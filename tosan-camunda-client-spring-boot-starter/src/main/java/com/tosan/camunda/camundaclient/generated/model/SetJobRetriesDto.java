package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.JobQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defines the number of retries for a selection of jobs. Please note that if both jobIds and jobQuery are provided, then retries will be set on the union of these sets.
 */

@Schema(name = "SetJobRetriesDto", description = "Defines the number of retries for a selection of jobs. Please note that if both jobIds and jobQuery are provided, then retries will be set on the union of these sets.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SetJobRetriesDto {

  @Valid
  private List<String> jobIds;

  private JobQueryDto jobQuery;

  private Integer retries = null;

  public SetJobRetriesDto jobIds(List<String> jobIds) {
    this.jobIds = jobIds;
    return this;
  }

  public SetJobRetriesDto addJobIdsItem(String jobIdsItem) {
    if (this.jobIds == null) {
      this.jobIds = new ArrayList<>();
    }
    this.jobIds.add(jobIdsItem);
    return this;
  }

  /**
   * A list of job ids to set retries for.
   * @return jobIds
  */
  
  @Schema(name = "jobIds", description = "A list of job ids to set retries for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobIds")
  public List<String> getJobIds() {
    return jobIds;
  }

  public void setJobIds(List<String> jobIds) {
    this.jobIds = jobIds;
  }

  public SetJobRetriesDto jobQuery(JobQueryDto jobQuery) {
    this.jobQuery = jobQuery;
    return this;
  }

  /**
   * Get jobQuery
   * @return jobQuery
  */
  @Valid 
  @Schema(name = "jobQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobQuery")
  public JobQueryDto getJobQuery() {
    return jobQuery;
  }

  public void setJobQuery(JobQueryDto jobQuery) {
    this.jobQuery = jobQuery;
  }

  public SetJobRetriesDto retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * An integer representing the number of retries. Please note that the value cannot be negative or null.
   * minimum: 0
   * @return retries
  */
  @Min(0) 
  @Schema(name = "retries", description = "An integer representing the number of retries. Please note that the value cannot be negative or null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetJobRetriesDto setJobRetriesDto = (SetJobRetriesDto) o;
    return Objects.equals(this.jobIds, setJobRetriesDto.jobIds) &&
        Objects.equals(this.jobQuery, setJobRetriesDto.jobQuery) &&
        Objects.equals(this.retries, setJobRetriesDto.retries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobIds, jobQuery, retries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetJobRetriesDto {\n");
    sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
    sb.append("    jobQuery: ").append(toIndentedString(jobQuery)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
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

