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
 * CompleteExternalTaskDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CompleteExternalTaskDto {

  @Valid
  private Map<String, VariableValueDto> variables;

  @Valid
  private Map<String, VariableValueDto> localVariables;

  private String workerId;

  public CompleteExternalTaskDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public CompleteExternalTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
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

  public CompleteExternalTaskDto localVariables(Map<String, VariableValueDto> localVariables) {
    this.localVariables = localVariables;
    return this;
  }

  public CompleteExternalTaskDto putLocalVariablesItem(String key, VariableValueDto localVariablesItem) {
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

  public CompleteExternalTaskDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * **Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "**Mandatory.** The ID of the worker who is performing the operation on the external task. If the task is already locked, must match the id of the worker who has most recently locked the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteExternalTaskDto completeExternalTaskDto = (CompleteExternalTaskDto) o;
    return Objects.equals(this.variables, completeExternalTaskDto.variables) &&
        Objects.equals(this.localVariables, completeExternalTaskDto.localVariables) &&
        Objects.equals(this.workerId, completeExternalTaskDto.workerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, localVariables, workerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteExternalTaskDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    localVariables: ").append(toIndentedString(localVariables)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

