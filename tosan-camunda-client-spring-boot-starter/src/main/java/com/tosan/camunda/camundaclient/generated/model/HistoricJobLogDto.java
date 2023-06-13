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
 * HistoricJobLogDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricJobLogDto {

  private String id = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String jobId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime jobDueDate = null;

  private Integer jobRetries = null;

  private Long jobPriority = null;

  private String jobExceptionMessage = null;

  private String failedActivityId = null;

  private String jobDefinitionId = null;

  private String jobDefinitionType = null;

  private String jobDefinitionConfiguration = null;

  private String activityId = null;

  private String executionId = null;

  private String processInstanceId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String deploymentId = null;

  private String rootProcessInstanceId = null;

  private String tenantId = null;

  private String hostname = null;

  private Boolean creationLog = null;

  private Boolean failureLog = null;

  private Boolean successLog = null;

  private Boolean deletionLog = null;

  public HistoricJobLogDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the log entry.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the log entry.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricJobLogDto timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time when the log entry has been written.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "The time when the log entry has been written.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public HistoricJobLogDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the log entry should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further info see the [docs](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the log entry should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further info see the [docs](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public HistoricJobLogDto jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The id of the associated job.
   * @return jobId
  */
  
  @Schema(name = "jobId", description = "The id of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public HistoricJobLogDto jobDueDate(OffsetDateTime jobDueDate) {
    this.jobDueDate = jobDueDate;
    return this;
  }

  /**
   * The date on which the associated job is supposed to be processed.
   * @return jobDueDate
  */
  @Valid 
  @Schema(name = "jobDueDate", description = "The date on which the associated job is supposed to be processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDueDate")
  public OffsetDateTime getJobDueDate() {
    return jobDueDate;
  }

  public void setJobDueDate(OffsetDateTime jobDueDate) {
    this.jobDueDate = jobDueDate;
  }

  public HistoricJobLogDto jobRetries(Integer jobRetries) {
    this.jobRetries = jobRetries;
    return this;
  }

  /**
   * The number of retries the associated job has left.
   * @return jobRetries
  */
  
  @Schema(name = "jobRetries", description = "The number of retries the associated job has left.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobRetries")
  public Integer getJobRetries() {
    return jobRetries;
  }

  public void setJobRetries(Integer jobRetries) {
    this.jobRetries = jobRetries;
  }

  public HistoricJobLogDto jobPriority(Long jobPriority) {
    this.jobPriority = jobPriority;
    return this;
  }

  /**
   * The execution priority the job had when the log entry was created.
   * @return jobPriority
  */
  
  @Schema(name = "jobPriority", description = "The execution priority the job had when the log entry was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobPriority")
  public Long getJobPriority() {
    return jobPriority;
  }

  public void setJobPriority(Long jobPriority) {
    this.jobPriority = jobPriority;
  }

  public HistoricJobLogDto jobExceptionMessage(String jobExceptionMessage) {
    this.jobExceptionMessage = jobExceptionMessage;
    return this;
  }

  /**
   * The message of the exception that occurred by executing the associated job.
   * @return jobExceptionMessage
  */
  
  @Schema(name = "jobExceptionMessage", description = "The message of the exception that occurred by executing the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobExceptionMessage")
  public String getJobExceptionMessage() {
    return jobExceptionMessage;
  }

  public void setJobExceptionMessage(String jobExceptionMessage) {
    this.jobExceptionMessage = jobExceptionMessage;
  }

  public HistoricJobLogDto failedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
    return this;
  }

  /**
   * The id of the activity on which the last exception occurred by executing the associated job.
   * @return failedActivityId
  */
  
  @Schema(name = "failedActivityId", description = "The id of the activity on which the last exception occurred by executing the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedActivityId")
  public String getFailedActivityId() {
    return failedActivityId;
  }

  public void setFailedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
  }

  public HistoricJobLogDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * The id of the job definition on which the associated job was created.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "The id of the job definition on which the associated job was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public HistoricJobLogDto jobDefinitionType(String jobDefinitionType) {
    this.jobDefinitionType = jobDefinitionType;
    return this;
  }

  /**
   * The job definition type of the associated job. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.
   * @return jobDefinitionType
  */
  
  @Schema(name = "jobDefinitionType", description = "The job definition type of the associated job. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionType")
  public String getJobDefinitionType() {
    return jobDefinitionType;
  }

  public void setJobDefinitionType(String jobDefinitionType) {
    this.jobDefinitionType = jobDefinitionType;
  }

  public HistoricJobLogDto jobDefinitionConfiguration(String jobDefinitionConfiguration) {
    this.jobDefinitionConfiguration = jobDefinitionConfiguration;
    return this;
  }

  /**
   * The job definition configuration type of the associated job.
   * @return jobDefinitionConfiguration
  */
  
  @Schema(name = "jobDefinitionConfiguration", description = "The job definition configuration type of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionConfiguration")
  public String getJobDefinitionConfiguration() {
    return jobDefinitionConfiguration;
  }

  public void setJobDefinitionConfiguration(String jobDefinitionConfiguration) {
    this.jobDefinitionConfiguration = jobDefinitionConfiguration;
  }

  public HistoricJobLogDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The id of the activity on which the associated job was created.
   * @return activityId
  */
  
  @Schema(name = "activityId", description = "The id of the activity on which the associated job was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("activityId")
  public String getActivityId() {
    return activityId;
  }

  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }

  public HistoricJobLogDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The execution id on which the associated job was created.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The execution id on which the associated job was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public HistoricJobLogDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance on which the associated job was created.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance on which the associated job was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public HistoricJobLogDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition which the associated job belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition which the associated job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public HistoricJobLogDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition which the associated job belongs to.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition which the associated job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public HistoricJobLogDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The id of the deployment which the associated job belongs to.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "The id of the deployment which the associated job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public HistoricJobLogDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance that initiated the process which the associated job belongs to.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance that initiated the process which the associated job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  public HistoricJobLogDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant that this historic job log entry belongs to.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant that this historic job log entry belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public HistoricJobLogDto hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   *  The name of the host of the Process Engine where the job of this historic job log entry was executed.
   * @return hostname
  */
  
  @Schema(name = "hostname", description = " The name of the host of the Process Engine where the job of this historic job log entry was executed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public HistoricJobLogDto creationLog(Boolean creationLog) {
    this.creationLog = creationLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the creation of the associated job.
   * @return creationLog
  */
  
  @Schema(name = "creationLog", description = "A flag indicating whether this log represents the creation of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationLog")
  public Boolean getCreationLog() {
    return creationLog;
  }

  public void setCreationLog(Boolean creationLog) {
    this.creationLog = creationLog;
  }

  public HistoricJobLogDto failureLog(Boolean failureLog) {
    this.failureLog = failureLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the failed execution of the associated job.
   * @return failureLog
  */
  
  @Schema(name = "failureLog", description = "A flag indicating whether this log represents the failed execution of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureLog")
  public Boolean getFailureLog() {
    return failureLog;
  }

  public void setFailureLog(Boolean failureLog) {
    this.failureLog = failureLog;
  }

  public HistoricJobLogDto successLog(Boolean successLog) {
    this.successLog = successLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the successful execution of the associated job.
   * @return successLog
  */
  
  @Schema(name = "successLog", description = "A flag indicating whether this log represents the successful execution of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successLog")
  public Boolean getSuccessLog() {
    return successLog;
  }

  public void setSuccessLog(Boolean successLog) {
    this.successLog = successLog;
  }

  public HistoricJobLogDto deletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
    return this;
  }

  /**
   * A flag indicating whether this log represents the deletion of the associated job.
   * @return deletionLog
  */
  
  @Schema(name = "deletionLog", description = "A flag indicating whether this log represents the deletion of the associated job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletionLog")
  public Boolean getDeletionLog() {
    return deletionLog;
  }

  public void setDeletionLog(Boolean deletionLog) {
    this.deletionLog = deletionLog;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricJobLogDto historicJobLogDto = (HistoricJobLogDto) o;
    return Objects.equals(this.id, historicJobLogDto.id) &&
        Objects.equals(this.timestamp, historicJobLogDto.timestamp) &&
        Objects.equals(this.removalTime, historicJobLogDto.removalTime) &&
        Objects.equals(this.jobId, historicJobLogDto.jobId) &&
        Objects.equals(this.jobDueDate, historicJobLogDto.jobDueDate) &&
        Objects.equals(this.jobRetries, historicJobLogDto.jobRetries) &&
        Objects.equals(this.jobPriority, historicJobLogDto.jobPriority) &&
        Objects.equals(this.jobExceptionMessage, historicJobLogDto.jobExceptionMessage) &&
        Objects.equals(this.failedActivityId, historicJobLogDto.failedActivityId) &&
        Objects.equals(this.jobDefinitionId, historicJobLogDto.jobDefinitionId) &&
        Objects.equals(this.jobDefinitionType, historicJobLogDto.jobDefinitionType) &&
        Objects.equals(this.jobDefinitionConfiguration, historicJobLogDto.jobDefinitionConfiguration) &&
        Objects.equals(this.activityId, historicJobLogDto.activityId) &&
        Objects.equals(this.executionId, historicJobLogDto.executionId) &&
        Objects.equals(this.processInstanceId, historicJobLogDto.processInstanceId) &&
        Objects.equals(this.processDefinitionId, historicJobLogDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, historicJobLogDto.processDefinitionKey) &&
        Objects.equals(this.deploymentId, historicJobLogDto.deploymentId) &&
        Objects.equals(this.rootProcessInstanceId, historicJobLogDto.rootProcessInstanceId) &&
        Objects.equals(this.tenantId, historicJobLogDto.tenantId) &&
        Objects.equals(this.hostname, historicJobLogDto.hostname) &&
        Objects.equals(this.creationLog, historicJobLogDto.creationLog) &&
        Objects.equals(this.failureLog, historicJobLogDto.failureLog) &&
        Objects.equals(this.successLog, historicJobLogDto.successLog) &&
        Objects.equals(this.deletionLog, historicJobLogDto.deletionLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, removalTime, jobId, jobDueDate, jobRetries, jobPriority, jobExceptionMessage, failedActivityId, jobDefinitionId, jobDefinitionType, jobDefinitionConfiguration, activityId, executionId, processInstanceId, processDefinitionId, processDefinitionKey, deploymentId, rootProcessInstanceId, tenantId, hostname, creationLog, failureLog, successLog, deletionLog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricJobLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobDueDate: ").append(toIndentedString(jobDueDate)).append("\n");
    sb.append("    jobRetries: ").append(toIndentedString(jobRetries)).append("\n");
    sb.append("    jobPriority: ").append(toIndentedString(jobPriority)).append("\n");
    sb.append("    jobExceptionMessage: ").append(toIndentedString(jobExceptionMessage)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    jobDefinitionType: ").append(toIndentedString(jobDefinitionType)).append("\n");
    sb.append("    jobDefinitionConfiguration: ").append(toIndentedString(jobDefinitionConfiguration)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    creationLog: ").append(toIndentedString(creationLog)).append("\n");
    sb.append("    failureLog: ").append(toIndentedString(failureLog)).append("\n");
    sb.append("    successLog: ").append(toIndentedString(successLog)).append("\n");
    sb.append("    deletionLog: ").append(toIndentedString(deletionLog)).append("\n");
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

