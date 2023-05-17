package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * SignalDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SignalDto   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("executionId")
  private String executionId = null;

  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  public SignalDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the signal to deliver.  **Note**: This property is mandatory.
   * @return name
   **/
  @Schema(description = "The name of the signal to deliver.  **Note**: This property is mandatory.")
  
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
   **/
  @Schema(description = "Optionally specifies a single execution which is notified by the signal.  **Note**: If no execution id is defined the signal is broadcasted to all subscribed handlers. ")
  
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
   **/
  @Schema(description = "A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object.")
      @Valid
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
   **/
  @Schema(description = "Specifies a tenant to deliver the signal. The signal can only be received on executions or process definitions which belongs to the given tenant.  **Note**: Cannot be used in combination with executionId.")
  
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
   **/
  @Schema(description = "If true the signal can only be received on executions or process definitions which belongs to no tenant. Value may not be false as this is the default behavior.  **Note**: Cannot be used in combination with `executionId`.")
  
    public Boolean isWithoutTenantId() {
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
