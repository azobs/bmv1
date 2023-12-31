/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.c2psi.bmv1.api;

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
@Api(value = "upload", description = "the upload API")
public interface UploadApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /upload/bm/v1/article : Path used to upload a picture that represent an article in the system
     *
     * @param fileName  (optional)
     * @return Picture of article uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent an article in the system", nickname = "uploadPictureArticle", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Picture of article uploaded successfully", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bm/v1/article",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> _uploadPictureArticle(@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPictureArticle(fileName);
    }

    // Override this method
    default  ResponseEntity<String> uploadPictureArticle(MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /upload/bm/v1/invoice : Path used to upload a picture that represent an invoice in the system
     *
     * @param fileName  (optional)
     * @return Invoice uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent an invoice in the system", nickname = "uploadPictureInvoice", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Invoice uploaded successfully", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bm/v1/invoice",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> _uploadPictureInvoice(@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPictureInvoice(fileName);
    }

    // Override this method
    default  ResponseEntity<String> uploadPictureInvoice(MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /upload/bm/v1/logo : Path used to upload a picture that represent a logo in the system
     *
     * @param fileName  (optional)
     * @return Resource uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent a logo in the system", nickname = "uploadPictureLogo", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resource uploaded successfully", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bm/v1/logo",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> _uploadPictureLogo(@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPictureLogo(fileName);
    }

    // Override this method
    default  ResponseEntity<String> uploadPictureLogo(MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /upload/bm/v1/person : Path used to upload a picture that represent a person in the system
     *
     * @param fileName  (optional)
     * @return Picture uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent a person in the system", nickname = "uploadPictureofPerson", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Picture uploaded successfully", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bm/v1/person",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> _uploadPictureofPerson(@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPictureofPerson(fileName);
    }

    // Override this method
    default  ResponseEntity<String> uploadPictureofPerson(MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /upload/bm/v1/pf : Path used to upload a picture that represent a formated product in the system
     *
     * @param fileName  (optional)
     * @return Picture uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent a formated product in the system", nickname = "uploadPictureofProductformated", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "BearerAuth")
         }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Picture uploaded successfully", response = String.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bm/v1/pf",
        produces = { "application/json" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<String> _uploadPictureofProductformated(@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPictureofProductformated(fileName);
    }

    // Override this method
    default  ResponseEntity<String> uploadPictureofProductformated(MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
