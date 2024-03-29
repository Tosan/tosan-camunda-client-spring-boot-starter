/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.tosan.camunda.camundaclient.generated.api;

import com.tosan.camunda.camundaclient.generated.model.CountResultDto;
import org.springframework.format.annotation.DateTimeFormat;
import com.tosan.camunda.camundaclient.generated.model.ExceptionDto;
import com.tosan.camunda.camundaclient.generated.model.HistoricDetailDto;
import com.tosan.camunda.camundaclient.generated.model.HistoricDetailQueryDto;
import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
@Validated
@Tag(name = "Historic Detail", description = "the Historic Detail API")
public interface HistoricDetailApi {

    /**
     * GET /history/detail : Get Historic Details
     * Queries for historic details that fulfill the given parameters. The size of the result set can be retrieved by using the [Get Historic Detail Count](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query-count/) method.
     *
     * @param processInstanceId Filter by process instance id. (optional)
     * @param processInstanceIdIn Only include historic details which belong to one of the passed comma-separated process instance ids. (optional)
     * @param executionId Filter by execution id. (optional)
     * @param taskId Filter by task id. (optional)
     * @param activityInstanceId Filter by activity instance id. (optional)
     * @param caseInstanceId Filter by case instance id. (optional)
     * @param caseExecutionId Filter by case execution id. (optional)
     * @param variableInstanceId Filter by variable instance id. (optional)
     * @param variableTypeIn Only include historic details where the variable updates belong to one of the passed comma-separated list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type &#x60;serializable&#x60;. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. (optional)
     * @param withoutTenantId Only include historic details that belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param userOperationId Filter by a user operation id. (optional)
     * @param formFields Only include &#x60;HistoricFormFields&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param variableUpdates Only include &#x60;HistoricVariableUpdates&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param excludeTaskDetails Excludes all task-related &#x60;HistoricDetails&#x60;, so only items which have no task id set will be selected. When this parameter is used together with &#x60;taskId&#x60;, this call is ignored and task details are not excluded. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param initial Restrict to historic variable updates that contain only initial variable values. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param occurredBefore Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200. (optional)
     * @param occurredAfter Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200. (optional)
     * @param sortBy Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter. (optional)
     * @param sortOrder Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter. (optional)
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param deserializeValues Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default &#x60;true&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While &#x60;true&#x60; is the default value for reasons of backward compatibility, we recommend setting this parameter to &#x60;false&#x60; when developing web applications that are independent of the Java process applications deployed to the engine. (optional)
     * @return Request successful. (status code 200)
     *         or Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format. (status code 400)
     */
    @Operation(
        operationId = "getHistoricDetails",
        summary = "Get Historic Details",
        description = "Queries for historic details that fulfill the given parameters. The size of the result set can be retrieved by using the [Get Historic Detail Count](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query-count/) method.",
        tags = { "Historic Detail" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Request successful.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = HistoricDetailDto.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy`. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history/detail",
        produces = { "application/json" }
    )
    ResponseEntity<List<HistoricDetailDto>> getHistoricDetails(
        @Parameter(name = "processInstanceId", description = "Filter by process instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,
        @Parameter(name = "processInstanceIdIn", description = "Only include historic details which belong to one of the passed comma-separated process instance ids.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "processInstanceIdIn", required = false) String processInstanceIdIn,
        @Parameter(name = "executionId", description = "Filter by execution id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "executionId", required = false) String executionId,
        @Parameter(name = "taskId", description = "Filter by task id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "taskId", required = false) String taskId,
        @Parameter(name = "activityInstanceId", description = "Filter by activity instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "activityInstanceId", required = false) String activityInstanceId,
        @Parameter(name = "caseInstanceId", description = "Filter by case instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "caseInstanceId", required = false) String caseInstanceId,
        @Parameter(name = "caseExecutionId", description = "Filter by case execution id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "caseExecutionId", required = false) String caseExecutionId,
        @Parameter(name = "variableInstanceId", description = "Filter by variable instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableInstanceId", required = false) String variableInstanceId,
        @Parameter(name = "variableTypeIn", description = "Only include historic details where the variable updates belong to one of the passed comma-separated list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type `serializable`.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableTypeIn", required = false) String variableTypeIn,
        @Parameter(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tenantIdIn", required = false) String tenantIdIn,
        @Parameter(name = "withoutTenantId", description = "Only include historic details that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
        @Parameter(name = "userOperationId", description = "Filter by a user operation id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "userOperationId", required = false) String userOperationId,
        @Parameter(name = "formFields", description = "Only include `HistoricFormFields`. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "formFields", required = false) Boolean formFields,
        @Parameter(name = "variableUpdates", description = "Only include `HistoricVariableUpdates`. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableUpdates", required = false) Boolean variableUpdates,
        @Parameter(name = "excludeTaskDetails", description = "Excludes all task-related `HistoricDetails`, so only items which have no task id set will be selected. When this parameter is used together with `taskId`, this call is ignored and task details are not excluded. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "excludeTaskDetails", required = false) Boolean excludeTaskDetails,
        @Parameter(name = "initial", description = "Restrict to historic variable updates that contain only initial variable values. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "initial", required = false) Boolean initial,
        @Parameter(name = "occurredBefore", description = "Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "occurredBefore", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime occurredBefore,
        @Parameter(name = "occurredAfter", description = "Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "occurredAfter", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime occurredAfter,
        @Parameter(name = "sortBy", description = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "sortBy", required = false) String sortBy,
        @Parameter(name = "sortOrder", description = "Sort the results in a given order. Values may be asc for ascending order or desc for descending order. Must be used in conjunction with the sortBy parameter.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "sortOrder", required = false) String sortOrder,
        @Parameter(name = "firstResult", description = "Pagination of results. Specifies the index of the first result to return.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "firstResult", required = false) Integer firstResult,
        @Parameter(name = "maxResults", description = "Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults,
        @Parameter(name = "deserializeValues", description = "Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `true`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While `true` is the default value for reasons of backward compatibility, we recommend setting this parameter to `false` when developing web applications that are independent of the Java process applications deployed to the engine.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "deserializeValues", required = false) Boolean deserializeValues
    );


    /**
     * GET /history/detail/count : Get Historic Detail Count
     * Queries for the number of historic details that fulfill the given parameters. Takes the same parameters as the [Get Historic Details](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query/) method.
     *
     * @param processInstanceId Filter by process instance id. (optional)
     * @param processInstanceIdIn Only include historic details which belong to one of the passed comma-separated process instance ids. (optional)
     * @param executionId Filter by execution id. (optional)
     * @param taskId Filter by task id. (optional)
     * @param activityInstanceId Filter by activity instance id. (optional)
     * @param caseInstanceId Filter by case instance id. (optional)
     * @param caseExecutionId Filter by case execution id. (optional)
     * @param variableInstanceId Filter by variable instance id. (optional)
     * @param variableTypeIn Only include historic details where the variable updates belong to one of the passed comma-separated list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type &#x60;serializable&#x60;. (optional)
     * @param tenantIdIn Filter by a comma-separated list of tenant ids. (optional)
     * @param withoutTenantId Only include historic details that belong to no tenant. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param userOperationId Filter by a user operation id. (optional)
     * @param formFields Only include &#x60;HistoricFormFields&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param variableUpdates Only include &#x60;HistoricVariableUpdates&#x60;. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param excludeTaskDetails Excludes all task-related &#x60;HistoricDetails&#x60;, so only items which have no task id set will be selected. When this parameter is used together with &#x60;taskId&#x60;, this call is ignored and task details are not excluded. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param initial Restrict to historic variable updates that contain only initial variable values. Value may only be &#x60;true&#x60;, as &#x60;false&#x60; is the default behavior. (optional)
     * @param occurredBefore Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200. (optional)
     * @param occurredAfter Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., 2013-01-23T14:42:45.000+0200. (optional)
     * @return Request successful. (status code 200)
     *         or Returned if some of the query parameters are invalid. (status code 400)
     */
    @Operation(
        operationId = "getHistoricDetailsCount",
        summary = "Get Historic Detail Count",
        description = "Queries for the number of historic details that fulfill the given parameters. Takes the same parameters as the [Get Historic Details](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query/) method.",
        tags = { "Historic Detail" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Request successful.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CountResultDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history/detail/count",
        produces = { "application/json" }
    )
    ResponseEntity<CountResultDto> getHistoricDetailsCount(
        @Parameter(name = "processInstanceId", description = "Filter by process instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "processInstanceId", required = false) String processInstanceId,
        @Parameter(name = "processInstanceIdIn", description = "Only include historic details which belong to one of the passed comma-separated process instance ids.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "processInstanceIdIn", required = false) String processInstanceIdIn,
        @Parameter(name = "executionId", description = "Filter by execution id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "executionId", required = false) String executionId,
        @Parameter(name = "taskId", description = "Filter by task id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "taskId", required = false) String taskId,
        @Parameter(name = "activityInstanceId", description = "Filter by activity instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "activityInstanceId", required = false) String activityInstanceId,
        @Parameter(name = "caseInstanceId", description = "Filter by case instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "caseInstanceId", required = false) String caseInstanceId,
        @Parameter(name = "caseExecutionId", description = "Filter by case execution id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "caseExecutionId", required = false) String caseExecutionId,
        @Parameter(name = "variableInstanceId", description = "Filter by variable instance id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableInstanceId", required = false) String variableInstanceId,
        @Parameter(name = "variableTypeIn", description = "Only include historic details where the variable updates belong to one of the passed comma-separated list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type `serializable`.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableTypeIn", required = false) String variableTypeIn,
        @Parameter(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tenantIdIn", required = false) String tenantIdIn,
        @Parameter(name = "withoutTenantId", description = "Only include historic details that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "withoutTenantId", required = false) Boolean withoutTenantId,
        @Parameter(name = "userOperationId", description = "Filter by a user operation id.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "userOperationId", required = false) String userOperationId,
        @Parameter(name = "formFields", description = "Only include `HistoricFormFields`. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "formFields", required = false) Boolean formFields,
        @Parameter(name = "variableUpdates", description = "Only include `HistoricVariableUpdates`. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "variableUpdates", required = false) Boolean variableUpdates,
        @Parameter(name = "excludeTaskDetails", description = "Excludes all task-related `HistoricDetails`, so only items which have no task id set will be selected. When this parameter is used together with `taskId`, this call is ignored and task details are not excluded. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "excludeTaskDetails", required = false) Boolean excludeTaskDetails,
        @Parameter(name = "initial", description = "Restrict to historic variable updates that contain only initial variable values. Value may only be `true`, as `false` is the default behavior.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "initial", required = false) Boolean initial,
        @Parameter(name = "occurredBefore", description = "Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "occurredBefore", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime occurredBefore,
        @Parameter(name = "occurredAfter", description = "Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "occurredAfter", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) OffsetDateTime occurredAfter
    );


    /**
     * GET /history/detail/{id} : Get Historic Detail
     * Retrieves a historic detail by id.
     *
     * @param id The id of the detail. (required)
     * @param deserializeValue Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default &#x60;true&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While &#x60;true&#x60; is the default value for reasons of backward compatibility, we recommend setting this parameter to &#x60;false&#x60; when developing web applications that are independent of the Java process applications deployed to the engine. (optional)
     * @return Request successful. (status code 200)
     *         or Variable with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format. (status code 404)
     */
    @Operation(
        operationId = "historicDetail",
        summary = "Get Historic Detail",
        description = "Retrieves a historic detail by id.",
        tags = { "Historic Detail" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Request successful.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = HistoricDetailDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Variable with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history/detail/{id}",
        produces = { "application/json" }
    )
    ResponseEntity<HistoricDetailDto> historicDetail(
        @Parameter(name = "id", description = "The id of the detail.", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "deserializeValue", description = "Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `true`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While `true` is the default value for reasons of backward compatibility, we recommend setting this parameter to `false` when developing web applications that are independent of the Java process applications deployed to the engine.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "deserializeValue", required = false) Boolean deserializeValue
    );


    /**
     * GET /history/detail/{id}/data : Get Historic Detail (Binary)
     * Retrieves the content of a historic variable update by id. Applicable for byte array and file variables.
     *
     * @param id The id of the historic variable update. (required)
     * @return Request successful. (status code 200)
     *         or Detail with given id exists but is not a binary variable. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format. (status code 400)
     *         or Detail with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format. (status code 404)
     */
    @Operation(
        operationId = "historicDetailBinary",
        summary = "Get Historic Detail (Binary)",
        description = "Retrieves the content of a historic variable update by id. Applicable for byte array and file variables.",
        tags = { "Historic Detail" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Request successful.", content = {
                @Content(mediaType = "application/octet-stream", schema = @Schema(implementation = org.springframework.core.io.Resource.class)),
                @Content(mediaType = "*/*", schema = @Schema(implementation = org.springframework.core.io.Resource.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
            }),
            @ApiResponse(responseCode = "400", description = "Detail with given id exists but is not a binary variable. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = {
                @Content(mediaType = "application/octet-stream", schema = @Schema(implementation = ExceptionDto.class)),
                @Content(mediaType = "*/*", schema = @Schema(implementation = ExceptionDto.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Detail with given id does not exist. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = {
                @Content(mediaType = "application/octet-stream", schema = @Schema(implementation = ExceptionDto.class)),
                @Content(mediaType = "*/*", schema = @Schema(implementation = ExceptionDto.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/history/detail/{id}/data",
        produces = { "application/octet-stream", "*/*", "application/json" }
    )
    ResponseEntity<org.springframework.core.io.Resource> historicDetailBinary(
        @Parameter(name = "id", description = "The id of the historic variable update.", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    );


    /**
     * POST /history/detail : Get Historic Details (POST)
     * Queries for historic details that fulfill the given parameters. This method is slightly more powerful than the [Get Historic Details](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query/) method because it allows sorting by multiple parameters. The size of the result set can be retrieved by using the [Get Historic Detail Count](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query-count/) method.
     *
     * @param firstResult Pagination of results. Specifies the index of the first result to return. (optional)
     * @param maxResults Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left. (optional)
     * @param deserializeValues Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default &#x60;true&#x60;).  If set to &#x60;true&#x60;, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson&#39;s](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API&#39;s classpath.  If set to &#x60;false&#x60;, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While &#x60;true&#x60; is the default value for reasons of backward compatibility, we recommend setting this parameter to &#x60;false&#x60; when developing web applications that are independent of the Java process applications deployed to the engine. (optional)
     * @param historicDetailQueryDto  (optional)
     * @return Request successful. (status code 200)
     *         or Returned if some of the query parameters are invalid, for example if a &#x60;sortOrder&#x60; parameter is supplied, but no &#x60;sortBy&#x60;. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format. (status code 400)
     */
    @Operation(
        operationId = "queryHistoricDetails",
        summary = "Get Historic Details (POST)",
        description = "Queries for historic details that fulfill the given parameters. This method is slightly more powerful than the [Get Historic Details](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query/) method because it allows sorting by multiple parameters. The size of the result set can be retrieved by using the [Get Historic Detail Count](https://docs.camunda.org/manual/7.17/reference/rest/history/detail/get-detail-query-count/) method.",
        tags = { "Historic Detail" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Request successful.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = HistoricDetailDto.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Returned if some of the query parameters are invalid, for example if a `sortOrder` parameter is supplied, but no `sortBy`. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/history/detail",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<List<HistoricDetailDto>> queryHistoricDetails(
        @Parameter(name = "firstResult", description = "Pagination of results. Specifies the index of the first result to return.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "firstResult", required = false) Integer firstResult,
        @Parameter(name = "maxResults", description = "Pagination of results. Specifies the maximum number of results to return. Will return less results if there are no more results left.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "maxResults", required = false) Integer maxResults,
        @Parameter(name = "deserializeValues", description = "Determines whether serializable variable values (typically variables that store custom Java objects) should be deserialized on server side (default `true`).  If set to `true`, a serializable variable will be deserialized on server side and transformed to JSON using [Jackson's](https://github.com/FasterXML/jackson) POJO/bean property introspection feature. Note that this requires the Java classes of the variable value to be on the REST API's classpath.  If set to `false`, a serializable variable will be returned in its serialized format. For example, a variable that is serialized as XML will be returned as a JSON string containing XML.  **Note:** While `true` is the default value for reasons of backward compatibility, we recommend setting this parameter to `false` when developing web applications that are independent of the Java process applications deployed to the engine.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "deserializeValues", required = false) Boolean deserializeValues,
        @Parameter(name = "HistoricDetailQueryDto", description = "") @Valid @RequestBody(required = false) HistoricDetailQueryDto historicDetailQueryDto
    );

}
