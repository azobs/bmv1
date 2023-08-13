/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.LoadingDto;
import com.c2psi.bmv1.dto.PageofLoadingDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-13T03:59:42.033168+01:00[Africa/Douala]")
@Validated
@Api(value = "loading", description = "the loading API")
public interface LoadingApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /loading/bmV1.0/delete/{id} : Path used to delete a loading in the system with its id
     *
     * @param id The id that represent the Loading to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Loading deleted successfully (status code 200)
     *         or Bad request. Loading ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a loading in the system with its id", nickname = "deleteLoadingById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Loading ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/loading/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteLoadingById(@ApiParam(value = "The id that represent the Loading to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteLoadingById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteLoadingById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /loading/bmV1.0/getby/{id} : Find a Loading in the system by its id
     *
     * @param id The id that represent the Loading found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Loading found successfully (status code 200)
     *         or Bad request. Loading ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Loading in the system by its id", nickname = "getLoadingById", notes = "", response = LoadingDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading found successfully", response = LoadingDto.class),
        @ApiResponse(code = 400, message = "Bad request. Loading ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/loading/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<LoadingDto> _getLoadingById(@ApiParam(value = "The id that represent the Loading found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getLoadingById(id);
    }

    // Override this method
    default  ResponseEntity<LoadingDto> getLoadingById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /loading/bmV1.0/list : Path used to list loading that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Loading list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list loading that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getLoadingList", notes = "", response = LoadingDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading list found successfully", response = LoadingDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/loading/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<LoadingDto>> _getLoadingList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getLoadingList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<LoadingDto>> getLoadingList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /loading/bmV1.0/page : Path used to list loading page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Loading page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list loading page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getLoadingPage", notes = "", response = PageofLoadingDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading page found successfully", response = PageofLoadingDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/loading/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofLoadingDto> _getLoadingPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getLoadingPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofLoadingDto> getLoadingPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, { \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /loading/bmV1.0/create : Path used to save a new Loading in the system
     *
     * @param loadingDto  (optional)
     * @return Loading saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Loading in the system", nickname = "saveLoading", notes = "", response = LoadingDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading saved successfully", response = LoadingDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/loading/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LoadingDto> _saveLoading(@ApiParam(value = "") @Valid @RequestBody(required = false) LoadingDto loadingDto) {
        return saveLoading(loadingDto);
    }

    // Override this method
    default  ResponseEntity<LoadingDto> saveLoading(LoadingDto loadingDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /loading/bmV1.0/update : Path used to update or modify an existing Loading in the system
     *
     * @param loadingDto  (optional)
     * @return Loading updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Loading in the system", nickname = "updateLoading", notes = "", response = LoadingDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Loading updated successfully", response = LoadingDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/loading/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LoadingDto> _updateLoading(@ApiParam(value = "") @Valid @RequestBody(required = false) LoadingDto loadingDto) {
        return updateLoading(loadingDto);
    }

    // Override this method
    default  ResponseEntity<LoadingDto> updateLoading(LoadingDto loadingDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"loadReport\" : \"loadReport\", \"loadSaler\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"loadPaidamount\" : 1.1465812980502945, \"loadCode\" : \"L0000\", \"id\" : 0, \"loadExpectedamount\" : 1.6027456183070403, \"loadDate\" : \"2000-01-23T04:56:07.000+00:00\", \"loadPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"loadRemise\" : 0.5962133916683182, \"loadManager\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
