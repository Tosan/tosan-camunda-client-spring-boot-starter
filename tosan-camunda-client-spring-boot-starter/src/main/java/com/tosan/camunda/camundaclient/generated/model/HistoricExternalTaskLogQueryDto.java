package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricExternalTaskLogQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A Historic External Task Log instance query which defines a list of Historic External Task Log instances
 */

@Schema(name = "HistoricExternalTaskLogQueryDto", description = "A Historic External Task Log instance query which defines a list of Historic External Task Log instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricExternalTaskLogQueryDto {

  private String logId = null;

  private String externalTaskId = null;

  private String topicName = null;

  private String workerId = null;

  private String errorMessage = null;

  @Valid
  private List<String> activityIdIn;

  @Valid
  private List<String> activityInstanceIdIn;

  @Valid
  private List<String> executionIdIn;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  private Long priorityLowerThanOrEquals = null;

  private Long priorityHigherThanOrEquals = null;

  private Boolean creationLog = null;

  private Boolean failureLog = null;

  private Boolean successLog = null;

  private Boolean deletionLog = null;

  @Valid
  private List<@Valid HistoricExternalTaskLogQueryDtoSortingInner> sorting;

  public HistoricExternalTaskLogQueryDto logId(String logId) {
    this.logId = logId;
    return this;
  }

  /**
   * Filter by historic external task log id.
   * @return logId
  */
  
  @Schema(name = "logId", description = "Filter by historic external task log id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logId")
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
  */
  
  @Schema(name = "externalTaskId", description = "Filter by external task id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalTaskId")
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
  */
  
  @Schema(name = "topicName", description = "Filter by an external task topic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topicName")
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
  */
  
  @Schema(name = "workerId", description = "Filter by the id of the worker that the task was most recently locked by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
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
  */
  
  @Schema(name = "errorMessage", description = "Filter by external task exception message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
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
  */
  
  @Schema(name = "activityIdIn", description = "Only include historic external task logs which belong to one of the passed activity ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityIdIn")
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
  */
  
  @Schema(name = "activityInstanceIdIn", description = "Only include historic external task logs which belong to one of the passed activity instance ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceIdIn")
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
  */
  
  @Schema(name = "executionIdIn", description = "Only include historic external task logs which belong to one of the passed execution ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionIdIn")
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
  */
  
  @Schema(name = "processInstanceId", description = "Filter by process instance id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
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
  */
  
  @Schema(name = "processDefinitionId", description = "Filter by process definition id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
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
  */
  
  @Schema(name = "processDefinitionKey", description = "Filter by process definition key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
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
  */
  
  @Schema(name = "tenantIdIn", description = "Only include historic external task log entries which belong to one of the passed and comma-separated tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
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
  */
  
  @Schema(name = "withoutTenantId", description = "Only include historic external task log entries that belong to no tenant. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
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
  */
  
  @Schema(name = "priorityLowerThanOrEquals", description = "Only include logs for which the associated external task had a priority lower than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityLowerThanOrEquals")
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
  */
  
  @Schema(name = "priorityHigherThanOrEquals", description = "Only include logs for which the associated external task had a priority higher than or equal to the given value. Value must be a valid `long` value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priorityHigherThanOrEquals")
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
  */
  
  @Schema(name = "creationLog", description = "Only include creation logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationLog")
  public Boolean getCreationLog() {
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
  */
  
  @Schema(name = "failureLog", description = "Only include failure logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureLog")
  public Boolean getFailureLog() {
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
  */
  
  @Schema(name = "successLog", description = "Only include success logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successLog")
  public Boolean getSuccessLog() {
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
  */
  
  @Schema(name = "deletionLog", description = "Only include deletion logs. Value may only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletionLog")
  public Boolean getDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  public HistoricExternalTaskLogQueryDto sorting(List<@Valid HistoricExternalTaskLogQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricExternalTaskLogQueryDto addSortingItem(HistoricExternalTaskLogQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Sorting has no effect for `count` endpoints.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricExternalTaskLogQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricExternalTaskLogQueryDtoSortingInner> sorting) {
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

