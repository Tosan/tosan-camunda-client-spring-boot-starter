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
 * TaskBpmnErrorDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TaskBpmnErrorDto {

  private String errorCode = null;

  private String errorMessage = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  public TaskBpmnErrorDto errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * An error code that indicates the predefined error. It is used to identify the BPMN error handler.
   * @return errorCode
  */
  
  @Schema(name = "errorCode", description = "An error code that indicates the predefined error. It is used to identify the BPMN error handler.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public TaskBpmnErrorDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * An error message that describes the error.
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", description = "An error message that describes the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public TaskBpmnErrorDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public TaskBpmnErrorDto putVariablesItem(String key, VariableValueDto variablesItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBpmnErrorDto taskBpmnErrorDto = (TaskBpmnErrorDto) o;
    return Objects.equals(this.errorCode, taskBpmnErrorDto.errorCode) &&
        Objects.equals(this.errorMessage, taskBpmnErrorDto.errorMessage) &&
        Objects.equals(this.variables, taskBpmnErrorDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBpmnErrorDto {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

