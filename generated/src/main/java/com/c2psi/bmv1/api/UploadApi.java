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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-11T17:01:56.543198200+01:00[Africa/Douala]")
@Validated
@Api(value = "upload", description = "the upload API")
public interface UploadApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /upload/bmV1.0/picture : Path used to upload a picture that represent a resource in the system
     *
     * @param id  (optional)
     * @param fileName  (optional)
     * @return Resource uploaded successfully (status code 200)
     */
    @ApiOperation(value = "Path used to upload a picture that represent a resource in the system", nickname = "uploadPicture", notes = "", response = org.springframework.core.io.Resource.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Resource uploaded successfully", response = org.springframework.core.io.Resource.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/upload/bmV1.0/picture",
        produces = { "image/_*" },
        consumes = { "multipart/form-data" }
    )
    default ResponseEntity<org.springframework.core.io.Resource> _uploadPicture(@ApiParam(value = "") @Valid @RequestPart(value = "id", required = false) Long id,@ApiParam(value = "") @Valid @RequestPart(value = "fileName", required = false) MultipartFile fileName) {
        return uploadPicture(id, fileName);
    }

    // Override this method
    default  ResponseEntity<org.springframework.core.io.Resource> uploadPicture(Long id, MultipartFile fileName) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
