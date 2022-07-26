/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tosan.camunda.camundaclient.generated.api;

import com.tosan.camunda.camundaclient.generated.model.CountResultDto;
import com.tosan.camunda.camundaclient.generated.model.ExceptionDto;
import com.tosan.camunda.camundaclient.generated.model.GroupDto;
import com.tosan.camunda.camundaclient.generated.model.GroupQueryDto;
import com.tosan.camunda.camundaclient.generated.model.ResourceOptionsDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")
@Validated
public interface GroupApi {

    Logger log = LoggerFactory.getLogger(GroupApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @Operation(summary = "Group Resource Instance Options", description = "The `/group` resource supports two custom OPTIONS requests, one for the resource as such and this one for individual group instances. The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the `/group/{id}` resource instance. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceOptionsDto.class))) })
    @RequestMapping(value = "/group/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<ResourceOptionsDto> availableGroupInstanceOperations(@Parameter(in = ParameterIn.PATH, description = "The id of the group.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Group Membership Resource Options", description = "The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the resource. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceOptionsDto.class))) })
    @RequestMapping(value = "/group/{id}/members",
        produces = { "application/json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<ResourceOptionsDto> availableGroupMembersOperations(@Parameter(in = ParameterIn.PATH, description = "The id of the group.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Group Resource Options", description = "The `/group` resource supports two custom OPTIONS requests, this one for the resource as such and one for individual group instances. The OPTIONS request allows checking for the set of available operations that the currently authenticated user can perform on the `/group` resource. If the user can perform an operation or not may depend on various things, including the users authorizations to interact with this resource and the internal configuration of the process engine.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResourceOptionsDto.class))) })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        method = RequestMethod.OPTIONS)
    ResponseEntity<ResourceOptionsDto> availableGroupOperations();


    @Operation(summary = "Create Group", description = "Creates a new group.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request successful. This method returns no content."),
        
        @ApiResponse(responseCode = "403", description = "Identity service is read-only (Cannot modify users / groups / memberships).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "500", description = "The group could not be created due to an internal server error. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/create",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createGroup(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupDto body);


    @Operation(summary = "Create Group Member", description = "Adds a member to a group.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request successful. This method returns no content."),
        
        @ApiResponse(responseCode = "403", description = "Identity service is read-only (Cannot modify users / groups / memberships).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "500", description = "In case an internal error occurs. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/{id}/members/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> createGroupMember(@Parameter(in = ParameterIn.PATH, description = "The id of the group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.PATH, description = "The id of user to add to the group.", required=true, schema=@Schema()) @PathVariable("userId") String userId);


    @Operation(summary = "Delete Group", description = "Deletes a group by id.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request successful. This method returns no content."),
        
        @ApiResponse(responseCode = "403", description = "Identity service is read-only (Cannot modify users / groups / memberships).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Group cannot be found. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGroup(@Parameter(in = ParameterIn.PATH, description = "The id of the group to be deleted.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Delete a Group Member", description = "Removes a member from a group.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request successful. This method returns no content."),
        
        @ApiResponse(responseCode = "403", description = "Identity service is read-only (Cannot modify users / groups / memberships).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "500", description = "In case an error occurs. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/{id}/members/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGroupMember(@Parameter(in = ParameterIn.PATH, description = "The id of the group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.PATH, description = "The id of user to remove from the group.", required=true, schema=@Schema()) @PathVariable("userId") String userId);


    @Operation(summary = "Get Group", description = "Retrieves a group by id.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GroupDto.class))),
        
        @ApiResponse(responseCode = "404", description = "Group with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GroupDto> getGroup(@Parameter(in = ParameterIn.PATH, description = "The id of the group to be retrieved.", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get List Count", description = "Queries for groups using a list of parameters and retrieves the count.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CountResultDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/count",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CountResultDto> getGroupCount(@Parameter(in = ParameterIn.QUERY, description = "Filter by the id of the group." ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id, @Parameter(in = ParameterIn.QUERY, description = "Filter by a comma seperated list of group ids." ,schema=@Schema()) @Valid @RequestParam(value = "idIn", required = false) String idIn, @Parameter(in = ParameterIn.QUERY, description = "Filter by the name of the group." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name, @Parameter(in = ParameterIn.QUERY, description = "Filter by the name that the parameter is a substring of." ,schema=@Schema()) @Valid @RequestParam(value = "nameLike", required = false) String nameLike, @Parameter(in = ParameterIn.QUERY, description = "Filter by the type of the group." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.QUERY, description = "Only retrieve groups where the given user id is a member of." ,schema=@Schema()) @Valid @RequestParam(value = "member", required = false) String member, @Parameter(in = ParameterIn.QUERY, description = "Only retrieve groups which are members of the given tenant." ,schema=@Schema()) @Valid @RequestParam(value = "memberOfTenant", required = false) String memberOfTenant);


    @Operation(summary = "Get List", description = "Queries for a list of groups using a list of parameters. The size of the result set can be retrieved by using the [Get Group Count](https://docs.camunda.org/manual/7.17/reference/rest/group/get-query-count) method.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GroupDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy` is specified. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<GroupDto>> getQueryGroups(@Parameter(in = ParameterIn.QUERY, description = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter." ,schema=@Schema(allowableValues={ "id", "name", "type" }
)) @Valid @RequestParam(value = "sortBy", required = false) String sortBy, @Parameter(in = ParameterIn.QUERY, description = "Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter." ,schema=@Schema(allowableValues={ "asc", "desc" }
)) @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder, @Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the index of the first result to return." ,schema=@Schema()) @Valid @RequestParam(value = "firstResult", required = false) Integer firstResult, @Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left." ,schema=@Schema()) @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults, @Parameter(in = ParameterIn.QUERY, description = "Filter by the id of the group." ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id, @Parameter(in = ParameterIn.QUERY, description = "Filter by a comma seperated list of group ids." ,schema=@Schema()) @Valid @RequestParam(value = "idIn", required = false) String idIn, @Parameter(in = ParameterIn.QUERY, description = "Filter by the name of the group." ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name, @Parameter(in = ParameterIn.QUERY, description = "Filter by the name that the parameter is a substring of." ,schema=@Schema()) @Valid @RequestParam(value = "nameLike", required = false) String nameLike, @Parameter(in = ParameterIn.QUERY, description = "Filter by the type of the group." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.QUERY, description = "Only retrieve groups where the given user id is a member of." ,schema=@Schema()) @Valid @RequestParam(value = "member", required = false) String member, @Parameter(in = ParameterIn.QUERY, description = "Only retrieve groups which are members of the given tenant." ,schema=@Schema()) @Valid @RequestParam(value = "memberOfTenant", required = false) String memberOfTenant);


    @Operation(summary = "Get List (POST)", description = "Queries for a list of groups using a list of parameters. The size of the result set can be retrieved by using the [Get Group Count (POST)](https://docs.camunda.org/manual/7.17/reference/rest/group/post-query-count/) method.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GroupDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy` is specified. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<List<GroupDto>> postQueryGroups(@Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the index of the first result to return." ,schema=@Schema()) @Valid @RequestParam(value = "firstResult", required = false) Integer firstResult, @Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left." ,schema=@Schema()) @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupQueryDto body);


    @Operation(summary = "Get List Count (POST)", description = "Queries for groups using a list of parameters and retrieves the count.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CountResultDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/count",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<CountResultDto> queryGroupCount(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupQueryDto body);


    @Operation(summary = "Update Group", description = "Updates a given group by id.", tags={ "Group" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "204", description = "Request successful. No content."),
        
        @ApiResponse(responseCode = "403", description = "Identity service is read-only (Cannot modify users / groups / memberships).", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "404", description = "If the group with the requested Id cannot be found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))),
        
        @ApiResponse(responseCode = "500", description = "The group could not be updated due to an internal server error. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/group/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateGroup(@Parameter(in = ParameterIn.PATH, description = "The id of the group.", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody GroupDto body);

}

