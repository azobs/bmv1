package com.c2psi.bmv1.pos.enterprise.services;

import com.c2psi.bmv1.bmapp.dto.BmPageDto;
import com.c2psi.bmv1.bmapp.exceptions.*;
import com.c2psi.bmv1.bmapp.services.AppService;
import com.c2psi.bmv1.dto.*;
import com.c2psi.bmv1.pos.enterprise.dao.EnterpriseDao;
import com.c2psi.bmv1.bmapp.enumerations.EntRegimeEnum;
import com.c2psi.bmv1.pos.enterprise.errorCode.ErrorCode;
import com.c2psi.bmv1.pos.enterprise.mappers.EnterpriseMapper;
import com.c2psi.bmv1.pos.enterprise.models.Enterprise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service(value = "EnterpriseServiceV1")
@Slf4j
@Transactional
@RequiredArgsConstructor
public class EnterpriseServiceImpl implements EnterpriseService{
    final EnterpriseDao enterpriseDao;
    final EnterpriseMapper enterpriseMapper;
    final EnterpriseValidator enterpriseValidator;
    final AppService appService;
    final EnterpriseSpecService enterpriseSpecService;

    @Override
    public EnterpriseDto saveEnterprise(EnterpriseDto enterpriseDto) {
        if(enterpriseDto == null){
            throw new NullValueException("L'enterprise envoye est null");
        }
        /**************************************************************************
         * On valide les parametres saisis et envoyes depuis l'interface client
         **************************************************************************/
        List<String> errors = enterpriseValidator.validate(enterpriseMapper.dtoToEntity(enterpriseDto));
        if(!errors.isEmpty()){
            log.error("Entity Enterprise not valid because of {}", errors);
            throw new InvalidEntityException("Le Enterprise a enregistrer n'est pas valide ", errors,
                    ErrorCode.ENTERPRISE_NOT_VALID.name());
        }

        /***********************************************************************
         * Il faut se rassurer qu'aucune contrainte d'unicite ne sera vile en BD
         */
        if(enterpriseDto.getEntNiu() != null){
            if(!isEnterpriseNiuUsable(enterpriseDto.getEntNiu())){
                log.error("The Niu sent is already used in the DB");
                throw new DuplicateEntityException("L'identifiant unique envoye est deja utilise",
                        ErrorCode.ENTERPRISE_DUPLICATED.name());
            }
        }

        if(enterpriseDto.getEntName() != null && enterpriseDto.getEntAcronym() != null){
            if(!isEnterpriseNameUsable(enterpriseDto.getEntName(), enterpriseDto.getEntAcronym())){
                log.error("The couple name and acronym sent is already used in the DB");
                throw new DuplicateEntityException("Le couple (name, acronym) envoye est deja utilise",
                        ErrorCode.ENTERPRISE_DUPLICATED.name());
            }
        }

        log.info("After all verification, the Enterprise {} sent can be safely saved in the DB ", enterpriseDto);

        //Enterprise enterpriseSaved = enterpriseDao.save(enterpriseMapper.dtoToEntity(enterpriseDto));
        /***
         * enterpriseToUpdate.setEntAcronym(enterpriseDto.getEntAcronym());
         *         enterpriseToUpdate.setEntName(enterpriseDto.getEntName());
         *         enterpriseToUpdate.setEntLogo(enterpriseDto.getEntLogo());
         *         enterpriseToUpdate.setEntNiu(enterpriseDto.getEntNiu());
         *         enterpriseToUpdate.setEntSocialreason(enterpriseDto.getEntSocialreason());
         *         enterpriseToUpdate.setEntDescription(enterpriseDto.getEntDescription());
         *         enterpriseToUpdate.setEntRegime(convertToEntRegimeEnum(enterpriseDto.getEntRegime()));
         */
        Enterprise enterpriseSaved = Enterprise.builder()
                .entAcronym(enterpriseDto.getEntAcronym())
                .entName(enterpriseDto.getEntName())
                .entLogo(enterpriseDto.getEntLogo())
                .entNiu(enterpriseDto.getEntNiu())
                .entSocialreason(enterpriseDto.getEntSocialreason())
                .entDescription(enterpriseDto.getEntDescription())
                .entRegime(convertToEntRegimeEnum(enterpriseDto.getEntRegime()))
                .build();

        return enterpriseMapper.entityToDto(enterpriseSaved);
    }

    Boolean isEnterpriseNiuUsable(String niu){
        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseByEntNiu(niu);
        return optionalEnterprise.isEmpty();
    }

    Boolean isEnterpriseNameUsable(String name, String acronym){
        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseByFullname(name, acronym);
        return optionalEnterprise.isEmpty();
    }

    @Override
    public EnterpriseDto updateEnterprise(EnterpriseDto enterpriseDto) {
        if(enterpriseDto == null){
            throw new NullValueException("L'enterprise envoye est null");
        }

        List<String> errors = enterpriseValidator.validate(enterpriseMapper.dtoToEntity(enterpriseDto));
        if(!errors.isEmpty()){
            log.error("Entity Enterprise not valid because of {}", errors);
            throw new InvalidEntityException("Le Enterprise a enregistrer n'est pas valide ", errors,
                    ErrorCode.ENTERPRISE_NOT_VALID.name());
        }

        if(enterpriseDto.getId() == null){
            throw new NullValueException("L'enterprise envoye a un identifiant null et ne saurait donc etre mis a jour");
        }

        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseById(enterpriseDto.getId());
        if(!optionalEnterprise.isPresent()){
            log.error("There is no enterprise with the precised id");
            throw new ModelNotFoundException("Aucune entreprise n'existe en BD avec l'Id precise",
                    ErrorCode.ENTERPRISE_NOT_FOUND.name());
        }
        Enterprise enterpriseToUpdate = optionalEnterprise.get();

        /**********************************************************************************
         * On va se rassurer que les contraintes ne seront pas viole en cas de mis a jour
         */

        if(enterpriseDto.getEntNiu() != null){
            if(!enterpriseToUpdate.getEntNiu().equalsIgnoreCase(enterpriseDto.getEntNiu())){
                //Alors on veut modifier le Niu
                if(!isEnterpriseNiuUsable(enterpriseDto.getEntNiu())){
                    log.error("Le nouveau Niu envoye est deja utilise");
                    throw new DuplicateEntityException("Le Niu envoye est deja utilise",
                            ErrorCode.ENTERPRISE_DUPLICATED.name());
                }
            }
        }

        if(enterpriseDto.getEntName() != null && enterpriseDto.getEntAcronym() != null){
            if(!enterpriseToUpdate.getEntName().equalsIgnoreCase(enterpriseDto.getEntName()) ||
                !enterpriseToUpdate.getEntAcronym().equalsIgnoreCase(enterpriseDto.getEntAcronym())){
                if(!isEnterpriseNameUsable(enterpriseDto.getEntName(), enterpriseDto.getEntAcronym())){
                    log.error("Le nouveau de l'entreprise est deja utilise");
                    throw new DuplicateEntityException("Le nouveau non de l'entreprise est deja utilise",
                            ErrorCode.ENTERPRISE_DUPLICATED.name());
                }
            }
        }

        log.info("After all verification, The reamining update can be done without any problem");
        enterpriseToUpdate.setEntAcronym(enterpriseDto.getEntAcronym());
        enterpriseToUpdate.setEntName(enterpriseDto.getEntName());
        enterpriseToUpdate.setEntLogo(enterpriseDto.getEntLogo());
        enterpriseToUpdate.setEntNiu(enterpriseDto.getEntNiu());
        enterpriseToUpdate.setEntSocialreason(enterpriseDto.getEntSocialreason());
        enterpriseToUpdate.setEntDescription(enterpriseDto.getEntDescription());
        enterpriseToUpdate.setEntRegime(convertToEntRegimeEnum(enterpriseDto.getEntRegime()));

        Enterprise enterpriseUpdated = enterpriseDao.save(enterpriseToUpdate);

        return enterpriseMapper.entityToDto(enterpriseUpdated);
    }

    EntRegimeEnum convertToEntRegimeEnum(EnterpriseDto.EntRegimeEnum entRegimeEnum){
        if(entRegimeEnum == null){
            throw  new NullValueException("L'argument est null");
        }
        switch (entRegimeEnum){
            case IL:
                return EntRegimeEnum.IL;
            case SA:
                return EntRegimeEnum.SA;
            case SI:
                return EntRegimeEnum.SI;
            case SARL:
                return EntRegimeEnum.SARL;
            case GRP:
                return EntRegimeEnum.GRP;
            default:
                throw new InvalidArgumentException("Le regime de l'entreprise n'est pas valide ou n'est pas encore " +
                        "pris par le systeme");
        }
    }

    @Override
    public Boolean deleteEnterpriseById(Long id) {
        /*****************************************
         * On se rassure que l'id n'est pas null
         */
        if(id == null){
            throw new NullValueException("The id of the enterprise to be deleted can't be null");
        }
        /********************************************************
         * On se rassure qu'une entreprise existe avec cet id
         */
        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseById(id);
        if(!optionalEnterprise.isPresent()){
            throw new ModelNotFoundException("Aucune entreprise n'existe avec l'id envoye");
        }

        if(!isEnterpriseDeleatable(optionalEnterprise.get())){
            throw new EntityNotDeleatableException("D'autres modeles dependent de l'entreprise dont on veut supprimer",
                    ErrorCode.ENTERPRISE_NOT_DELETEABLE.name());
        }
        enterpriseDao.deleteById(id);

        return true;
    }

    Boolean isEnterpriseDeleatable(Enterprise enterprise){
        return true;
    }

    @Override
    public EnterpriseDto getEnterpriseById(Long id) {
        /**********
         * On se rassure que l'id n'est pas null
         */
        if(id == null){
            throw new NullValueException("L'id de l'entreprise recherche ne peut etre null");
        }
        /*******************
         * On fait donc la recherche de l'entreprise en question
         */
        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseById(id);
        if(!optionalEnterprise.isPresent()){
            throw new ModelNotFoundException("Aucune entreprise n'existe avec l'id envoye");
        }

        return enterpriseMapper.entityToDto(optionalEnterprise.get());
    }

    @Override
    public List<EnterpriseDto> getListofEnterprise(FilterRequest filterRequest) {
        /************************************************************************
         * On se rassure que le filterRequest n'est pas null et si c'est le cas
         * on retourne le findAll
         */
        if(filterRequest == null){
            return enterpriseMapper.entityToDto(enterpriseDao.findAll());
        }

        /************************************************************************
         * Si dans le filterRequest les filtres et les tris sont null on
         * retourne aussi le findAll
         */
        if(filterRequest.getFilters() == null && filterRequest.getOrderby() == null){
            return enterpriseMapper.entityToDto(enterpriseDao.findAll());
        }

        /**********************************************************************************
         * Si les filtres sont null mais les elements de tris non null
         * alors on retourne le findAll range dans l'ordre indique par les elements de tri
         */
        if(filterRequest.getFilters() == null && filterRequest.getOrderby() != null){
            return enterpriseMapper.entityToDto(enterpriseDao.findAll(appService.getSortOrders(filterRequest.getOrderby())));
        }

        /*****************************************************************
         * A ce niveau on est sur que filterRequest.getFilters() != null
         * Maintenant si filterRequest.getOrderby() == null cela ne cause
         * aucun souci la liste aura juste un ordre par defaut.
         */

        if(filterRequest.getLogicOperator() == null && filterRequest.getFilters().size() > 1){
            throw new NullValueException("L'operateur logique permettant de lier les filtres ne peut etre null");
        }

        Specification<Enterprise> enterpriseSpecification = enterpriseSpecService.getEnterpriseSpecification(filterRequest.getFilters(),
                filterRequest.getLogicOperator(), filterRequest.getOrderby());
        return enterpriseMapper.entityToDto(enterpriseDao.findAll(enterpriseSpecification));
    }

    @Override
    public PageofEnterpriseDto getPageofEnterprise(FilterRequest filterRequest) {
        /*****************************************************************
         * On prepare un element page de notre bmapp
         */
        Pagebm pagebm = new Pagebm();
        /***********************************************
         * On declare une page pour notre element
         */
        Page<Enterprise> enterprisePage = null;
        /***************************************************************************************
         * Si le filterRequest envoye est null alors c'est le findAll qu'on retourne
         * page par page. On va donc retourner la page 0 avec une taille de 10 pour la page
         */
        if(filterRequest == null){
            pagebm.setPagenum(0);
            pagebm.setPagesize(10);
            Pageable pageable = new BmPageDto().getPageable(pagebm);
            enterprisePage = enterpriseDao.findAll(pageable);
            return getPageofEnterpriseDto(enterprisePage);
        }
        else{
            /*************************************************************************************
             * Si le filterRequest envoye n'est pas null mais que l'element pas indiquant le numero
             * et la taille de page voulu est null alors on assigne des valeurs par defaut soit
             * page numero 0 et taille de page 10
             */
            if(filterRequest.getPage() == null){
                pagebm.setPagenum(0);
                pagebm.setPagesize(10);
                filterRequest.setPage(pagebm);
            }

            /**************************************************************************************
             * Si dans le filterRequest envoye les filtres et les elements de tri sont null alors
             * on retourne le findAll page par page.
             */

            if(filterRequest.getFilters() == null && filterRequest.getOrderby() == null){
                Pageable pageable = new BmPageDto().getPageable(filterRequest.getPage());
                enterprisePage = enterpriseDao.findAll(pageable);
                return getPageofEnterpriseDto(enterprisePage);
            }

            /****************************************************************************************************
             * Si dans le filterRequest envoye les filtres sont nuls et les elements de tri sont non null alors
             * on retourne le findAll page par page trie selon les elements de tri envoye.
             */

            if(filterRequest.getFilters() == null && filterRequest.getOrderby() != null){
                Sort sort = appService.getSortOrders(filterRequest.getOrderby());
                Pageable pageable = PageRequest.of(filterRequest.getPage().getPagenum(),
                        filterRequest.getPage().getPagesize(), sort);
                enterprisePage = enterpriseDao.findAll(pageable);
                return getPageofEnterpriseDto(enterprisePage);
            }

            /*********************************************************************************************
             * Si l'operateur logique permettant de lier les filtres est null et que la liste des filtres
             * contient plus d'un filtre alors il ya un probleme dans les parametres
             */
            if(filterRequest.getLogicOperator() == null && filterRequest.getFilters().size() > 1){
                throw new NullValueException("L'operateur logique permettant de lier les filtres ne peut etre null");
            }

            /****************************************************************************************************
             * On peut ici lancer une recherche selon les filtres envoyes, les classer selon les elements de tri
             * et ensuite la page demande
             */
            Specification<Enterprise> enterpriseSpecification = enterpriseSpecService.getEnterpriseSpecification(filterRequest.getFilters(),
                    filterRequest.getLogicOperator(), filterRequest.getOrderby());
            Pageable pageable = new BmPageDto().getPageable(filterRequest.getPage());
            enterprisePage = enterpriseDao.findAll(enterpriseSpecification, pageable);
            return getPageofEnterpriseDto(enterprisePage);

        }
    }

    @Override
    public Boolean isEnterpriseExistWith(Long id) {
        if(id == null){
            return false;
        }
        Optional<Enterprise> optionalEnterprise = enterpriseDao.findEnterpriseById(id);
        return optionalEnterprise.isPresent();
    }

    PageofEnterpriseDto getPageofEnterpriseDto(Page<Enterprise> enterprisePage){
        PageofEnterpriseDto pageofEnterpriseDto = new PageofEnterpriseDto();
        pageofEnterpriseDto.setContent(enterpriseMapper.entityToDto(enterprisePage.getContent()));
        pageofEnterpriseDto.setCurrentPage(enterprisePage.getNumber());
        pageofEnterpriseDto.setPageSize(enterprisePage.getSize());
        pageofEnterpriseDto.setTotalElements(enterprisePage.getTotalElements());
        pageofEnterpriseDto.setTotalPages(enterprisePage.getTotalPages());

        return pageofEnterpriseDto;

    }

}
