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
 * Defines by which selection criterion to activate or suspend jobs. This selection criterion are mutually exclusive and can only be on of: * &#x60;jobDefinitionId&#x60; * &#x60;processDefinitionId&#x60; * &#x60;processInstanceId&#x60; * &#x60;processDefinitionKey&#x60;
 */

@Schema(name = "JobSuspensionStateDto_allOf", description = "Defines by which selection criterion to activate or suspend jobs. This selection criterion are mutually exclusive and can only be on of: * `jobDefinitionId` * `processDefinitionId` * `processInstanceId` * `processDefinitionKey`")
@JsonTypeName("JobSuspensionStateDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobSuspensionStateDtoAllOf {

  private String jobDefinitionId = null;

  private String processDefinitionId = null;

  private String processInstanceId = null;

  private String processDefinitionKey = null;

  private String processDefinitionTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  public JobSuspensionStateDtoAllOf jobDefinitionId(String jobDefinitionId) {
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

  public JobSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
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

  public JobSuspensionStateDtoAllOf processInstanceId(String processInstanceId) {
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

  public JobSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
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

  public JobSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
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

  public JobSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobSuspensionStateDtoAllOf jobSuspensionStateDtoAllOf = (JobSuspensionStateDtoAllOf) o;
    return Objects.equals(this.jobDefinitionId, jobSuspensionStateDtoAllOf.jobDefinitionId) &&
        Objects.equals(this.processDefinitionId, jobSuspensionStateDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processInstanceId, jobSuspensionStateDtoAllOf.processInstanceId) &&
        Objects.equals(this.processDefinitionKey, jobSuspensionStateDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, jobSuspensionStateDtoAllOf.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, jobSuspensionStateDtoAllOf.processDefinitionWithoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobDefinitionId, processDefinitionId, processInstanceId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobSuspensionStateDtoAllOf {\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
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

