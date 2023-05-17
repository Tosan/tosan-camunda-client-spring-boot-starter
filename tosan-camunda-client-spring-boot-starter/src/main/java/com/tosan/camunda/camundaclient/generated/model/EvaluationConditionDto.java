package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * EvaluationConditionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class EvaluationConditionDto   {
  @JsonProperty("variables")
  @Valid
  private Map<String, VariableValueDto> variables = null;

  @JsonProperty("businessKey")
  private String businessKey = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("processDefinitionId")
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
   **/
  @Schema(description = "A map of variables which are used for evaluation of the conditions and are injected into the process instances which have been triggered. Each key is a variable name and each value a JSON variable value object with the following properties.")
      @Valid
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
   **/
  @Schema(description = "Used for the process instances that have been triggered after the evaluation.")
  
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
   **/
  @Schema(description = "Used to evaluate a condition for a tenant with the given id. Will only evaluate conditions of process definitions which belong to the tenant.")
  
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
   **/
  @Schema(description = "A Boolean value that indicates whether the conditions should only be evaluated of process definitions which belong to no tenant or not. Value may only be true, as false is the default behavior.")
  
    public Boolean isWithoutTenantId() {
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
   **/
  @Schema(description = "Used to evaluate conditions of the process definition with the given id.")
  
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
