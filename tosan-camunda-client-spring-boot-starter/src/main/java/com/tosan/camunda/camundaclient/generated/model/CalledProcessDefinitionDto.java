package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.*;

/**
 * CalledProcessDefinitionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CalledProcessDefinitionDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("key")
  private String key = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("resource")
  private String resource = null;

  @JsonProperty("deploymentId")
  private String deploymentId = null;

  @JsonProperty("diagram")
  private String diagram = null;

  @JsonProperty("suspended")
  private Boolean suspended = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("versionTag")
  private String versionTag = null;

  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  @JsonProperty("startableInTasklist")
  private Boolean startableInTasklist = null;

  public CalledProcessDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process definition
   * @return id
   **/
  @Schema(description = "The id of the process definition")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CalledProcessDefinitionDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.
   * @return key
   **/
  @Schema(description = "The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CalledProcessDefinitionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the process definition.
   * @return category
   **/
  @Schema(description = "The category of the process definition.")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CalledProcessDefinitionDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the process definition.
   * @return description
   **/
  @Schema(description = "The description of the process definition.")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CalledProcessDefinitionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the process definition.
   * @return name
   **/
  @Schema(description = "The name of the process definition.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CalledProcessDefinitionDto version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the process definition that the engine assigned to it.
   * @return version
   **/
  @Schema(description = "The version of the process definition that the engine assigned to it.")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CalledProcessDefinitionDto resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The file name of the process definition.
   * @return resource
   **/
  @Schema(description = "The file name of the process definition.")
  
    public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public CalledProcessDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment id of the process definition.
   * @return deploymentId
   **/
  @Schema(description = "The deployment id of the process definition.")
  
    public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public CalledProcessDefinitionDto diagram(String diagram) {
    this.diagram = diagram;
    return this;
  }

  /**
   * The file name of the process definition diagram, if it exists.
   * @return diagram
   **/
  @Schema(description = "The file name of the process definition diagram, if it exists.")
  
    public String getDiagram() {
    return diagram;
  }

  public void setDiagram(String diagram) {
    this.diagram = diagram;
  }

  public CalledProcessDefinitionDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A flag indicating whether the definition is suspended or not.
   * @return suspended
   **/
  @Schema(description = "A flag indicating whether the definition is suspended or not.")
  
    public Boolean isSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public CalledProcessDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the process definition.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the process definition.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CalledProcessDefinitionDto versionTag(String versionTag) {
    this.versionTag = versionTag;
    return this;
  }

  /**
   * The version tag of the process definition.
   * @return versionTag
   **/
  @Schema(description = "The version tag of the process definition.")
  
    public String getVersionTag() {
    return versionTag;
  }

  public void setVersionTag(String versionTag) {
    this.versionTag = versionTag;
  }

  public CalledProcessDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
   **/
  @Schema(description = "History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).")
  
  @Min(0)  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public CalledProcessDefinitionDto startableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = startableInTasklist;
    return this;
  }

  /**
   * A flag indicating whether the process definition is startable in Tasklist or not.
   * @return startableInTasklist
   **/
  @Schema(description = "A flag indicating whether the process definition is startable in Tasklist or not.")
  
    public Boolean isStartableInTasklist() {
    return startableInTasklist;
  }

  public void setStartableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = startableInTasklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalledProcessDefinitionDto calledProcessDefinitionDto = (CalledProcessDefinitionDto) o;
    return Objects.equals(this.id, calledProcessDefinitionDto.id) &&
        Objects.equals(this.key, calledProcessDefinitionDto.key) &&
        Objects.equals(this.category, calledProcessDefinitionDto.category) &&
        Objects.equals(this.description, calledProcessDefinitionDto.description) &&
        Objects.equals(this.name, calledProcessDefinitionDto.name) &&
        Objects.equals(this.version, calledProcessDefinitionDto.version) &&
        Objects.equals(this.resource, calledProcessDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, calledProcessDefinitionDto.deploymentId) &&
        Objects.equals(this.diagram, calledProcessDefinitionDto.diagram) &&
        Objects.equals(this.suspended, calledProcessDefinitionDto.suspended) &&
        Objects.equals(this.tenantId, calledProcessDefinitionDto.tenantId) &&
        Objects.equals(this.versionTag, calledProcessDefinitionDto.versionTag) &&
        Objects.equals(this.historyTimeToLive, calledProcessDefinitionDto.historyTimeToLive) &&
        Objects.equals(this.startableInTasklist, calledProcessDefinitionDto.startableInTasklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, category, description, name, version, resource, deploymentId, diagram, suspended, tenantId, versionTag, historyTimeToLive, startableInTasklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalledProcessDefinitionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    diagram: ").append(toIndentedString(diagram)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    startableInTasklist: ").append(toIndentedString(startableInTasklist)).append("\n");
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
