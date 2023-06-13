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
 * JobDefinitionSuspensionStateDtoAllOf
 */

@JsonTypeName("JobDefinitionSuspensionStateDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDefinitionSuspensionStateDtoAllOf {

  private Boolean includeJobs = null;

  private String executionDate = null;

  public JobDefinitionSuspensionStateDtoAllOf includeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
    return this;
  }

  /**
   * A `Boolean` value which indicates whether to activate or suspend also all jobs of the referenced job definitions. When the value is set to `true`, all jobs of the provided job definitions will be activated or suspended and when the value is set to `false`, the suspension state of all jobs of the provided job definitions will not be updated.
   * @return includeJobs
  */
  
  @Schema(name = "includeJobs", description = "A `Boolean` value which indicates whether to activate or suspend also all jobs of the referenced job definitions. When the value is set to `true`, all jobs of the provided job definitions will be activated or suspended and when the value is set to `false`, the suspension state of all jobs of the provided job definitions will not be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeJobs")
  public Boolean getIncludeJobs() {
    return includeJobs;
  }

  public void setIncludeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
  }

  public JobDefinitionSuspensionStateDtoAllOf executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * The date on which the referenced job definitions will be activated or suspended. If null, the suspension state of the given job definitions is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executionDate
  */
  
  @Schema(name = "executionDate", description = "The date on which the referenced job definitions will be activated or suspended. If null, the suspension state of the given job definitions is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM- dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionDate")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionSuspensionStateDtoAllOf jobDefinitionSuspensionStateDtoAllOf = (JobDefinitionSuspensionStateDtoAllOf) o;
    return Objects.equals(this.includeJobs, jobDefinitionSuspensionStateDtoAllOf.includeJobs) &&
        Objects.equals(this.executionDate, jobDefinitionSuspensionStateDtoAllOf.executionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeJobs, executionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionSuspensionStateDtoAllOf {\n");
    sb.append("    includeJobs: ").append(toIndentedString(includeJobs)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

