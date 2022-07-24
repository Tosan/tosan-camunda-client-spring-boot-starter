package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * DecisionRequirementsDefinitionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class DecisionRequirementsDefinitionDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  public DecisionRequirementsDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the decision requirements definition
   * @return id
   **/
  @Schema(description = "The id of the decision requirements definition")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DecisionRequirementsDefinitionDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the decision requirements definition, i.e., the id of the DMN 1.0 XML decision definition.
   * @return key
   **/
  @Schema(description = "The key of the decision requirements definition, i.e., the id of the DMN 1.0 XML decision definition.")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DecisionRequirementsDefinitionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the decision requirements definition.
   * @return name
   **/
  @Schema(description = "The name of the decision requirements definition.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DecisionRequirementsDefinitionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the decision requirements definition.
   * @return category
   **/
  @Schema(description = "The category of the decision requirements definition.")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public DecisionRequirementsDefinitionDto version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the decision requirements definition that the engine assigned to it.
   * @return version
   **/
  @Schema(description = "The version of the decision requirements definition that the engine assigned to it.")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public DecisionRequirementsDefinitionDto resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The file name of the decision requirements definition.
   * @return resource
   **/
  @Schema(description = "The file name of the decision requirements definition.")
  
    public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public DecisionRequirementsDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment id of the decision requirements definition.
   * @return deploymentId
   **/
  @Schema(description = "The deployment id of the decision requirements definition.")
  
    public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public DecisionRequirementsDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the decisionrequirements definition.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the decisionrequirements definition.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionRequirementsDefinitionDto decisionRequirementsDefinitionDto = (DecisionRequirementsDefinitionDto) o;
    return Objects.equals(this.id, decisionRequirementsDefinitionDto.id) &&
        Objects.equals(this.key, decisionRequirementsDefinitionDto.key) &&
        Objects.equals(this.name, decisionRequirementsDefinitionDto.name) &&
        Objects.equals(this.category, decisionRequirementsDefinitionDto.category) &&
        Objects.equals(this.version, decisionRequirementsDefinitionDto.version) &&
        Objects.equals(this.resource, decisionRequirementsDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, decisionRequirementsDefinitionDto.deploymentId) &&
        Objects.equals(this.tenantId, decisionRequirementsDefinitionDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, category, version, resource, deploymentId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionRequirementsDefinitionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
