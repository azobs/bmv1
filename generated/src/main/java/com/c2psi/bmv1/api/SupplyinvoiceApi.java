/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

import com.c2psi.bmv1.dto.FilterRequest;
import com.c2psi.bmv1.dto.PageofSupplyinvoiceDto;
import com.c2psi.bmv1.dto.SupplyinvoiceDto;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-11T17:01:56.543198200+01:00[Africa/Douala]")
@Validated
@Api(value = "supplyinvoice", description = "the supplyinvoice API")
public interface SupplyinvoiceApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /supplyinvoice/bmV1.0/delete/{id} : Path used to delete a supplyinvoice in the system with its id
     *
     * @param id The id that represent the Supplyinvoice to delete. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Supplyinvoice deleted successfully (status code 200)
     *         or Bad request. Supplyinvoice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to delete a supplyinvoice in the system with its id", nickname = "deleteSupplyinvoiceById", notes = "", response = Boolean.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supplyinvoice deleted successfully", response = Boolean.class),
        @ApiResponse(code = 400, message = "Bad request. Supplyinvoice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/supplyinvoice/bmV1.0/delete/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> _deleteSupplyinvoiceById(@ApiParam(value = "The id that represent the Supplyinvoice to delete. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return deleteSupplyinvoiceById(id);
    }

    // Override this method
    default  ResponseEntity<Boolean> deleteSupplyinvoiceById(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /supplyinvoice/bmV1.0/getby/{id} : Find a Supplyinvoice in the system by its id
     *
     * @param id The id that represent the Supplyinvoice found. It&#39;s compulsory if not the operation can&#39;t proceed (required)
     * @return Supplyinvoice found successfully (status code 200)
     *         or Bad request. Supplyinvoice ID must be an integer and larger than 0. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Find a Supplyinvoice in the system by its id", nickname = "getSupplyinvoiceById", notes = "", response = SupplyinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supplyinvoice found successfully", response = SupplyinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. Supplyinvoice ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/supplyinvoice/bmV1.0/getby/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<SupplyinvoiceDto> _getSupplyinvoiceById(@ApiParam(value = "The id that represent the Supplyinvoice found. It's compulsory if not the operation can't proceed", required = true) @PathVariable("id") Long id) {
        return getSupplyinvoiceById(id);
    }

    // Override this method
    default  ResponseEntity<SupplyinvoiceDto> getSupplyinvoiceById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /supplyinvoice/bmV1.0/list : Path used to list supplyinvoice that respect certain criteria. A criteria is an instance of a Filter object
     *
     * @param filterRequest  (optional)
     * @return Supplyinvoice list found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list supplyinvoice that respect certain criteria. A criteria is an instance of a Filter object", nickname = "getSupplyinvoiceList", notes = "", response = SupplyinvoiceDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supplyinvoice list found successfully", response = SupplyinvoiceDto.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/supplyinvoice/bmV1.0/list",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<SupplyinvoiceDto>> _getSupplyinvoiceList(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getSupplyinvoiceList(filterRequest);
    }

    // Override this method
    default  ResponseEntity<List<SupplyinvoiceDto>> getSupplyinvoiceList(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /supplyinvoice/bmV1.0/page : Path used to list Supplyinvoice page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want
     *
     * @param filterRequest  (optional)
     * @return Supplyinvoice page found successfully (status code 200)
     */
    @ApiOperation(value = "Path used to list Supplyinvoice page by page that respect certain criteria. With the Page object, we can configure the page number and size that we want", nickname = "getSupplyinvoicePage", notes = "", response = PageofSupplyinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supplyinvoice page found successfully", response = PageofSupplyinvoiceDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/supplyinvoice/bmV1.0/page",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PageofSupplyinvoiceDto> _getSupplyinvoicePage(@ApiParam(value = "") @Valid @RequestBody(required = false) FilterRequest filterRequest) {
        return getSupplyinvoicePage(filterRequest);
    }

    // Override this method
    default  ResponseEntity<PageofSupplyinvoiceDto> getSupplyinvoicePage(FilterRequest filterRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalPages\" : 6, \"pageSize\" : 10, \"currentPage\" : 0, \"content\" : [ { \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" } ], \"totalElements\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /supplyinvoice/bmV1.0/create : Path used to save a new supplyinvoice in the system
     *
     * @param supplyinvoiceDto  (optional)
     * @return Supply invoice saved successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to save a new supplyinvoice in the system", nickname = "saveSupplyinvoice", notes = "", response = SupplyinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supply invoice saved successfully", response = SupplyinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/supplyinvoice/bmV1.0/create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SupplyinvoiceDto> _saveSupplyinvoice(@ApiParam(value = "") @Valid @RequestBody(required = false) SupplyinvoiceDto supplyinvoiceDto) {
        return saveSupplyinvoice(supplyinvoiceDto);
    }

    // Override this method
    default  ResponseEntity<SupplyinvoiceDto> saveSupplyinvoice(SupplyinvoiceDto supplyinvoiceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /supplyinvoice/bmV1.0/update : Path used to update or modify a existing Supplyinvoice in the system
     *
     * @param supplyinvoiceDto  (optional)
     * @return Supplyinvoice updated successfully (status code 200)
     *         or Bad request. There is something wrong in the request. (status code 400)
     *         or Authorization information is missing or invalid. (status code 401)
     *         or The user who ask the ressource is Forbidden. (status code 403)
     *         or The expected ressource is not found. (status code 404)
     *         or Unexpected error at the server side. (status code 500)
     */
    @ApiOperation(value = "Path used to update or modify a existing Supplyinvoice in the system", nickname = "updateSupplyinvoice", notes = "", response = SupplyinvoiceDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Supplyinvoice updated successfully", response = SupplyinvoiceDto.class),
        @ApiResponse(code = 400, message = "Bad request. There is something wrong in the request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "The user who ask the ressource is Forbidden."),
        @ApiResponse(code = 404, message = "The expected ressource is not found."),
        @ApiResponse(code = 500, message = "Unexpected error at the server side.") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/supplyinvoice/bmV1.0/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<SupplyinvoiceDto> _updateSupplyinvoice(@ApiParam(value = "") @Valid @RequestBody(required = false) SupplyinvoiceDto supplyinvoiceDto) {
        return updateSupplyinvoice(supplyinvoiceDto);
    }

    // Override this method
    default  ResponseEntity<SupplyinvoiceDto> updateSupplyinvoice(SupplyinvoiceDto supplyinvoiceDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"siPaymentmethod\" : \"Cash\", \"siInvoicingdate\" : \"2000-01-23T04:56:07.000+00:00\", \"siExpectedamount\" : 0.14658129805029452, \"siCode\" : \"SuI0000\", \"siPicture\" : \"siPicture\", \"siPaidamount\" : 0.5962133916683182, \"id\" : 6, \"siTotalcolis\" : 1, \"siPos\" : { \"posName\" : \"posName\", \"posAccountDto\" : { \"damageNumber\" : 0, \"accountClientDto\" : { \"clientCni\" : \"clientCni\", \"clientBalance\" : 0, \"clientName\" : \"clientName\", \"id\" : 5, \"clientOthername\" : \"clientOthername\", \"clientAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" } }, \"accountType\" : \"Pos\", \"accountProviderDto\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"id\" : 1, \"accountArticleDto\" : { \"artName\" : \"artName\", \"artQuantityinstock\" : 0, \"artUnit\" : { \"unitName\" : \"unitName\", \"unitAbbreviation\" : \"UN\" }, \"artThreshold\" : 0, \"artShortname\" : \"artShortname\", \"artPf\" : { \"pfProduct\" : { \"prodDescription\" : \"prodDescription\", \"prodCode\" : \"P0000\", \"prodCat\" : { \"catCode\" : \"CA000\", \"catName\" : \"catName\", \"id\" : 2, \"catDescription\" : \"catDescription\", \"catShortname\" : \"catShortname\" }, \"prodName\" : \"prodName\", \"id\" : 3, \"prodPerishable\" : false, \"prodAlias\" : \"prodAlias\" }, \"pfPicture\" : \"pfPicture\", \"pfFormat\" : { \"formatName\" : \"formatName\", \"id\" : 4, \"formatCapacity\" : 7.386281948385884 }, \"id\" : 9 }, \"artCode\" : \"A0000\", \"artLowlimitwholesale\" : 30, \"artDescription\" : \"artDescription\", \"artlowlimitSemiwholesale\" : 25, \"id\" : 7, \"artBaseprice\" : { \"bpSemiwholeprice\" : 0.684685269835264, \"bpPurchaseprice\" : 0.10246457001441578, \"bpDetailsprice\" : 0.7457744773683765, \"id\" : 1, \"bpRistourne\" : 0, \"bpCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 }, \"bpWholeprice\" : 0.14894159098541704, \"bpPrecompte\" : 0 } }, \"accountPackagingDto\" : { \"packDescription\" : \"packDescription\", \"packagingProvider\" : { \"providerBalance\" : 0, \"providerAddress\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"providerAcronym\" : \"PN\", \"providerDescription\" : \"providerDescription\", \"id\" : 2, \"providerName\" : \"providerName\" }, \"packLabel\" : \"packLabel\", \"packFirstcolor\" : \"packFirstcolor\", \"id\" : 4, \"packPrice\" : 5.025004791520295 }, \"coverNumber\" : 0, \"packageNumber\" : 0 }, \"posAddressDto\" : { \"country\" : \"country\", \"numtel3\" : \"numtel3\", \"town\" : \"town\", \"numtel1\" : \"678470262\", \"numtel2\" : \"numtel2\", \"localisation\" : \"localisation\", \"id\" : 0, \"email\" : \"abc@gmail.com\", \"quarter\" : \"quarter\" }, \"id\" : 6, \"posAcronym\" : \"posAcronym\", \"posEnterprise\" : { \"entAcronym\" : \"entAcronym\", \"entNiu\" : \"entNiu\", \"entSocialreason\" : \"entSocialreason\", \"entName\" : \"entName\", \"entLogo\" : \"entLogo\", \"entRegime\" : \"IL\", \"entDescription\" : \"entDescription\", \"id\" : 9 }, \"posDescription\" : \"posDescription\", \"posCurrency\" : { \"currencyName\" : \"franc cfa\", \"currencyAbbreviation\" : \"F cfa\", \"id\" : 1 } }, \"siComment\" : \"siComment\", \"siDeliverydate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
