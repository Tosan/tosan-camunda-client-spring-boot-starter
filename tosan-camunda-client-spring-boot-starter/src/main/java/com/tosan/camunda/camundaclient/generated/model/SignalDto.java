package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SignalDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SignalDto {

  private String name;

  private String executionId = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  private String tenantId = null;

  private Boolean withoutTenantId = null;

  public SignalDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the signal to deliver.  **Note**: This property is mandatory.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the signal to deliver.  **Note**: This property is mandatory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SignalDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

  /**
   * Optionally specifies a single execution which is notified by the signal.  **Note**: If no execution id is defined the signal is broadcasted to all subscribed handlers. 
   * @return executionId
  */
  
  @Schema(name = "executionId", description = "Optionally specifies a single execution which is notified by the signal.  **Note**: If no execution id is defined the signal is broadcasted to all subscribed handlers. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executionId")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }

  public SignalDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public SignalDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public SignalDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Specifies a tenant to deliver the signal. The signal can only be received on executions or process definitions which belongs to the given tenant.  **Note**: Cannot be used in combination with executionId.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "Specifies a tenant to deliver the signal. The signal can only be received on executions or process definitions which belongs to the given tenant.  **Note**: Cannot be used in combination with executionId.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public SignalDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * If true the signal can only be received on executions or process definitions which belongs to no tenant. Value may not be false as this is the default behavior.  **Note**: Cannot be used in combination with `executionId`.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "If true the signal can only be received on executions or process definitions which belongs to no tenant. Value may not be false as this is the default behavior.  **Note**: Cannot be used in combination with `executionId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalDto signalDto = (SignalDto) o;
    return Objects.equals(this.name, signalDto.name) &&
        Objects.equals(this.executionId, signalDto.executionId) &&
        Objects.equals(this.variables, signalDto.variables) &&
        Objects.equals(this.tenantId, signalDto.tenantId) &&
        Objects.equals(this.withoutTenantId, signalDto.withoutTenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, executionId, variables, tenantId, withoutTenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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

