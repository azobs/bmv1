package com.c2psi.bmv1.userbm.services;

import com.c2psi.bmv1.address.services.AddressService;
import com.c2psi.bmv1.bmapp.services.AppService;
import com.c2psi.bmv1.dto.*;
import com.c2psi.bmv1.bmapp.dto.BmPageDto;
import com.c2psi.bmv1.bmapp.exceptions.*;
import com.c2psi.bmv1.userbm.dao.UserbmDao;
import com.c2psi.bmv1.bmapp.enumerations.UserbmErrorCode;
import com.c2psi.bmv1.userbm.mappers.UserbmMapper;
import com.c2psi.bmv1.userbm.models.Userbm;
import com.c2psi.bmv1.userbm.validators.UserbmValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service(value = "UserbmServiceV1")
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserbmServiceImpl implements UserbmService{
    final UserbmDao userbmDao;
    final UserbmMapper userbmMapper;
    final AddressService addressService;
    final AppService appService;
    final UserbmSpecService userbmSpecService;
    final UserbmValidator userbmValidator;

    @Override
    public UserbmDto saveUserbm(UserbmDto userbmDto) {
        if(userbmDto == null){
            throw new NullValueException("Le User envoye est null");
        }
        /**************************************************************************
         * On valide les parametres saisis et envoyes depuis l'interface client
         **************************************************************************/
        List<String> errors = userbmValidator.validate(userbmMapper.dtoToEntity(userbmDto));
        if(!errors.isEmpty()){
            log.error("Entity Userbm not valid because of {}", errors);
            throw new InvalidEntityException("Le userbm a enregistrer n'est pas valide ", errors,
                    UserbmErrorCode.USERBM_NOT_VALID.name());
        }

        /***********************************************************************
         * Il faut se rassurer de l'unicite du login ou alors lever
         * une exception sinon
         * NB: Dans la validation on est sur que le login ne peut etre null
         ***********************************************************************/
        if(userbmDto.getUserLogin() != null){
            if(!isLoginUsable(userbmDto.getUserLogin())){
                log.error("The login sent is already used in the DB");
                throw new DuplicateEntityException("Le login envoye est deja utilise",
                        UserbmErrorCode.USERBM_DUPLICATED.name());
            }
        }

        if(userbmDto.getUserCni() != null){
            if(!isCniUsable(userbmDto.getUserCni())){
                log.error("The cni number sent is already used in the DB");
                throw new DuplicateEntityException("Le cni number envoye est deja utilise",
                        UserbmErrorCode.USERBM_DUPLICATED.name());
            }
        }

        if(userbmDto.getUserAddress() != null){
            if(userbmDto.getUserAddress().getEmail() != null){
                if(!isAddressUsable(userbmDto.getUserAddress().getEmail())){
                    log.error("The userbm email sent is already used in the DB");
                    throw new DuplicateEntityException("Le userbm email envoye est deja utilise",
                            UserbmErrorCode.USERBM_DUPLICATED.name());
                }
            }
        }

        if(userbmDto.getUserName() != null ){
            if(!isFullnameUsable(userbmDto.getUserName(), userbmDto.getUserSurname(), userbmDto.getUserDob())){
                log.error("The userbm fullname sent is already used in the DB");
                throw new DuplicateEntityException("Le userbm fullname envoye est deja utilise",
                        UserbmErrorCode.USERBM_DUPLICATED.name());
            }
        }

        if(userbmDto.getUserPassword() == null || userbmDto.getUserRepassword() == null){
            log.error("Password and Repassword can't be null and must equal");
            throw new NullValueException("Password or Repassword is null please check");
        }

        if(userbmDto.getUserPassword() != null && userbmDto.getUserRepassword() != null){
            if(!isPasswordConfirm(userbmDto.getUserPassword(), userbmDto.getUserRepassword())){
                throw new PasswordNotConfirmedException("Password is not well confirmed");
            }
        }

        /*********************************************************************************
         * After including security, the password confirm must be encrypted before saved
         * by using the PasswordEncoder of SpringSecurity
         ********************************************************************************/

        log.info("After all verification, the Userbm {} sent can be safely saved in the DB ", userbmDto);

        Userbm userbmSaved = userbmDao.save(userbmMapper.dtoToEntity(userbmDto));

        return userbmMapper.entityToDto(userbmSaved);
    }

    public boolean isPasswordConfirm(String password, String rePassword){
        return password.equals(rePassword);
    }

    public boolean isLoginUsable(String login){
        Optional<Userbm> optionalUserbm = userbmDao.findUserbmByUserLogin(login);
        return optionalUserbm.isEmpty();
    }

    public boolean isCniUsable(String cni){
        Optional<Userbm> optionalUserbm = userbmDao.findUserbmByUserCni(cni);
        return optionalUserbm.isEmpty();
    }

    public boolean isFullnameUsable(String userName, String userSurname, LocalDate userDob){
        Optional<Userbm> optionalUserbm = userbmDao.findUserbmByFullname(userName, userSurname, userDob);
        return optionalUserbm.isEmpty();
    }

    public boolean isAddressUsable(String email){
        Optional<Userbm> optionalUserbm = userbmDao.findUserbmByEmail(email);
        return optionalUserbm.isEmpty();
    }

    @Override
    public UserbmDto updateUserbm(UserbmDto userbmDto) {
        return null;
    }

    @Override
    public Boolean deleteUserbmById(Long id) {
        return null;
    }

    @Override
    public UserbmDto getUserbmById(Long id) {
        return null;
    }

    @Override
    public UserbmDto getUserbmByCni(String userCni) {
        return null;
    }

    @Override
    public UserbmDto getUserbmByLogin(String userLogin) {
        return null;
    }

    @Override
    public UserbmDto getUserbmByEmail(String userEmail) {
        return null;
    }

    @Override
    public List<UserbmDto> getListofUserbm(FilterRequest filterRequest) {
        if(filterRequest == null){
            return userbmMapper.entityToDto(userbmDao.findAll());
        }

        if(filterRequest.getFilters() == null && filterRequest.getOrderby() == null){
            return userbmMapper.entityToDto(userbmDao.findAll());
        }

        if(filterRequest.getFilters() == null && filterRequest.getOrderby() != null){
            return userbmMapper.entityToDto(userbmDao.findAll(appService.getSortOrders(filterRequest.getOrderby())));
        }

        /*****************************************************************
         * A ce niveau on est sur que filterRequest.getFilters() != null
         * Maintenant si filterRequest.getOrderby() == null cela ne cause
         * aucun souci la liste aura juste un ordre par defaut.
         */

        if(filterRequest.getLogicOperator() == null && filterRequest.getFilters().size() > 1){
            throw new NullValueException("L'operateur logique permettant de lier les filtres ne peut etre null");
        }

        Specification<Userbm> userbmSpecification = userbmSpecService.getUserbmSpecification(filterRequest.getFilters(),
                filterRequest.getLogicOperator(), filterRequest.getOrderby());
        return userbmMapper.entityToDto(userbmDao.findAll(userbmSpecification));
    }

    @Override
    public PageofUserbmDto getPageofUserbm(FilterRequest filterRequest) {

        com.c2psi.bmv1.dto.Page page = new com.c2psi.bmv1.dto.Page();
        Page<Userbm> userbmPage = null;
        if(filterRequest == null){
            page.setPagenum(0);
            page.setPagesize(1);
            Pageable pageable = new BmPageDto().getPageable(page);
            userbmPage = userbmDao.findAll(pageable);
            //log.error("dsdsds {}", userbmPage.getTotalElements());
        }
        else{
            if(filterRequest.getPage() == null){
                page.setPagenum(0);
                page.setPagesize(1);
                filterRequest.setPage(page);
            }
            if(filterRequest.getFilters() == null && filterRequest.getOrderby() == null){
                Pageable pageable = new BmPageDto().getPageable(filterRequest.getPage());
                userbmPage = userbmDao.findAll(pageable);
            }

            if(filterRequest.getFilters() == null && filterRequest.getOrderby() != null){
                Sort sort = appService.getSortOrders(filterRequest.getOrderby());
                Pageable pageable = PageRequest.of(filterRequest.getPage().getPagenum(),
                        filterRequest.getPage().getPagesize(), sort);
                userbmPage = userbmDao.findAll(pageable);
            }

            if(filterRequest.getFilters() != null && filterRequest.getOrderby() == null){
                if(filterRequest.getLogicOperator() == null && filterRequest.getFilters().size() > 1){
                    throw new NullValueException("L'operateur logique permettant de lier les filtres ne peut etre null");
                }
                Specification<Userbm> userbmSpecification = userbmSpecService.getUserbmSpecification(filterRequest.getFilters(),
                        filterRequest.getLogicOperator(), filterRequest.getOrderby());
                Pageable pageable = new BmPageDto().getPageable(filterRequest.getPage());
                userbmPage = userbmDao.findAll(userbmSpecification, pageable);
            }
            if (filterRequest.getFilters() != null && filterRequest.getOrderby() != null){
                Specification<Userbm> userbmSpecification = userbmSpecService.getUserbmSpecification(filterRequest.getFilters(),
                        filterRequest.getLogicOperator(), filterRequest.getOrderby());
                Pageable pageable = new BmPageDto().getPageable(filterRequest.getPage());
                userbmPage = userbmDao.findAll(userbmSpecification, pageable);
            }
        }
        return getPageofUserbmDto(userbmPage);
    }

    PageofUserbmDto getPageofUserbmDto(Page<Userbm> userbmPage){
        PageofUserbmDto pageofUserbmDto = new PageofUserbmDto();
        pageofUserbmDto.setContent(userbmMapper.entityToDto(userbmPage.getContent()));
        pageofUserbmDto.setCurrentPage(userbmPage.getNumber());
        pageofUserbmDto.setPageSize(userbmPage.getSize());
        pageofUserbmDto.setTotalElements(userbmPage.getTotalElements());
        pageofUserbmDto.setTotalPages(userbmPage.getTotalPages());

        return pageofUserbmDto;
    }

}