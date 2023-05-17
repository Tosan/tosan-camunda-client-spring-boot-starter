package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricExternalTaskLogDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricExternalTaskLogDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("externalTaskId")
  private String externalTaskId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("topicName")
  private String topicName = null;

  @JsonProperty("workerId")
  private String workerId = null;

  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("activityInstanceId")
  private String activityInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("creationLog")
  private Boolean creationLog = null;

  @JsonProperty("failureLog")
  private Boolean failureLog = null;

  @JsonProperty("successLog")
  private Boolean successLog = null;

  @JsonProperty("deletionLog")
  private Boolean deletionLog = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public HistoricExternalTaskLogDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the log entry.
   * @return id
   **/
  @Schema(description = "The id of the log entry.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricExternalTaskLogDto externalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
    return this;
  }

  /**
   * The id of the external task.
   * @return externalTaskId
   **/
  @Schema(description = "The id of the external task.")
  
    public String getExternalTaskId() {
    return externalTaskId;
  }

  public void setExternalTaskId(String externalTaskId) {
    this.externalTaskId = externalTaskId;
  }

  public HistoricExternalTaskLogDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time when the log entry has been written.
   * @return timestamp
   **/
  @Schema(description = "The time when the log entry has been written.")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HistoricExternalTaskLogDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * The topic name of the associated external task.
   * @return topicName
   **/
  @Schema(description = "The topic name of the associated external task.")
  
    public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public HistoricExternalTaskLogDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The id of the worker that posessed the most recent lock.
   * @return workerId
   **/
  @Schema(description = "The id of the worker that posessed the most recent lock.")
  
    public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public HistoricExternalTaskLogDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of retries the associated external task has left.
   * @return retries
   **/
  @Schema(description = "The number of retries the associated external task has left.")
  
    public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public HistoricExternalTaskLogDto priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The execution priority the external task had when the log entry was created.
   * @return priority
   **/
  @Schema(description = "The execution priority the external task had when the log entry was created.")
  
    public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public HistoricExternalTaskLogDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The message of the error that occurred by executing the associated external task.
   * @return errorMessage
   **/
  @Schema(description = "The message of the error that occurred by executing the associated external task.")
  
    public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public HistoricExternalTaskLogDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity on which the associated external task was created.
   * @return activityId
   **/
  @Schema(description = "The id of the activity on which the associated external task was created.")
  
    public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricExternalTaskLogDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

  /**
   * The id of the activity instance on which the associated external task was created.
   * @return activityInstanceId
   **/
  @Schema(description = "The id of the activity instance on which the associated external task was created.")
  
    public String getActivityInstanceId() {
    return activityInstanceId;
  }

  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }

  public HistoricExternalTaskLogDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The execution id on which the associated external task was created.
   * @return executionId
   **/
  @Schema(description = "The execution id on which the associated external task was created.")
  
    public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricExternalTaskLogDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance on which the associated external task was created.
   * @return processInstanceId
   **/
  @Schema(description = "The id of the process instance on which the associated external task was created.")
  
    public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricExternalTaskLogDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition which the associated external task belongs to.
   * @return processDefinitionId
   **/
  @Schema(description = "The id of the process definition which the associated external task belongs to.")
  
    public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricExternalTaskLogDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition which the associated external task belongs to.
   * @return processDefinitionKey
   **/
  @Schema(description = "The key of the process definition which the associated external task belongs to.")
  
    public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricExternalTaskLogDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant that this historic external task log entry belongs to.
   * @return tenantId
   **/
  @Schema(description = "The id of the tenant that this historic external task log entry belongs to.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricExternalTaskLogDto creationLog(Boolean creationLog) {
    this.creationLog = creationLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the creation of the associated external task.
   * @return creationLog
   **/
  @Schema(description = "A flag indicating whether this log represents the creation of the associated external task.")
  
    public Boolean isCreationLog() {
    return creationLog;
  }

  public void setCreationLog(Boolean creationLog) {
    this.creationLog = creationLog;
  }

  public HistoricExternalTaskLogDto failureLog(Boolean failureLog) {
    this.failureLog = failureLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the failed execution of the associated external task.
   * @return failureLog
   **/
  @Schema(description = "A flag indicating whether this log represents the failed execution of the associated external task.")
  
    public Boolean isFailureLog() {
    return failureLog;
  }

  public void setFailureLog(Boolean failureLog) {
    this.failureLog = failureLog;
  }

  public HistoricExternalTaskLogDto successLog(Boolean successLog) {
    this.successLog = successLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the successful execution of the associated external task.
   * @return successLog
   **/
  @Schema(description = "A flag indicating whether this log represents the successful execution of the associated external task.")
  
    public Boolean isSuccessLog() {
    return successLog;
  }

  public void setSuccessLog(Boolean successLog) {
    this.successLog = successLog;
  }

  public HistoricExternalTaskLogDto deletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the deletion of the associated external task.
   * @return deletionLog
   **/
  @Schema(description = "A flag indicating whether this log represents the deletion of the associated external task.")
  
    public Boolean isDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  public HistoricExternalTaskLogDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which this log should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.  For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return removalTime
   **/
  @Schema(description = "The time after which this log should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.  For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)")
  
    @Valid
    public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricExternalTaskLogDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process containing this log.
   * @return rootProcessInstanceId
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process containing this log.")
  
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
    HistoricExternalTaskLogDto historicExternalTaskLogDto = (HistoricExternalTaskLogDto) o;
    return Objects.equals(this.id, historicExternalTaskLogDto.id) &&
        Objects.equals(this.externalTaskId, historicExternalTaskLogDto.externalTaskId) &&
        Objects.equals(this.timestamp, historicExternalTaskLogDto.timestamp) &&
        Objects.equals(this.topicName, historicExternalTaskLogDto.topicName) &&
        Objects.equals(this.workerId, historicExternalTaskLogDto.workerId) &&
        Objects.equals(this.retries, historicExternalTaskLogDto.retries) &&
        Objects.equals(this.priority, historicExternalTaskLogDto.priority) &&
        Objects.equals(this.errorMessage, historicExternalTaskLogDto.errorMessage) &&
        Objects.equals(this.activityId, historicExternalTaskLogDto.activityId) &&
        Objects.equals(this.activityInstanceId, historicExternalTaskLogDto.activityInstanceId) &&
        Objects.equals(this.executionId, historicExternalTaskLogDto.executionId) &&
        Objects.equals(this.processInstanceId, historicExternalTaskLogDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicExternalTaskLogDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicExternalTaskLogDto.processDefinitionKey) &&
        Objects.equals(this.tenantId, historicExternalTaskLogDto.tenantId) &&
        Objects.equals(this.creationLog, historicExternalTaskLogDto.creationLog) &&
        Objects.equals(this.failureLog, historicExternalTaskLogDto.failureLog) &&
        Objects.equals(this.successLog, historicExternalTaskLogDto.successLog) &&
        Objects.equals(this.deletionLog, historicExternalTaskLogDto.deletionLog) &&
        Objects.equals(this.removalTime, historicExternalTaskLogDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, historicExternalTaskLogDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalTaskId, timestamp, topicName, workerId, retries, priority, errorMessage, activityId, activityInstanceId, executionId, processInstanceId, processDefinitionId, processDefinitionKey, tenantId, creationLog, failureLog, successLog, deletionLog, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricExternalTaskLogDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalTaskId: ").append(toIndentedString(externalTaskId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
    sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
    sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
    sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
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
