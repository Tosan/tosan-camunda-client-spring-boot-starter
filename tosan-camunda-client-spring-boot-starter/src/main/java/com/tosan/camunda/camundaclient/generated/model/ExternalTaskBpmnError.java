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
 * ExternalTaskBpmnError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskBpmnError {

  private String workerId = null;

  private String errorCode = null;

  private String errorMessage = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  public ExternalTaskBpmnError workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

  /**
   * The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.
   * @return workerId
  */
  
  @Schema(name = "workerId", description = "The id of the worker that reports the failure. Must match the id of the worker who has most recently locked the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workerId")
  public String getWorkerId() {
    return workerId;
  }

  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }

  public ExternalTaskBpmnError errorCode(String errorCode) {
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

  public ExternalTaskBpmnError errorMessage(String errorMessage) {
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

  public ExternalTaskBpmnError variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public ExternalTaskBpmnError putVariablesItem(String key, VariableValueDto variablesItem) {
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
    ExternalTaskBpmnError externalTaskBpmnError = (ExternalTaskBpmnError) o;
    return Objects.equals(this.workerId, externalTaskBpmnError.workerId) &&
        Objects.equals(this.errorCode, externalTaskBpmnError.errorCode) &&
        Objects.equals(this.errorMessage, externalTaskBpmnError.errorMessage) &&
        Objects.equals(this.variables, externalTaskBpmnError.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, errorCode, errorMessage, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskBpmnError {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
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

