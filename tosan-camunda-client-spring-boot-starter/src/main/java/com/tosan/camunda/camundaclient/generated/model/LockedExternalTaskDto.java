package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LockedExternalTaskDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class LockedExternalTaskDto {

  private String activityId = null;

  private String activityInstanceId = null;

  private String errorMessage = null;

  private String errorDetails = null;

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

  private Long priority = null;

  private String topicName = null;

  private String businessKey = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  public LockedExternalTaskDto activityId(String activityId) {
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

  public LockedExternalTaskDto activityInstanceId(String activityInstanceId) {
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

  public LockedExternalTaskDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The full error message submitted with the latest reported failure executing this task;`null` if no failure was reported previously or if no error message was submitted
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", description = "The full error message submitted with the latest reported failure executing this task;`null` if no failure was reported previously or if no error message was submitted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public LockedExternalTaskDto errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * The error details submitted with the latest reported failure executing this task.`null` if no failure was reported previously or if no error details was submitted
   * @return errorDetails
  */
  
  @Schema(name = "errorDetails", description = "The error details submitted with the latest reported failure executing this task.`null` if no failure was reported previously or if no error details was submitted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDetails")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public LockedExternalTaskDto executionId(String executionId) {
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

  public LockedExternalTaskDto id(String id) {
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

  public LockedExternalTaskDto lockExpirationTime(OffsetDateTime lockExpirationTime) {
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

  public LockedExternalTaskDto processDefinitionId(String processDefinitionId) {
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

  public LockedExternalTaskDto processDefinitionKey(String processDefinitionKey) {
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

  public LockedExternalTaskDto processDefinitionVersionTag(String processDefinitionVersionTag) {
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

  public LockedExternalTaskDto processInstanceId(String processInstanceId) {
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

  public LockedExternalTaskDto tenantId(String tenantId) {
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

  public LockedExternalTaskDto retries(Integer retries) {
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

  public LockedExternalTaskDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Whether the process instance the external task belongs to is suspended.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "Whether the process instance the external task belongs to is suspended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public LockedExternalTaskDto workerId(String workerId) {
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

  public LockedExternalTaskDto priority(Long priority) {
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

  public LockedExternalTaskDto topicName(String topicName) {
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

  public LockedExternalTaskDto businessKey(String businessKey) {
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

  public LockedExternalTaskDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public LockedExternalTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A JSON object containing a property for each of the requested variables. The key is the variable name, the value is a JSON object of serialized variable values with the following properties:
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON object containing a property for each of the requested variables. The key is the variable name, the value is a JSON object of serialized variable values with the following properties:", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockedExternalTaskDto lockedExternalTaskDto = (LockedExternalTaskDto) o;
    return Objects.equals(this.activityId, lockedExternalTaskDto.activityId) &&
        Objects.equals(this.activityInstanceId, lockedExternalTaskDto.activityInstanceId) &&
        Objects.equals(this.errorMessage, lockedExternalTaskDto.errorMessage) &&
        Objects.equals(this.errorDetails, lockedExternalTaskDto.errorDetails) &&
        Objects.equals(this.executionId, lockedExternalTaskDto.executionId) &&
        Objects.equals(this.id, lockedExternalTaskDto.id) &&
        Objects.equals(this.lockExpirationTime, lockedExternalTaskDto.lockExpirationTime) &&
        Objects.equals(this.processDefinitionId, lockedExternalTaskDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, lockedExternalTaskDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersionTag, lockedExternalTaskDto.processDefinitionVersionTag) &&
        Objects.equals(this.processInstanceId, lockedExternalTaskDto.processInstanceId) &&
        Objects.equals(this.tenantId, lockedExternalTaskDto.tenantId) &&
        Objects.equals(this.retries, lockedExternalTaskDto.retries) &&
        Objects.equals(this.suspended, lockedExternalTaskDto.suspended) &&
        Objects.equals(this.workerId, lockedExternalTaskDto.workerId) &&
        Objects.equals(this.priority, lockedExternalTaskDto.priority) &&
        Objects.equals(this.topicName, lockedExternalTaskDto.topicName) &&
        Objects.equals(this.businessKey, lockedExternalTaskDto.businessKey) &&
        Objects.equals(this.variables, lockedExternalTaskDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityInstanceId, errorMessage, errorDetails, executionId, id, lockExpirationTime, processDefinitionId, processDefinitionKey, processDefinitionVersionTag, processInstanceId, tenantId, retries, suspended, workerId, priority, topicName, businessKey, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockedExternalTaskDto {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

