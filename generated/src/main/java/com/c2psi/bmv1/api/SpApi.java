/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.SpecialpriceDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-12T10:38:54.913224900+01:00[Africa/Douala]")
@Validated
@Api(value = "sp", description = "the sp API")
public interface SpApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /sp/bmV1.0/delete/{id} : Path used to delete a specialprice in the system with its id
     *
     * @param id The id that represent the Specialprice to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Specialprice deleted successfully (status code 200)
     *         or Bad request. Specialprice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a specialprice in the system with its id", nickname = "deleteSpecialpriceById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Specialprice deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Specialprice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/sp/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteSpecialpriceById(@ApiParam(value = "The id that represent the Specialprice to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteSpecialpriceById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteSpecialpriceById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sp/bmV1.0/getby/{id} : Find a Specialprice in the system by its id
     *
     * @param id The id that represent the Specialprice found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Specialprice found successfully (status code 200)
     *         or Bad request. Specialprice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Specialprice in the system by its id", nickname = "getSpecialpriceById", notes = "", response = SpecialpriceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Specialprice found successfully", response = SpecialpriceDto.class),
        @ApiResponse(code = 400, message = "Bad request. Specialprice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/sp/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<SpecialpriceDto> _getSpecialpriceById(@ApiParam(value = "The id that represent the Specialprice found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getSpecialpriceById(id);
    }

    // Override this method
    default  ResponseEntity<SpecialpriceDto> getSpecialpriceById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"spSemiwholeprice\" : 0.14658129805029452, \"spBaseprice\" : { \"bpSemiwholeprice\" : 0.5637376656633328, \"bpPurchaseprice\" : 0.14658129805029452, \"bpDetailsprice\" : 0.23021358869347652, \"id\" : 6, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 }, \"bpWholeprice\" : 0.5962133916683182, \"bpPrecompte\" : 0 }, \"spWholeprice\" : 0.6027456183070403, \"spRistourne\" : 0, \"spDetailsprice\" : 0.5962133916683182, \"id\" : 0, \"spPrecompte\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /sp/bmV1.0/create : Path used to save a new Specialprice of an article link to a Baseprice in the system
     *
     * @param specialpriceDto  (optional)
     * @return Specialprice for a Baseprice of an article saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Specialprice of an article link to a Baseprice in the system", nickname = "saveSpecialprice", notes = "", response = SpecialpriceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Specialprice for a Baseprice of an article saved successfully", response = SpecialpriceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/sp/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SpecialpriceDto> _saveSpecialprice(@ApiParam(value = "") @Valid @RequestBody(required = false) SpecialpriceDto specialpriceDto) {
        return saveSpecialprice(specialpriceDto);
    }

    // Override this method
    default  ResponseEntity<SpecialpriceDto> saveSpecialprice(SpecialpriceDto specialpriceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"spSemiwholeprice\" : 0.14658129805029452, \"spBaseprice\" : { \"bpSemiwholeprice\" : 0.5637376656633328, \"bpPurchaseprice\" : 0.14658129805029452, \"bpDetailsprice\" : 0.23021358869347652, \"id\" : 6, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 }, \"bpWholeprice\" : 0.5962133916683182, \"bpPrecompte\" : 0 }, \"spWholeprice\" : 0.6027456183070403, \"spRistourne\" : 0, \"spDetailsprice\" : 0.5962133916683182, \"id\" : 0, \"spPrecompte\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /sp/bmV1.0/update : Path used to update or modify an existing Specialprice in the system
     *
     * @param specialpriceDto  (optional)
     * @return Special price updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Specialprice in the system", nickname = "updateSpecialprice", notes = "", response = SpecialpriceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Special price updated successfully", response = SpecialpriceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/sp/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SpecialpriceDto> _updateSpecialprice(@ApiParam(value = "") @Valid @RequestBody(required = false) SpecialpriceDto specialpriceDto) {
        return updateSpecialprice(specialpriceDto);
    }

    // Override this method
    default  ResponseEntity<SpecialpriceDto> updateSpecialprice(SpecialpriceDto specialpriceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"spSemiwholeprice\" : 0.14658129805029452, \"spBaseprice\" : { \"bpSemiwholeprice\" : 0.5637376656633328, \"bpPurchaseprice\" : 0.14658129805029452, \"bpDetailsprice\" : 0.23021358869347652, \"id\" : 6, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 }, \"bpWholeprice\" : 0.5962133916683182, \"bpPrecompte\" : 0 }, \"spWholeprice\" : 0.6027456183070403, \"spRistourne\" : 0, \"spDetailsprice\" : 0.5962133916683182, \"id\" : 0, \"spPrecompte\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
