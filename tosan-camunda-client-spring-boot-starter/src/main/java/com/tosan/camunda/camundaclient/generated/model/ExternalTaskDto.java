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
 * An External Task object with the following properties
 */

@Schema(name = "ExternalTaskDto", description = "An External Task object with the following properties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskDto {

  private String activityId = null;

  private String activityInstanceId = null;

  private String errorMessage = null;

  private String executionId = null;

  private String id = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lockExpirationTime = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionVersionTag = null;

  private String processInstanceId = null;

  private String tenantId = null;

  private Integer retries = null;

  private Boolean suspended = null;

  private String workerId = null;

  private String topicName = null;

  private Long priority = null;

  private String businessKey = null;

  public ExternalTaskDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity that this external task belongs to.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity that this external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public ExternalTaskDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance that the external task belongs to.
   * @return activityInstanceId
  */
  
  @Schema(name = "activityInstanceId", description = "The id of the activity instance that the external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityInstanceId")
  public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public ExternalTaskDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The full error message submitted with the latest reported failure executing this task; `null` if no failure was reported previously or if no error message was submitted
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", description = "The full error message submitted with the latest reported failure executing this task; `null` if no failure was reported previously or if no error message was submitted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ExternalTaskDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The id of the execution that the external task belongs to.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The id of the execution that the external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public ExternalTaskDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the external task.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExternalTaskDto lockExpirationTime(OffsetDateTime lockExpirationTime) {
    this.lockExpirationTime = lockExpirationTime;
    return this;
  }

  /**
   * The date that the task's most recent lock expires or has expired.
   * @return lockExpirationTime
  */
  @Valid 
  @Schema(name = "lockExpirationTime", description = "The date that the task's most recent lock expires or has expired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lockExpirationTime")
  public OffsetDateTime getLockExpirationTime() {
    return lockExpirationTime;
  }

  public void setLockExpirationTime(OffsetDateTime lockExpirationTime) {
    this.lockExpirationTime = lockExpirationTime;
  }

  public ExternalTaskDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition the external task is defined in.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition the external task is defined in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ExternalTaskDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition the external task is defined in.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition the external task is defined in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public ExternalTaskDto processDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
    return this;
  }

  /**
   * The version tag of the process definition the external task is defined in.
   * @return processDefinitionVersionTag
  */
  
  @Schema(name = "processDefinitionVersionTag", description = "The version tag of the process definition the external task is defined in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionVersionTag")
  public String getProcessDefinitionVersionTag() {
    return processDefinitionVersionTag;
  }

  public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
  }

  public ExternalTaskDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance the external task belongs to.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance the external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ExternalTaskDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant the external task belongs to.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant the external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ExternalTaskDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of retries the task currently has left.
   * @return retries
  */
  
  @Schema(name = "retries", description = "The number of retries the task currently has left.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public ExternalTaskDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A flag indicating whether the external task is suspended or not.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A flag indicating whether the external task is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ExternalTaskDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The id of the worker that posesses or posessed the most recent lock.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "The id of the worker that posesses or posessed the most recent lock.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public ExternalTaskDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * The topic name of the external task.
   * @return topicName
  */
  
  @Schema(name = "topicName", description = "The topic name of the external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topicName")
  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public ExternalTaskDto priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The priority of the external task.
   * @return priority
  */
  
  @Schema(name = "priority", description = "The priority of the external task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public ExternalTaskDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key of the process instance the external task belongs to.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "The business key of the process instance the external task belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskDto externalTaskDto = (ExternalTaskDto) o;
    return Objects.equals(this.activityId, externalTaskDto.activityId) &&
        Objects.equals(this.activityInstanceId, externalTaskDto.activityInstanceId) &&
        Objects.equals(this.errorMessage, externalTaskDto.errorMessage) &&
        Objects.equals(this.executionId, externalTaskDto.executionId) &&
        Objects.equals(this.id, externalTaskDto.id) &&
        Objects.equals(this.lockExpirationTime, externalTaskDto.lockExpirationTime) &&
        Objects.equals(this.processDefinitionId, externalTaskDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, externalTaskDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersionTag, externalTaskDto.processDefinitionVersionTag) &&
        Objects.equals(this.processInstanceId, externalTaskDto.processInstanceId) &&
        Objects.equals(this.tenantId, externalTaskDto.tenantId) &&
        Objects.equals(this.retries, externalTaskDto.retries) &&
        Objects.equals(this.suspended, externalTaskDto.suspended) &&
        Objects.equals(this.workerId, externalTaskDto.workerId) &&
        Objects.equals(this.topicName, externalTaskDto.topicName) &&
        Objects.equals(this.priority, externalTaskDto.priority) &&
        Objects.equals(this.businessKey, externalTaskDto.businessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityInstanceId, errorMessage, executionId, id, lockExpirationTime, processDefinitionId, processDefinitionKey, processDefinitionVersionTag, processInstanceId, tenantId, retries, suspended, workerId, topicName, priority, businessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskDto {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockExpirationTime: ").append(toIndentedString(lockExpirationTime)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
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

