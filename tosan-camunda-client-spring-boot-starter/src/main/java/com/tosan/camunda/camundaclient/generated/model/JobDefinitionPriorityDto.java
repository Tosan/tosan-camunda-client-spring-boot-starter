package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * JobDefinitionPriorityDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobDefinitionPriorityDto   {
  @JsonProperty("priority")
  private Long priority = null;

  @JsonProperty("includeJobs")
  private Boolean includeJobs = null;

  public JobDefinitionPriorityDto priority(Long priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The new execution priority number for jobs of the given definition. The definition's priority can be reset by using the value `null`. In that case, the job definition's priority no longer applies but a new job's priority is determined as specified in the process model.
   * @return priority
   **/
  @Schema(description = "The new execution priority number for jobs of the given definition. The definition's priority can be reset by using the value `null`. In that case, the job definition's priority no longer applies but a new job's priority is determined as specified in the process model.")
  
    public Long getPriority() {
    return priority;
  }

  public void setPriority(Long priority) {
    this.priority = priority;
  }

  public JobDefinitionPriorityDto includeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
    return this;
  }

  /**
   * A boolean value indicating whether existing jobs of the given definition should receive the priority as well. Default value is `false`. Can only be `true` when the __priority__ parameter is not `null`.
   * @return includeJobs
   **/
  @Schema(description = "A boolean value indicating whether existing jobs of the given definition should receive the priority as well. Default value is `false`. Can only be `true` when the __priority__ parameter is not `null`.")
  
    public Boolean isIncludeJobs() {
    return includeJobs;
  }

  public void setIncludeJobs(Boolean includeJobs) {
    this.includeJobs = includeJobs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinitionPriorityDto jobDefinitionPriorityDto = (JobDefinitionPriorityDto) o;
    return Objects.equals(this.priority, jobDefinitionPriorityDto.priority) &&
        Objects.equals(this.includeJobs, jobDefinitionPriorityDto.includeJobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, includeJobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionPriorityDto {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    includeJobs: ").append(toIndentedString(includeJobs)).append("\n");
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
