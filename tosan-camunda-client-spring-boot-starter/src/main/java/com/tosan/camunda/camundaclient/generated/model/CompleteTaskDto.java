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
 * CompleteTaskDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CompleteTaskDto {

  @Valid
  private Map<String, VariableValueDto> variables;

  private Boolean withVariablesInReturn = null;

  public CompleteTaskDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public CompleteTaskDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A JSON object containing variable key-value pairs.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A JSON object containing variable key-value pairs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public CompleteTaskDto withVariablesInReturn(Boolean withVariablesInReturn) {
    this.withVariablesInReturn = withVariablesInReturn;
    return this;
  }

  /**
   * Indicates whether the response should contain the process variables or not. The default is `false` with a response code of `204`. If set to `true` the response contains the process variables and has a response code of `200`. If the task is not associated with a process instance (e.g. if it's part of a case instance) no variables will be returned.
   * @return withVariablesInReturn
  */
  
  @Schema(name = "withVariablesInReturn", description = "Indicates whether the response should contain the process variables or not. The default is `false` with a response code of `204`. If set to `true` the response contains the process variables and has a response code of `200`. If the task is not associated with a process instance (e.g. if it's part of a case instance) no variables will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withVariablesInReturn")
  public Boolean getWithVariablesInReturn() {
    return withVariablesInReturn;
  }

  public void setWithVariablesInReturn(Boolean withVariablesInReturn) {
    this.withVariablesInReturn = withVariablesInReturn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteTaskDto completeTaskDto = (CompleteTaskDto) o;
    return Objects.equals(this.variables, completeTaskDto.variables) &&
        Objects.equals(this.withVariablesInReturn, completeTaskDto.withVariablesInReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, withVariablesInReturn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteTaskDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    withVariablesInReturn: ").append(toIndentedString(withVariablesInReturn)).append("\n");
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

