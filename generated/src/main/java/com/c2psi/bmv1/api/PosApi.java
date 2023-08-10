/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofPointofsaleDto;
import com.c2psi.bmv1.dto.PointofsaleDto;
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
@Api(value = "pos", description = "the pos API")
public interface PosApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /pos/bmV1.0/delete/{id} : Path used to delete a pointofsale in the system with its id
     *
     * @param id The id that represent the Pointofsale to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Pointofsale deleted successfully (status code 200)
     *         or Bad request. Article ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a pointofsale in the system with its id", nickname = "deletePosById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Article ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/pos/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deletePosById(@ApiParam(value = "The id that represent the Pointofsale to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deletePosById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deletePosById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pos/bmV1.0/getby/{id} : Find an Pointofsale in the system by its id
     *
     * @param id The id that represent the Pointofsale found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Pointofsale found successfully (status code 200)
     *         or Bad request. Pointofsale ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find an Pointofsale in the system by its id", nickname = "getPosById", notes = "", response = PointofsaleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale found successfully", response = PointofsaleDto.class),
        @ApiResponse(code = 400, message = "Bad request. Pointofsale ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/pos/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<PointofsaleDto> _getPosById(@ApiParam(value = "The id that represent the Pointofsale found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getPosById(id);
    }

    // Override this method
    default  ResponseEntity<PointofsaleDto> getPosById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pos/bmV1.0/list : Path used to list pointofsale that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Pointofsale list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list pointofsale that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getPosList", notes = "", response = PointofsaleDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale list found successfully", response = PointofsaleDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pos/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<PointofsaleDto>> _getPosList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getPosList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<PointofsaleDto>> getPosList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pos/bmV1.0/page : Path used to list Pointofsale page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Pointofsale page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Pointofsale page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getPosPage", notes = "", response = PageofPointofsaleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale page found successfully", response = PageofPointofsaleDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pos/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofPointofsaleDto> _getPosPage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getPosPage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofPointofsaleDto> getPosPage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } }, { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pos/bmV1.0/create : Path used to save a new Pointofsale in the system
     *
     * @param pointofsaleDto  (optional)
     * @return Pointofsale saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new Pointofsale in the system", nickname = "savePos", notes = "", response = PointofsaleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale saved successfully", response = PointofsaleDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/pos/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PointofsaleDto> _savePos(@ApiParam(value = "") @Valid @RequestBody(required = false) PointofsaleDto pointofsaleDto) {
        return savePos(pointofsaleDto);
    }

    // Override this method
    default  ResponseEntity<PointofsaleDto> savePos(PointofsaleDto pointofsaleDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pos/bmV1.0/update : Path used to update or modify an existing Pointofsale in the system
     *
     * @param pointofsaleDto  (optional)
     * @return Pointofsale updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify an existing Pointofsale in the system", nickname = "updatePos", notes = "", response = PointofsaleDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pointofsale updated successfully", response = PointofsaleDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/pos/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PointofsaleDto> _updatePos(@ApiParam(value = "") @Valid @RequestBody(required = false) PointofsaleDto pointofsaleDto) {
        return updatePos(pointofsaleDto);
    }

    // Override this method
    default  ResponseEntity<PointofsaleDto> updatePos(PointofsaleDto pointofsaleDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"formatCapacity\" : 1.4658129805029452 } }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artDescription\" : \"artDescription\", \"artThreshold\" : 0, \"artlowlimitSemiwholesale\" : 25, \"artShortname\" : \"artShortname\", \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.23021358869347652, \"bpPurchaseprice\" : 0.5962133916683182, \"bpDetailsprice\" : 0.7061401241503109, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" }, \"bpWholeprice\" : 0.5637376656633328, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"packPrice\" : 9.301444243932576 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"entAdmin\" : { \"userLogin\" : \"login\", \"userAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"userPicture\" : \"userPicture\", \"userPassword\" : \"password\", \"userState\" : \"Activated\", \"userDob\" : \"2000-01-23\", \"userCni\" : \"107235260\", \"id\" : 0, \"userName\" : \"userName\", \"userRepassword\" : \"password\", \"userSurname\" : \"userSurname\" } }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}