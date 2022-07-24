package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * A Historic External Task Log instance query which defines a list of Historic External Task Log instances
 */
@Schema(description = "A Historic External Task Log instance query which defines a list of Historic External Task Log instances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricExternalTaskLogQueryDto   {
  @JsonProperty("logId")
  private String logId = null;

  @JsonProperty("externalTaskId")
  private String externalTaskId = null;

  @JsonProperty("topicName")
  private String topicName = null;

  @JsonProperty("workerId")
  private String workerId = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("activityIdIn")
  @Valid
  private List<String> activityIdIn = null;

  @JsonProperty("activityInstanceIdIn")
  @Valid
  private List<String> activityInstanceIdIn = null;

  @JsonProperty("executionIdIn")
  @Valid
  private List<String> executionIdIn = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("priorityLowerThanOrEquals")
  private Long priorityLowerThanOrEquals = null;

  @JsonProperty("priorityHigherThanOrEquals")
  private Long priorityHigherThanOrEquals = null;

  @JsonProperty("creationLog")
  private Boolean creationLog = null;

  @JsonProperty("failureLog")
  private Boolean failureLog = null;

  @JsonProperty("successLog")
  private Boolean successLog = null;

  @JsonProperty("deletionLog")
  private Boolean deletionLog = null;

  @JsonProperty("sorting")
  @Valid
  private List<HistoricExternalTaskLogQueryDtoSorting> sorting = null;

  public HistoricExternalTaskLogQueryDto logId(String logId) {
    this.logId = logId;
    return this;
  }

  /**
   * Filter by historic external task log id.
   * @return logId
   **/
  @Schema(description = "Filter by historic external task log id.")
  
    public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }

  public HistoricExternalTaskLogQueryDto externalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
    return this;
  }

  /**
   * Filter by external task id.
   * @return externalTaskId
   **/
  @Schema(description = "Filter by external task id.")
  
    public String getExternalTaskId() {
    return externalTaskId;
  }

  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }

  public HistoricExternalTaskLogQueryDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * Filter by an external task topic.
   * @return topicName
   **/
  @Schema(description = "Filter by an external task topic.")
  
    public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public HistoricExternalTaskLogQueryDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * Filter by the id of the worker that the task was most recently locked by.
   * @return workerId
   **/
  @Schema(description = "Filter by the id of the worker that the task was most recently locked by.")
  
    public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public HistoricExternalTaskLogQueryDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Filter by external task exception message.
   * @return errorMessage
   **/
  @Schema(description = "Filter by external task exception message.")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HistoricExternalTaskLogQueryDto activityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addActivityIdInItem(String activityIdInItem) {
    if (this.activityIdIn == null) {
      this.activityIdIn = new ArrayList<>();
    }
    this.activityIdIn.add(activityIdInItem);
    return this;
  }

  /**
   * Only include historic external task logs which belong to one of the passed activity ids.
   * @return activityIdIn
   **/
  @Schema(description = "Only include historic external task logs which belong to one of the passed activity ids.")
  
    public List<String> getActivityIdIn() {
    return activityIdIn;
  }

  public void setActivityIdIn(List<String> activityIdIn) {
    this.activityIdIn = activityIdIn;
  }

  public HistoricExternalTaskLogQueryDto activityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addActivityInstanceIdInItem(String activityInstanceIdInItem) {
    if (this.activityInstanceIdIn == null) {
      this.activityInstanceIdIn = new ArrayList<>();
    }
    this.activityInstanceIdIn.add(activityInstanceIdInItem);
    return this;
  }

  /**
   * Only include historic external task logs which belong to one of the passed activity instance ids.
   * @return activityInstanceIdIn
   **/
  @Schema(description = "Only include historic external task logs which belong to one of the passed activity instance ids.")
  
    public List<String> getActivityInstanceIdIn() {
    return activityInstanceIdIn;
  }

  public void setActivityInstanceIdIn(List<String> activityInstanceIdIn) {
    this.activityInstanceIdIn = activityInstanceIdIn;
  }

  public HistoricExternalTaskLogQueryDto executionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addExecutionIdInItem(String executionIdInItem) {
    if (this.executionIdIn == null) {
      this.executionIdIn = new ArrayList<>();
    }
    this.executionIdIn.add(executionIdInItem);
    return this;
  }

  /**
   * Only include historic external task logs which belong to one of the passed execution ids.
   * @return executionIdIn
   **/
  @Schema(description = "Only include historic external task logs which belong to one of the passed execution ids.")
  
    public List<String> getExecutionIdIn() {
    return executionIdIn;
  }

  public void setExecutionIdIn(List<String> executionIdIn) {
    this.executionIdIn = executionIdIn;
  }

  public HistoricExternalTaskLogQueryDto processInstanceId(String processInstanceId) {
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

  public HistoricExternalTaskLogQueryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Filter by process definition id.
   * @return processDefinitionId
   **/
  @Schema(description = "Filter by process definition id.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricExternalTaskLogQueryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * Filter by process definition key.
   * @return processDefinitionKey
   **/
  @Schema(description = "Filter by process definition key.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricExternalTaskLogQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Only include historic external task log entries which belong to one of the passed and comma-separated tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Only include historic external task log entries which belong to one of the passed and comma-separated tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricExternalTaskLogQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include historic external task log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include historic external task log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricExternalTaskLogQueryDto priorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
    return this;
  }

  /**
   * Only include logs for which the associated external task had a priority lower than or equal to the given value. Value must be a valid `long` value.
   * @return priorityLowerThanOrEquals
   **/
  @Schema(description = "Only include logs for which the associated external task had a priority lower than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getPriorityLowerThanOrEquals() {
    return priorityLowerThanOrEquals;
  }

  public void setPriorityLowerThanOrEquals(Long priorityLowerThanOrEquals) {
    this.priorityLowerThanOrEquals = priorityLowerThanOrEquals;
  }

  public HistoricExternalTaskLogQueryDto priorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
    return this;
  }

  /**
   * Only include logs for which the associated external task had a priority higher than or equal to the given value. Value must be a valid `long` value.
   * @return priorityHigherThanOrEquals
   **/
  @Schema(description = "Only include logs for which the associated external task had a priority higher than or equal to the given value. Value must be a valid `long` value.")
  
    public Long getPriorityHigherThanOrEquals() {
    return priorityHigherThanOrEquals;
  }

  public void setPriorityHigherThanOrEquals(Long priorityHigherThanOrEquals) {
    this.priorityHigherThanOrEquals = priorityHigherThanOrEquals;
  }

  public HistoricExternalTaskLogQueryDto creationLog(Boolean creationLog) {
    this.creationLog = creationLog;
    return this;
  }

  /**
   * Only include creation logs. Value may only be `true`, as `false` is the default behavior.
   * @return creationLog
   **/
  @Schema(description = "Only include creation logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isCreationLog() {
    return creationLog;
  }

  public void setCreationLog(Boolean creationLog) {
    this.creationLog = creationLog;
  }

  public HistoricExternalTaskLogQueryDto failureLog(Boolean failureLog) {
    this.failureLog = failureLog;
    return this;
  }

  /**
   * Only include failure logs. Value may only be `true`, as `false` is the default behavior.
   * @return failureLog
   **/
  @Schema(description = "Only include failure logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isFailureLog() {
    return failureLog;
  }

  public void setFailureLog(Boolean failureLog) {
    this.failureLog = failureLog;
  }

  public HistoricExternalTaskLogQueryDto successLog(Boolean successLog) {
    this.successLog = successLog;
    return this;
  }

  /**
   * Only include success logs. Value may only be `true`, as `false` is the default behavior.
   * @return successLog
   **/
  @Schema(description = "Only include success logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isSuccessLog() {
    return successLog;
  }

  public void setSuccessLog(Boolean successLog) {
    this.successLog = successLog;
  }

  public HistoricExternalTaskLogQueryDto deletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
    return this;
  }

  /**
   * Only include deletion logs. Value may only be `true`, as `false` is the default behavior.
   * @return deletionLog
   **/
  @Schema(description = "Only include deletion logs. Value may only be `true`, as `false` is the default behavior.")
  
    public Boolean isDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  public HistoricExternalTaskLogQueryDto sorting(List<HistoricExternalTaskLogQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addSortingItem(HistoricExternalTaskLogQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.")
      @Valid
    public List<HistoricExternalTaskLogQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<HistoricExternalTaskLogQueryDtoSorting> sorting) {
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
    HistoricExternalTaskLogQueryDto historicExternalTaskLogQueryDto = (HistoricExternalTaskLogQueryDto) o;
    return Objects.equals(this.logId, historicExternalTaskLogQueryDto.logId) &&
        Objects.equals(this.externalTaskId, historicExternalTaskLogQueryDto.externalTaskId) &&
        Objects.equals(this.topicName, historicExternalTaskLogQueryDto.topicName) &&
        Objects.equals(this.workerId, historicExternalTaskLogQueryDto.workerId) &&
        Objects.equals(this.errorMessage, historicExternalTaskLogQueryDto.errorMessage) &&
        Objects.equals(this.activityIdIn, historicExternalTaskLogQueryDto.activityIdIn) &&
        Objects.equals(this.activityInstanceIdIn, historicExternalTaskLogQueryDto.activityInstanceIdIn) &&
        Objects.equals(this.executionIdIn, historicExternalTaskLogQueryDto.executionIdIn) &&
        Objects.equals(this.processInstanceId, historicExternalTaskLogQueryDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicExternalTaskLogQueryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicExternalTaskLogQueryDto.processDefinitionKey) &&
        Objects.equals(this.tenantIdIn, historicExternalTaskLogQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicExternalTaskLogQueryDto.withoutTenantId) &&
        Objects.equals(this.priorityLowerThanOrEquals, historicExternalTaskLogQueryDto.priorityLowerThanOrEquals) &&
        Objects.equals(this.priorityHigherThanOrEquals, historicExternalTaskLogQueryDto.priorityHigherThanOrEquals) &&
        Objects.equals(this.creationLog, historicExternalTaskLogQueryDto.creationLog) &&
        Objects.equals(this.failureLog, historicExternalTaskLogQueryDto.failureLog) &&
        Objects.equals(this.successLog, historicExternalTaskLogQueryDto.successLog) &&
        Objects.equals(this.deletionLog, historicExternalTaskLogQueryDto.deletionLog) &&
        Objects.equals(this.sorting, historicExternalTaskLogQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logId, externalTaskId, topicName, workerId, errorMessage, activityIdIn, activityInstanceIdIn, executionIdIn, processInstanceId, processDefinitionId, processDefinitionKey, tenantIdIn, withoutTenantId, priorityLowerThanOrEquals, priorityHigherThanOrEquals, creationLog, failureLog, successLog, deletionLog, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricExternalTaskLogQueryDto {\n");
    
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    activityIdIn: ").append(toIndentedString(activityIdIn)).append("\n");
    sb.append("    activityInstanceIdIn: ").append(toIndentedString(activityInstanceIdIn)).append("\n");
    sb.append("    executionIdIn: ").append(toIndentedString(executionIdIn)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    priorityLowerThanOrEquals: ").append(toIndentedString(priorityLowerThanOrEquals)).append("\n");
    sb.append("    priorityHigherThanOrEquals: ").append(toIndentedString(priorityHigherThanOrEquals)).append("\n");
    sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
    sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
    sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
    sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
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
