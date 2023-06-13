package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VariableInstanceDtoAllOf
 */

@JsonTypeName("VariableInstanceDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class VariableInstanceDtoAllOf {

  private String id = null;

  private String name = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String executionId = null;

  private String caseInstanceId = null;

  private String caseExecutionId = null;

  private String taskId = null;

  private String batchId = null;

  private String activityInstanceId = null;

  private String tenantId = null;

  private String errorMessage = null;

  public VariableInstanceDtoAllOf id(String id) {
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

  public VariableInstanceDtoAllOf name(String name) {
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

  public VariableInstanceDtoAllOf processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition that this variable instance belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public VariableInstanceDtoAllOf processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance that this variable instance belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public VariableInstanceDtoAllOf executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution that this variable instance belongs to.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The id of the execution that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public VariableInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the case instance that this variable instance belongs to.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "The id of the case instance that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public VariableInstanceDtoAllOf caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * The id of the case execution that this variable instance belongs to.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "The id of the case execution that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public VariableInstanceDtoAllOf taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * The id of the task that this variable instance belongs to.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "The id of the task that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public VariableInstanceDtoAllOf batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * The id of the batch that this variable instance belongs to.<
   * @return batchId
  */
  
  @Schema(name = "batchId", description = "The id of the batch that this variable instance belongs to.<", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public VariableInstanceDtoAllOf activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance that this variable instance belongs to.
   * @return activityInstanceId
  */
  
  @Schema(name = "activityInstanceId", description = "The id of the activity instance that this variable instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public VariableInstanceDtoAllOf tenantId(String tenantId) {
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

  public VariableInstanceDtoAllOf errorMessage(String errorMessage) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableInstanceDtoAllOf variableInstanceDtoAllOf = (VariableInstanceDtoAllOf) o;
    return Objects.equals(this.id, variableInstanceDtoAllOf.id) &&
        Objects.equals(this.name, variableInstanceDtoAllOf.name) &&
        Objects.equals(this.processDefinitionId, variableInstanceDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processInstanceId, variableInstanceDtoAllOf.processInstanceId) &&
        Objects.equals(this.executionId, variableInstanceDtoAllOf.executionId) &&
        Objects.equals(this.caseInstanceId, variableInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, variableInstanceDtoAllOf.caseExecutionId) &&
        Objects.equals(this.taskId, variableInstanceDtoAllOf.taskId) &&
        Objects.equals(this.batchId, variableInstanceDtoAllOf.batchId) &&
        Objects.equals(this.activityInstanceId, variableInstanceDtoAllOf.activityInstanceId) &&
        Objects.equals(this.tenantId, variableInstanceDtoAllOf.tenantId) &&
        Objects.equals(this.errorMessage, variableInstanceDtoAllOf.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, processDefinitionId, processInstanceId, executionId, caseInstanceId, caseExecutionId, taskId, batchId, activityInstanceId, tenantId, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

