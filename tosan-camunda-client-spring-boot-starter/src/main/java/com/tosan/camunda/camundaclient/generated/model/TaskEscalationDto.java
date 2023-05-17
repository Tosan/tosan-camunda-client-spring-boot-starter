package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * TaskEscalationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TaskEscalationDto   {
  @JsonProperty("escalationCode")
  private String escalationCode = null;

  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  public TaskEscalationDto escalationCode(String escalationCode) {
    this.escalationCode = escalationCode;
    return this;
  }

  /**
   * An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.
   * @return escalationCode
   **/
  @Schema(description = "An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.")
  
    public String getEscalationCode() {
    return escalationCode;
  }

  public void setEscalationCode(String escalationCode) {
    this.escalationCode = escalationCode;
  }

  public TaskEscalationDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public TaskEscalationDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A JSON object containing variable key-value pairs.
   * @return variables
   **/
  @Schema(description = "A JSON object containing variable key-value pairs.")
      @Valid
    public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskEscalationDto taskEscalationDto = (TaskEscalationDto) o;
    return Objects.equals(this.escalationCode, taskEscalationDto.escalationCode) &&
        Objects.equals(this.variables, taskEscalationDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalationCode, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskEscalationDto {\n");
    
    sb.append("    escalationCode: ").append(toIndentedString(escalationCode)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
