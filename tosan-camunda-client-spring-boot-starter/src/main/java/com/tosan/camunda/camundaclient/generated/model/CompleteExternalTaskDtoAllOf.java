package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CompleteExternalTaskDtoAllOf
 */

@JsonTypeName("CompleteExternalTaskDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CompleteExternalTaskDtoAllOf {

  @Valid
  private Map<String, VariableValueDto> variables;

  @Valid
  private Map<String, VariableValueDto> localVariables;

  public CompleteExternalTaskDtoAllOf variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public CompleteExternalTaskDtoAllOf putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object with the following properties:
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON object containing variable key-value pairs. Each key is a variable name and each value a JSON variable value object with the following properties:", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public CompleteExternalTaskDtoAllOf localVariables(Map<String, VariableValueDto> localVariables) {
    this.localVariables = localVariables;
    return this;
  }

  public CompleteExternalTaskDtoAllOf putLocalVariablesItem(String key, VariableValueDto localVariablesItem) {
    if (this.localVariables == null) {
      this.localVariables = new HashMap<>();
    }
    this.localVariables.put(key, localVariablesItem);
    return this;
  }

  /**
   * A JSON object containing local variable key-value pairs. Local variables are set only in the scope of external task. Each key is a variable name and each value a JSON variable value object with the following properties:
   * @return localVariables
  */
  @Valid 
  @Schema(name = "localVariables", description = "A JSON object containing local variable key-value pairs. Local variables are set only in the scope of external task. Each key is a variable name and each value a JSON variable value object with the following properties:", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localVariables")
  public Map<String, VariableValueDto> getLocalVariables() {
    return localVariables;
  }

  public void setLocalVariables(Map<String, VariableValueDto> localVariables) {
    this.localVariables = localVariables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteExternalTaskDtoAllOf completeExternalTaskDtoAllOf = (CompleteExternalTaskDtoAllOf) o;
    return Objects.equals(this.variables, completeExternalTaskDtoAllOf.variables) &&
        Objects.equals(this.localVariables, completeExternalTaskDtoAllOf.localVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, localVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteExternalTaskDtoAllOf {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
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

