/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.DeliverydetailsDto;
import com.c2psi.bmv1.dto.FilterRequest;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-12T10:38:54.913224900+01:00[Africa/Douala]")
@Validated
@Api(value = "deliverydetails", description = "the deliverydetails API")
public interface DeliverydetailsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /deliverydetails/bmV1.0/delete/{id} : Path used to delete a Deliverydetails in the system with its id
     *
     * @param id The id that represent the Deliverydetails to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Deliverydetails deleted successfully (status code 200)
     *         or Bad request. Deliverydetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a Deliverydetails in the system with its id", nickname = "deleteDeliverydetailsById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Deliverydetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/deliverydetails/bmV1.0/delete/{id}",
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
     * GET /deliverydetails/bmV1.0/getby/{id} : Find a Deliverydetails in the system by its id
     *
     * @param id The id that represent the Deliverydetails found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Deliverydetails found successfully (status code 200)
     *         or Bad request. Deliverydetails ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Deliverydetails in the system by its id", nickname = "getDeliverydetailsById", notes = "", response = DeliverydetailsDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails found successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. Deliverydetails ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/deliverydetails/bmV1.0/getby/{id}",
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
                    String exampleString = "{ \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deliverydetails/bmV1.0/list : Path used to list delivery details that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Delivery details list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list delivery details that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getDeliverydetailsList", notes = "", response = DeliverydetailsDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery details list found successfully", response = DeliverydetailsDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/deliverydetails/bmV1.0/list",
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
                    String exampleString = "{ \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deliverydetails/bmV1.0/page : Path used to list deliverydetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Deliverydetails page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list deliverydetails page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getDeliverydetailsPage", notes = "", response = PageofDeliverydetailsDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails page found successfully", response = PageofDeliverydetailsDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/deliverydetails/bmV1.0/page",
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
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } }, { \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deliverydetails/bmV1.0/create : Path used to save a new Deliverydetails in the system
     *
     * @param deliverydetailsDto  (optional)
     * @return Delivery details saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Deliverydetails in the system", nickname = "saveDeliverydetails", notes = "", response = DeliverydetailsDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Delivery details saved successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/deliverydetails/bmV1.0/create",
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
                    String exampleString = "{ \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /deliverydetails/bmV1.0/update : Path used to update or modify an existing deliverydetails in the system
     *
     * @param deliverydetailsDto  (optional)
     * @return Deliverydetails updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing deliverydetails in the system", nickname = "updateDeliverydetails", notes = "", response = DeliverydetailsDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Deliverydetails updated successfully", response = DeliverydetailsDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/deliverydetails/bmV1.0/update",
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
                    String exampleString = "{ \"ddPackaging\" : { \"packDescription\" : \"packDescription\", \"packagingPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"packagingProvider\" : { \"providerBalance\" : 0, \"providerPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 5, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 6, \"packPrice\" : 1.4658129805029452 }, \"packageReturn\" : 0, \"id\" : 0, \"packageUsed\" : 0, \"ddDelivery\" : { \"deliveryPos\" : { \"posName\" : \"posName\", \"posAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 5 }, \"posDescription\" : \"posDescription\", \"posBalance\" : 1.4658129805029452, \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 5 } }, \"deliveryState\" : \"InEditing\", \"deliveryComment\" : \"deliveryComment\", \"deliveryDeliver\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" }, \"id\" : 6, \"deliveryDate\" : \"2000-01-23T04:56:07.000+00:00\", \"deliveryCode\" : \"D0001\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
