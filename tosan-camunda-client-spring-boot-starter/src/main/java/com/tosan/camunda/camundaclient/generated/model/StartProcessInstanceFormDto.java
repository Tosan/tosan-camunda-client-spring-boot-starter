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
 * StartProcessInstanceFormDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class StartProcessInstanceFormDto {

  @Valid
  private Map<String, VariableValueDto> variables;

  private String businessKey = null;

  public StartProcessInstanceFormDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public StartProcessInstanceFormDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * 
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public StartProcessInstanceFormDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key the process instance is to be initialized with. The business key uniquely identifies the process instance in the context of the given process definition.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "The business key the process instance is to be initialized with. The business key uniquely identifies the process instance in the context of the given process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartProcessInstanceFormDto startProcessInstanceFormDto = (StartProcessInstanceFormDto) o;
    return Objects.equals(this.variables, startProcessInstanceFormDto.variables) &&
        Objects.equals(this.businessKey, startProcessInstanceFormDto.businessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, businessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartProcessInstanceFormDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
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

