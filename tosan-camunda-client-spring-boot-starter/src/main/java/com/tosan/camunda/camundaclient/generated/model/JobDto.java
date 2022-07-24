package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * JobDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("jobDefinitionId")
  private String jobDefinitionId = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processDefinitionKey")
  private String processDefinitionKey = null;

  @JsonProperty("retries")
  private Integer retries = null;

  @JsonProperty("exceptionMessage")
  private String exceptionMessage = null;

  @JsonProperty("failedActivityId")
  private String failedActivityId = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("createTime")
  private OffsetDateTime createTime = null;

  public JobDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the job.
   * @return id
   **/
  @Schema(description = "The id of the job.")
  
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
   **/
  @Schema(description = "The id of the associated job definition.")
  
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
   **/
  @Schema(description = "The date on which this job is supposed to be processed.")
  
    @Valid
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
   **/
  @Schema(description = "The id of the process instance which execution created the job.")
  
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
   **/
  @Schema(description = "The specific execution id on which the job was created.")
  
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
   **/
  @Schema(description = "The id of the process definition which this job belongs to.")
  
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
   **/
  @Schema(description = "The key of the process definition which this job belongs to.")
  
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
   **/
  @Schema(description = "The number of retries this job has left.")
  
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
   **/
  @Schema(description = "The message of the exception that occurred, the last time the job was executed. Is null when no exception occurred.")
  
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
   **/
  @Schema(description = "The id of the activity on which the last exception occurred, the last time the job was executed. Is null when no exception occurred.")
  
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
   **/
  @Schema(description = "A flag indicating whether the job is suspended or not.")
  
    public Boolean isSuspended() {
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
   **/
  @Schema(description = "The job's priority for execution.")
  
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
   **/
  @Schema(description = "The id of the tenant which this job belongs to.")
  
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
   **/
  @Schema(description = "The date on which this job has been created.")
  
    @Valid
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
