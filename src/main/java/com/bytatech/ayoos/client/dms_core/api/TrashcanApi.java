/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.dms_core.api;

import com.bytatech.ayoos.client.dms_core.model.DeletedNodeBodyRestore;
import com.bytatech.ayoos.client.dms_core.model.DeletedNodeEntry;
import com.bytatech.ayoos.client.dms_core.model.DeletedNodesPaging;
import com.bytatech.ayoos.client.dms_core.model.Error;
import com.bytatech.ayoos.client.dms_core.model.NodeEntry;
import java.time.OffsetDateTime;
import com.bytatech.ayoos.client.dms_core.model.RenditionEntry;
import com.bytatech.ayoos.client.dms_core.model.RenditionPaging;
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

@Api(value = "Trashcan", description = "the Trashcan API")
public interface TrashcanApi {

    @ApiOperation(value = "Permanently delete a deleted node", nickname = "deleteDeletedNode", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Permanently deletes the deleted node **nodeId**. ", tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format           "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "User does not have permission to permanently delete the deleted node"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}",
        produces = "application/json", 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDeletedNode(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId);


    @ApiOperation(value = "Get rendition information for a deleted node", nickname = "getArchivedNodeRendition", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition information for **renditionId** of file **nodeId**. ", response = RenditionEntry.class, tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RenditionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or is not a file, or **renditionId** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** or **renditionId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}/renditions/{renditionId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<RenditionEntry> getArchivedNodeRendition(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The name of a thumbnail rendition, for example *doclib*, or *pdf*.",required=true) @PathVariable("renditionId") String renditionId);


    @ApiOperation(value = "Get rendition content of a deleted node", nickname = "getArchivedNodeRenditionContent", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for **renditionId** of file **nodeId**. ", tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response"),
        @ApiResponse(code = 206, message = "Partial Content"),
        @ApiResponse(code = 304, message = "Content has not been modified since the date provided in the If-Modified-Since header"),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or is not a file, or **renditionId** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** or **renditionId** does not exist "),
        @ApiResponse(code = 416, message = "Range Not Satisfiable"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}/renditions/{renditionId}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<Void> getArchivedNodeRenditionContent(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The name of a thumbnail rendition, for example *doclib*, or *pdf*.",required=true) @PathVariable("renditionId") String renditionId,@ApiParam(value = "**true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. ", defaultValue = "true") @Valid @RequestParam(value = "attachment", required = false, defaultValue="true") Boolean attachment,@ApiParam(value = "Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. " ) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince,@ApiParam(value = "The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. " ) @RequestHeader(value="Range", required=false) String range,@ApiParam(value = "If **true** and there is no rendition for this **nodeId** and **renditionId**, then the placeholder image for the mime type of this rendition is returned, rather than a 404 response. ", defaultValue = "false") @Valid @RequestParam(value = "placeholder", required = false, defaultValue="false") Boolean placeholder);


    @ApiOperation(value = "Get a deleted node", nickname = "getDeletedNode", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the specific deleted node **nodeId**. ", response = DeletedNodeEntry.class, tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DeletedNodeEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "User does not have permission to view the deleted node"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DeletedNodeEntry> getDeletedNode(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isLocked * path * permissions ") @Valid @RequestParam(value = "include", required = false) List<String> include);


    @ApiOperation(value = "Get deleted node content", nickname = "getDeletedNodeContent", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the content of the deleted node with identifier **nodeId**. ", tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response"),
        @ApiResponse(code = 206, message = "Partial Content"),
        @ApiResponse(code = 304, message = "Content has not been modified since the date provided in the If-Modified-Since header"),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, or is not a file "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to retrieve content of **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 416, message = "Range Not Satisfiable"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}/content",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<Void> getDeletedNodeContent(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "**true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window, but not download the file.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. ", defaultValue = "true") @Valid @RequestParam(value = "attachment", required = false, defaultValue="true") Boolean attachment,@ApiParam(value = "Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. " ) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince,@ApiParam(value = "The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. " ) @RequestHeader(value="Range", required=false) String range);


    @ApiOperation(value = "List renditions for a deleted node", nickname = "listDeletedNodeRenditions", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for each rendition of the file **nodeId**, including the rendition id.  Each rendition returned has a **status**: CREATED means it is available to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where** clause will return just the CREATED renditions:  ``` (status='CREATED') ``` ", response = RenditionPaging.class, tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RenditionPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format, is not a file, or **where** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission for **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}/renditions",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<RenditionPaging> listDeletedNodeRenditions(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "A string to restrict the returned objects by using a predicate.") @Valid @RequestParam(value = "where", required = false) String where);


    @ApiOperation(value = "List deleted nodes", nickname = "listDeletedNodes", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of deleted nodes for the current user.  If the current user is an administrator deleted nodes for all users will be returned.  The list of deleted nodes will be ordered with the most recently deleted node at the top of the list. ", response = DeletedNodesPaging.class, tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DeletedNodesPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems** or **skipCount** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DeletedNodesPaging> listDeletedNodes(@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.  If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.  If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer maxItems,@ApiParam(value = "Returns additional information about the node. The following optional fields can be requested: * allowableOperations * aspectNames * association * isLink * isFavorite * isLocked * path * properties * permissions ") @Valid @RequestParam(value = "include", required = false) List<String> include);


    @ApiOperation(value = "Restore a deleted node", nickname = "restoreDeletedNode", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Attempts to restore the deleted node **nodeId** to its original location or to a new location.  If the node is successfully restored to its former primary parent, then only the  primary child association will be restored, including recursively for any primary  children. It should be noted that no other secondary child associations or peer  associations will be restored, for any of the nodes within the primary parent-child  hierarchy of restored nodes, irrespective of whether these associations were to  nodes within or outside of the restored hierarchy.   Also, any previously shared link will not be restored since it is deleted at the time  of delete of each node. ", response = NodeEntry.class, tags={ "trashcan", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = NodeEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** or **targetNodeId** is not a valid format              "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "User does not have permission to restore the deleted node or user does not have permission to the target node"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist or the restore destination parent node does not exists "),
        @ApiResponse(code = 409, message = "Node name already exists in the restore destination"),
        @ApiResponse(code = 422, message = "Model integrity exception trying to restore the node"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/deleted-nodes/{nodeId}/restore",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<NodeEntry> restoreDeletedNode(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields,@ApiParam(value = "The targetParentId if the node is restored to a new location."  )  @Valid @RequestBody DeletedNodeBodyRestore deletedNodeBodyRestore);

}
