package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BatchDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class BatchDto {

  private String id = null;

  private String type = null;

  private Integer totalJobs = null;

  private Integer jobsCreated = null;

  private Integer batchJobsPerSeed = null;

  private Integer invocationsPerBatchJob = null;

  private String seedJobDefinitionId = null;

  private String monitorJobDefinitionId = null;

  private String batchJobDefinitionId = null;

  private Boolean suspended = null;

  private String tenantId = null;

  private String createUserId = null;

  public BatchDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the batch.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  */
  
  @Schema(name = "type", description = "The type of the batch. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
  */
  
  @Schema(name = "totalJobs", description = "The total jobs of a batch is the number of batch execution jobs required to complete the batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalJobs")
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
  */
  
  @Schema(name = "jobsCreated", description = "The number of batch execution jobs already created by the seed job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobsCreated")
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
  */
  
  @Schema(name = "batchJobsPerSeed", description = "The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchJobsPerSeed")
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
  */
  
  @Schema(name = "invocationsPerBatchJob", description = "Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invocationsPerBatchJob")
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
  */
  
  @Schema(name = "seedJobDefinitionId", description = "The job definition id for the seed jobs of this batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seedJobDefinitionId")
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
  */
  
  @Schema(name = "monitorJobDefinitionId", description = "The job definition id for the monitor jobs of this batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitorJobDefinitionId")
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
  */
  
  @Schema(name = "batchJobDefinitionId", description = "The job definition id for the batch execution jobs of this batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchJobDefinitionId")
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
  */
  
  @Schema(name = "suspended", description = "Indicates whether this batch is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
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
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
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
  */
  
  @Schema(name = "createUserId", description = "The id of the user that created the batch.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createUserId")
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

