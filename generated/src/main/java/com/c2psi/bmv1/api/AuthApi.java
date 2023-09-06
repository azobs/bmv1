/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.AuthRequest;
import com.c2psi.bmv1.dto.AuthResponse;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofPermissionDto;
import com.c2psi.bmv1.dto.PermissionDto;
import com.c2psi.bmv1.dto.TokenDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-05T20:37:01.434321300+01:00[Africa/Casablanca]")
@Validated
@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /auth/bm/v1/authenticate : Path used to authenticate a user in the system
     *
     * @param authRequest  (optional)
     * @return Userbm authenticated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to authenticate a user in the system", nickname = "authenticate", notes = "", response = AuthResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm authenticated successfully", response = AuthResponse.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/authenticate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AuthResponse> _authenticate(@ApiParam(value = "") @Valid @RequestBody(required = false) AuthRequest authRequest) {
        return authenticate(authRequest);
    }

    // Override this method
    default  ResponseEntity<AuthResponse> authenticate(AuthRequest authRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accessToken\" : \"accessToken\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /auth/bm/v1/permission/delete/{id} : Path used to delete a permission in the system with its id
     *
     * @param id The id that represent the Permission to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Permission deleted successfully (status code 200)
     *         or Bad request. User ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a permission in the system with its id", nickname = "deletePermissionById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. User ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/auth/bm/v1/permission/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deletePermissionById(@ApiParam(value = "The id that represent the Permission to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deletePermissionById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deletePermissionById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /auth/bm/v1/token/delete/{id} : Path used to delete a token in the system with its id
     *
     * @param id The id that represent the Token to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Token deleted successfully (status code 200)
     *         or Bad request. Token ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a token in the system with its id", nickname = "deleteTokenById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Token deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Token ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/auth/bm/v1/token/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteTokenById(@ApiParam(value = "The id that represent the Token to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteTokenById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteTokenById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /auth/bm/v1/permission/getby/{id} : Find a Permission in the system by its id
     *
     * @param id The id that represent the Permission found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Permission found successfully (status code 200)
     *         or Bad request. Permission ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Permission in the system by its id", nickname = "getPermissionById", notes = "", response = PermissionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission found successfully", response = PermissionDto.class),
        @ApiResponse(code = 400, message = "Bad request. Permission ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auth/bm/v1/permission/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<PermissionDto> _getPermissionById(@ApiParam(value = "The id that represent the Permission found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getPermissionById(id);
    }

    // Override this method
    default  ResponseEntity<PermissionDto> getPermissionById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /auth/bm/v1/permission/getby/{name} : Find a Permission in the system by its email address
     *
     * @param name The name that represent the Permission found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Permission found successfully (status code 200)
     *         or Bad request. Permission name must be an string and not empty. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Permission in the system by its email address", nickname = "getPermissionByName", notes = "", response = PermissionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission found successfully", response = PermissionDto.class),
        @ApiResponse(code = 400, message = "Bad request. Permission name must be an string and not empty."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auth/bm/v1/permission/getby/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<PermissionDto> _getPermissionByName(@ApiParam(value = "The name that represent the Permission found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("name") String name) {
        return getPermissionByName(name);
    }

    // Override this method
    default  ResponseEntity<PermissionDto> getPermissionByName(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /auth/bm/v1/token/getby/{tokenValue} : Find a Permission in the system by its email address
     *
     * @param tokenValue The name that represent the Token found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Token found successfully (status code 200)
     *         or Bad request. Token name must be an string and not empty. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Permission in the system by its email address", nickname = "getPermissionByTokenvalue", notes = "", response = TokenDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Token found successfully", response = TokenDto.class),
        @ApiResponse(code = 400, message = "Bad request. Token name must be an string and not empty."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auth/bm/v1/token/getby/{tokenValue}",
        produces = { "application/json" }
    )
    default ResponseEntity<TokenDto> _getPermissionByTokenvalue(@ApiParam(value = "The name that represent the Token found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("tokenValue") String tokenValue) {
        return getPermissionByTokenvalue(tokenValue);
    }

    // Override this method
    default  ResponseEntity<TokenDto> getPermissionByTokenvalue(String tokenValue) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expired\" : true, \"userbmId\" : 6, \"id\" : 0, \"tokenType\" : \"Bearer\", \"revoked\" : true, \"tokenValue\" : \"tokenValue\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/bm/v1/permission/list : Path used to list permission that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Permission list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list permission that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getPermissionList", notes = "", response = PermissionDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission list found successfully", response = PermissionDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/permission/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<PermissionDto>> _getPermissionList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getPermissionList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<PermissionDto>> getPermissionList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/bm/v1/permission/page : Path used to list permission page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Permission page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list permission page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getPermissionPage", notes = "", response = PageofPermissionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission page found successfully", response = PageofPermissionDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/permission/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofPermissionDto> _getPermissionPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getPermissionPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofPermissionDto> getPermissionPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 5, \"currentPage\" : 1, \"content\" : [ { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }, { \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /auth/bm/v1/token/getby/{id} : Find a token in the system by its id
     *
     * @param id The id that represent the Token found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Token found successfully (status code 200)
     *         or Bad request. Token ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a token in the system by its id", nickname = "getTokenById", notes = "", response = TokenDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Token found successfully", response = TokenDto.class),
        @ApiResponse(code = 400, message = "Bad request. Token ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auth/bm/v1/token/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<TokenDto> _getTokenById(@ApiParam(value = "The id that represent the Token found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getTokenById(id);
    }

    // Override this method
    default  ResponseEntity<TokenDto> getTokenById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expired\" : true, \"userbmId\" : 6, \"id\" : 0, \"tokenType\" : \"Bearer\", \"revoked\" : true, \"tokenValue\" : \"tokenValue\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/bm/v1/token/list : Path used to list token that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Token list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list token that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getTokenList", notes = "", response = TokenDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Token list found successfully", response = TokenDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/token/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<TokenDto>> _getTokenList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getTokenList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<TokenDto>> getTokenList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expired\" : true, \"userbmId\" : 6, \"id\" : 0, \"tokenType\" : \"Bearer\", \"revoked\" : true, \"tokenValue\" : \"tokenValue\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/bm/v1/permission/create : Path used to save a new permission associate to a role in the system
     *
     * @param permissionDto  (optional)
     * @return Permission saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new permission associate to a role in the system", nickname = "savePermission", notes = "", response = PermissionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission saved successfully", response = PermissionDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/permission/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PermissionDto> _savePermission(@ApiParam(value = "") @Valid @RequestBody(required = false) PermissionDto permissionDto) {
        return savePermission(permissionDto);
    }

    // Override this method
    default  ResponseEntity<PermissionDto> savePermission(PermissionDto permissionDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 5, \"permissionDescription\" : \"permissionDescription\", \"permissionName\" : \"permissionName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /auth/bm/v1/token/create : Path used to save a new connexion token in the system
     *
     * @param tokenDto  (optional)
     * @return Permission saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new connexion token in the system", nickname = "saveToken", notes = "", response = TokenDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Permission saved successfully", response = TokenDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/auth/bm/v1/token/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TokenDto> _saveToken(@ApiParam(value = "") @Valid @RequestBody(required = false) TokenDto tokenDto) {
        return saveToken(tokenDto);
    }

    // Override this method
    default  ResponseEntity<TokenDto> saveToken(TokenDto tokenDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"expired\" : true, \"userbmId\" : 6, \"id\" : 0, \"tokenType\" : \"Bearer\", \"revoked\" : true, \"tokenValue\" : \"tokenValue\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
