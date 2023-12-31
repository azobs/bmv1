/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.InventoryDto;
import com.c2psi.bmv1.dto.InventorylineDto;
import com.c2psi.bmv1.dto.PageofInventoryDto;
import com.c2psi.bmv1.dto.PageofInventorylineDto;
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
@Api(value = "inventory", description = "the inventory API")
public interface InventoryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /inventory/bm/v1/delete/{id} : Path used to delete a inventory in the system with its id
     *
     * @param id The id that represent the Inventory to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Inventory deleted successfully (status code 200)
     *         or Bad request. Currency ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a inventory in the system with its id", nickname = "deleteInventoryById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Currency ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/inventory/bm/v1/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteInventoryById(@ApiParam(value = "The id that represent the Inventory to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteInventoryById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteInventoryById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /inventory/bm/v1/line/delete/{id} : Path used to delete a inventoryline in the system with its id
     *
     * @param id The id that represent the Inventoryline to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Inventoryline deleted successfully (status code 200)
     *         or Bad request. Currency ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a inventoryline in the system with its id", nickname = "deleteInventorylineById", notes = "", response = Boolean.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Currency ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/inventory/bm/v1/line/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteInventorylineById(@ApiParam(value = "The id that represent the Inventoryline to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteInventorylineById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteInventorylineById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /inventory/bm/v1/getby/{id} : Find a Inventory in the system by its id
     *
     * @param id The id that represent the Inventory found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Inventory found successfully (status code 200)
     *         or Bad request. Inventory ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Inventory in the system by its id", nickname = "getInventoryById", notes = "", response = InventoryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory found successfully", response = InventoryDto.class),
        @ApiResponse(code = 400, message = "Bad request. Inventory ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/inventory/bm/v1/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<InventoryDto> _getInventoryById(@ApiParam(value = "The id that represent the Inventory found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getInventoryById(id);
    }

    // Override this method
    default  ResponseEntity<InventoryDto> getInventoryById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/list : Path used to list inventory that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Inventory list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list inventory that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getInventoryList", notes = "", response = InventoryDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory list found successfully", response = InventoryDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<InventoryDto>> _getInventoryList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getInventoryList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<InventoryDto>> getInventoryList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/page : Path used to list Inventory page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Inventory page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Inventory page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getInventoryPage", notes = "", response = PageofInventoryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory page found successfully", response = PageofInventoryDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofInventoryDto> _getInventoryPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getInventoryPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofInventoryDto> getInventoryPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 }, { \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /inventory/bm/v1/line/getby/{id} : Find a Inventoryline in the system by its id
     *
     * @param id The id that represent the Inventoryline found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Inventoryline found successfully (status code 200)
     *         or Bad request. Inventory ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Inventoryline in the system by its id", nickname = "getInventorylineById", notes = "", response = InventorylineDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline found successfully", response = InventorylineDto.class),
        @ApiResponse(code = 400, message = "Bad request. Inventory ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/inventory/bm/v1/line/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<InventorylineDto> _getInventorylineById(@ApiParam(value = "The id that represent the Inventoryline found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getInventorylineById(id);
    }

    // Override this method
    default  ResponseEntity<InventorylineDto> getInventorylineById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/line/list : Path used to list inventoryline that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Inventoryline list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list inventoryline that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getInventorylineList", notes = "", response = InventorylineDto.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline list found successfully", response = InventorylineDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/line/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<InventorylineDto>> _getInventorylineList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getInventorylineList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<InventorylineDto>> getInventorylineList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/line/page : Path used to list Inventoryline page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Inventoryline page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Inventoryline page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getInventorylinePage", notes = "", response = PageofInventorylineDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline page found successfully", response = PageofInventorylineDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/line/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofInventorylineDto> _getInventorylinePage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getInventorylinePage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofInventorylineDto> getInventorylinePage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 }, { \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/create : Path used to save a new Inventory in the system
     *
     * @param inventoryDto  (optional)
     * @return Inventory saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Inventory in the system", nickname = "saveInventory", notes = "", response = InventoryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory saved successfully", response = InventoryDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InventoryDto> _saveInventory(@ApiParam(value = "") @Valid @RequestBody(required = false) InventoryDto inventoryDto) {
        return saveInventory(inventoryDto);
    }

    // Override this method
    default  ResponseEntity<InventoryDto> saveInventory(InventoryDto inventoryDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /inventory/bm/v1/line/create : Path used to save a new Inventoryline in the system
     *
     * @param inventorylineDto  (optional)
     * @return Inventoryline saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Inventoryline in the system", nickname = "saveInventoryline", notes = "", response = InventorylineDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline saved successfully", response = InventorylineDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/inventory/bm/v1/line/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InventorylineDto> _saveInventoryline(@ApiParam(value = "") @Valid @RequestBody(required = false) InventorylineDto inventorylineDto) {
        return saveInventoryline(inventorylineDto);
    }

    // Override this method
    default  ResponseEntity<InventorylineDto> saveInventoryline(InventorylineDto inventorylineDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /inventory/bm/v1/update : Path used to update or modify an existing inventory in the system
     *
     * @param inventoryDto  (optional)
     * @return Inventory updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing inventory in the system", nickname = "updateInventory", notes = "", response = InventoryDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventory updated successfully", response = InventoryDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/inventory/bm/v1/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InventoryDto> _updateInventory(@ApiParam(value = "") @Valid @RequestBody(required = false) InventoryDto inventoryDto) {
        return updateInventory(inventoryDto);
    }

    // Override this method
    default  ResponseEntity<InventoryDto> updateInventory(InventoryDto inventoryDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"invCode\" : \"I0000\", \"invDate\" : \"2000-01-23T04:56:07.000+00:00\", \"invComment\" : \"invComment\", \"invPosId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /inventory/bm/v1/line/update : Path used to update or modify an existing inventoryline in the system
     *
     * @param inventorylineDto  (optional)
     * @return Inventoryline updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing inventoryline in the system", nickname = "updateInventoryline", notes = "", response = InventorylineDto.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Inventoryline updated successfully", response = InventorylineDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/inventory/bm/v1/line/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<InventorylineDto> _updateInventoryline(@ApiParam(value = "") @Valid @RequestBody(required = false) InventorylineDto inventorylineDto) {
        return updateInventoryline(inventorylineDto);
    }

    // Override this method
    default  ResponseEntity<InventorylineDto> updateInventoryline(InventorylineDto inventorylineDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"realqteinStock\" : 0, \"invlineComment\" : \"invlineComment\", \"inventoryId\" : 6, \"invlineArticleId\" : 1, \"id\" : 0, \"logicqteinStock\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
