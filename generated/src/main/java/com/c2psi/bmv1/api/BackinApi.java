/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.BackinDto;
import com.c2psi.bmv1.dto.BackindetailsDto;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofBackinDto;
import com.c2psi.bmv1.dto.PageofBackindetailsDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-09-30T16:03:01.698280900+01:00[Africa/Casablanca]")
@Validated
@Api(value = "backin", description = "the backin API")
public interface BackinApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /backin/bm/v1/delete/{id} : Path used to delete a backin in the system with its id
     *
     * @param id The id that represent the Backin to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Backin deleted successfully (status code 200)
     *         or Bad request. Backin ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a backin in the system with its id", nickname = "deleteBackinById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Backin ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/backin/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteBackinById(@ApiParam(value = "The id that represent the Backin to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteBackinById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteBackinById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /backin/bm/v1/details/delete/{id} : Path used to delete a backindetails in the system with its id
     *
     * @param id The id that represent the Backindetails to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Backindetails deleted successfully (status code 200)
     *         or Bad request. Backindetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a backindetails in the system with its id", nickname = "deleteBackindetailsById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Backindetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/backin/bm/v1/details/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteBackindetailsById(@ApiParam(value = "The id that represent the Backindetails to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteBackindetailsById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteBackindetailsById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /backin/bm/v1/getby/{id} : Find a Backin in the system by its id
     *
     * @param id The id that represent the Backin found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Backin found successfully (status code 200)
     *         or Bad request. Backin ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Backin in the system by its id", nickname = "getBackinById", notes = "", response = BackinDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin found successfully", response = BackinDto.class),
        @ApiResponse(code = 400, message = "Bad request. Backin ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/backin/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<BackinDto> _getBackinById(@ApiParam(value = "The id that represent the Backin found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getBackinById(id);
    }

    // Override this method
    default  ResponseEntity<BackinDto> getBackinById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/list : Path used to list backin that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Backin list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list backin that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getBackinList", notes = "", response = BackinDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin list found successfully", response = BackinDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<BackinDto>> _getBackinList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getBackinList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<BackinDto>> getBackinList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/page : Path used to list backin page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Backin page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list backin page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getBackinPage", notes = "", response = PageofBackinDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin page found successfully", response = PageofBackinDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofBackinDto> _getBackinPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getBackinPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofBackinDto> getBackinPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 }, { \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /backin/bm/v1/details/getby/{id} : Find a Backindetails in the system by its id
     *
     * @param id The id that represent the Backindetails found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Backindetails found successfully (status code 200)
     *         or Bad request. Backindetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Backindetails in the system by its id", nickname = "getBackindetailsById", notes = "", response = BackindetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails found successfully", response = BackindetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. Backindetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/backin/bm/v1/details/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<BackindetailsDto> _getBackindetailsById(@ApiParam(value = "The id that represent the Backindetails found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getBackindetailsById(id);
    }

    // Override this method
    default  ResponseEntity<BackindetailsDto> getBackindetailsById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/details/list : Path used to list backindetails that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Backindetails list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list backindetails that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getBackindetailsList", notes = "", response = BackindetailsDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails list found successfully", response = BackindetailsDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/details/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<BackindetailsDto>> _getBackindetailsList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getBackindetailsList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<BackindetailsDto>> getBackindetailsList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/details/page : Path used to list backindetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Backindetails page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list backindetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getBackindetailsPage", notes = "", response = PageofBackindetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails page found successfully", response = PageofBackindetailsDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/details/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofBackindetailsDto> _getBackindetailsPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getBackindetailsPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofBackindetailsDto> getBackindetailsPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 }, { \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/create : Path used to save a new Backin in the system
     *
     * @param backinDto  (optional)
     * @return Backin saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Backin in the system", nickname = "saveBackin", notes = "", response = BackinDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin saved successfully", response = BackinDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BackinDto> _saveBackin(@ApiParam(value = "") @Valid @RequestBody(required = false) BackinDto backinDto) {
        return saveBackin(backinDto);
    }

    // Override this method
    default  ResponseEntity<BackinDto> saveBackin(BackinDto backinDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /backin/bm/v1/details/create : Path used to save a new Backindetails in the system
     *
     * @param backindetailsDto  (optional)
     * @return Backindetails saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Backindetails in the system", nickname = "saveBackindetails", notes = "", response = BackindetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails saved successfully", response = BackindetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/backin/bm/v1/details/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BackindetailsDto> _saveBackindetails(@ApiParam(value = "") @Valid @RequestBody(required = false) BackindetailsDto backindetailsDto) {
        return saveBackindetails(backindetailsDto);
    }

    // Override this method
    default  ResponseEntity<BackindetailsDto> saveBackindetails(BackindetailsDto backindetailsDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /backin/bm/v1/update : Path used to update or modify an existing backin in the system
     *
     * @param backinDto  (optional)
     * @return Backin updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing backin in the system", nickname = "updateBackin", notes = "", response = BackinDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backin updated successfully", response = BackinDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/backin/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BackinDto> _updateBackin(@ApiParam(value = "") @Valid @RequestBody(required = false) BackinDto backinDto) {
        return updateBackin(backinDto);
    }

    // Override this method
    default  ResponseEntity<BackinDto> updateBackin(BackinDto backinDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"biComment\" : \"biComment\", \"biSalerId\" : 1, \"biCommandId\" : 6, \"biDate\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /backin/bm/v1/details/update : Path used to update or modify an existing backindetails in the system
     *
     * @param backindetailsDto  (optional)
     * @return Backindetails updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing backindetails in the system", nickname = "updateBackindetails", notes = "", response = BackindetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Backindetails updated successfully", response = BackindetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/backin/bm/v1/details/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<BackindetailsDto> _updateBackindetails(@ApiParam(value = "") @Valid @RequestBody(required = false) BackindetailsDto backindetailsDto) {
        return updateBackindetails(backindetailsDto);
    }

    // Override this method
    default  ResponseEntity<BackindetailsDto> updateBackindetails(BackindetailsDto backindetailsDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"bidComment\" : \"bidComment\", \"bidQuantity\" : 0, \"bidBackinId\" : 1, \"id\" : 0, \"bidArticleId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
