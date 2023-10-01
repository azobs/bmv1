/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.DeliveryDto;
import com.c2psi.bmv1.dto.DeliverydetailsDto;
import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofDeliveryDto;
import com.c2psi.bmv1.dto.PageofDeliverydetailsDto;
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
@Api(value = "delivery", description = "the delivery API")
public interface DeliveryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /delivery/bm/v1/delete/{id} : Path used to delete a Delivery in the system with its id
     *
     * @param id The id that represent the Delivery to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Delivery deleted successfully (status code 200)
     *         or Bad request. Delivery ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a Delivery in the system with its id", nickname = "deleteDeliveryById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Delivery ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/delivery/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteDeliveryById(@ApiParam(value = "The id that represent the Delivery to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteDeliveryById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteDeliveryById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /delivery/bm/v1/details/delete/{id} : Path used to delete a Deliverydetails in the system with its id
     *
     * @param id The id that represent the Deliverydetails to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Deliverydetails deleted successfully (status code 200)
     *         or Bad request. Deliverydetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a Deliverydetails in the system with its id", nickname = "deleteDeliverydetailsById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Deliverydetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/delivery/bm/v1/details/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteDeliverydetailsById(@ApiParam(value = "The id that represent the Deliverydetails to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteDeliverydetailsById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteDeliverydetailsById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /delivery/bm/v1/getby/{id} : Find a Delivery in the system by its id
     *
     * @param id The id that represent the Delivery found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Delivery found successfully (status code 200)
     *         or Bad request. Delivery ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Delivery in the system by its id", nickname = "getDeliveryById", notes = "", response = DeliveryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery found successfully", response = DeliveryDto.class),
        @ApiResponse(code = 400, message = "Bad request. Delivery ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/delivery/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<DeliveryDto> _getDeliveryById(@ApiParam(value = "The id that represent the Delivery found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getDeliveryById(id);
    }

    // Override this method
    default  ResponseEntity<DeliveryDto> getDeliveryById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/list : Path used to list delivery that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Delivery list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list delivery that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getDeliveryList", notes = "", response = DeliveryDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery list found successfully", response = DeliveryDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<DeliveryDto>> _getDeliveryList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getDeliveryList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<DeliveryDto>> getDeliveryList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/page : Path used to list delivery page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Delivery page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list delivery page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getDeliveryPage", notes = "", response = PageofDeliveryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery page found successfully", response = PageofDeliveryDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofDeliveryDto> _getDeliveryPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getDeliveryPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofDeliveryDto> getDeliveryPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" }, { \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /delivery/bm/v1/details/getby/{id} : Find a Deliverydetails in the system by its id
     *
     * @param id The id that represent the Deliverydetails found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Deliverydetails found successfully (status code 200)
     *         or Bad request. Deliverydetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Deliverydetails in the system by its id", nickname = "getDeliverydetailsById", notes = "", response = DeliverydetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails found successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. Deliverydetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/delivery/bm/v1/details/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<DeliverydetailsDto> _getDeliverydetailsById(@ApiParam(value = "The id that represent the Deliverydetails found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getDeliverydetailsById(id);
    }

    // Override this method
    default  ResponseEntity<DeliverydetailsDto> getDeliverydetailsById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/details/list : Path used to list delivery details that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Delivery details list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list delivery details that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getDeliverydetailsList", notes = "", response = DeliverydetailsDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery details list found successfully", response = DeliverydetailsDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/details/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<DeliverydetailsDto>> _getDeliverydetailsList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getDeliverydetailsList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<DeliverydetailsDto>> getDeliverydetailsList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/details/page : Path used to list deliverydetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Deliverydetails page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list deliverydetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getDeliverydetailsPage", notes = "", response = PageofDeliverydetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails page found successfully", response = PageofDeliverydetailsDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/details/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofDeliverydetailsDto> _getDeliverydetailsPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getDeliverydetailsPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofDeliverydetailsDto> getDeliverydetailsPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 }, { \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/create : Path used to save a new Delivery in the system
     *
     * @param deliveryDto  (optional)
     * @return Delivery saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Delivery in the system", nickname = "saveDelivery", notes = "", response = DeliveryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery saved successfully", response = DeliveryDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<DeliveryDto> _saveDelivery(@ApiParam(value = "") @Valid @RequestBody(required = false) DeliveryDto deliveryDto) {
        return saveDelivery(deliveryDto);
    }

    // Override this method
    default  ResponseEntity<DeliveryDto> saveDelivery(DeliveryDto deliveryDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /delivery/bm/v1/details/create : Path used to save a new Deliverydetails in the system
     *
     * @param deliverydetailsDto  (optional)
     * @return Delivery details saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Deliverydetails in the system", nickname = "saveDeliverydetails", notes = "", response = DeliverydetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery details saved successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/delivery/bm/v1/details/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<DeliverydetailsDto> _saveDeliverydetails(@ApiParam(value = "") @Valid @RequestBody(required = false) DeliverydetailsDto deliverydetailsDto) {
        return saveDeliverydetails(deliverydetailsDto);
    }

    // Override this method
    default  ResponseEntity<DeliverydetailsDto> saveDeliverydetails(DeliverydetailsDto deliverydetailsDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /delivery/bm/v1/update : Path used to update or modify an existing delivery in the system
     *
     * @param deliveryDto  (optional)
     * @return Delivery updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing delivery in the system", nickname = "updateDelivery", notes = "", response = DeliveryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery updated successfully", response = DeliveryDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/delivery/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<DeliveryDto> _updateDelivery(@ApiParam(value = "") @Valid @RequestBody(required = false) DeliveryDto deliveryDto) {
        return updateDelivery(deliveryDto);
    }

    // Override this method
    default  ResponseEntity<DeliveryDto> updateDelivery(DeliveryDto deliveryDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"deliveryDeliverId\" : 6, \"deliveryPosId\" : 1, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"id\" : 0, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /delivery/bm/v1/details/update : Path used to update or modify an existing deliverydetails in the system
     *
     * @param deliverydetailsDto  (optional)
     * @return Deliverydetails updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing deliverydetails in the system", nickname = "updateDeliverydetails", notes = "", response = DeliverydetailsDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails updated successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/delivery/bm/v1/details/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<DeliverydetailsDto> _updateDeliverydetails(@ApiParam(value = "") @Valid @RequestBody(required = false) DeliverydetailsDto deliverydetailsDto) {
        return updateDeliverydetails(deliverydetailsDto);
    }

    // Override this method
    default  ResponseEntity<DeliverydetailsDto> updateDeliverydetails(DeliverydetailsDto deliverydetailsDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ddPackagingId\" : 6, \"packageReturn\" : 0, \"ddDeliveryId\" : 1, \"id\" : 0, \"packageUsed\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
