/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.ArrivalDto;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofArrivalDto;
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
@Api(value = "arrival", description = "the arrival API")
public interface ArrivalApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /arrival/bm/v1/delete/{id} : Path used to delete an arrival in the system with its id
     *
     * @param id The id that represent the Arrival to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Arrival deleted successfully (status code 200)
     *         or Bad request. Arrival ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete an arrival in the system with its id", nickname = "deleteArrivalById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Arrival ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/arrival/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteArrivalById(@ApiParam(value = "The id that represent the Arrival to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteArrivalById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteArrivalById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /arrival/bm/v1/getby/{id} : Find an Arrival in the system by its id
     *
     * @param id The id that represent the Arrival found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Arrival found successfully (status code 200)
     *         or Bad request. Arrival ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find an Arrival in the system by its id", nickname = "getArrivalById", notes = "", response = ArrivalDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival found successfully", response = ArrivalDto.class),
        @ApiResponse(code = 400, message = "Bad request. Arrival ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/arrival/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ArrivalDto> _getArrivalById(@ApiParam(value = "The id that represent the Arrival found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getArrivalById(id);
    }

    // Override this method
    default  ResponseEntity<ArrivalDto> getArrivalById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /arrival/bm/v1/list : Path used to list arrival that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Arrival list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list arrival that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getArrivalList", notes = "", response = ArrivalDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival list found successfully", response = ArrivalDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/arrival/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<ArrivalDto>> _getArrivalList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getArrivalList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<ArrivalDto>> getArrivalList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /arrival/bm/v1/page : Path used to list Arrival page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Arrival page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Arrival page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getArrivalPage", notes = "", response = PageofArrivalDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival page found successfully", response = PageofArrivalDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/arrival/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofArrivalDto> _getArrivalPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getArrivalPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofArrivalDto> getArrivalPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /arrival/bm/v1/create : Path used to save a new Arrival in the system
     *
     * @param arrivalDto  (optional)
     * @return Arrival saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Arrival in the system", nickname = "saveArrival", notes = "", response = ArrivalDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival saved successfully", response = ArrivalDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/arrival/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ArrivalDto> _saveArrival(@ApiParam(value = "") @Valid @RequestBody(required = false) ArrivalDto arrivalDto) {
        return saveArrival(arrivalDto);
    }

    // Override this method
    default  ResponseEntity<ArrivalDto> saveArrival(ArrivalDto arrivalDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /arrival/bm/v1/update : Path used to update or modify an existing Arrival in the system
     *
     * @param arrivalDto  (optional)
     * @return Arrival updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Arrival in the system", nickname = "updateArrival", notes = "", response = ArrivalDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Arrival updated successfully", response = ArrivalDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/arrival/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ArrivalDto> _updateArrival(@ApiParam(value = "") @Valid @RequestBody(required = false) ArrivalDto arrivalDto) {
        return updateArrival(arrivalDto);
    }

    // Override this method
    default  ResponseEntity<ArrivalDto> updateArrival(ArrivalDto arrivalDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"arrivalType\" : \"Standard\", \"arrivalArticleId\" : 6, \"arrivalUnitprice\" : 1, \"deliveryQuantity\" : 1, \"arrivalInvoiceId\" : 1, \"id\" : 0, \"arrivalNature\" : \"Cash\", \"arrivalDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
