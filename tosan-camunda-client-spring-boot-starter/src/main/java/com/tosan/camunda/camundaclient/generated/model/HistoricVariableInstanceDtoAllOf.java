package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricVariableInstanceDtoAllOf
 */

@JsonTypeName("HistoricVariableInstanceDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricVariableInstanceDtoAllOf {

  private String id = null;

  private String name = null;

  private String processDefinitionKey = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String executionId = null;

  private String activityInstanceId = null;

  private String caseDefinitionKey = null;

  private String caseDefinitionId = null;

  private String caseInstanceId = null;

  private String caseExecutionId = null;

  private String taskId = null;

  private String tenantId = null;

  private String errorMessage = null;

  private String state = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String rootProcessInstanceId = null;

  public HistoricVariableInstanceDtoAllOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the variable instance.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the variable instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricVariableInstanceDtoAllOf name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the variable instance.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the variable instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HistoricVariableInstanceDtoAllOf processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition the variable instance belongs to.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricVariableInstanceDtoAllOf processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition the variable instance belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricVariableInstanceDtoAllOf processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The process instance id the variable instance belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The process instance id the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricVariableInstanceDtoAllOf executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The execution id the variable instance belongs to.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The execution id the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricVariableInstanceDtoAllOf activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance in which the variable is valid.
   * @return activityInstanceId
  */
  
  @Schema(name = "activityInstanceId", description = "The id of the activity instance in which the variable is valid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricVariableInstanceDtoAllOf caseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
    return this;
  }

  /**
   * The key of the case definition the variable instance belongs to.
   * @return caseDefinitionKey
  */
  
  @Schema(name = "caseDefinitionKey", description = "The key of the case definition the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionKey")
  public String getCaseDefinitionKey() {
    return caseDefinitionKey;
  }

  public void setCaseDefinitionKey(String caseDefinitionKey) {
    this.caseDefinitionKey = caseDefinitionKey;
  }

  public HistoricVariableInstanceDtoAllOf caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * The id of the case definition the variable instance belongs to.
   * @return caseDefinitionId
  */
  
  @Schema(name = "caseDefinitionId", description = "The id of the case definition the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionId")
  public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public HistoricVariableInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The case instance id the variable instance belongs to.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "The case instance id the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public HistoricVariableInstanceDtoAllOf caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * The case execution id the variable instance belongs to.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "The case execution id the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public HistoricVariableInstanceDtoAllOf taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task the variable instance belongs to.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "The id of the task the variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public HistoricVariableInstanceDtoAllOf tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant that this variable instance belongs to.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricVariableInstanceDtoAllOf errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * An error message in case a Java Serialized Object could not be de-serialized.
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", description = "An error message in case a Java Serialized Object could not be de-serialized.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HistoricVariableInstanceDtoAllOf state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The current state of the variable. Can be 'CREATED' or 'DELETED'.
   * @return state
  */
  
  @Schema(name = "state", description = "The current state of the variable. Can be 'CREATED' or 'DELETED'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public HistoricVariableInstanceDtoAllOf createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return createTime
  */
  @Valid 
  @Schema(name = "createTime", description = "The time the variable was inserted. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createTime")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public HistoricVariableInstanceDtoAllOf removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the variable should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the variable should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricVariableInstanceDtoAllOf rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this variable.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process containing this variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricVariableInstanceDtoAllOf historicVariableInstanceDtoAllOf = (HistoricVariableInstanceDtoAllOf) o;
    return Objects.equals(this.id, historicVariableInstanceDtoAllOf.id) &&
        Objects.equals(this.name, historicVariableInstanceDtoAllOf.name) &&
        Objects.equals(this.processDefinitionKey, historicVariableInstanceDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionId, historicVariableInstanceDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processInstanceId, historicVariableInstanceDtoAllOf.processInstanceId) &&
        Objects.equals(this.executionId, historicVariableInstanceDtoAllOf.executionId) &&
        Objects.equals(this.activityInstanceId, historicVariableInstanceDtoAllOf.activityInstanceId) &&
        Objects.equals(this.caseDefinitionKey, historicVariableInstanceDtoAllOf.caseDefinitionKey) &&
        Objects.equals(this.caseDefinitionId, historicVariableInstanceDtoAllOf.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, historicVariableInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, historicVariableInstanceDtoAllOf.caseExecutionId) &&
        Objects.equals(this.taskId, historicVariableInstanceDtoAllOf.taskId) &&
        Objects.equals(this.tenantId, historicVariableInstanceDtoAllOf.tenantId) &&
        Objects.equals(this.errorMessage, historicVariableInstanceDtoAllOf.errorMessage) &&
        Objects.equals(this.state, historicVariableInstanceDtoAllOf.state) &&
        Objects.equals(this.createTime, historicVariableInstanceDtoAllOf.createTime) &&
        Objects.equals(this.removalTime, historicVariableInstanceDtoAllOf.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicVariableInstanceDtoAllOf.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, processDefinitionKey, processDefinitionId, processInstanceId, executionId, activityInstanceId, caseDefinitionKey, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, tenantId, errorMessage, state, createTime, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricVariableInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    caseDefinitionKey: ").append(toIndentedString(caseDefinitionKey)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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

