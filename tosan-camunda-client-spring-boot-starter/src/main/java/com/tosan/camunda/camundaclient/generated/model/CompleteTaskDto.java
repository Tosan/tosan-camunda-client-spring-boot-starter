package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * CompleteTaskDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CompleteTaskDto   {
  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  @JsonProperty("withVariablesInReturn")
  private Boolean withVariablesInReturn = false;

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
   **/
  @Schema(description = "A JSON object containing variable key-value pairs.")
      @Valid
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
   **/
  @Schema(description = "Indicates whether the response should contain the process variables or not. The default is `false` with a response code of `204`. If set to `true` the response contains the process variables and has a response code of `200`. If the task is not associated with a process instance (e.g. if it's part of a case instance) no variables will be returned.")
  
    public Boolean isWithVariablesInReturn() {
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
