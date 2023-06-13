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
 * JobSuspensionStateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobSuspensionStateDto {

  private String jobDefinitionId = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String processDefinitionKey = null;

  private String processDefinitionTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  private Boolean suspended = null;

  public JobSuspensionStateDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

  /**
   * The job definition id of the jobs to activate or suspend.
   * @return jobDefinitionId
  */
  
  @Schema(name = "jobDefinitionId", description = "The job definition id of the jobs to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jobDefinitionId")
  public String getJobDefinitionId() {
    return jobDefinitionId;
  }

  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }

  public JobSuspensionStateDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The process definition id of the jobs to activate or suspend.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The process definition id of the jobs to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobSuspensionStateDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The process instance id of the jobs to activate or suspend.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The process instance id of the jobs to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public JobSuspensionStateDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The process definition key of the jobs to activate or suspend.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The process definition key of the jobs to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobSuspensionStateDto processDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
    return this;
  }

  /**
   * Only activate or suspend jobs of a process definition which belongs to a tenant with the given id. Works only when selecting with `processDefinitionKey`.
   * @return processDefinitionTenantId
  */
  
  @Schema(name = "processDefinitionTenantId", description = "Only activate or suspend jobs of a process definition which belongs to a tenant with the given id. Works only when selecting with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionTenantId")
  public String getProcessDefinitionTenantId() {
    return processDefinitionTenantId;
  }

  public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
  }

  public JobSuspensionStateDto processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

  /**
   * Only activate or suspend jobs of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior. Works only when selecting with `processDefinitionKey`.
   * @return processDefinitionWithoutTenantId
  */
  
  @Schema(name = "processDefinitionWithoutTenantId", description = "Only activate or suspend jobs of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior. Works only when selecting with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionWithoutTenantId")
  public Boolean getProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }

  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }

  public JobSuspensionStateDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A Boolean value which indicates whether to activate or suspend a given instance  (e.g. process instance, job, job definition, or batch). When the value is set to true,  the given instance will be suspended and when the value is set to false,  the given instance will be activated.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A Boolean value which indicates whether to activate or suspend a given instance  (e.g. process instance, job, job definition, or batch). When the value is set to true,  the given instance will be suspended and when the value is set to false,  the given instance will be activated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSuspensionStateDto jobSuspensionStateDto = (JobSuspensionStateDto) o;
    return Objects.equals(this.jobDefinitionId, jobSuspensionStateDto.jobDefinitionId) &&
        Objects.equals(this.processDefinitionId, jobSuspensionStateDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, jobSuspensionStateDto.processInstanceId) &&
        Objects.equals(this.processDefinitionKey, jobSuspensionStateDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, jobSuspensionStateDto.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, jobSuspensionStateDto.processDefinitionWithoutTenantId) &&
        Objects.equals(this.suspended, jobSuspensionStateDto.suspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobDefinitionId, processDefinitionId, processInstanceId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId, suspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSuspensionStateDto {\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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

