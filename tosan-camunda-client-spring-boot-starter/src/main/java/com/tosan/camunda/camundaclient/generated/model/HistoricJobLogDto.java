package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * HistoricJobLogDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricJobLogDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("jobDueDate")
  private OffsetDateTime jobDueDate = null;

  @JsonProperty("jobRetries")
  private Integer jobRetries = null;

  @JsonProperty("jobPriority")
  private Long jobPriority = null;

  @JsonProperty("jobExceptionMessage")
  private String jobExceptionMessage = null;

  @JsonProperty("failedActivityId")
  private String failedActivityId = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("jobDefinitionType")
  private String jobDefinitionType = null;

  @JsonProperty("jobDefinitionConfiguration")
  private String jobDefinitionConfiguration = null;

  @JsonProperty("activityId")
  private String activityId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("creationLog")
  private Boolean creationLog = null;

  @JsonProperty("failureLog")
  private Boolean failureLog = null;

  @JsonProperty("successLog")
  private Boolean successLog = null;

  @JsonProperty("deletionLog")
  private Boolean deletionLog = null;

  public HistoricJobLogDto id(String id) {
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

  public HistoricJobLogDto timestamp(OffsetDateTime timestamp) {
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

  public HistoricJobLogDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the log entry should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further info see the [docs](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return removalTime
   **/
  @Schema(description = "The time after which the log entry should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further info see the [docs](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)")
  
    @Valid
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
   **/
  @Schema(description = "The id of the associated job.")
  
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
   **/
  @Schema(description = "The date on which the associated job is supposed to be processed.")
  
    @Valid
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
   **/
  @Schema(description = "The number of retries the associated job has left.")
  
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
   **/
  @Schema(description = "The execution priority the job had when the log entry was created.")
  
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
   **/
  @Schema(description = "The message of the exception that occurred by executing the associated job.")
  
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
   **/
  @Schema(description = "The id of the activity on which the last exception occurred by executing the associated job.")
  
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
   **/
  @Schema(description = "The id of the job definition on which the associated job was created.")
  
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
   **/
  @Schema(description = "The job definition type of the associated job. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/the-job-executor/#job-creation) for more information about job definition types.")
  
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
   **/
  @Schema(description = "The job definition configuration type of the associated job.")
  
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
   **/
  @Schema(description = "The id of the activity on which the associated job was created.")
  
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
   **/
  @Schema(description = "The execution id on which the associated job was created.")
  
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
   **/
  @Schema(description = "The id of the process instance on which the associated job was created.")
  
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
   **/
  @Schema(description = "The id of the process definition which the associated job belongs to.")
  
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
   **/
  @Schema(description = "The key of the process definition which the associated job belongs to.")
  
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
   **/
  @Schema(description = "The id of the deployment which the associated job belongs to.")
  
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
   **/
  @Schema(description = "The process instance id of the root process instance that initiated the process which the associated job belongs to.")
  
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
   **/
  @Schema(description = "The id of the tenant that this historic job log entry belongs to.")
  
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
   **/
  @Schema(description = " The name of the host of the Process Engine where the job of this historic job log entry was executed.")
  
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
   **/
  @Schema(description = "A flag indicating whether this log represents the creation of the associated job.")
  
    public Boolean isCreationLog() {
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
   **/
  @Schema(description = "A flag indicating whether this log represents the failed execution of the associated job.")
  
    public Boolean isFailureLog() {
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
   **/
  @Schema(description = "A flag indicating whether this log represents the successful execution of the associated job.")
  
    public Boolean isSuccessLog() {
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
   **/
  @Schema(description = "A flag indicating whether this log represents the deletion of the associated job.")
  
    public Boolean isDeletionLog() {
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
