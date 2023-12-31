package com.c2psi.bmv1.auth.services;

import com.c2psi.bmv1.auth.config.JwtService;
import com.c2psi.bmv1.auth.models.ExtendedUser;
import com.c2psi.bmv1.auth.permission.dao.PermissionDao;
import com.c2psi.bmv1.auth.permission.services.PermissionService;
import com.c2psi.bmv1.auth.token.models.Token;
import com.c2psi.bmv1.auth.token.services.TokenService;
import com.c2psi.bmv1.bmapp.enumerations.TokenType;
import com.c2psi.bmv1.bmapp.exceptions.*;
import com.c2psi.bmv1.bmapp.services.AppService;
import com.c2psi.bmv1.dto.*;
import com.c2psi.bmv1.role.services.RoleService;
import com.c2psi.bmv1.userbm.dao.UserbmDao;
import com.c2psi.bmv1.userbm.models.Userbm;
import com.c2psi.bmv1.userbm.services.UserbmService;
import com.c2psi.bmv1.userbmrole.dao.UserbmRoleDao;
import com.c2psi.bmv1.auth.dao.UserbmRolePermissionDao;
import com.c2psi.bmv1.auth.errorCode.ErrorCode;
import com.c2psi.bmv1.auth.mapper.UserbmRolePermissionMapper;
import com.c2psi.bmv1.auth.models.UserbmRolePermission;
import com.c2psi.bmv1.userbmrole.models.UserbmRole;
import com.c2psi.bmv1.userbmrole.services.UserbmRoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "UserbmRolePermissionServiceV1")
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserbmRolePermissionServiceImpl implements UserbmRolePermissionService{
    final AppService appService;
    final UserbmRolePermissionDao ubmRolePermDao;
    final UserbmRolePermissionMapper ubmRolePermMapper;
    final UserbmRolePermissionValidator ubmRolePermValidator;
    final UserbmRoleDao userbmRoleDao;
    final PermissionDao permissionDao;
    final UserbmRolePermissionSpecService ubmRolePermSpecService;
//    final JwtService jwtService;
//    //final LoadUserbmService loadUserbmService;
//    final UserbmDao userbmDao;
//    final TokenService tokenService;
//    final UserbmRoleService userbmRoleService;
//    final RoleService roleService;
//    final PermissionService permService;

    @Override
    public UserbmRolePermissionDto saveUserbmRolePermission(UserbmRolePermissionDto ubmRolePermDto) {
        /*************************************************
         * Le parametre dto ne devrait pas etre null
         */
        if(ubmRolePermDto == null){
            throw new NullValueException("Le ubmRolePermDto envoye est null");
        }

        /*************************************************
         * Le parametre dto doit etre valide
         */
        List<String> errorsDto = ubmRolePermValidator.validate(ubmRolePermDto);
        if(!errorsDto.isEmpty()){
            log.error("Dto UserbmRolePermission not valid because of {}", errorsDto);
            throw new InvalidEntityException("Les entites lies sont inexistantes en BD ", errorsDto,
                    ErrorCode.USERBMROLE_PERMISSION_NOT_VALID.name());
        }

        /**************************************
         * On valide l'entite associe au dto
         */
        List<String> errors = ubmRolePermValidator.validate(ubmRolePermMapper.dtoToEntity(ubmRolePermDto));
        if(!errors.isEmpty()){
            log.error("Entity UserbmRolePermission not valid because of {}", errors);
            throw new InvalidEntityException("Le userbmrole a enregistrer n'est pas valide ", errors,
                    ErrorCode.USERBMROLE_PERMISSION_NOT_VALID.name());
        }

        /******************************************************************
         * On se rassure que les contraintes d'unicite ne seront pas viole
         */

        if(!isUserbmRolePermissionUsable(ubmRolePermDto.getUserbmroleId(), ubmRolePermDto.getPermissionId())){
            throw new DuplicateEntityException("La permission indique a deja ete attribue au UserbmRole ",
                    ErrorCode.USERBMROLE_PERMISSION_DUPLICATED.name());
        }


        /**********************************************************
         * Si tout est bon on effectue l'enregistrement
         */
        log.info("After all verification, the userbmrolepermission can be saved safely");
        UserbmRole userbmRole = userbmRoleDao.findUserbmRoleById(ubmRolePermDto.getUserbmroleId()).get();
        UserbmRolePermission ubmRolePermToSaved = UserbmRolePermission.builder()
                .userbmRole(userbmRole)
                .permission(permissionDao.findPermissionById(ubmRolePermDto.getPermissionId()).get())
                .build();

        UserbmRolePermission userbmRolePermSaved = ubmRolePermDao.save(ubmRolePermToSaved);

        return ubmRolePermMapper.entityToDto(userbmRolePermSaved);
    }

    Boolean isUserbmRolePermissionUsable(Long userbmRoleId, Long permId){
        Optional<UserbmRolePermission> optionalUserbmRolePermission = ubmRolePermDao.
                findByUserbmroleAndPermission(userbmRoleId, permId);
        return optionalUserbmRolePermission.isEmpty();
    }

    @Override
    public Boolean deleteUserbmRolePermissionById(Long id) {
        if(id == null){
            throw new NullValueException("The id of the UserbmRolePermission to delete can't be null");
        }
        Optional<UserbmRolePermission> optionalUserbmRolePermission = ubmRolePermDao.findUserbmRolePermissionById(id);
        if(!optionalUserbmRolePermission.isPresent()){
            throw new ModelNotFoundException("There is no UserbmRolePermission in the DB with the precise id",
                    ErrorCode.USERBMROLE_PERMISSION_NOT_FOUND.name());
        }

        if(!isUserbmRolePermissionDeleteable(optionalUserbmRolePermission.get())){
            throw new EntityNotDeleatableException("It is not possible to delete the UserbmRolePermission without cause " +
                    "conflits ", ErrorCode.USERBMROLE_PERMISSION_NOT_DELETEABLE.name());
        }

        ubmRolePermDao.delete(optionalUserbmRolePermission.get());
        return true;
    }

    Boolean isUserbmRolePermissionDeleteable(UserbmRolePermission ubmRolePerm){
        return true;
    }

    @Override
    public UserbmRolePermissionDto getUserbmRolePermissionById(Long id) {
        if(id == null){
            throw new NullValueException("L'id du UserbmRolePermission est null ");
        }
        Optional<UserbmRolePermission> optionalUserbmRolePermission = ubmRolePermDao.findUserbmRolePermissionById(id);
        if(!optionalUserbmRolePermission.isPresent()){
            throw new ModelNotFoundException("There is no UserbmRolePermission in the DB with the precise id",
                    ErrorCode.USERBMROLE_PERMISSION_NOT_FOUND.name());
        }
        return ubmRolePermMapper.entityToDto(optionalUserbmRolePermission.get());
    }

    @Override
    public UserbmRolePermissionDto getUserbmRolePermissionByUserbmRoleAndPermission(Long userbmRoleId, Long permId) {
        if(userbmRoleId == null || permId == null){
            throw new NullValueException("Les ids du UserbmRolePermission sont nulls");
        }
        Optional<UserbmRolePermission> optionalUserbmRolePermission = ubmRolePermDao.
                findByUserbmroleAndPermission(userbmRoleId, permId);
        if(!optionalUserbmRolePermission.isPresent()){
            throw new ModelNotFoundException("There is no UserbmRolePermission in the system with the precise ids ",
                    ErrorCode.USERBMROLE_PERMISSION_NOT_FOUND.name());
        }
        return ubmRolePermMapper.entityToDto(optionalUserbmRolePermission.get());
    }

    @Override
    public List<UserbmRolePermissionDto> getListofUserbmRolePermission(FilterRequest filterRequest) {
        if(filterRequest == null){
            return ubmRolePermMapper.entityToDto(ubmRolePermDao.findAll());
        }

        if(filterRequest.getFilters() == null && filterRequest.getOrderby() == null){
            return ubmRolePermMapper.entityToDto(ubmRolePermDao.findAll());
        }

        if(filterRequest.getFilters() == null && filterRequest.getOrderby() != null){
            return ubmRolePermMapper.entityToDto(ubmRolePermDao.findAll(
                    appService.getSortOrders(filterRequest.getOrderby())));
        }

        /*****************************************************************
         * A ce niveau on est sur que filterRequest.getFilters() != null
         * Maintenant si filterRequest.getOrderby() == null cela ne cause
         * aucun souci la liste aura juste un ordre par defaut.
         */

        if(filterRequest.getLogicOperator() == null && filterRequest.getFilters().size() > 1){
            throw new NullValueException("L'operateur logique permettant de lier les filtres ne peut etre null");
        }

        Specification<UserbmRolePermission> ubmRoleSpecification = ubmRolePermSpecService.
                getUserbmRolePermissionSpecification(filterRequest.getFilters(), filterRequest.getLogicOperator(),
                        filterRequest.getOrderby());

        return ubmRolePermMapper.entityToDto(ubmRolePermDao.findAll(ubmRoleSpecification));
    }

    @Override
    public Boolean isUserbmRolePermissionExistWithId(Long userbmRolePermId) {
        if(userbmRolePermId == null){
            throw new NullValueException("Le userbmRolePermId envoye est null");
        }
        Optional<UserbmRolePermission> optionalUserbmRolePermission = ubmRolePermDao.findUserbmRolePermissionById(
                userbmRolePermId);
        return optionalUserbmRolePermission.isPresent();
    }

    @Override
    public List<UserbmRolePermissionDto> getPermissionofUserbmRole(Long userbmRoleId) {
        if(userbmRoleId == null){
            throw new NullValueException("L'id envoye est null");
        }
        Optional<List<UserbmRolePermission>> optionalUserbmRolePermissionList = ubmRolePermDao.
                findPermissionofUserbmRole(userbmRoleId);
        if(!optionalUserbmRolePermissionList.isPresent()){
            throw new ModelNotFoundException("Aucun UserbmRolePermission avec le userbmroleif envoye");
        }
        return ubmRolePermMapper.entityToDto(optionalUserbmRolePermissionList.get());
    }

    @Override
    public ExtendedUser loadUserbmbyUsername(String username) {

//        log.info("LoadUserbmbyUsername: start execution");
//        UserbmDto userbmDto = userbmService.loadUserbmByUsername(username);
//        List<String> roleAndPermissionListofUserString = new ArrayList<>();
//        /********************************************************************
//         * Avec le UserDto il faut faire la liste de ses roles
//         */
//        List<UserbmRoleDto> userbmRoleDtoList = userbmRoleService.getRoleListofUserbm(userbmDto.getId());
//
//        /**********************************************************************************************
//         * Pour chaque role dans la liste des role du User, il faut recuperer ses permissions. Mais
//         * avant il faut ajouter a la liste des roles a la liste des rolesString .
//         */
        ExtendedUser extendedUser = ExtendedUser.builder()
                .userbmId(null)
                .password(null)
                .username(username)
                .roleAndPermissions(null)
                .build();

        return extendedUser;
    }
}
