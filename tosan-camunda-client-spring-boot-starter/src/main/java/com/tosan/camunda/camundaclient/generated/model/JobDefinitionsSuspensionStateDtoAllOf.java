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
 * Defines by which selection criterion to activate or suspend job definitions. The selection criteria are mutually exclusive and can only be one of: * &#x60;processDefinitionId&#x60; * &#x60;processDefinitionKey&#x60;
 */

@Schema(name = "JobDefinitionsSuspensionStateDto_allOf", description = "Defines by which selection criterion to activate or suspend job definitions. The selection criteria are mutually exclusive and can only be one of: * `processDefinitionId` * `processDefinitionKey`")
@JsonTypeName("JobDefinitionsSuspensionStateDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class JobDefinitionsSuspensionStateDtoAllOf {

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The process definition id of the job definitions to activate or suspend.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The process definition id of the job definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The process definition key of the job definitions to activate or suspend.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The process definition key of the job definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
    return this;
  }

  /**
   * Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.
   * @return processDefinitionTenantId
  */
  
  @Schema(name = "processDefinitionTenantId", description = "Only activate or suspend job definitions of a process definition which belongs to a tenant with the given id.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionTenantId")
  public String getProcessDefinitionTenantId() {
    return processDefinitionTenantId;
  }

  public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
  }

  public JobDefinitionsSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

  /**
   * Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.
   * @return processDefinitionWithoutTenantId
  */
  
  @Schema(name = "processDefinitionWithoutTenantId", description = "Only activate or suspend job definitions of a process definition which belongs to no tenant. Value may only be `true`, as `false` is the default behavior.  Note that this parameter will only be considered  in combination with `processDefinitionKey`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    JobDefinitionsSuspensionStateDtoAllOf jobDefinitionsSuspensionStateDtoAllOf = (JobDefinitionsSuspensionStateDtoAllOf) o;
    return Objects.equals(this.processDefinitionId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, jobDefinitionsSuspensionStateDtoAllOf.processDefinitionWithoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinitionsSuspensionStateDtoAllOf {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
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

