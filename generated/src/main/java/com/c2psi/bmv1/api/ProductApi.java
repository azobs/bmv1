/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofProductDto;
import com.c2psi.bmv1.dto.ProductDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-10T08:08:31.170887700+01:00[Africa/Douala]")
@Validated
@Api(value = "product", description = "the product API")
public interface ProductApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /product/delete : Path used to delete a product in the system with its id
     *
     * @param id The id that represent the Product to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Product deleted successfully (status code 200)
     *         or Bad request. Category ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a product in the system with its id", nickname = "deleteProductById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Category ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/product/delete",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteProductById(@ApiParam(value = "The id that represent the Product to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteProductById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteProductById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /product/bmV1.0/getby/{id} : Find a Product in the system by its id
     *
     * @param id The id that represent the Product found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Product found successfully (status code 200)
     *         or Bad request. Product ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Product in the system by its id", nickname = "getProductById", notes = "", response = ProductDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product found successfully", response = ProductDto.class),
        @ApiResponse(code = 400, message = "Bad request. Product ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/product/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ProductDto> _getProductById(@ApiParam(value = "The id that represent the Product found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getProductById(id);
    }

    // Override this method
    default  ResponseEntity<ProductDto> getProductById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /product/bmV1.0/list : Path used to list product that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Product list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list product that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getProductList", notes = "", response = ProductDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product list found successfully", response = ProductDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/product/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<ProductDto>> _getProductList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProductList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<ProductDto>> getProductList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /product/bmV1.0/page : Path used to list product page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Product page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list product page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getProductPage", notes = "", response = PageofProductDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product page found successfully", response = PageofProductDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/product/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofProductDto> _getProductPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getProductPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofProductDto> getProductPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /product/bmV1.0/create : Path used to save a new product of product in the system
     *
     * @param productDto  (optional)
     * @return Product saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new product of product in the system", nickname = "saveProduct", notes = "", response = ProductDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product saved successfully", response = ProductDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/product/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProductDto> _saveProduct(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductDto productDto) {
        return saveProduct(productDto);
    }

    // Override this method
    default  ResponseEntity<ProductDto> saveProduct(ProductDto productDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /product/bmV1.0/update : Path used to update or modify an existing product in the system
     *
     * @param productDto  (optional)
     * @return Product updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing product in the system", nickname = "updateProduct", notes = "", response = ProductDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Product updated successfully", response = ProductDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/product/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ProductDto> _updateProduct(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductDto productDto) {
        return updateProduct(productDto);
    }

    // Override this method
    default  ResponseEntity<ProductDto> updateProduct(ProductDto productDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}