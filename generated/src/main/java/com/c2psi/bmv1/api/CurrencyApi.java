/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.CurrencyDto;
import com.c2psi.bmv1.dto.CurrencyconversionDto;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofCurrencyDto;
import com.c2psi.bmv1.dto.PageofCurrencyconversionDto;
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
@Api(value = "currency", description = "the currency API")
public interface CurrencyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /currency/bmV1.0/delete/{id} : Path used to delete a currency in the system with its id
     *
     * @param id The id that represent the Currency to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Currency deleted successfully (status code 200)
     *         or Bad request. Currency ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a currency in the system with its id", nickname = "deleteCurrencyById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Currency ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/currency/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteCurrencyById(@ApiParam(value = "The id that represent the Currency to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteCurrencyById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteCurrencyById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /currency/conversion/bmV1.0/delete/{id} : Path used to delete a currency conversion in the system with its id
     *
     * @param id The id that represent the Currencyconversion to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Currencyconversion deleted successfully (status code 200)
     *         or Bad request. Unitconversion ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a currency conversion in the system with its id", nickname = "deleteCurrencyconversionById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Unitconversion ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/currency/conversion/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteCurrencyconversionById(@ApiParam(value = "The id that represent the Currencyconversion to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteCurrencyconversionById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteCurrencyconversionById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /currency/bmV1.0/getby/{id} : Find a Currency in the system by its id
     *
     * @param id The id that represent the Currency found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Currency found successfully (status code 200)
     *         or Bad request. Currency ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Currency in the system by its id", nickname = "getCurrencyById", notes = "", response = CurrencyDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency found successfully", response = CurrencyDto.class),
        @ApiResponse(code = 400, message = "Bad request. Currency ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/currency/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<CurrencyDto> _getCurrencyById(@ApiParam(value = "The id that represent the Currency found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getCurrencyById(id);
    }

    // Override this method
    default  ResponseEntity<CurrencyDto> getCurrencyById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/bmV1.0/list : Path used to list currency that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Currency list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list currency that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getCurrencyList", notes = "", response = CurrencyDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency list found successfully", response = CurrencyDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<CurrencyDto>> _getCurrencyList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getCurrencyList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<CurrencyDto>> getCurrencyList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/bmV1.0/page : Path used to list currency page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Currency page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list currency page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getCurrencyPage", notes = "", response = PageofCurrencyDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency page found successfully", response = PageofCurrencyDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofCurrencyDto> _getCurrencyPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getCurrencyPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofCurrencyDto> getCurrencyPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 }, { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /currency/conversion/bmV1.0/getby/{id} : Find a Currencyconversion in the system by its id
     *
     * @param id The id that represent the Currencyconversion found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Currencyconversion found successfully (status code 200)
     *         or Bad request. Currencyconversion ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Currencyconversion in the system by its id", nickname = "getCurrencyconversionById", notes = "", response = CurrencyconversionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion found successfully", response = CurrencyconversionDto.class),
        @ApiResponse(code = 400, message = "Bad request. Currencyconversion ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/currency/conversion/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<CurrencyconversionDto> _getCurrencyconversionById(@ApiParam(value = "The id that represent the Currencyconversion found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getCurrencyconversionById(id);
    }

    // Override this method
    default  ResponseEntity<CurrencyconversionDto> getCurrencyconversionById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/conversion/bmV1.0/list : Path used to list currencyconversion that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Currencyconversion list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list currencyconversion that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getCurrencyconversionList", notes = "", response = CurrencyconversionDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion list found successfully", response = CurrencyconversionDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/conversion/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<CurrencyconversionDto>> _getCurrencyconversionList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getCurrencyconversionList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<CurrencyconversionDto>> getCurrencyconversionList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/conversion/bmV1.0/page : Path used to list currencyconversion page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Currencyconversion page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list currencyconversion page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getCurrencyconversionPage", notes = "", response = PageofCurrencyconversionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion page found successfully", response = PageofCurrencyconversionDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/conversion/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofCurrencyconversionDto> _getCurrencyconversionPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getCurrencyconversionPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofCurrencyconversionDto> getCurrencyconversionPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 5, \"currentPage\" : 1, \"content\" : [ { \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 }, { \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/bmV1.0/create : Path used to save a new Currency of product in the system
     *
     * @param currencyDto  (optional)
     * @return Currency saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Currency of product in the system", nickname = "saveCurrency", notes = "", response = CurrencyDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency saved successfully", response = CurrencyDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CurrencyDto> _saveCurrency(@ApiParam(value = "") @Valid @RequestBody(required = false) CurrencyDto currencyDto) {
        return saveCurrency(currencyDto);
    }

    // Override this method
    default  ResponseEntity<CurrencyDto> saveCurrency(CurrencyDto currencyDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /currency/conversion/bmV1.0/create : Path used to save a new Currencyconversion of product in the system
     *
     * @param currencyconversionDto  (optional)
     * @return Currencyconversion saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Currencyconversion of product in the system", nickname = "saveCurrencyconversion", notes = "", response = CurrencyconversionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion saved successfully", response = CurrencyconversionDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/currency/conversion/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CurrencyconversionDto> _saveCurrencyconversion(@ApiParam(value = "") @Valid @RequestBody(required = false) CurrencyconversionDto currencyconversionDto) {
        return saveCurrencyconversion(currencyconversionDto);
    }

    // Override this method
    default  ResponseEntity<CurrencyconversionDto> saveCurrencyconversion(CurrencyconversionDto currencyconversionDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /currency/bmV1.0/update : Path used to update or modify an existing currency in the system
     *
     * @param currencyDto  (optional)
     * @return Currency updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing currency in the system", nickname = "updateCurrency", notes = "", response = CurrencyDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currency updated successfully", response = CurrencyDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/currency/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CurrencyDto> _updateCurrency(@ApiParam(value = "") @Valid @RequestBody(required = false) CurrencyDto currencyDto) {
        return updateCurrency(currencyDto);
    }

    // Override this method
    default  ResponseEntity<CurrencyDto> updateCurrency(CurrencyDto currencyDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /currency/conversion/bmV1.0/update : Path used to update or modify an existing currencyconversion in the system
     *
     * @param currencyconversionDto  (optional)
     * @return Currencyconversion updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing currencyconversion in the system", nickname = "updateCurrencyconversion", notes = "", response = CurrencyconversionDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Currencyconversion updated successfully", response = CurrencyconversionDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/currency/conversion/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<CurrencyconversionDto> _updateCurrencyconversion(@ApiParam(value = "") @Valid @RequestBody(required = false) CurrencyconversionDto currencyconversionDto) {
        return updateCurrencyconversion(currencyconversionDto);
    }

    // Override this method
    default  ResponseEntity<CurrencyconversionDto> updateCurrencyconversion(CurrencyconversionDto currencyconversionDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"currencyDestinationId\" : 5, \"conversionFactor\" : 6.027456183070403, \"id\" : 0, \"currencySourceId\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
