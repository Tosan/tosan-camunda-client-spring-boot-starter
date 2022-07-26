/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tosan.camunda.camundaclient.generated.api;

import com.tosan.camunda.camundaclient.generated.model.CountResultDto;
import com.tosan.camunda.camundaclient.generated.model.ExceptionDto;
import com.tosan.camunda.camundaclient.generated.model.HistoricIdentityLinkLogDto;
import java.time.OffsetDateTime;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")
@Validated
public interface HistoricIdentityLinkLogApi {

    Logger log = LoggerFactory.getLogger(HistoricIdentityLinkLogApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @Operation(summary = "Get Identity Link Logs", description = "Queries for historic identity link logs that fulfill given parameters. The size of the result set can be retrieved by using the [Get Identity-Link-Log Count](https://docs.camunda.org/manual/7.17/reference/rest/history/identity-links/get-identity-link-query-count/) method.", tags={ "Historic Identity Link Log" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = HistoricIdentityLinkLogDto.class)))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy`. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/history/identity-link-log",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<HistoricIdentityLinkLogDto>> getHistoricIdentityLinks(@Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given type (candidate/assignee/owner)." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given user id." ,schema=@Schema()) @Valid @RequestParam(value = "userId", required = false) String userId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given group id." ,schema=@Schema()) @Valid @RequestParam(value = "groupId", required = false) String groupId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the time before the given time." ,schema=@Schema()) @Valid @RequestParam(value = "dateBefore", required = false) OffsetDateTime dateBefore, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the time after the given time." ,schema=@Schema()) @Valid @RequestParam(value = "dateAfter", required = false) OffsetDateTime dateAfter, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given task id." ,schema=@Schema()) @Valid @RequestParam(value = "taskId", required = false) String taskId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given process definition id." ,schema=@Schema()) @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given process definition key." ,schema=@Schema()) @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given operationType (add/delete)." ,schema=@Schema()) @Valid @RequestParam(value = "operationType", required = false) String operationType, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given assigner id." ,schema=@Schema()) @Valid @RequestParam(value = "assignerId", required = false) String assignerId, @Parameter(in = ParameterIn.QUERY, description = "Filter by a comma-separated list of tenant ids." ,schema=@Schema()) @Valid @RequestParam(value = "tenantIdIn", required = false) String tenantIdIn, @Parameter(in = ParameterIn.QUERY, description = "Only include historic identity links that belong to no tenant. Value may only be `true`, as `false` is the default behavior." ,schema=@Schema()) @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId, @Parameter(in = ParameterIn.QUERY, description = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter." ,schema=@Schema(allowableValues={ "time", "type", "userId", "groupId", "taskId", "processDefinitionId", "processDefinitionKey", "operationType", "assignerId", "tenantId" }
)) @Valid @RequestParam(value = "sortBy", required = false) String sortBy, @Parameter(in = ParameterIn.QUERY, description = "Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter." ,schema=@Schema(allowableValues={ "asc", "desc" }
)) @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder, @Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the index of the first result to return." ,schema=@Schema()) @Valid @RequestParam(value = "firstResult", required = false) Integer firstResult, @Parameter(in = ParameterIn.QUERY, description = "Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left." ,schema=@Schema()) @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults);


    @Operation(summary = "Get Identity Link Log Count", description = "Queries for the number of historic identity link logs that fulfill the given parameters. Takes the same parameters as the [Get Identity-Link-Logs](https://docs.camunda.org/manual/7.17/reference/rest/history/identity-links/get-identity-link-query/) method.", tags={ "Historic Identity Link Log" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CountResultDto.class))),
        
        @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy`. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/history/identity-link-log/count",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<CountResultDto> getHistoricIdentityLinksCount(@Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given type (candidate/assignee/owner)." ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) String type, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given user id." ,schema=@Schema()) @Valid @RequestParam(value = "userId", required = false) String userId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given group id." ,schema=@Schema()) @Valid @RequestParam(value = "groupId", required = false) String groupId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the time before the given time." ,schema=@Schema()) @Valid @RequestParam(value = "dateBefore", required = false) OffsetDateTime dateBefore, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the time after the given time." ,schema=@Schema()) @Valid @RequestParam(value = "dateAfter", required = false) OffsetDateTime dateAfter, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given task id." ,schema=@Schema()) @Valid @RequestParam(value = "taskId", required = false) String taskId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given process definition id." ,schema=@Schema()) @Valid @RequestParam(value = "processDefinitionId", required = false) String processDefinitionId, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given process definition key." ,schema=@Schema()) @Valid @RequestParam(value = "processDefinitionKey", required = false) String processDefinitionKey, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given operationType (add/delete)." ,schema=@Schema()) @Valid @RequestParam(value = "operationType", required = false) String operationType, @Parameter(in = ParameterIn.QUERY, description = "Restricts to identity links that have the given assigner id." ,schema=@Schema()) @Valid @RequestParam(value = "assignerId", required = false) String assignerId, @Parameter(in = ParameterIn.QUERY, description = "Filter by a comma-separated list of tenant ids." ,schema=@Schema()) @Valid @RequestParam(value = "tenantIdIn", required = false) String tenantIdIn, @Parameter(in = ParameterIn.QUERY, description = "Only include historic identity links that belong to no tenant. Value may only be `true`, as `false` is the default behavior." ,schema=@Schema()) @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId);

}

