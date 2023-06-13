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
 * JobDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDto {

  private String id = null;

  private String jobDefinitionId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate = null;

  private String processInstanceId = null;

  private String executionId = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private Integer retries = null;

  private String exceptionMessage = null;

  private String failedActivityId = null;

  private Boolean suspended = null;

  private Long priority = null;

  private String tenantId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createTime = null;

  public JobDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the job.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JobDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * The id of the associated job definition.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "The id of the associated job definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public JobDto dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The date on which this job is supposed to be processed.
   * @return dueDate
  */
  @Valid 
  @Schema(name = "dueDate", description = "The date on which this job is supposed to be processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dueDate")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public JobDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the process instance which execution created the job.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the process instance which execution created the job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public JobDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * The specific execution id on which the job was created.
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "The specific execution id on which the job was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public JobDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definition which this job belongs to.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definition which this job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definition which this job belongs to.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definition which this job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of retries this job has left.
   * @return retries
  */
  
  @Schema(name = "retries", description = "The number of retries this job has left.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public JobDto exceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    return this;
  }

  /**
   * The message of the exception that occurred, the last time the job was executed. Is null when no exception occurred.
   * @return exceptionMessage
  */
  
  @Schema(name = "exceptionMessage", description = "The message of the exception that occurred, the last time the job was executed. Is null when no exception occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptionMessage")
  public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public JobDto failedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
    return this;
  }

  /**
   * The id of the activity on which the last exception occurred, the last time the job was executed. Is null when no exception occurred.
   * @return failedActivityId
  */
  
  @Schema(name = "failedActivityId", description = "The id of the activity on which the last exception occurred, the last time the job was executed. Is null when no exception occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedActivityId")
  public String getFailedActivityId() {
    return failedActivityId;
  }

  public void setFailedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
  }

  public JobDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A flag indicating whether the job is suspended or not.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A flag indicating whether the job is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public JobDto priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The job's priority for execution.
   * @return priority
  */
  
  @Schema(name = "priority", description = "The job's priority for execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public JobDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant which this job belongs to.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant which this job belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public JobDto createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The date on which this job has been created.
   * @return createTime
  */
  @Valid 
  @Schema(name = "createTime", description = "The date on which this job has been created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createTime")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDto jobDto = (JobDto) o;
    return Objects.equals(this.id, jobDto.id) &&
        Objects.equals(this.jobDefinitionId, jobDto.jobDefinitionId) &&
        Objects.equals(this.dueDate, jobDto.dueDate) &&
        Objects.equals(this.processInstanceId, jobDto.processInstanceId) &&
        Objects.equals(this.executionId, jobDto.executionId) &&
        Objects.equals(this.processDefinitionId, jobDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDto.processDefinitionKey) &&
        Objects.equals(this.retries, jobDto.retries) &&
        Objects.equals(this.exceptionMessage, jobDto.exceptionMessage) &&
        Objects.equals(this.failedActivityId, jobDto.failedActivityId) &&
        Objects.equals(this.suspended, jobDto.suspended) &&
        Objects.equals(this.priority, jobDto.priority) &&
        Objects.equals(this.tenantId, jobDto.tenantId) &&
        Objects.equals(this.createTime, jobDto.createTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobDefinitionId, dueDate, processInstanceId, executionId, processDefinitionId, processDefinitionKey, retries, exceptionMessage, failedActivityId, suspended, priority, tenantId, createTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

