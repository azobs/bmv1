/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.FormatDto;
import com.c2psi.bmv1.dto.PageofFormatDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-15T06:34:19.158834900+01:00[Africa/Douala]")
@Validated
@Api(value = "format", description = "the format API")
public interface FormatApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /format/bmV1.0/delete/{id} : Path used to delete a format in the system with its id
     *
     * @param id The id that represent the Format to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Format deleted successfully (status code 200)
     *         or Bad request. Format ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a format in the system with its id", nickname = "deleteFormatById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Format ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/format/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteFormatById(@ApiParam(value = "The id that represent the Format to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteFormatById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteFormatById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /format/bmV1.0/getby/{id} : Find a Format in the system by its id
     *
     * @param id The id that represent the Format found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Format found successfully (status code 200)
     *         or Bad request. Format ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Format in the system by its id", nickname = "getFormatById", notes = "", response = FormatDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format found successfully", response = FormatDto.class),
        @ApiResponse(code = 400, message = "Bad request. Format ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/format/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<FormatDto> _getFormatById(@ApiParam(value = "The id that represent the Format found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getFormatById(id);
    }

    // Override this method
    default  ResponseEntity<FormatDto> getFormatById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /format/bmV1.0/list : Path used to list format that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Format list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list format that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getFormatList", notes = "", response = FormatDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format list found successfully", response = FormatDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/format/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<FormatDto>> _getFormatList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getFormatList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<FormatDto>> getFormatList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /format/bmV1.0/page : Path used to list format page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Format page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list format page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getFormatPage", notes = "", response = PageofFormatDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format page found successfully", response = PageofFormatDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/format/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofFormatDto> _getFormatPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getFormatPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofFormatDto> getFormatPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 }, { \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /format/bmV1.0/create : Path used to save a new format of product in the system
     *
     * @param formatDto  (optional)
     * @return Format saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new format of product in the system", nickname = "saveFormat", notes = "", response = FormatDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format saved successfully", response = FormatDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/format/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<FormatDto> _saveFormat(@ApiParam(value = "") @Valid @RequestBody(required = false) FormatDto formatDto) {
        return saveFormat(formatDto);
    }

    // Override this method
    default  ResponseEntity<FormatDto> saveFormat(FormatDto formatDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /format/bmV1.0/update : Path used to update or modify an existing format in the system
     *
     * @param formatDto  (optional)
     * @return Format updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing format in the system", nickname = "updateFormat", notes = "", response = FormatDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Format updated successfully", response = FormatDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/format/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<FormatDto> _updateFormat(@ApiParam(value = "") @Valid @RequestBody(required = false) FormatDto formatDto) {
        return updateFormat(formatDto);
    }

    // Override this method
    default  ResponseEntity<FormatDto> updateFormat(FormatDto formatDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"formatPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"formatName\" : \"formatName\", \"id\" : 0, \"formatCapacity\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
