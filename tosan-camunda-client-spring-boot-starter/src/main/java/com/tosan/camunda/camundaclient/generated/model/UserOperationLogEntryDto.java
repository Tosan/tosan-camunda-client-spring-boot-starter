package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserOperationLogEntryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class UserOperationLogEntryDto {

  private String id = null;

  private String userId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp = null;

  private String operationId = null;

  private String operationType = null;

  private String entityType = null;

  private String category = null;

  private String annotation = null;

  private String property = null;

  private String orgValue = null;

  private String newValue = null;

  private String deploymentId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processInstanceId = null;

  private String executionId = null;

  private String caseDefinitionId = null;

  private String caseInstanceId = null;

  private String caseExecutionId = null;

  private String taskId = null;

  private String externalTaskId = null;

  private String batchId = null;

  private String jobId = null;

  private String jobDefinitionId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String rootProcessInstanceId = null;

  public UserOperationLogEntryDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this log entry.
   * @return id
  */
  
  @Schema(name = "id", description = "The unique identifier of this log entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserOperationLogEntryDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The user who performed this operation.
   * @return userId
  */
  
  @Schema(name = "userId", description = "The user who performed this operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserOperationLogEntryDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Timestamp of this operation.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "Timestamp of this operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public UserOperationLogEntryDto operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The unique identifier of this operation. A composite operation that changes multiple properties has a common `operationId`.
   * @return operationId
  */
  
  @Schema(name = "operationId", description = "The unique identifier of this operation. A composite operation that changes multiple properties has a common `operationId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }

  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  public UserOperationLogEntryDto operationType(String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * The type of this operation, e.g., `Assign`, `Claim` and so on.
   * @return operationType
  */
  
  @Schema(name = "operationType", description = "The type of this operation, e.g., `Assign`, `Claim` and so on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operationType")
  public String getOperationType() {
    return operationType;
  }

  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }

  public UserOperationLogEntryDto entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * The type of the entity on which this operation was executed, e.g., `Task` or `Attachment`.
   * @return entityType
  */
  
  @Schema(name = "entityType", description = "The type of the entity on which this operation was executed, e.g., `Task` or `Attachment`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public UserOperationLogEntryDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The name of the category this operation was associated with, e.g., `TaskWorker` or `Admin`.
   * @return category
  */
  
  @Schema(name = "category", description = "The name of the category this operation was associated with, e.g., `TaskWorker` or `Admin`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public UserOperationLogEntryDto annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

  /**
   * An arbitrary annotation set by a user for auditing reasons.
   * @return annotation
  */
  
  @Schema(name = "annotation", description = "An arbitrary annotation set by a user for auditing reasons.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("annotation")
  public String getAnnotation() {
    return annotation;
  }

  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }

  public UserOperationLogEntryDto property(String property) {
    this.property = property;
    return this;
  }

  /**
   * The property changed by this operation.
   * @return property
  */
  
  @Schema(name = "property", description = "The property changed by this operation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("property")
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }

  public UserOperationLogEntryDto orgValue(String orgValue) {
    this.orgValue = orgValue;
    return this;
  }

  /**
   * The original value of the changed property.
   * @return orgValue
  */
  
  @Schema(name = "orgValue", description = "The original value of the changed property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orgValue")
  public String getOrgValue() {
    return orgValue;
  }

  public void setOrgValue(String orgValue) {
    this.orgValue = orgValue;
  }

  public UserOperationLogEntryDto newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * The new value of the changed property.
   * @return newValue
  */
  
  @Schema(name = "newValue", description = "The new value of the changed property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public UserOperationLogEntryDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this deployment.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "If not `null`, the operation is restricted to entities in relation to this deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public UserOperationLogEntryDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this process definition.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "If not `null`, the operation is restricted to entities in relation to this process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public UserOperationLogEntryDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to process definitions with this key.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "If not `null`, the operation is restricted to entities in relation to process definitions with this key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public UserOperationLogEntryDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this process instance.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "If not `null`, the operation is restricted to entities in relation to this process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public UserOperationLogEntryDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this execution.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "If not `null`, the operation is restricted to entities in relation to this execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public UserOperationLogEntryDto caseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this case definition.
   * @return caseDefinitionId
  */
  
  @Schema(name = "caseDefinitionId", description = "If not `null`, the operation is restricted to entities in relation to this case definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseDefinitionId")
  public String getCaseDefinitionId() {
    return caseDefinitionId;
  }

  public void setCaseDefinitionId(String caseDefinitionId) {
    this.caseDefinitionId = caseDefinitionId;
  }

  public UserOperationLogEntryDto caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this case instance.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "If not `null`, the operation is restricted to entities in relation to this case instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public UserOperationLogEntryDto caseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this case execution.
   * @return caseExecutionId
  */
  
  @Schema(name = "caseExecutionId", description = "If not `null`, the operation is restricted to entities in relation to this case execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseExecutionId")
  public String getCaseExecutionId() {
    return caseExecutionId;
  }

  public void setCaseExecutionId(String caseExecutionId) {
    this.caseExecutionId = caseExecutionId;
  }

  public UserOperationLogEntryDto taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this task.
   * @return taskId
  */
  
  @Schema(name = "taskId", description = "If not `null`, the operation is restricted to entities in relation to this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("taskId")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public UserOperationLogEntryDto externalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this external task.
   * @return externalTaskId
  */
  
  @Schema(name = "externalTaskId", description = "If not `null`, the operation is restricted to entities in relation to this external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalTaskId")
  public String getExternalTaskId() {
    return externalTaskId;
  }

  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }

  public UserOperationLogEntryDto batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this batch.
   * @return batchId
  */
  
  @Schema(name = "batchId", description = "If not `null`, the operation is restricted to entities in relation to this batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public UserOperationLogEntryDto jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this job.
   * @return jobId
  */
  
  @Schema(name = "jobId", description = "If not `null`, the operation is restricted to entities in relation to this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public UserOperationLogEntryDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * If not `null`, the operation is restricted to entities in relation to this job definition.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "If not `null`, the operation is restricted to entities in relation to this job definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public UserOperationLogEntryDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public UserOperationLogEntryDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this entry.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process containing this entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserOperationLogEntryDto userOperationLogEntryDto = (UserOperationLogEntryDto) o;
    return Objects.equals(this.id, userOperationLogEntryDto.id) &&
        Objects.equals(this.userId, userOperationLogEntryDto.userId) &&
        Objects.equals(this.timestamp, userOperationLogEntryDto.timestamp) &&
        Objects.equals(this.operationId, userOperationLogEntryDto.operationId) &&
        Objects.equals(this.operationType, userOperationLogEntryDto.operationType) &&
        Objects.equals(this.entityType, userOperationLogEntryDto.entityType) &&
        Objects.equals(this.category, userOperationLogEntryDto.category) &&
        Objects.equals(this.annotation, userOperationLogEntryDto.annotation) &&
        Objects.equals(this.property, userOperationLogEntryDto.property) &&
        Objects.equals(this.orgValue, userOperationLogEntryDto.orgValue) &&
        Objects.equals(this.newValue, userOperationLogEntryDto.newValue) &&
        Objects.equals(this.deploymentId, userOperationLogEntryDto.deploymentId) &&
        Objects.equals(this.processDefinitionId, userOperationLogEntryDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, userOperationLogEntryDto.processDefinitionKey) &&
        Objects.equals(this.processInstanceId, userOperationLogEntryDto.processInstanceId) &&
        Objects.equals(this.executionId, userOperationLogEntryDto.executionId) &&
        Objects.equals(this.caseDefinitionId, userOperationLogEntryDto.caseDefinitionId) &&
        Objects.equals(this.caseInstanceId, userOperationLogEntryDto.caseInstanceId) &&
        Objects.equals(this.caseExecutionId, userOperationLogEntryDto.caseExecutionId) &&
        Objects.equals(this.taskId, userOperationLogEntryDto.taskId) &&
        Objects.equals(this.externalTaskId, userOperationLogEntryDto.externalTaskId) &&
        Objects.equals(this.batchId, userOperationLogEntryDto.batchId) &&
        Objects.equals(this.jobId, userOperationLogEntryDto.jobId) &&
        Objects.equals(this.jobDefinitionId, userOperationLogEntryDto.jobDefinitionId) &&
        Objects.equals(this.removalTime, userOperationLogEntryDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, userOperationLogEntryDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, timestamp, operationId, operationType, entityType, category, annotation, property, orgValue, newValue, deploymentId, processDefinitionId, processDefinitionKey, processInstanceId, executionId, caseDefinitionId, caseInstanceId, caseExecutionId, taskId, externalTaskId, batchId, jobId, jobDefinitionId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOperationLogEntryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    orgValue: ").append(toIndentedString(orgValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    caseDefinitionId: ").append(toIndentedString(caseDefinitionId)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    caseExecutionId: ").append(toIndentedString(caseExecutionId)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
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

