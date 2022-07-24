package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ExternalTaskBpmnError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ExternalTaskBpmnError   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  public ExternalTaskBpmnError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * An error code that indicates the predefined error. It is used to identify the BPMN error handler.
   * @return errorCode
   **/
  @Schema(description = "An error code that indicates the predefined error. It is used to identify the BPMN error handler.")
  
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
   **/
  @Schema(description = "An error message that describes the error.")
  
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
    ExternalTaskBpmnError externalTaskBpmnError = (ExternalTaskBpmnError) o;
    return Objects.equals(this.errorCode, externalTaskBpmnError.errorCode) &&
        Objects.equals(this.errorMessage, externalTaskBpmnError.errorMessage) &&
        Objects.equals(this.variables, externalTaskBpmnError.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskBpmnError {\n");
    
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
