package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DecisionDefinitionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DecisionDefinitionDto {

  private String id = null;

  private String key = null;

  private String category = null;

  private String name = null;

  private Integer version = null;

  private String resource = null;

  private String deploymentId = null;

  private String tenantId = null;

  private String decisionRequirementsDefinitionId = null;

  private String decisionRequirementsDefinitionKey = null;

  private Integer historyTimeToLive = null;

  private String versionTag = null;

  public DecisionDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision definition
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the decision definition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DecisionDefinitionDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the decision definition, i.e., the id of the DMN 1.0 XML decision definition.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the decision definition, i.e., the id of the DMN 1.0 XML decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DecisionDefinitionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the decision definition.
   * @return category
  */
  
  @Schema(name = "category", description = "The category of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DecisionDefinitionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the decision definition.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DecisionDefinitionDto version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the decision definition that the engine assigned to it.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of the decision definition that the engine assigned to it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public DecisionDefinitionDto resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The file name of the decision definition.
   * @return resource
  */
  
  @Schema(name = "resource", description = "The file name of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public DecisionDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment id of the decision definition.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "The deployment id of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public DecisionDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the decision definition.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public DecisionDefinitionDto decisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
    return this;
  }

  /**
   * The id of the decision requirements definition this decision definition belongs to.
   * @return decisionRequirementsDefinitionId
  */
  
  @Schema(name = "decisionRequirementsDefinitionId", description = "The id of the decision requirements definition this decision definition belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionRequirementsDefinitionId")
  public String getDecisionRequirementsDefinitionId() {
    return decisionRequirementsDefinitionId;
  }

  public void setDecisionRequirementsDefinitionId(String decisionRequirementsDefinitionId) {
    this.decisionRequirementsDefinitionId = decisionRequirementsDefinitionId;
  }

  public DecisionDefinitionDto decisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
    return this;
  }

  /**
   * The key of the decision requirements definition this decision definition belongs to.
   * @return decisionRequirementsDefinitionKey
  */
  
  @Schema(name = "decisionRequirementsDefinitionKey", description = "The key of the decision requirements definition this decision definition belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionRequirementsDefinitionKey")
  public String getDecisionRequirementsDefinitionKey() {
    return decisionRequirementsDefinitionKey;
  }

  public void setDecisionRequirementsDefinitionKey(String decisionRequirementsDefinitionKey) {
    this.decisionRequirementsDefinitionKey = decisionRequirementsDefinitionKey;
  }

  public DecisionDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * History time to live value of the decision definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
  */
  @Min(0) 
  @Schema(name = "historyTimeToLive", description = "History time to live value of the decision definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyTimeToLive")
  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public DecisionDefinitionDto versionTag(String versionTag) {
    this.versionTag = versionTag;
    return this;
  }

  /**
   * The version tag of the decision definition.
   * @return versionTag
  */
  
  @Schema(name = "versionTag", description = "The version tag of the decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionTag")
  public String getVersionTag() {
    return versionTag;
  }

  public void setVersionTag(String versionTag) {
    this.versionTag = versionTag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionDefinitionDto decisionDefinitionDto = (DecisionDefinitionDto) o;
    return Objects.equals(this.id, decisionDefinitionDto.id) &&
        Objects.equals(this.key, decisionDefinitionDto.key) &&
        Objects.equals(this.category, decisionDefinitionDto.category) &&
        Objects.equals(this.name, decisionDefinitionDto.name) &&
        Objects.equals(this.version, decisionDefinitionDto.version) &&
        Objects.equals(this.resource, decisionDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, decisionDefinitionDto.deploymentId) &&
        Objects.equals(this.tenantId, decisionDefinitionDto.tenantId) &&
        Objects.equals(this.decisionRequirementsDefinitionId, decisionDefinitionDto.decisionRequirementsDefinitionId) &&
        Objects.equals(this.decisionRequirementsDefinitionKey, decisionDefinitionDto.decisionRequirementsDefinitionKey) &&
        Objects.equals(this.historyTimeToLive, decisionDefinitionDto.historyTimeToLive) &&
        Objects.equals(this.versionTag, decisionDefinitionDto.versionTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, category, name, version, resource, deploymentId, tenantId, decisionRequirementsDefinitionId, decisionRequirementsDefinitionKey, historyTimeToLive, versionTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionDefinitionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    decisionRequirementsDefinitionId: ").append(toIndentedString(decisionRequirementsDefinitionId)).append("\n");
    sb.append("    decisionRequirementsDefinitionKey: ").append(toIndentedString(decisionRequirementsDefinitionKey)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
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

