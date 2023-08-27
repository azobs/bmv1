/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofUserbmRoleDto;
import com.c2psi.bmv1.dto.UserbmRoleDto;
import com.c2psi.bmv1.dto.UserbmRolePermissionDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-27T14:53:37.924409800+01:00[Africa/Casablanca]")
@Validated
@Api(value = "userbm_role", description = "the userbm_role API")
public interface UserbmRoleApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /userbm_role/bm/v1/delete/{id} : Path used to delete a userbm_role in the system with its id
     *
     * @param id The id that represent the UserbmRole to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm deleted successfully (status code 200)
     *         or Bad request. User ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a userbm_role in the system with its id", nickname = "deleteUserbmRoleById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. User ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/userbm_role/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteUserbmRoleById(@ApiParam(value = "The id that represent the UserbmRole to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteUserbmRoleById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteUserbmRoleById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userbm_role/bm/v1/getby/{id} : Find a UserbmRole in the system by its id
     *
     * @param id The id that represent the UserbmRole found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return UserbmRole found successfully (status code 200)
     *         or Bad request. UserRole ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a UserbmRole in the system by its id", nickname = "getUserbmRoleById", notes = "", response = UserbmRoleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UserbmRole found successfully", response = UserbmRoleDto.class),
        @ApiResponse(code = 400, message = "Bad request. UserRole ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/userbm_role/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserbmRoleDto> _getUserbmRoleById(@ApiParam(value = "The id that represent the UserbmRole found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getUserbmRoleById(id);
    }

    // Override this method
    default  ResponseEntity<UserbmRoleDto> getUserbmRoleById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm_role/bm/v1/list : Path used to list user_role that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return UserbmRole list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list user_role that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getUserbmRoleList", notes = "", response = UserbmRoleDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UserbmRole list found successfully", response = UserbmRoleDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm_role/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<UserbmRoleDto>> _getUserbmRoleList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getUserbmRoleList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<UserbmRoleDto>> getUserbmRoleList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm_role/bm/v1/page : Path used to list userrole page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return UserbmRole page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list userrole page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getUserbmRolePage", notes = "", response = PageofUserbmRoleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "UserbmRole page found successfully", response = PageofUserbmRoleDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm_role/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofUserbmRoleDto> _getUserbmRolePage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getUserbmRolePage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofUserbmRoleDto> getUserbmRolePage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 1, \"pageSize\" : 10, \"id\" : 0, \"currentPage\" : 0, \"content\" : [ { \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 }, { \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 } ], \"totalElements\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm_role/bm/v1/create : Path used to save a new user_role in the system
     *
     * @param userbmRoleDto  (optional)
     * @return Userbm_Role saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new user_role in the system", nickname = "saveUserbmRole", notes = "", response = UserbmRoleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm_Role saved successfully", response = UserbmRoleDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm_role/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserbmRoleDto> _saveUserbmRole(@ApiParam(value = "") @Valid @RequestBody(required = false) UserbmRoleDto userbmRoleDto) {
        return saveUserbmRole(userbmRoleDto);
    }

    // Override this method
    default  ResponseEntity<UserbmRoleDto> saveUserbmRole(UserbmRoleDto userbmRoleDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /userbm_role/bm/v1/changepermission : Path used to update or modify an existing user_role in the system
     *
     * @param userbmRolePermissionDto  (optional)
     * @return Userbm updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing user_role in the system", nickname = "updateUserbmRole", notes = "", response = UserbmRoleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm updated successfully", response = UserbmRoleDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/userbm_role/bm/v1/changepermission",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserbmRoleDto> _updateUserbmRole(@ApiParam(value = "") @Valid @RequestBody(required = false) UserbmRolePermissionDto userbmRolePermissionDto) {
        return updateUserbmRole(userbmRolePermissionDto);
    }

    // Override this method
    default  ResponseEntity<UserbmRoleDto> updateUserbmRole(UserbmRolePermissionDto userbmRolePermissionDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userbmId\" : 6, \"roleId\" : 1, \"permissions\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
