/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofSaleinvoiceDto;
import com.c2psi.bmv1.dto.SaleinvoiceDto;
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
@Api(value = "saleinvoice", description = "the saleinvoice API")
public interface SaleinvoiceApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /saleinvoice/bm/v1/delete/{id} : Path used to delete a Saleinvoice in the system with its id
     *
     * @param id The id that represent the Saleinvoice to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Saleinvoice deleted successfully (status code 200)
     *         or Bad request. Saleinvoice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a Saleinvoice in the system with its id", nickname = "deleteSaleinvoiceById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Saleinvoice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/saleinvoice/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteSaleinvoiceById(@ApiParam(value = "The id that represent the Saleinvoice to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteSaleinvoiceById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteSaleinvoiceById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /saleinvoice/bm/v1/getby/{id} : Find a Saleinvoice in the system by its id
     *
     * @param id The id that represent the Saleinvoice found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Saleinvoice found successfully (status code 200)
     *         or Bad request. Saleinvoice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Saleinvoice in the system by its id", nickname = "getSaleinvoiceById", notes = "", response = SaleinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice found successfully", response = SaleinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. Saleinvoice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/saleinvoice/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<SaleinvoiceDto> _getSaleinvoiceById(@ApiParam(value = "The id that represent the Saleinvoice found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getSaleinvoiceById(id);
    }

    // Override this method
    default  ResponseEntity<SaleinvoiceDto> getSaleinvoiceById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /saleinvoice/bm/v1/list : Path used to list saleinvoice that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Saleinvoice list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list saleinvoice that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getSaleinvoiceList", notes = "", response = SaleinvoiceDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice list found successfully", response = SaleinvoiceDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/saleinvoice/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<SaleinvoiceDto>> _getSaleinvoiceList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getSaleinvoiceList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<SaleinvoiceDto>> getSaleinvoiceList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /saleinvoice/bm/v1/page : Path used to list Saleinvoice page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Saleinvoice page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Saleinvoice page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getSaleinvoicePage", notes = "", response = PageofSaleinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice page found successfully", response = PageofSaleinvoiceDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/saleinvoice/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofSaleinvoiceDto> _getSaleinvoicePage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getSaleinvoicePage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofSaleinvoiceDto> getSaleinvoicePage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" }, { \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /saleinvoice/bm/v1/create : Path used to save a new Saleinvoice in the system
     *
     * @param saleinvoiceDto  (optional)
     * @return Saleinvoice saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Saleinvoice in the system", nickname = "saveSaleinvoice", notes = "", response = SaleinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice saved successfully", response = SaleinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/saleinvoice/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SaleinvoiceDto> _saveSaleinvoice(@ApiParam(value = "") @Valid @RequestBody(required = false) SaleinvoiceDto saleinvoiceDto) {
        return saveSaleinvoice(saleinvoiceDto);
    }

    // Override this method
    default  ResponseEntity<SaleinvoiceDto> saveSaleinvoice(SaleinvoiceDto saleinvoiceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /saleinvoice/bm/v1/update : Path used to update or modify an existing Saleinvoice in the system
     *
     * @param saleinvoiceDto  (optional)
     * @return Saleinvoice updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Saleinvoice in the system", nickname = "updateSaleinvoice", notes = "", response = SaleinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Saleinvoice updated successfully", response = SaleinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/saleinvoice/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SaleinvoiceDto> _updateSaleinvoice(@ApiParam(value = "") @Valid @RequestBody(required = false) SaleinvoiceDto saleinvoiceDto) {
        return updateSaleinvoice(saleinvoiceDto);
    }

    // Override this method
    default  ResponseEntity<SaleinvoiceDto> updateSaleinvoice(SaleinvoiceDto saleinvoiceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 1.4658129805029452, \"siCode\" : \"0\", \"siPaidamount\" : 5.962133916683182, \"id\" : 0, \"siTotalcolis\" : 6.027456183070403, \"siPosId\" : 5, \"siComment\" : \"siComment\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
