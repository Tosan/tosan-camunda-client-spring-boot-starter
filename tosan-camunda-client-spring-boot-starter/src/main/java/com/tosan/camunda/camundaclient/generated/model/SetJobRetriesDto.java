package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the number of retries for a selection of jobs. Please note that if both jobIds and jobQuery are provided, then retries will be set on the union of these sets.
 */
@Schema(description = "Defines the number of retries for a selection of jobs. Please note that if both jobIds and jobQuery are provided, then retries will be set on the union of these sets.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SetJobRetriesDto   {
  @JsonProperty("jobIds")
  @Valid
  private List<String> jobIds = null;

  @JsonProperty("jobQuery")
  private JobQueryDto jobQuery = null;

  @JsonProperty("retries")
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
   **/
  @Schema(description = "A list of job ids to set retries for.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "An integer representing the number of retries. Please note that the value cannot be negative or null.")
  
  @Min(0)  public Integer getRetries() {
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
