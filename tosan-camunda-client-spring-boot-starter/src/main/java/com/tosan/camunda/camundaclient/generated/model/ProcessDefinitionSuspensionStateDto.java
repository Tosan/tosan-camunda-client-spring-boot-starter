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
 * ProcessDefinitionSuspensionStateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessDefinitionSuspensionStateDto {

  private Boolean suspended = null;

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private Boolean includeProcessInstances = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime executionDate = null;

  public ProcessDefinitionSuspensionStateDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A `Boolean` value which indicates whether to activate or suspend all process definitions with the given key. When the value is set to `true`, all process definitions with the given key will be suspended and when the value is set to `false`, all process definitions with the given key will be activated.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A `Boolean` value which indicates whether to activate or suspend all process definitions with the given key. When the value is set to `true`, all process definitions with the given key will be suspended and when the value is set to `false`, all process definitions with the given key will be activated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessDefinitionSuspensionStateDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The id of the process definitions to activate or suspend.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The id of the process definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ProcessDefinitionSuspensionStateDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The key of the process definitions to activate or suspend.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The key of the process definitions to activate or suspend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public ProcessDefinitionSuspensionStateDto includeProcessInstances(Boolean includeProcessInstances) {
    this.includeProcessInstances = includeProcessInstances;
    return this;
  }

  /**
   * A `Boolean` value which indicates whether to activate or suspend also all process instances of  the process definitions with the given key. When the value is set to `true`, all process instances of the process definitions with the given key will be activated or suspended and when the value is set to `false`, the suspension state of  all process instances of the process definitions with the given key will not be updated.
   * @return includeProcessInstances
  */
  
  @Schema(name = "includeProcessInstances", description = "A `Boolean` value which indicates whether to activate or suspend also all process instances of  the process definitions with the given key. When the value is set to `true`, all process instances of the process definitions with the given key will be activated or suspended and when the value is set to `false`, the suspension state of  all process instances of the process definitions with the given key will not be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeProcessInstances")
  public Boolean getIncludeProcessInstances() {
    return includeProcessInstances;
  }

  public void setIncludeProcessInstances(Boolean includeProcessInstances) {
    this.includeProcessInstances = includeProcessInstances;
  }

  public ProcessDefinitionSuspensionStateDto executionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * The date on which all process definitions with the given key will be activated or suspended. If `null`, the suspension state of all process definitions with the given key is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.
   * @return executionDate
  */
  @Valid 
  @Schema(name = "executionDate", description = "The date on which all process definitions with the given key will be activated or suspended. If `null`, the suspension state of all process definitions with the given key is updated immediately. By [default](https://docs.camunda.org/manual/7.17/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionDate")
  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(OffsetDateTime executionDate) {
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
    ProcessDefinitionSuspensionStateDto processDefinitionSuspensionStateDto = (ProcessDefinitionSuspensionStateDto) o;
    return Objects.equals(this.suspended, processDefinitionSuspensionStateDto.suspended) &&
        Objects.equals(this.processDefinitionId, processDefinitionSuspensionStateDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processDefinitionSuspensionStateDto.processDefinitionKey) &&
        Objects.equals(this.includeProcessInstances, processDefinitionSuspensionStateDto.includeProcessInstances) &&
        Objects.equals(this.executionDate, processDefinitionSuspensionStateDto.executionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suspended, processDefinitionId, processDefinitionKey, includeProcessInstances, executionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionSuspensionStateDto {\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    includeProcessInstances: ").append(toIndentedString(includeProcessInstances)).append("\n");
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

