/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofProductformatedDto;
import com.c2psi.bmv1.dto.ProductformatedDto;
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
@Api(value = "pf", description = "the pf API")
public interface PfApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /pf/bmV1.0/delete/{id} : Path used to delete a product formated in the system with its id
     *
     * @param id The id that represent the Productformated to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Productformated deleted successfully (status code 200)
     *         or Bad request. Productformated ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a product formated in the system with its id", nickname = "deleteProductformatedById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Productformated deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Productformated ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pf/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteProductformatedById(@ApiParam(value = "The id that represent the Productformated to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteProductformatedById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteProductformatedById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pf/bmV1.0/getby/{id} : Find a Productformated in the system by its id
     *
     * @param id The id that represent the Productformated found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Productformated found successfully (status code 200)
     *         or Bad request. Productformated ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Productformated in the system by its id", nickname = "getProductformatedById", notes = "", response = ProductformatedDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Productformated found successfully", response = ProductformatedDto.class),
        @ApiResponse(code = 400, message = "Bad request. Productformated ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pf/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ProductformatedDto> _getProductformatedById(@ApiParam(value = "The id that represent the Productformated found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getProductformatedById(id);
    }

    // Override this method
    default  ResponseEntity<ProductformatedDto> getProductformatedById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pf/bmV1.0/list : Path used to list productformated that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Productformated list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list productformated that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getProductformatedList", notes = "", response = ProductformatedDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Productformated list found successfully", response = ProductformatedDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pf/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<ProductformatedDto>> _getProductformatedList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProductformatedList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<ProductformatedDto>> getProductformatedList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pf/bmV1.0/page : Path used to list productformated page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Productformated page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list productformated page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getProductformatedPage", notes = "", response = PageofProductformatedDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Productformated page found successfully", response = PageofProductformatedDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pf/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofProductformatedDto> _getProductformatedPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProductformatedPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofProductformatedDto> getProductformatedPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 }, { \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pf/bmV1.0/create : Path used to save a new product formated in the system
     *
     * @param productformatedDto  (optional)
     * @return Product formated saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new product formated in the system", nickname = "saveProductformated", notes = "", response = ProductformatedDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product formated saved successfully", response = ProductformatedDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pf/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProductformatedDto> _saveProductformated(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductformatedDto productformatedDto) {
        return saveProductformated(productformatedDto);
    }

    // Override this method
    default  ResponseEntity<ProductformatedDto> saveProductformated(ProductformatedDto productformatedDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pf/bmV1.0/update : Path used to update or modify an existing product formated in the system
     *
     * @param productformatedDto  (optional)
     * @return Productformated updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing product formated in the system", nickname = "updateProductformated", notes = "", response = ProductformatedDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Productformated updated successfully", response = ProductformatedDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pf/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProductformatedDto> _updateProductformated(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductformatedDto productformatedDto) {
        return updateProductformated(productformatedDto);
    }

    // Override this method
    default  ResponseEntity<ProductformatedDto> updateProductformated(ProductformatedDto productformatedDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pfProductId\" : 6, \"pfPicture\" : \"pfPicture\", \"pfFormatId\" : 1, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
