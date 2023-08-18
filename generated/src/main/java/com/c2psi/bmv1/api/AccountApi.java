/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.AccountDto;
import com.c2psi.bmv1.dto.AccountOperationDto;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofAccountDto;
import com.c2psi.bmv1.dto.PageofAccountOperationDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-18T07:37:22.558276100+01:00[Africa/Casablanca]")
@Validated
@Api(value = "account", description = "the account API")
public interface AccountApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /account/bmV1.0/delete/{id} : Path used to delete an account in the system with its id
     *
     * @param id The id that represent the Account to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Account deleted successfully (status code 200)
     *         or Bad request. Account ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete an account in the system with its id", nickname = "deleteAccountById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Account ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/account/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteAccountById(@ApiParam(value = "The id that represent the Account to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteAccountById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteAccountById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /account/operation/bmV1.0/delete/{id} : Path used to delete an account operation in the system with its id
     *
     * @param id The id that represent the AccountOperation to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return AccountOperation deleted successfully (status code 200)
     *         or Bad request. Operation ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete an account operation in the system with its id", nickname = "deleteAccountOperationById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Operation ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/account/operation/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteAccountOperationById(@ApiParam(value = "The id that represent the AccountOperation to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteAccountOperationById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteAccountOperationById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /account/bmV1.0/getby/{id} : Find an Account in the system by its id
     *
     * @param id The id that represent the Account found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Account found successfully (status code 200)
     *         or Bad request. Account ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find an Account in the system by its id", nickname = "getAccountById", notes = "", response = AccountDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account found successfully", response = AccountDto.class),
        @ApiResponse(code = 400, message = "Bad request. Account ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<AccountDto> _getAccountById(@ApiParam(value = "The id that represent the Account found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getAccountById(id);
    }

    // Override this method
    default  ResponseEntity<AccountDto> getAccountById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/bmV1.0/list : Path used to list account that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Account list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list account that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getAccountList", notes = "", response = AccountDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account list found successfully", response = AccountDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<AccountDto>> _getAccountList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getAccountList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<AccountDto>> getAccountList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /account/operation/bmV1.0/getby/{id} : Find an AccountOperation in the system by its id
     *
     * @param id The id that represent the AccountOperation found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return AccountOperation found successfully (status code 200)
     *         or Bad request. Operation ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find an AccountOperation in the system by its id", nickname = "getAccountOperationById", notes = "", response = AccountOperationDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation found successfully", response = AccountOperationDto.class),
        @ApiResponse(code = 400, message = "Bad request. Operation ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/operation/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<AccountOperationDto> _getAccountOperationById(@ApiParam(value = "The id that represent the AccountOperation found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getAccountOperationById(id);
    }

    // Override this method
    default  ResponseEntity<AccountOperationDto> getAccountOperationById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/operation/bmV1.0/list : Path used to list accountoperation that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return AccountOperation list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list accountoperation that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getAccountOperationList", notes = "", response = AccountOperationDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation list found successfully", response = AccountOperationDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/operation/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<AccountOperationDto>> _getAccountOperationList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getAccountOperationList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<AccountOperationDto>> getAccountOperationList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/operation/bmV1.0/page : Path used to list AccountOperation page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return AccountOperation page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list AccountOperation page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getAccountOperationPage", notes = "", response = PageofAccountOperationDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation page found successfully", response = PageofAccountOperationDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/operation/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofAccountOperationDto> _getAccountOperationPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getAccountOperationPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofAccountOperationDto> getAccountOperationPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 }, { \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/bmV1.0/page : Path used to list Account page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Account page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Account page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getAccountPage", notes = "", response = PageofAccountDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account page found successfully", response = PageofAccountDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofAccountDto> _getAccountPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getAccountPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofAccountDto> getAccountPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 }, { \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/bmV1.0/create : Path used to save a new Account in the system to manage packaging, cover and damage article
     *
     * @param accountDto  (optional)
     * @return Account saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Account in the system to manage packaging, cover and damage article", nickname = "saveAccount", notes = "", response = AccountDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account saved successfully", response = AccountDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AccountDto> _saveAccount(@ApiParam(value = "") @Valid @RequestBody(required = false) AccountDto accountDto) {
        return saveAccount(accountDto);
    }

    // Override this method
    default  ResponseEntity<AccountDto> saveAccount(AccountDto accountDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/operation/bmV1.0/create : Path used to save a new AccountOperation in the system to have history of all operations in the system
     *
     * @param accountOperationDto  (optional)
     * @return AccountOperation saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new AccountOperation in the system to have history of all operations in the system", nickname = "saveAccountOperation", notes = "", response = AccountOperationDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation saved successfully", response = AccountOperationDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/operation/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AccountOperationDto> _saveAccountOperation(@ApiParam(value = "") @Valid @RequestBody(required = false) AccountOperationDto accountOperationDto) {
        return saveAccountOperation(accountOperationDto);
    }

    // Override this method
    default  ResponseEntity<AccountOperationDto> saveAccountOperation(AccountOperationDto accountOperationDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /account/bmV1.0/update : Path used to update or modify an existing Account in the system
     *
     * @param accountDto  (optional)
     * @return Account updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Account in the system", nickname = "updateAccount", notes = "", response = AccountDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Account updated successfully", response = AccountDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/account/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AccountDto> _updateAccount(@ApiParam(value = "") @Valid @RequestBody(required = false) AccountDto accountDto) {
        return updateAccount(accountDto);
    }

    // Override this method
    default  ResponseEntity<AccountDto> updateAccount(AccountDto accountDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"damageNumber\" : 0, \"accountClientId\" : 6, \"accountPackagingId\" : 2, \"accountType\" : \"Pos\", \"accountProviderId\" : 5, \"accountArticleId\" : 5, \"accountPosId\" : 1, \"id\" : 0, \"coverNumber\" : 0, \"packageNumber\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /account/operation/bmV1.0/update : Path used to update or modify an existing AccountOperation in the system
     *
     * @param accountOperationDto  (optional)
     * @return AccountOperation updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing AccountOperation in the system", nickname = "updateAccountOperation", notes = "", response = AccountOperationDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "AccountOperation updated successfully", response = AccountOperationDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/account/operation/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<AccountOperationDto> _updateAccountOperation(@ApiParam(value = "") @Valid @RequestBody(required = false) AccountOperationDto accountOperationDto) {
        return updateAccountOperation(accountOperationDto);
    }

    // Override this method
    default  ResponseEntity<AccountOperationDto> updateAccountOperation(AccountOperationDto accountOperationDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accountId\" : 1, \"quantityinMvt\" : 1, \"operationId\" : 6, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
