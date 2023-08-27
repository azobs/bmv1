/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofProviderDto;
import com.c2psi.bmv1.dto.ProviderDto;
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
@Api(value = "provider", description = "the provider API")
public interface ProviderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /provider/bm/v1/delete/{id} : Path used to delete a provider in the system with its id
     *
     * @param id The id that represent the provider to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Provider deleted successfully (status code 200)
     *         or Bad request. Loading ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a provider in the system with its id", nickname = "deleteProviderById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Loading ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/provider/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteProviderById(@ApiParam(value = "The id that represent the provider to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteProviderById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteProviderById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /provider/bm/v1/getby/{id} : Find a Provider in the system by its id
     *
     * @param id The id that represent the Provider found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Provider found successfully (status code 200)
     *         or Bad request. Provider ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Provider in the system by its id", nickname = "getProviderById", notes = "", response = ProviderDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider found successfully", response = ProviderDto.class),
        @ApiResponse(code = 400, message = "Bad request. Provider ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/provider/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ProviderDto> _getProviderById(@ApiParam(value = "The id that represent the Provider found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getProviderById(id);
    }

    // Override this method
    default  ResponseEntity<ProviderDto> getProviderById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /provider/bm/v1/list : Path used to list provider that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Provider list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list provider that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getProviderList", notes = "", response = ProviderDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider list found successfully", response = ProviderDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/provider/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<ProviderDto>> _getProviderList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProviderList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<ProviderDto>> getProviderList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /provider/bm/v1/page : Path used to list provider page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Provider page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list provider page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getProviderPage", notes = "", response = PageofProviderDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider page found successfully", response = PageofProviderDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/provider/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofProviderDto> _getProviderPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProviderPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofProviderDto> getProviderPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" }, { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /provider/bm/v1/create : Path used to save a new Provider in the system
     *
     * @param providerDto  (optional)
     * @return Provider saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Provider in the system", nickname = "saveProvider", notes = "", response = ProviderDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider saved successfully", response = ProviderDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/provider/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProviderDto> _saveProvider(@ApiParam(value = "") @Valid @RequestBody(required = false) ProviderDto providerDto) {
        return saveProvider(providerDto);
    }

    // Override this method
    default  ResponseEntity<ProviderDto> saveProvider(ProviderDto providerDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /provider/bm/v1/update : Path used to update or modify an existing Provider in the system
     *
     * @param providerDto  (optional)
     * @return Provider updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Provider in the system", nickname = "updateProvider", notes = "", response = ProviderDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Provider updated successfully", response = ProviderDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/provider/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProviderDto> _updateProvider(@ApiParam(value = "") @Valid @RequestBody(required = false) ProviderDto providerDto) {
        return updateProvider(providerDto);
    }

    // Override this method
    default  ResponseEntity<ProviderDto> updateProvider(ProviderDto providerDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 0, \"providerPosId\" : 6, \"providerName\" : \"providerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
