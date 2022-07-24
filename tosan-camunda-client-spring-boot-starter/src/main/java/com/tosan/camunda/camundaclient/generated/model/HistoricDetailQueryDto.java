package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A historic detail query which defines a group of historic details.
 */
@Schema(description = "A historic detail query which defines a group of historic details.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricDetailQueryDto   {
  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processInstanceIdIn")
  @Valid
  private List<String> processInstanceIdIn = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("caseExecutionId")
  private String caseExecutionId = null;

  @JsonProperty("variableInstanceId")
  private String variableInstanceId = null;

  @JsonProperty("variableTypeIn")
  @Valid
  private List<String> variableTypeIn = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("userOperationId")
  private String userOperationId = null;

  @JsonProperty("formFields")
  private Boolean formFields = null;

  @JsonProperty("variableUpdates")
  private Boolean variableUpdates = null;

  @JsonProperty("excludeTaskDetails")
  private Boolean excludeTaskDetails = null;

  @JsonProperty("initial")
  private Boolean initial = null;

  @JsonProperty("occurredBefore")
  private OffsetDateTime occurredBefore = null;

  @JsonProperty("occurredAfter")
  private OffsetDateTime occurredAfter = null;

  @JsonProperty("sorting")
  @Valid
  private List<HistoricDetailQueryDtoSorting> sorting = null;

  public HistoricDetailQueryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * Filter by process instance id.
   * @return processInstanceId
   **/
  @Schema(description = "Filter by process instance id.")
  
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
   **/
  @Schema(description = "Only include historic details which belong to one of the passed  process instance ids.")
  
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
   **/
  @Schema(description = "Filter by execution id.")
  
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
   **/
  @Schema(description = "Filter by task id.")
  
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
   **/
  @Schema(description = "Filter by activity instance id.")
  
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
   **/
  @Schema(description = "Filter by case instance id.")
  
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
   **/
  @Schema(description = "Filter by case execution id.")
  
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
   **/
  @Schema(description = "Filter by variable instance id.")
  
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
   **/
  @Schema(description = "Only include historic details where the variable updates belong to one of the passed  list of variable types. A list of all supported variable types can be found [here](https://docs.camunda.org/manual/7.17/user-guide/process-engine/variables/#supported-variable-values). **Note:** All non-primitive variables are associated with the type `serializable`.")
  
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
   **/
  @Schema(description = "Filter by a  list of tenant ids.")
  
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
   **/
  @Schema(description = "Only include historic details that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
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
   **/
  @Schema(description = "Filter by a user operation id.")
  
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
   **/
  @Schema(description = "Only include `HistoricFormFields`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isFormFields() {
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
   **/
  @Schema(description = "Only include `HistoricVariableUpdates`. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isVariableUpdates() {
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
   **/
  @Schema(description = "Excludes all task-related `HistoricDetails`, so only items which have no task id set will be selected. When this parameter is used together with `taskId`, this call is ignored and task details are not excluded. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isExcludeTaskDetails() {
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
   **/
  @Schema(description = "Restrict to historic variable updates that contain only initial variable values. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isInitial() {
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
   **/
  @Schema(description = "Restrict to historic details that occured before the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.")
  
    @Valid
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
   **/
  @Schema(description = "Restrict to historic details that occured after the given date (including the date). Default [format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., 2013-01-23T14:42:45.000+0200.")
  
    @Valid
    public OffsetDateTime getOccurredAfter() {
    return occurredAfter;
  }

  public void setOccurredAfter(OffsetDateTime occurredAfter) {
    this.occurredAfter = occurredAfter;
  }

  public HistoricDetailQueryDto sorting(List<HistoricDetailQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricDetailQueryDto addSortingItem(HistoricDetailQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * A JSON array of criteria to sort the result by. Each element of the array is                     a JSON object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Does not have an effect for the `count` endpoint.
   * @return sorting
   **/
  @Schema(description = "A JSON array of criteria to sort the result by. Each element of the array is                     a JSON object that specifies one ordering. The position in the array                     identifies the rank of an ordering, i.e., whether it is primary, secondary,                     etc. Does not have an effect for the `count` endpoint.")
      @Valid
    public List<HistoricDetailQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<HistoricDetailQueryDtoSorting> sorting) {
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
