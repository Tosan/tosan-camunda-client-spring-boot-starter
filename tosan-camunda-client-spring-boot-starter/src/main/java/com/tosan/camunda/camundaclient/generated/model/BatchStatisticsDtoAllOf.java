package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BatchStatisticsDtoAllOf
 */

@JsonTypeName("BatchStatisticsDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class BatchStatisticsDtoAllOf {

  private Integer remainingJobs = null;

  private Integer completedJobs = null;

  private Integer failedJobs = null;

  public BatchStatisticsDtoAllOf remainingJobs(Integer remainingJobs) {
    this.remainingJobs = remainingJobs;
    return this;
  }

  /**
   * The number of remaining batch execution jobs. This does include failed batch execution jobs and batch execution jobs which still have to be created by the seed job.
   * @return remainingJobs
  */
  
  @Schema(name = "remainingJobs", description = "The number of remaining batch execution jobs. This does include failed batch execution jobs and batch execution jobs which still have to be created by the seed job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingJobs")
  public Integer getRemainingJobs() {
    return remainingJobs;
  }

  public void setRemainingJobs(Integer remainingJobs) {
    this.remainingJobs = remainingJobs;
  }

  public BatchStatisticsDtoAllOf completedJobs(Integer completedJobs) {
    this.completedJobs = completedJobs;
    return this;
  }

  /**
   * The number of completed batch execution jobs. This does include aborted/deleted batch execution jobs.
   * @return completedJobs
  */
  
  @Schema(name = "completedJobs", description = "The number of completed batch execution jobs. This does include aborted/deleted batch execution jobs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedJobs")
  public Integer getCompletedJobs() {
    return completedJobs;
  }

  public void setCompletedJobs(Integer completedJobs) {
    this.completedJobs = completedJobs;
  }

  public BatchStatisticsDtoAllOf failedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
    return this;
  }

  /**
   * The number of failed batch execution jobs. This does not include aborted or deleted batch execution jobs.
   * @return failedJobs
  */
  
  @Schema(name = "failedJobs", description = "The number of failed batch execution jobs. This does not include aborted or deleted batch execution jobs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedJobs")
  public Integer getFailedJobs() {
    return failedJobs;
  }

  public void setFailedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStatisticsDtoAllOf batchStatisticsDtoAllOf = (BatchStatisticsDtoAllOf) o;
    return Objects.equals(this.remainingJobs, batchStatisticsDtoAllOf.remainingJobs) &&
        Objects.equals(this.completedJobs, batchStatisticsDtoAllOf.completedJobs) &&
        Objects.equals(this.failedJobs, batchStatisticsDtoAllOf.failedJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainingJobs, completedJobs, failedJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStatisticsDtoAllOf {\n");
    sb.append("    remainingJobs: ").append(toIndentedString(remainingJobs)).append("\n");
    sb.append("    completedJobs: ").append(toIndentedString(completedJobs)).append("\n");
    sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
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

