/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofUserbmDto;
import com.c2psi.bmv1.dto.UserbmDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-11T17:01:56.543198200+01:00[Africa/Douala]")
@Validated
@Api(value = "userbm", description = "the userbm API")
public interface UserbmApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /userbm/bmV1.0/delete/{id} : Path used to delete a userbm in the system with its id
     *
     * @param id The id that represent the Userbm to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm deleted successfully (status code 200)
     *         or Bad request. User ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a userbm in the system with its id", nickname = "deleteUserbmById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. User ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/userbm/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteUserbmById(@ApiParam(value = "The id that represent the Userbm to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteUserbmById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteUserbmById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userbm/bmV1.0/getby/{cni} : Find a Userbm in the system by its cni number
     *
     * @param cni The cni number that represent the Userbm found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm found successfully (status code 200)
     *         or Bad request. User cni number must be an string and not empty. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Userbm in the system by its cni number", nickname = "getUserbmByCni", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm found successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. User cni number must be an string and not empty."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/userbm/bmV1.0/getby/{cni}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _getUserbmByCni(@ApiParam(value = "The cni number that represent the Userbm found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("cni") String cni) {
        return getUserbmByCni(cni);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> getUserbmByCni(String cni) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userbm/bmV1.0/getby/{email} : Find a Userbm in the system by its email address
     *
     * @param email The email that represent the Userbm found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm found successfully (status code 200)
     *         or Bad request. User email address number must be an string and not empty. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Userbm in the system by its email address", nickname = "getUserbmByEmail", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm found successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. User email address number must be an string and not empty."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/userbm/bmV1.0/getby/{email}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _getUserbmByEmail(@ApiParam(value = "The email that represent the Userbm found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("email") String email) {
        return getUserbmByEmail(email);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> getUserbmByEmail(String email) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userbm/bmV1.0/getby/{id} : Find a Userbm in the system by its id
     *
     * @param id The id that represent the Userbm found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm found successfully (status code 200)
     *         or Bad request. User ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Userbm in the system by its id", nickname = "getUserbmById", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm found successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. User ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/userbm/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _getUserbmById(@ApiParam(value = "The id that represent the Userbm found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getUserbmById(id);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> getUserbmById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /userbm/bmV1.0/getby/{login} : Find a Userbm in the system by its login
     *
     * @param login The login that represent the Userbm found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Userbm found successfully (status code 200)
     *         or Bad request. User login must be an string and not empty. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Userbm in the system by its login", nickname = "getUserbmByLogin", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm found successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. User login must be an string and not empty."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/userbm/bmV1.0/getby/{login}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _getUserbmByLogin(@ApiParam(value = "The login that represent the Userbm found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("login") String login) {
        return getUserbmByLogin(login);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> getUserbmByLogin(String login) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm/bmV1.0/list : Path used to list user that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Userbm list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list user that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getUserbmList", notes = "", response = UserbmDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm list found successfully", response = UserbmDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<UserbmDto>> _getUserbmList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getUserbmList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<UserbmDto>> getUserbmList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm/bmV1.0/page : Path used to list users page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Userbm page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list users page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getUserbmPage", notes = "", response = PageofUserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm page found successfully", response = PageofUserbmDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofUserbmDto> _getUserbmPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getUserbmPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofUserbmDto> getUserbmPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 1, \"currentPage\" : 0, \"content\" : [ { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /userbm/bmV1.0/create : Path used to save a new user in the system
     *
     * @param userbmDto  (optional)
     * @return Userbm saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new user in the system", nickname = "saveUserbm", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm saved successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/userbm/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _saveUserbm(@ApiParam(value = "") @Valid @RequestBody(required = false) UserbmDto userbmDto) {
        return saveUserbm(userbmDto);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> saveUserbm(UserbmDto userbmDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /userbm/bmV1.0/update : Path used to update or modify an existing user in the system
     *
     * @param userbmDto  (optional)
     * @return Userbm updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing user in the system", nickname = "updateUserbm", notes = "", response = UserbmDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Userbm updated successfully", response = UserbmDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/userbm/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserbmDto> _updateUserbm(@ApiParam(value = "") @Valid @RequestBody(required = false) UserbmDto userbmDto) {
        return updateUserbm(userbmDto);
    }

    // Override this method
    default  ResponseEntity<UserbmDto> updateUserbm(UserbmDto userbmDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
