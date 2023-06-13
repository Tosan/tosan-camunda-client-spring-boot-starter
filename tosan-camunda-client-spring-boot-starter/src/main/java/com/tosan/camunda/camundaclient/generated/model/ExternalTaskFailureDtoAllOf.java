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
 * ExternalTaskFailureDtoAllOf
 */

@JsonTypeName("ExternalTaskFailureDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskFailureDtoAllOf {

  private String errorMessage = null;

  private String errorDetails = null;

  private Integer retries = null;

  private Long retryTimeout = null;

  @Valid
  private Map<String, VariableValueDto> variables;

  @Valid
  private Map<String, VariableValueDto> localVariables;

  public ExternalTaskFailureDtoAllOf errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * An message indicating the reason of the failure.
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", description = "An message indicating the reason of the failure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ExternalTaskFailureDtoAllOf errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * A detailed error description.
   * @return errorDetails
  */
  
  @Schema(name = "errorDetails", description = "A detailed error description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDetails")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public ExternalTaskFailureDtoAllOf retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * A number of how often the task should be retried. Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. The incident's message is set to the `errorMessage` parameter.
   * @return retries
  */
  
  @Schema(name = "retries", description = "A number of how often the task should be retried. Must be >= 0. If this is 0, an incident is created and the task cannot be fetched anymore unless the retries are increased again. The incident's message is set to the `errorMessage` parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public ExternalTaskFailureDtoAllOf retryTimeout(Long retryTimeout) {
    this.retryTimeout = retryTimeout;
    return this;
  }

  /**
   * A timeout in milliseconds before the external task becomes available again for fetching. Must be >= 0.
   * @return retryTimeout
  */
  
  @Schema(name = "retryTimeout", description = "A timeout in milliseconds before the external task becomes available again for fetching. Must be >= 0.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retryTimeout")
  public Long getRetryTimeout() {
    return retryTimeout;
  }

  public void setRetryTimeout(Long retryTimeout) {
    this.retryTimeout = retryTimeout;
  }

  public ExternalTaskFailureDtoAllOf variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public ExternalTaskFailureDtoAllOf putVariablesItem(String key, VariableValueDto variablesItem) {
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

  public ExternalTaskFailureDtoAllOf localVariables(Map<String, VariableValueDto> localVariables) {
    this.localVariables = localVariables;
    return this;
  }

  public ExternalTaskFailureDtoAllOf putLocalVariablesItem(String key, VariableValueDto localVariablesItem) {
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
    ExternalTaskFailureDtoAllOf externalTaskFailureDtoAllOf = (ExternalTaskFailureDtoAllOf) o;
    return Objects.equals(this.errorMessage, externalTaskFailureDtoAllOf.errorMessage) &&
        Objects.equals(this.errorDetails, externalTaskFailureDtoAllOf.errorDetails) &&
        Objects.equals(this.retries, externalTaskFailureDtoAllOf.retries) &&
        Objects.equals(this.retryTimeout, externalTaskFailureDtoAllOf.retryTimeout) &&
        Objects.equals(this.variables, externalTaskFailureDtoAllOf.variables) &&
        Objects.equals(this.localVariables, externalTaskFailureDtoAllOf.localVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorDetails, retries, retryTimeout, variables, localVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskFailureDtoAllOf {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
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

