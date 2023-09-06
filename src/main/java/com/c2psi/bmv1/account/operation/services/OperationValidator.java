package com.c2psi.bmv1.account.operation.services;

import com.c2psi.bmv1.account.operation.models.Operation;
import com.c2psi.bmv1.bmapp.annotations.BmNotBlank;
import com.c2psi.bmv1.bmapp.services.AppService;
import com.c2psi.bmv1.dto.Filter;
import com.c2psi.bmv1.dto.OperationDto;
import com.c2psi.bmv1.dto.Orderby;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service(value = "OperationValidatorV1")
@Slf4j
@RequiredArgsConstructor
public class OperationValidator {
    final AppService appService;

    public List<String> validate(OperationDto operationDto){
        List<String> errors = new ArrayList<>();
        if(operationDto == null){
            errors.add("L'operationDto envoye ne saurait etre null");
        }
        else{

        }
        return errors;
    }

    public List<String> validate(Operation operation){
        List<String> errors = new ArrayList<>();
        if(operation == null){
            errors.add("L'operation envoye ne saurait etre null");
        }
        else{
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();

            Set<ConstraintViolation<Operation>> constraintViolations = validator.validate(operation);

            if (constraintViolations.size() > 0) {
                for (ConstraintViolation<Operation> contraintes : constraintViolations) {
                /*System.out.println(contraintes.getRootBeanClass().getSimpleName()+
                        "." + contraintes.getPropertyPath() + " " + contraintes.getMessage());*/
                    errors.add(contraintes.getMessage());
                }
            }
            errors.addAll(this.validateStringofBm(operation));
        }
        return errors;
    }

    public List<String> validate(List<Filter> filterList, List<Orderby> sortCriterias){
        List<Field> operationFields = Arrays.stream(Operation.class.getDeclaredFields()).toList();
        List<Field> operationInheritFields = Arrays.stream(Operation.class.getSuperclass().getDeclaredFields()).toList();
        return appService.checkColumnList(filterList, sortCriterias, operationFields, operationInheritFields);
    }

    private List<String> validateStringofBm(Operation operation) {
        List<String> errors = new ArrayList<>();

        for(Method method : operation.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(BmNotBlank.class)){
                BmNotBlank bmNotBlank = method.getAnnotation(BmNotBlank.class);
                String message = bmNotBlank.message();
                try {
                    Object objectValueSent = method.invoke(operation);
                    if(objectValueSent instanceof String stringValueSent){
                        /***
                         * On se rassure que la chaine saisi une fois non null n'est ni empty ni blank
                         * et ensuite que sa taille est comprise entre le min et le max defini
                         * */
                        if(appService.isBlankValueIfNotNull(stringValueSent)) {
                            errors.add(message);
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Access denied to this method due to encapsulation");
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("InvocationTargetException");
                }
            }
        }
        return errors;
    }


}
