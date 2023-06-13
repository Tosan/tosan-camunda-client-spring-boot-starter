package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricDetailQueryDtoSortingInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A historic detail query which defines a group of historic details.
 */

@Schema(name = "HistoricDetailQueryDto", description = "A historic detail query which defines a group of historic details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricDetailQueryDto {

  private String processInstanceId = null;

  @Valid
  private List<String> processInstanceIdIn;

  private String executionId = null;

  private String taskId = null;

  private String activityInstanceId = null;

  private String caseInstanceId = null;

  private String caseExecutionId = null;

  private String variableInstanceId = null;

  @Valid
  private List<String> variableTypeIn;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private String userOperationId = null;

  private Boolean formFields = null;

  private Boolean variableUpdates = null;

  private Boolean excludeTaskDetails = null;

  private Boolean initial = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredBefore = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime occurredAfter = null;

  @Valid
  private List<@Valid HistoricDetailQueryDtoSortingInner> sorting;

  public HistoricDetailQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by process instance id.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "Filter by process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricDetailQueryDto processInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
    return this;
  }

  public HistoricDetailQueryDto addProcessInstanceIdInItem(String processInstanceIdInItem) {
    if (this.processInstanceIdIn == null) {
      this.processInstanceIdIn = new ArrayList<>();
    }
    this.processInstanceIdIn.add(processInstanceIdInItem);
    return this;
  }

  /**
   * Only include historic details which belong to one of the passed  process instance ids.
   * @return processInstanceIdIn
  */
  
  @Schema(name = "processInstanceIdIn", description = "Only include historic details which belong to one of the passed  process instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIdIn")
  public List<String> getProcessInstanceIdIn() {
    return processInstanceIdIn;
  }

  public void setProcessInstanceIdIn(List<String> processInstanceIdIn) {
    this.processInstanceIdIn = processInstanceIdIn;
  }

  public HistoricDetailQueryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Filter by execution id.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Filter by execution id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricDetailQueryDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Filter by task id.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "Filter by task id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricDetailQueryDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * Filter by activity instance id.
   * @return activityInstanceId
  */
  
  @Schema(name = "activityInstanceId", description = "Filter by activity instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricDetailQueryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * Filter by case instance id.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "Filter by case instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricDetailQueryDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * Filter by case execution id.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "Filter by case execution id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public HistoricDetailQueryDto variableInstanceId(String variableInstanceId) {
    this.variableInstanceId = variableInstanceId;
    return this;
  }

  /**
   * Filter by variable instance id.
   * @return variableInstanceId
  */
  
  @Schema(name = "variableInstanceId", description = "Filter by variable instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableInstanceId")
  public String getVariableInstanceId() {
    return variableInstanceId;
  }

  public void setVariableInstanceId(String variableInstanceId) {
    this.variableInstanceId = variableInstanceId;
  }

  public HistoricDetailQueryDto variableTypeIn(List<String> variableTypeIn) {
    this.variableTypeIn = variableTypeIn;
    return this;
  }

  public HistoricDetailQueryDto addVariableTypeInItem(String variableTypeInItem) {
    if (this.variableTypeIn == null) {
      this.variableTypeIn = new ArrayList<>();
    }
    this.variableTypeIn.add(variableTypeInItem);
    return this;
  }

  /**
   * Only include historic details where the variable updates belong to one of the passed  list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type `serializable`.
   * @return variableTypeIn
  */
  
  @Schema(name = "variableTypeIn", description = "Only include historic details where the variable updates belong to one of the passed  list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type `serializable`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableTypeIn")
  public List<String> getVariableTypeIn() {
    return variableTypeIn;
  }

  public void setVariableTypeIn(List<String> variableTypeIn) {
    this.variableTypeIn = variableTypeIn;
  }

  public HistoricDetailQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricDetailQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a  list of tenant ids.
   * @return tenantIdIn
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a  list of tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
  public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricDetailQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic details that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic details that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricDetailQueryDto userOperationId(String userOperationId) {
    this.userOperationId = userOperationId;
    return this;
  }

  /**
   * Filter by a user operation id.
   * @return userOperationId
  */
  
  @Schema(name = "userOperationId", description = "Filter by a user operation id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userOperationId")
  public String getUserOperationId() {
    return userOperationId;
  }

  public void setUserOperationId(String userOperationId) {
    this.userOperationId = userOperationId;
  }

  public HistoricDetailQueryDto formFields(Boolean formFields) {
    this.formFields = formFields;
    return this;
  }

  /**
   * Only include `HistoricFormFields`. Value may only be `true`, as `false` is the default behavior.
   * @return formFields
  */
  
  @Schema(name = "formFields", description = "Only include `HistoricFormFields`. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formFields")
  public Boolean getFormFields() {
    return formFields;
  }

  public void setFormFields(Boolean formFields) {
    this.formFields = formFields;
  }

  public HistoricDetailQueryDto variableUpdates(Boolean variableUpdates) {
    this.variableUpdates = variableUpdates;
    return this;
  }

  /**
   * Only include `HistoricVariableUpdates`. Value may only be `true`, as `false` is the default behavior.
   * @return variableUpdates
  */
  
  @Schema(name = "variableUpdates", description = "Only include `HistoricVariableUpdates`. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variableUpdates")
  public Boolean getVariableUpdates() {
    return variableUpdates;
  }

  public void setVariableUpdates(Boolean variableUpdates) {
    this.variableUpdates = variableUpdates;
  }

  public HistoricDetailQueryDto excludeTaskDetails(Boolean excludeTaskDetails) {
    this.excludeTaskDetails = excludeTaskDetails;
    return this;
  }

  /**
   * Excludes all task-related `HistoricDetails`, so only items which have no task id set will be selected. When this parameter is used together with `taskId`, this call is ignored and task details are not excluded. Value may only be `true`, as `false` is the default behavior.
   * @return excludeTaskDetails
  */
  
  @Schema(name = "excludeTaskDetails", description = "Excludes all task-related `HistoricDetails`, so only items which have no task id set will be selected. When this parameter is used together with `taskId`, this call is ignored and task details are not excluded. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excludeTaskDetails")
  public Boolean getExcludeTaskDetails() {
    return excludeTaskDetails;
  }

  public void setExcludeTaskDetails(Boolean excludeTaskDetails) {
    this.excludeTaskDetails = excludeTaskDetails;
  }

  public HistoricDetailQueryDto initial(Boolean initial) {
    this.initial = initial;
    return this;
  }

  /**
   * Restrict to historic variable updates that contain only initial variable values. Value may only be `true`, as `false` is the default behavior.
   * @return initial
  */
  
  @Schema(name = "initial", description = "Restrict to historic variable updates that contain only initial variable values. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initial")
  public Boolean getInitial() {
    return initial;
  }

  public void setInitial(Boolean initial) {
    this.initial = initial;
  }

  public HistoricDetailQueryDto occurredBefore(OffsetDateTime occurredBefore) {
    this.occurredBefore = occurredBefore;
    return this;
  }

  /**
   * Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.
   * @return occurredBefore
  */
  @Valid 
  @Schema(name = "occurredBefore", description = "Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurredBefore")
  public OffsetDateTime getOccurredBefore() {
    return occurredBefore;
  }

  public void setOccurredBefore(OffsetDateTime occurredBefore) {
    this.occurredBefore = occurredBefore;
  }

  public HistoricDetailQueryDto occurredAfter(OffsetDateTime occurredAfter) {
    this.occurredAfter = occurredAfter;
    return this;
  }

  /**
   * Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.
   * @return occurredAfter
  */
  @Valid 
  @Schema(name = "occurredAfter", description = "Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occurredAfter")
  public OffsetDateTime getOccurredAfter() {
    return occurredAfter;
  }

  public void setOccurredAfter(OffsetDateTime occurredAfter) {
    this.occurredAfter = occurredAfter;
  }

  public HistoricDetailQueryDto sorting(List<@Valid HistoricDetailQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricDetailQueryDto addSortingItem(HistoricDetailQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * A JSON array of criteria to sort the result by. Each element of the array is                     a JSON object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Does not have an effect for the `count` endpoint.
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "A JSON array of criteria to sort the result by. Each element of the array is                     a JSON object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Does not have an effect for the `count` endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricDetailQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricDetailQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDetailQueryDto historicDetailQueryDto = (HistoricDetailQueryDto) o;
    return Objects.equals(this.processInstanceId, historicDetailQueryDto.processInstanceId) &&
        Objects.equals(this.processInstanceIdIn, historicDetailQueryDto.processInstanceIdIn) &&
        Objects.equals(this.executionId, historicDetailQueryDto.executionId) &&
        Objects.equals(this.taskId, historicDetailQueryDto.taskId) &&
        Objects.equals(this.activityInstanceId, historicDetailQueryDto.activityInstanceId) &&
        Objects.equals(this.caseInstanceId, historicDetailQueryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicDetailQueryDto.caseExecutionId) &&
        Objects.equals(this.variableInstanceId, historicDetailQueryDto.variableInstanceId) &&
        Objects.equals(this.variableTypeIn, historicDetailQueryDto.variableTypeIn) &&
        Objects.equals(this.tenantIdIn, historicDetailQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicDetailQueryDto.withoutTenantId) &&
        Objects.equals(this.userOperationId, historicDetailQueryDto.userOperationId) &&
        Objects.equals(this.formFields, historicDetailQueryDto.formFields) &&
        Objects.equals(this.variableUpdates, historicDetailQueryDto.variableUpdates) &&
        Objects.equals(this.excludeTaskDetails, historicDetailQueryDto.excludeTaskDetails) &&
        Objects.equals(this.initial, historicDetailQueryDto.initial) &&
        Objects.equals(this.occurredBefore, historicDetailQueryDto.occurredBefore) &&
        Objects.equals(this.occurredAfter, historicDetailQueryDto.occurredAfter) &&
        Objects.equals(this.sorting, historicDetailQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processInstanceId, processInstanceIdIn, executionId, taskId, activityInstanceId, caseInstanceId, caseExecutionId, variableInstanceId, variableTypeIn, tenantIdIn, withoutTenantId, userOperationId, formFields, variableUpdates, excludeTaskDetails, initial, occurredBefore, occurredAfter, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDetailQueryDto {\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processInstanceIdIn: ").append(toIndentedString(processInstanceIdIn)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    variableInstanceId: ").append(toIndentedString(variableInstanceId)).append("\n");
    sb.append("    variableTypeIn: ").append(toIndentedString(variableTypeIn)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    userOperationId: ").append(toIndentedString(userOperationId)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
    sb.append("    variableUpdates: ").append(toIndentedString(variableUpdates)).append("\n");
    sb.append("    excludeTaskDetails: ").append(toIndentedString(excludeTaskDetails)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    occurredBefore: ").append(toIndentedString(occurredBefore)).append("\n");
    sb.append("    occurredAfter: ").append(toIndentedString(occurredAfter)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

