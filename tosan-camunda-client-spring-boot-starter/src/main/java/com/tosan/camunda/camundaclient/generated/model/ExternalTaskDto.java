package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * An External Task object with the following properties
 */
@Schema(description = "An External Task object with the following properties")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ExternalTaskDto   {
  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lockExpirationTime")
  private OffsetDateTime lockExpirationTime = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("processDefinitionVersionTag")
  private String processDefinitionVersionTag = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("workerId")
  private String workerId = null;

  @JsonProperty("topicName")
  private String topicName = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  public ExternalTaskDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity that this external task belongs to.
   * @return activityId
   **/
  @Schema(description = "The id of the activity that this external task belongs to.")
  
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
   **/
  @Schema(description = "The id of the activity instance that the external task belongs to.")
  
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
   **/
  @Schema(description = "The full error message submitted with the latest reported failure executing this task; `null` if no failure was reported previously or if no error message was submitted")
  
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
   **/
  @Schema(description = "The id of the execution that the external task belongs to.")
  
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
   **/
  @Schema(description = "The id of the external task.")
  
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
   **/
  @Schema(description = "The date that the task's most recent lock expires or has expired.")
  
    @Valid
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
   **/
  @Schema(description = "The id of the process definition the external task is defined in.")
  
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
   **/
  @Schema(description = "The key of the process definition the external task is defined in.")
  
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
   **/
  @Schema(description = "The version tag of the process definition the external task is defined in.")
  
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
   **/
  @Schema(description = "The id of the process instance the external task belongs to.")
  
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
   **/
  @Schema(description = "The id of the tenant the external task belongs to.")
  
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
   **/
  @Schema(description = "The number of retries the task currently has left.")
  
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
   **/
  @Schema(description = "A flag indicating whether the external task is suspended or not.")
  
    public Boolean isSuspended() {
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
   **/
  @Schema(description = "The id of the worker that posesses or posessed the most recent lock.")
  
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
   **/
  @Schema(description = "The topic name of the external task.")
  
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
   **/
  @Schema(description = "The priority of the external task.")
  
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
   **/
  @Schema(description = "The business key of the process instance the external task belongs to.")
  
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
