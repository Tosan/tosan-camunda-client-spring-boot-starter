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
 * EvaluationConditionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class EvaluationConditionDto {

  @Valid
  private Map<String, VariableValueDto> variables;

  private String businessKey = null;

  private String tenantId = null;

  private Boolean withoutTenantId = null;

  private String processDefinitionId = null;

  public EvaluationConditionDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public EvaluationConditionDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * A map of variables which are used for evaluation of the conditions and are injected into the process instances which have been triggered. Each key is a variable name and each value a JSON variable value object with the following properties.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "A map of variables which are used for evaluation of the conditions and are injected into the process instances which have been triggered. Each key is a variable name and each value a JSON variable value object with the following properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public EvaluationConditionDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * Used for the process instances that have been triggered after the evaluation.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "Used for the process instances that have been triggered after the evaluation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public EvaluationConditionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Used to evaluate a condition for a tenant with the given id. Will only evaluate conditions of process definitions which belong to the tenant.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "Used to evaluate a condition for a tenant with the given id. Will only evaluate conditions of process definitions which belong to the tenant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public EvaluationConditionDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * A Boolean value that indicates whether the conditions should only be evaluated of process definitions which belong to no tenant or not. Value may only be true, as false is the default behavior.
   * @return withoutTenantId
  */
  
  @Schema(name = "withoutTenantId", description = "A Boolean value that indicates whether the conditions should only be evaluated of process definitions which belong to no tenant or not. Value may only be true, as false is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public EvaluationConditionDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * Used to evaluate conditions of the process definition with the given id.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "Used to evaluate conditions of the process definition with the given id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationConditionDto evaluationConditionDto = (EvaluationConditionDto) o;
    return Objects.equals(this.variables, evaluationConditionDto.variables) &&
        Objects.equals(this.businessKey, evaluationConditionDto.businessKey) &&
        Objects.equals(this.tenantId, evaluationConditionDto.tenantId) &&
        Objects.equals(this.withoutTenantId, evaluationConditionDto.withoutTenantId) &&
        Objects.equals(this.processDefinitionId, evaluationConditionDto.processDefinitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, businessKey, tenantId, withoutTenantId, processDefinitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationConditionDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
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

