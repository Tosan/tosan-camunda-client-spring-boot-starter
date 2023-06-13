package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tosan.camunda.camundaclient.generated.model.CaseDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.DecisionDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.DecisionRequirementsDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessDefinitionDto;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeploymentWithDefinitionsDtoAllOf
 */

@JsonTypeName("DeploymentWithDefinitionsDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeploymentWithDefinitionsDtoAllOf {

  @Valid
  private Map<String, ProcessDefinitionDto> deployedProcessDefinitions;

  @Valid
  private Map<String, DecisionDefinitionDto> deployedDecisionDefinitions;

  @Valid
  private Map<String, DecisionRequirementsDefinitionDto> deployedDecisionRequirementsDefinitions;

  @Valid
  private Map<String, CaseDefinitionDto> deployedCaseDefinitions;

  public DeploymentWithDefinitionsDtoAllOf deployedProcessDefinitions(Map<String, ProcessDefinitionDto> deployedProcessDefinitions) {
    this.deployedProcessDefinitions = deployedProcessDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDtoAllOf putDeployedProcessDefinitionsItem(String key, ProcessDefinitionDto deployedProcessDefinitionsItem) {
    if (this.deployedProcessDefinitions == null) {
      this.deployedProcessDefinitions = new HashMap<>();
    }
    this.deployedProcessDefinitions.put(key, deployedProcessDefinitionsItem);
    return this;
  }

  /**
   * A JSON Object containing a property for each of the process definitions, which are successfully deployed with that deployment. The key is the process definition id, the value is a JSON Object corresponding to the process definition.
   * @return deployedProcessDefinitions
  */
  @Valid 
  @Schema(name = "deployedProcessDefinitions", description = "A JSON Object containing a property for each of the process definitions, which are successfully deployed with that deployment. The key is the process definition id, the value is a JSON Object corresponding to the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedProcessDefinitions")
  public Map<String, ProcessDefinitionDto> getDeployedProcessDefinitions() {
    return deployedProcessDefinitions;
  }

  public void setDeployedProcessDefinitions(Map<String, ProcessDefinitionDto> deployedProcessDefinitions) {
    this.deployedProcessDefinitions = deployedProcessDefinitions;
  }

  public DeploymentWithDefinitionsDtoAllOf deployedDecisionDefinitions(Map<String, DecisionDefinitionDto> deployedDecisionDefinitions) {
    this.deployedDecisionDefinitions = deployedDecisionDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDtoAllOf putDeployedDecisionDefinitionsItem(String key, DecisionDefinitionDto deployedDecisionDefinitionsItem) {
    if (this.deployedDecisionDefinitions == null) {
      this.deployedDecisionDefinitions = new HashMap<>();
    }
    this.deployedDecisionDefinitions.put(key, deployedDecisionDefinitionsItem);
    return this;
  }

  /**
   * A JSON Object containing a property for each of the decision definitions, which are successfully deployed with that deployment. The key is the decision definition id, the value is a JSON Object corresponding to the decision definition.
   * @return deployedDecisionDefinitions
  */
  @Valid 
  @Schema(name = "deployedDecisionDefinitions", description = "A JSON Object containing a property for each of the decision definitions, which are successfully deployed with that deployment. The key is the decision definition id, the value is a JSON Object corresponding to the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedDecisionDefinitions")
  public Map<String, DecisionDefinitionDto> getDeployedDecisionDefinitions() {
    return deployedDecisionDefinitions;
  }

  public void setDeployedDecisionDefinitions(Map<String, DecisionDefinitionDto> deployedDecisionDefinitions) {
    this.deployedDecisionDefinitions = deployedDecisionDefinitions;
  }

  public DeploymentWithDefinitionsDtoAllOf deployedDecisionRequirementsDefinitions(Map<String, DecisionRequirementsDefinitionDto> deployedDecisionRequirementsDefinitions) {
    this.deployedDecisionRequirementsDefinitions = deployedDecisionRequirementsDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDtoAllOf putDeployedDecisionRequirementsDefinitionsItem(String key, DecisionRequirementsDefinitionDto deployedDecisionRequirementsDefinitionsItem) {
    if (this.deployedDecisionRequirementsDefinitions == null) {
      this.deployedDecisionRequirementsDefinitions = new HashMap<>();
    }
    this.deployedDecisionRequirementsDefinitions.put(key, deployedDecisionRequirementsDefinitionsItem);
    return this;
  }

  /**
   * A JSON Object containing a property for each of the decision requirements definitions, which are successfully deployed with that deployment. The key is the decision requirements definition id, the value is a JSON Object corresponding to the decision requirements definition.
   * @return deployedDecisionRequirementsDefinitions
  */
  @Valid 
  @Schema(name = "deployedDecisionRequirementsDefinitions", description = "A JSON Object containing a property for each of the decision requirements definitions, which are successfully deployed with that deployment. The key is the decision requirements definition id, the value is a JSON Object corresponding to the decision requirements definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedDecisionRequirementsDefinitions")
  public Map<String, DecisionRequirementsDefinitionDto> getDeployedDecisionRequirementsDefinitions() {
    return deployedDecisionRequirementsDefinitions;
  }

  public void setDeployedDecisionRequirementsDefinitions(Map<String, DecisionRequirementsDefinitionDto> deployedDecisionRequirementsDefinitions) {
    this.deployedDecisionRequirementsDefinitions = deployedDecisionRequirementsDefinitions;
  }

  public DeploymentWithDefinitionsDtoAllOf deployedCaseDefinitions(Map<String, CaseDefinitionDto> deployedCaseDefinitions) {
    this.deployedCaseDefinitions = deployedCaseDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDtoAllOf putDeployedCaseDefinitionsItem(String key, CaseDefinitionDto deployedCaseDefinitionsItem) {
    if (this.deployedCaseDefinitions == null) {
      this.deployedCaseDefinitions = new HashMap<>();
    }
    this.deployedCaseDefinitions.put(key, deployedCaseDefinitionsItem);
    return this;
  }

  /**
   * A JSON Object containing a property for each of the case definitions, which are successfully deployed with that deployment. The key is the case definition id, the value is a JSON Object corresponding to the case definition.
   * @return deployedCaseDefinitions
  */
  @Valid 
  @Schema(name = "deployedCaseDefinitions", description = "A JSON Object containing a property for each of the case definitions, which are successfully deployed with that deployment. The key is the case definition id, the value is a JSON Object corresponding to the case definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deployedCaseDefinitions")
  public Map<String, CaseDefinitionDto> getDeployedCaseDefinitions() {
    return deployedCaseDefinitions;
  }

  public void setDeployedCaseDefinitions(Map<String, CaseDefinitionDto> deployedCaseDefinitions) {
    this.deployedCaseDefinitions = deployedCaseDefinitions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentWithDefinitionsDtoAllOf deploymentWithDefinitionsDtoAllOf = (DeploymentWithDefinitionsDtoAllOf) o;
    return Objects.equals(this.deployedProcessDefinitions, deploymentWithDefinitionsDtoAllOf.deployedProcessDefinitions) &&
        Objects.equals(this.deployedDecisionDefinitions, deploymentWithDefinitionsDtoAllOf.deployedDecisionDefinitions) &&
        Objects.equals(this.deployedDecisionRequirementsDefinitions, deploymentWithDefinitionsDtoAllOf.deployedDecisionRequirementsDefinitions) &&
        Objects.equals(this.deployedCaseDefinitions, deploymentWithDefinitionsDtoAllOf.deployedCaseDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedProcessDefinitions, deployedDecisionDefinitions, deployedDecisionRequirementsDefinitions, deployedCaseDefinitions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentWithDefinitionsDtoAllOf {\n");
    sb.append("    deployedProcessDefinitions: ").append(toIndentedString(deployedProcessDefinitions)).append("\n");
    sb.append("    deployedDecisionDefinitions: ").append(toIndentedString(deployedDecisionDefinitions)).append("\n");
    sb.append("    deployedDecisionRequirementsDefinitions: ").append(toIndentedString(deployedDecisionRequirementsDefinitions)).append("\n");
    sb.append("    deployedCaseDefinitions: ").append(toIndentedString(deployedCaseDefinitions)).append("\n");
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

