/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.dms_core.api;

import com.bytatech.ayoos.client.dms_core.model.Error;
import java.time.OffsetDateTime;
import com.bytatech.ayoos.client.dms_core.model.RevertBody;
import com.bytatech.ayoos.client.dms_core.model.VersionEntry;
import com.bytatech.ayoos.client.dms_core.model.VersionPaging;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-04T11:46:25.045+05:30[Asia/Kolkata]")

@Api(value = "Versions", description = "the Versions API")
public interface VersionsApi {

    @ApiOperation(value = "Delete a version", nickname = "deleteVersion", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Delete the version identified by **versionId** and **nodeId*.  If the version is successfully deleted then the content and metadata for that versioned node will be deleted and will no longer appear in the version history. This operation cannot be undone.  If the most recent version is deleted the live node will revert to the next most recent version.  We currently do not allow the last version to be deleted. If you wish to clear the history then you can remove the \"cm:versionable\" aspect (via update node) which will also disable versioning. In this case, you can re-enable versioning by adding back the \"cm:versionable\" aspect or using the version  params (majorVersion and comment) on a subsequent file content update. ", tags={ "versions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or exists but does not identify a file, or **versionId** is invalid      "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete the versioned node"),
        @ApiResponse(code = 404, message = "**nodeId** or **versionId** does not exist "),
        @ApiResponse(code = 422, message = "Cannot delete the last remaining version"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/versions/{versionId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteVersion(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a version, ie. version label, within the version history of a node.",required=true) @PathVariable("versionId") String versionId);


    @ApiOperation(value = "Get version information", nickname = "getVersion", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version information for **versionId** of file node **nodeId**. ", response = VersionEntry.class, tags={ "versions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = VersionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or it exists but does not identify a file, or **versionId** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** or **versionId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/versions/{versionId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<VersionEntry> getVersion(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a version, ie. version label, within the version history of a node.",required=true) @PathVariable("versionId") String versionId);


    @ApiOperation(value = "Get version content", nickname = "getVersionContent", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version content for **versionId** of file node **nodeId**. ", tags={ "versions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response"),
        @ApiResponse(code = 206, message = "Partial Content"),
        @ApiResponse(code = 304, message = "Content has not been modified since the date provided in the If-Modified-Since header"),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or is not a file, or **versionId** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** or **versionId** does not exist "),
        @ApiResponse(code = 416, message = "Range Not Satisfiable"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/versions/{versionId}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<Void> getVersionContent(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a version, ie. version label, within the version history of a node.",required=true) @PathVariable("versionId") String versionId,@ApiParam(value = "**true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. ", defaultValue = "true") @Valid @RequestParam(value = "attachment", required = false, defaultValue="true") Boolean attachment,@ApiParam(value = "Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. " ) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince,@ApiParam(value = "The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. " ) @RequestHeader(value="Range", required=false) String range);


    @ApiOperation(value = "List version history", nickname = "listVersionHistory", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the version history as an ordered list of versions for the specified **nodeId**.  The list is ordered in descending modified order. So the most recent version is first and  the original version is last in the list.  ", response = VersionPaging.class, tags={ "versions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = VersionPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format             "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "Target **nodeId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/versions",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<VersionPaging> listVersionHistory(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "Returns additional information about the version node. The following optional fields can be requested: * properties * aspectNames ") @Valid @RequestParam(value = "include", required = false) List<String> include,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer maxItems);


    @ApiOperation(value = "Revert a version", nickname = "revertVersion", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Attempts to revert the version identified by **versionId** and **nodeId** to the live node.  If the node is successfully reverted then the content and metadata for that versioned node will be promoted to the live node and a new version will appear in the version history. ", response = VersionEntry.class, tags={ "versions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = VersionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or it exists  but does not identify a file, or **versionId** is invalid, or **revertBody** invalid           "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to revert the versioned node"),
        @ApiResponse(code = 404, message = "**nodeId** or **versionId** does not exist "),
        @ApiResponse(code = 422, message = "Model integrity exception trying to revert the node"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/versions/{versionId}/revert",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VersionEntry> revertVersion(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a version, ie. version label, within the version history of a node.",required=true) @PathVariable("versionId") String versionId,@ApiParam(value = "Optionally, specify a version comment and whether this should be a major version, or not." ,required=true )  @Valid @RequestBody RevertBody revertBody,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);

}
