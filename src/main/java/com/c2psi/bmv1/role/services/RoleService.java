package com.c2psi.bmv1.role.services;

import com.c2psi.bmv1.bmapp.enumerations.RoleTypeEnum;
import com.c2psi.bmv1.dto.*;

import java.util.List;

public interface RoleService {
    RoleDto saveRole(RoleDto roleDto);
    RoleDto updateRole(RoleDto roleDto);
    Boolean deleteRoleById(Long id);
    RoleDto getRoleById(Long id);
    RoleDto getRoleByName(String roleName, RoleTypeEnum roleTypeEnum);
    List<RoleDto> getListofRole(FilterRequest filterRequest);
    PageofRoleDto getPageofRole(FilterRequest filterRequest);

    Boolean isRoleExistWithId(Long roleId);
}
