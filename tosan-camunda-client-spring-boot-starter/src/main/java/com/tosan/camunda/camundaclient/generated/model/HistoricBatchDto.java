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
 * HistoricBatchDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricBatchDto {

  private String id = null;

  private String type = null;

  private Integer totalJobs = null;

  private Integer batchJobsPerSeed = null;

  private Integer invocationsPerBatchJob = null;

  private String seedJobDefinitionId = null;

  private String monitorJobDefinitionId = null;

  private String batchJobDefinitionId = null;

  private String tenantId = null;

  private String createUserId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  public HistoricBatchDto id(String id) {
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

  public HistoricBatchDto type(String type) {
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

  public HistoricBatchDto totalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
    return this;
  }

  /**
   *  The total jobs of a batch is the number of batch execution jobs required to complete the batch. 
   * @return totalJobs
  */
  
  @Schema(name = "totalJobs", description = " The total jobs of a batch is the number of batch execution jobs required to complete the batch. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalJobs")
  public Integer getTotalJobs() {
    return totalJobs;
  }

  public void setTotalJobs(Integer totalJobs) {
    this.totalJobs = totalJobs;
  }

  public HistoricBatchDto batchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = batchJobsPerSeed;
    return this;
  }

  /**
   *  The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property). 
   * @return batchJobsPerSeed
  */
  
  @Schema(name = "batchJobsPerSeed", description = " The number of batch execution jobs created per seed job invocation. The batch seed job is invoked until it has created all batch execution jobs required by the batch (see `totalJobs` property). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchJobsPerSeed")
  public Integer getBatchJobsPerSeed() {
    return batchJobsPerSeed;
  }

  public void setBatchJobsPerSeed(Integer batchJobsPerSeed) {
    this.batchJobsPerSeed = batchJobsPerSeed;
  }

  public HistoricBatchDto invocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = invocationsPerBatchJob;
    return this;
  }

  /**
   *  Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job. 
   * @return invocationsPerBatchJob
  */
  
  @Schema(name = "invocationsPerBatchJob", description = " Every batch execution job invokes the command executed by the batch `invocationsPerBatchJob` times. E.g., for a process instance migration batch this specifies the number of process instances which are migrated per batch execution job. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invocationsPerBatchJob")
  public Integer getInvocationsPerBatchJob() {
    return invocationsPerBatchJob;
  }

  public void setInvocationsPerBatchJob(Integer invocationsPerBatchJob) {
    this.invocationsPerBatchJob = invocationsPerBatchJob;
  }

  public HistoricBatchDto seedJobDefinitionId(String seedJobDefinitionId) {
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

  public HistoricBatchDto monitorJobDefinitionId(String monitorJobDefinitionId) {
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

  public HistoricBatchDto batchJobDefinitionId(String batchJobDefinitionId) {
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

  public HistoricBatchDto tenantId(String tenantId) {
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

  public HistoricBatchDto createUserId(String createUserId) {
    this.createUserId = createUserId;
    return this;
  }

  /**
   * The batch creator's user id.
   * @return createUserId
  */
  
  @Schema(name = "createUserId", description = "The batch creator's user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createUserId")
  public String getCreateUserId() {
    return createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public HistoricBatchDto startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The time the batch was started. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return startTime
  */
  @Valid 
  @Schema(name = "startTime", description = "The time the batch was started. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public HistoricBatchDto endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The time the batch ended. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return endTime
  */
  @Valid 
  @Schema(name = "endTime", description = "The time the batch ended. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endTime")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public HistoricBatchDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The time after which the historic batch should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The time after which the historic batch should be removed by the History Cleanup job. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`. For further information, please see the [documentation](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricBatchDto historicBatchDto = (HistoricBatchDto) o;
    return Objects.equals(this.id, historicBatchDto.id) &&
        Objects.equals(this.type, historicBatchDto.type) &&
        Objects.equals(this.totalJobs, historicBatchDto.totalJobs) &&
        Objects.equals(this.batchJobsPerSeed, historicBatchDto.batchJobsPerSeed) &&
        Objects.equals(this.invocationsPerBatchJob, historicBatchDto.invocationsPerBatchJob) &&
        Objects.equals(this.seedJobDefinitionId, historicBatchDto.seedJobDefinitionId) &&
        Objects.equals(this.monitorJobDefinitionId, historicBatchDto.monitorJobDefinitionId) &&
        Objects.equals(this.batchJobDefinitionId, historicBatchDto.batchJobDefinitionId) &&
        Objects.equals(this.tenantId, historicBatchDto.tenantId) &&
        Objects.equals(this.createUserId, historicBatchDto.createUserId) &&
        Objects.equals(this.startTime, historicBatchDto.startTime) &&
        Objects.equals(this.endTime, historicBatchDto.endTime) &&
        Objects.equals(this.removalTime, historicBatchDto.removalTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, totalJobs, batchJobsPerSeed, invocationsPerBatchJob, seedJobDefinitionId, monitorJobDefinitionId, batchJobDefinitionId, tenantId, createUserId, startTime, endTime, removalTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricBatchDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalJobs: ").append(toIndentedString(totalJobs)).append("\n");
    sb.append("    batchJobsPerSeed: ").append(toIndentedString(batchJobsPerSeed)).append("\n");
    sb.append("    invocationsPerBatchJob: ").append(toIndentedString(invocationsPerBatchJob)).append("\n");
    sb.append("    seedJobDefinitionId: ").append(toIndentedString(seedJobDefinitionId)).append("\n");
    sb.append("    monitorJobDefinitionId: ").append(toIndentedString(monitorJobDefinitionId)).append("\n");
    sb.append("    batchJobDefinitionId: ").append(toIndentedString(batchJobDefinitionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
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

