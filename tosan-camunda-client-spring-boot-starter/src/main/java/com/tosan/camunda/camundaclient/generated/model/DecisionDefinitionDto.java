package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * DecisionDefinitionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DecisionDefinitionDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("decisionRequirementsDefinitionId")
  private String decisionRequirementsDefinitionId = null;

  @JsonProperty("decisionRequirementsDefinitionKey")
  private String decisionRequirementsDefinitionKey = null;

  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  @JsonProperty("versionTag")
  private String versionTag = null;

  public DecisionDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision definition
   * @return id
   **/
  @Schema(description = "The id of the decision definition")
  
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
   **/
  @Schema(description = "The key of the decision definition, i.e., the id of the DMN 1.0 XML decision definition.")
  
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
   **/
  @Schema(description = "The category of the decision definition.")
  
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
   **/
  @Schema(description = "The name of the decision definition.")
  
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
   **/
  @Schema(description = "The version of the decision definition that the engine assigned to it.")
  
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
   **/
  @Schema(description = "The file name of the decision definition.")
  
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
   **/
  @Schema(description = "The deployment id of the decision definition.")
  
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
   **/
  @Schema(description = "The tenant id of the decision definition.")
  
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
   **/
  @Schema(description = "The id of the decision requirements definition this decision definition belongs to.")
  
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
   **/
  @Schema(description = "The key of the decision requirements definition this decision definition belongs to.")
  
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
   **/
  @Schema(description = "History time to live value of the decision definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).")
  
  @Min(0)  public Integer getHistoryTimeToLive() {
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
   **/
  @Schema(description = "The version tag of the decision definition.")
  
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
