package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * UserOperationLogEntryDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class UserOperationLogEntryDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("operationId")
  private String operationId = null;

  @JsonProperty("operationType")
  private String operationType = null;

  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("annotation")
  private String annotation = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("orgValue")
  private String orgValue = null;

  @JsonProperty("newValue")
  private String newValue = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("caseDefinitionId")
  private String caseDefinitionId = null;

  @JsonProperty("caseInstanceId")
  private String caseInstanceId = null;

  @JsonProperty("caseExecutionId")
  private String caseExecutionId = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("externalTaskId")
  private String externalTaskId = null;

  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public UserOperationLogEntryDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this log entry.
   * @return id
   **/
  @Schema(description = "The unique identifier of this log entry.")
  
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
   **/
  @Schema(description = "The user who performed this operation.")
  
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
   **/
  @Schema(description = "Timestamp of this operation.")
  
    @Valid
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
   **/
  @Schema(description = "The unique identifier of this operation. A composite operation that changes multiple properties has a common `operationId`.")
  
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
   **/
  @Schema(description = "The type of this operation, e.g., `Assign`, `Claim` and so on.")
  
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
   **/
  @Schema(description = "The type of the entity on which this operation was executed, e.g., `Task` or `Attachment`.")
  
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
   **/
  @Schema(description = "The name of the category this operation was associated with, e.g., `TaskWorker` or `Admin`.")
  
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
   **/
  @Schema(description = "An arbitrary annotation set by a user for auditing reasons.")
  
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
   **/
  @Schema(description = "The property changed by this operation.")
  
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
   **/
  @Schema(description = "The original value of the changed property.")
  
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
   **/
  @Schema(description = "The new value of the changed property.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this deployment.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this process definition.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to process definitions with this key.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this process instance.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this execution.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this case definition.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this case instance.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this case execution.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this task.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this external task.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this batch.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this job.")
  
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
   **/
  @Schema(description = "If not `null`, the operation is restricted to entities in relation to this job definition.")
  
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
   **/
  @Schema(description = "The time after which the entry should be removed by the History Cleanup job. [Default format](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/) `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
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
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this entry.")
  
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
