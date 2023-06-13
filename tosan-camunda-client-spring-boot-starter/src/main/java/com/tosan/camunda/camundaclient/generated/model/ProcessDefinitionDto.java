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
 * ProcessDefinitionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessDefinitionDto {

  private String id = null;

  private String key = null;

  private String category = null;

  private String description = null;

  private String name = null;

  private Integer version = null;

  private String resource = null;

  private String deploymentId = null;

  private String diagram = null;

  private Boolean suspended = null;

  private String tenantId = null;

  private String versionTag = null;

  private Integer historyTimeToLive = null;

  private Boolean startableInTasklist = null;

  public ProcessDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process definition
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the process definition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessDefinitionDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the process definition, i.e., the id of the BPMN 2.0 XML process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProcessDefinitionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the process definition.
   * @return category
  */
  
  @Schema(name = "category", description = "The category of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ProcessDefinitionDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the process definition.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProcessDefinitionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the process definition.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessDefinitionDto version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the process definition that the engine assigned to it.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of the process definition that the engine assigned to it.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public ProcessDefinitionDto resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The file name of the process definition.
   * @return resource
  */
  
  @Schema(name = "resource", description = "The file name of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public ProcessDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment id of the process definition.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "The deployment id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public ProcessDefinitionDto diagram(String diagram) {
    this.diagram = diagram;
    return this;
  }

  /**
   * The file name of the process definition diagram, if it exists.
   * @return diagram
  */
  
  @Schema(name = "diagram", description = "The file name of the process definition diagram, if it exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diagram")
  public String getDiagram() {
    return diagram;
  }

  public void setDiagram(String diagram) {
    this.diagram = diagram;
  }

  public ProcessDefinitionDto suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A flag indicating whether the definition is suspended or not.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A flag indicating whether the definition is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the process definition.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ProcessDefinitionDto versionTag(String versionTag) {
    this.versionTag = versionTag;
    return this;
  }

  /**
   * The version tag of the process definition.
   * @return versionTag
  */
  
  @Schema(name = "versionTag", description = "The version tag of the process definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionTag")
  public String getVersionTag() {
    return versionTag;
  }

  public void setVersionTag(String versionTag) {
    this.versionTag = versionTag;
  }

  public ProcessDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
  */
  @Min(0) 
  @Schema(name = "historyTimeToLive", description = "History time to live value of the process definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historyTimeToLive")
  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public ProcessDefinitionDto startableInTasklist(Boolean startableInTasklist) {
    this.startableInTasklist = startableInTasklist;
    return this;
  }

  /**
   * A flag indicating whether the process definition is startable in Tasklist or not.
   * @return startableInTasklist
  */
  
  @Schema(name = "startableInTasklist", description = "A flag indicating whether the process definition is startable in Tasklist or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startableInTasklist")
  public Boolean getStartableInTasklist() {
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
    ProcessDefinitionDto processDefinitionDto = (ProcessDefinitionDto) o;
    return Objects.equals(this.id, processDefinitionDto.id) &&
        Objects.equals(this.key, processDefinitionDto.key) &&
        Objects.equals(this.category, processDefinitionDto.category) &&
        Objects.equals(this.description, processDefinitionDto.description) &&
        Objects.equals(this.name, processDefinitionDto.name) &&
        Objects.equals(this.version, processDefinitionDto.version) &&
        Objects.equals(this.resource, processDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, processDefinitionDto.deploymentId) &&
        Objects.equals(this.diagram, processDefinitionDto.diagram) &&
        Objects.equals(this.suspended, processDefinitionDto.suspended) &&
        Objects.equals(this.tenantId, processDefinitionDto.tenantId) &&
        Objects.equals(this.versionTag, processDefinitionDto.versionTag) &&
        Objects.equals(this.historyTimeToLive, processDefinitionDto.historyTimeToLive) &&
        Objects.equals(this.startableInTasklist, processDefinitionDto.startableInTasklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, category, description, name, version, resource, deploymentId, diagram, suspended, tenantId, versionTag, historyTimeToLive, startableInTasklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionDto {\n");
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

