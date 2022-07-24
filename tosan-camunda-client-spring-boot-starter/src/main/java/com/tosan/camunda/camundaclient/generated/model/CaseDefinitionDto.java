package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * CaseDefinitionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CaseDefinitionDto   {
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

  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  public CaseDefinitionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the case definition
   * @return id
   **/
  @Schema(description = "The id of the case definition")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CaseDefinitionDto key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the case definition, i.e., the id of the CMMN 2.0 XML case definition.
   * @return key
   **/
  @Schema(description = "The key of the case definition, i.e., the id of the CMMN 2.0 XML case definition.")
  
    public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CaseDefinitionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The category of the case definition.
   * @return category
   **/
  @Schema(description = "The category of the case definition.")
  
    public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CaseDefinitionDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the case definition.
   * @return name
   **/
  @Schema(description = "The name of the case definition.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CaseDefinitionDto version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the case definition that the engine assigned to it.
   * @return version
   **/
  @Schema(description = "The version of the case definition that the engine assigned to it.")
  
    public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public CaseDefinitionDto resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The file name of the case definition.
   * @return resource
   **/
  @Schema(description = "The file name of the case definition.")
  
    public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public CaseDefinitionDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The deployment id of the case definition.
   * @return deploymentId
   **/
  @Schema(description = "The deployment id of the case definition.")
  
    public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public CaseDefinitionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the case definition.
   * @return tenantId
   **/
  @Schema(description = "The tenant id of the case definition.")
  
    public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CaseDefinitionDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * History time to live value of the case definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).
   * minimum: 0
   * @return historyTimeToLive
   **/
  @Schema(description = "History time to live value of the case definition. Is used within [History cleanup](https://docs.camunda.org/manual/7.17/user-guide/process-engine/history/#history-cleanup).")
  
  @Min(0)  public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseDefinitionDto caseDefinitionDto = (CaseDefinitionDto) o;
    return Objects.equals(this.id, caseDefinitionDto.id) &&
        Objects.equals(this.key, caseDefinitionDto.key) &&
        Objects.equals(this.category, caseDefinitionDto.category) &&
        Objects.equals(this.name, caseDefinitionDto.name) &&
        Objects.equals(this.version, caseDefinitionDto.version) &&
        Objects.equals(this.resource, caseDefinitionDto.resource) &&
        Objects.equals(this.deploymentId, caseDefinitionDto.deploymentId) &&
        Objects.equals(this.tenantId, caseDefinitionDto.tenantId) &&
        Objects.equals(this.historyTimeToLive, caseDefinitionDto.historyTimeToLive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, category, name, version, resource, deploymentId, tenantId, historyTimeToLive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseDefinitionDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
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
