package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.AtomLink;
import com.tosan.camunda.camundaclient.generated.model.CaseDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.DecisionDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.DecisionRequirementsDefinitionDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessDefinitionDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeploymentWithDefinitionsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeploymentWithDefinitionsDto {

  @Valid
  private Map<String, ProcessDefinitionDto> deployedProcessDefinitions;

  @Valid
  private Map<String, DecisionDefinitionDto> deployedDecisionDefinitions;

  @Valid
  private Map<String, DecisionRequirementsDefinitionDto> deployedDecisionRequirementsDefinitions;

  @Valid
  private Map<String, CaseDefinitionDto> deployedCaseDefinitions;

  private String id = null;

  private String tenantId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deploymentTime = null;

  private String source = null;

  private String name = null;

  @Valid
  private List<@Valid AtomLink> links;

  public DeploymentWithDefinitionsDto deployedProcessDefinitions(Map<String, ProcessDefinitionDto> deployedProcessDefinitions) {
    this.deployedProcessDefinitions = deployedProcessDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDto putDeployedProcessDefinitionsItem(String key, ProcessDefinitionDto deployedProcessDefinitionsItem) {
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

  public DeploymentWithDefinitionsDto deployedDecisionDefinitions(Map<String, DecisionDefinitionDto> deployedDecisionDefinitions) {
    this.deployedDecisionDefinitions = deployedDecisionDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDto putDeployedDecisionDefinitionsItem(String key, DecisionDefinitionDto deployedDecisionDefinitionsItem) {
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

  public DeploymentWithDefinitionsDto deployedDecisionRequirementsDefinitions(Map<String, DecisionRequirementsDefinitionDto> deployedDecisionRequirementsDefinitions) {
    this.deployedDecisionRequirementsDefinitions = deployedDecisionRequirementsDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDto putDeployedDecisionRequirementsDefinitionsItem(String key, DecisionRequirementsDefinitionDto deployedDecisionRequirementsDefinitionsItem) {
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

  public DeploymentWithDefinitionsDto deployedCaseDefinitions(Map<String, CaseDefinitionDto> deployedCaseDefinitions) {
    this.deployedCaseDefinitions = deployedCaseDefinitions;
    return this;
  }

  public DeploymentWithDefinitionsDto putDeployedCaseDefinitionsItem(String key, CaseDefinitionDto deployedCaseDefinitionsItem) {
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

  public DeploymentWithDefinitionsDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the deployment.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeploymentWithDefinitionsDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the deployment.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public DeploymentWithDefinitionsDto deploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

  /**
   * The time when the deployment was created.
   * @return deploymentTime
  */
  @Valid 
  @Schema(name = "deploymentTime", description = "The time when the deployment was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentTime")
  public OffsetDateTime getDeploymentTime() {
    return deploymentTime;
  }

  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
  }

  public DeploymentWithDefinitionsDto source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The source of the deployment.
   * @return source
  */
  
  @Schema(name = "source", description = "The source of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DeploymentWithDefinitionsDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the deployment.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentWithDefinitionsDto links(List<@Valid AtomLink> links) {
    this.links = links;
    return this;
  }

  public DeploymentWithDefinitionsDto addLinksItem(AtomLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * The links associated to this resource, with `method`, `href` and `rel`.
   * @return links
  */
  @Valid 
  @Schema(name = "links", description = "The links associated to this resource, with `method`, `href` and `rel`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<@Valid AtomLink> getLinks() {
    return links;
  }

  public void setLinks(List<@Valid AtomLink> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentWithDefinitionsDto deploymentWithDefinitionsDto = (DeploymentWithDefinitionsDto) o;
    return Objects.equals(this.deployedProcessDefinitions, deploymentWithDefinitionsDto.deployedProcessDefinitions) &&
        Objects.equals(this.deployedDecisionDefinitions, deploymentWithDefinitionsDto.deployedDecisionDefinitions) &&
        Objects.equals(this.deployedDecisionRequirementsDefinitions, deploymentWithDefinitionsDto.deployedDecisionRequirementsDefinitions) &&
        Objects.equals(this.deployedCaseDefinitions, deploymentWithDefinitionsDto.deployedCaseDefinitions) &&
        Objects.equals(this.id, deploymentWithDefinitionsDto.id) &&
        Objects.equals(this.tenantId, deploymentWithDefinitionsDto.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentWithDefinitionsDto.deploymentTime) &&
        Objects.equals(this.source, deploymentWithDefinitionsDto.source) &&
        Objects.equals(this.name, deploymentWithDefinitionsDto.name) &&
        Objects.equals(this.links, deploymentWithDefinitionsDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployedProcessDefinitions, deployedDecisionDefinitions, deployedDecisionRequirementsDefinitions, deployedCaseDefinitions, id, tenantId, deploymentTime, source, name, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentWithDefinitionsDto {\n");
    sb.append("    deployedProcessDefinitions: ").append(toIndentedString(deployedProcessDefinitions)).append("\n");
    sb.append("    deployedDecisionDefinitions: ").append(toIndentedString(deployedDecisionDefinitions)).append("\n");
    sb.append("    deployedDecisionRequirementsDefinitions: ").append(toIndentedString(deployedDecisionRequirementsDefinitions)).append("\n");
    sb.append("    deployedCaseDefinitions: ").append(toIndentedString(deployedCaseDefinitions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

