package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * BatchDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class BatchDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("totalJobs")
  private Integer totalJobs = null;

  @JsonProperty("jobsCreated")
  private Integer jobsCreated = null;

  @JsonProperty("batchJobsPerSeed")
  private Integer batchJobsPerSeed = null;

  @JsonProperty("invocationsPerBatchJob")
  private Integer invocationsPerBatchJob = null;

  @JsonProperty("seedJobDefinitionId")
  private String seedJobDefinitionId = null;

  @JsonProperty("monitorJobDefinitionId")
  private String monitorJobDefinitionId = null;

  @JsonProperty("batchJobDefinitionId")
  private String batchJobDefinitionId = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("createUserId")
  private String createUserId = null;

  public BatchDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the batch.
   * @return id
   **/
  @Schema(description = "The id of the batch.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BatchDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.
   * @return type
   **/
  @Schema(description = "The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BatchDto totalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
    return this;
  }

  /**
   * The total jobs of a batch is the number of batch execution jobs required to complete the batch.
   * @return totalJobs
   **/
  @Schema(description = "The total jobs of a batch is the number of batch execution jobs required to complete the batch.")
  
    public Integer getTotalJobs() {
    return totalJobs;
  }

  public void setTotalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
  }

  public BatchDto jobsCreated(Integer jobsCreated) {
    this.jobsCreated = jobsCreated;
    return this;
  }

  /**
   * The number of batch execution jobs already created by the seed job.
   * @return jobsCreated
   **/
  @Schema(description = "The number of batch execution jobs already created by the seed job.")
  
    public Integer getJobsCreated() {
    return jobsCreated;
  }

  public void setJobsCreated(Integer jobsCreated) {
    this.jobsCreated = jobsCreated;
  }

  public BatchDto batchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = batchJobsPerSeed;
    return this;
  }

  /**
   * The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property).
   * @return batchJobsPerSeed
   **/
  @Schema(description = "The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property).")
  
    public Integer getBatchJobsPerSeed() {
    return batchJobsPerSeed;
  }

  public void setBatchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = batchJobsPerSeed;
  }

  public BatchDto invocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = invocationsPerBatchJob;
    return this;
  }

  /**
   * Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.
   * @return invocationsPerBatchJob
   **/
  @Schema(description = "Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.")
  
    public Integer getInvocationsPerBatchJob() {
    return invocationsPerBatchJob;
  }

  public void setInvocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = invocationsPerBatchJob;
  }

  public BatchDto seedJobDefinitionId(String seedJobDefinitionId) {
    this.seedJobDefinitionId = seedJobDefinitionId;
    return this;
  }

  /**
   * The job definition id for the seed jobs of this batch.
   * @return seedJobDefinitionId
   **/
  @Schema(description = "The job definition id for the seed jobs of this batch.")
  
    public String getSeedJobDefinitionId() {
    return seedJobDefinitionId;
  }

  public void setSeedJobDefinitionId(String seedJobDefinitionId) {
    this.seedJobDefinitionId = seedJobDefinitionId;
  }

  public BatchDto monitorJobDefinitionId(String monitorJobDefinitionId) {
    this.monitorJobDefinitionId = monitorJobDefinitionId;
    return this;
  }

  /**
   * The job definition id for the monitor jobs of this batch.
   * @return monitorJobDefinitionId
   **/
  @Schema(description = "The job definition id for the monitor jobs of this batch.")
  
    public String getMonitorJobDefinitionId() {
    return monitorJobDefinitionId;
  }

  public void setMonitorJobDefinitionId(String monitorJobDefinitionId) {
    this.monitorJobDefinitionId = monitorJobDefinitionId;
  }

  public BatchDto batchJobDefinitionId(String batchJobDefinitionId) {
    this.batchJobDefinitionId = batchJobDefinitionId;
    return this;
  }

  /**
   * The job definition id for the batch execution jobs of this batch.
   * @return batchJobDefinitionId
   **/
  @Schema(description = "The job definition id for the batch execution jobs of this batch.")
  
    public String getBatchJobDefinitionId() {
    return batchJobDefinitionId;
  }

  public void setBatchJobDefinitionId(String batchJobDefinitionId) {
    this.batchJobDefinitionId = batchJobDefinitionId;
  }

  public BatchDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * Indicates whether this batch is suspended or not.
   * @return suspended
   **/
  @Schema(description = "Indicates whether this batch is suspended or not.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public BatchDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the batch.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the batch.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public BatchDto createUserId(String createUserId) {
    this.createUserId = createUserId;
    return this;
  }

  /**
   * The id of the user that created the batch.
   * @return createUserId
   **/
  @Schema(description = "The id of the user that created the batch.")
  
    public String getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchDto batchDto = (BatchDto) o;
    return Objects.equals(this.id, batchDto.id) &&
        Objects.equals(this.type, batchDto.type) &&
        Objects.equals(this.totalJobs, batchDto.totalJobs) &&
        Objects.equals(this.jobsCreated, batchDto.jobsCreated) &&
        Objects.equals(this.batchJobsPerSeed, batchDto.batchJobsPerSeed) &&
        Objects.equals(this.invocationsPerBatchJob, batchDto.invocationsPerBatchJob) &&
        Objects.equals(this.seedJobDefinitionId, batchDto.seedJobDefinitionId) &&
        Objects.equals(this.monitorJobDefinitionId, batchDto.monitorJobDefinitionId) &&
        Objects.equals(this.batchJobDefinitionId, batchDto.batchJobDefinitionId) &&
        Objects.equals(this.suspended, batchDto.suspended) &&
        Objects.equals(this.tenantId, batchDto.tenantId) &&
        Objects.equals(this.createUserId, batchDto.createUserId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, totalJobs, jobsCreated, batchJobsPerSeed, invocationsPerBatchJob, seedJobDefinitionId, monitorJobDefinitionId, batchJobDefinitionId, suspended, tenantId, createUserId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalJobs: ").append(toIndentedString(totalJobs)).append("\n");
    sb.append("    jobsCreated: ").append(toIndentedString(jobsCreated)).append("\n");
    sb.append("    batchJobsPerSeed: ").append(toIndentedString(batchJobsPerSeed)).append("\n");
    sb.append("    invocationsPerBatchJob: ").append(toIndentedString(invocationsPerBatchJob)).append("\n");
    sb.append("    seedJobDefinitionId: ").append(toIndentedString(seedJobDefinitionId)).append("\n");
    sb.append("    monitorJobDefinitionId: ").append(toIndentedString(monitorJobDefinitionId)).append("\n");
    sb.append("    batchJobDefinitionId: ").append(toIndentedString(batchJobDefinitionId)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
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
