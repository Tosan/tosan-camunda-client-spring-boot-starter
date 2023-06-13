package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.AtomLink;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeploymentDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeploymentDto {

  private String id = null;

  private String tenantId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deploymentTime = null;

  private String source = null;

  private String name = null;

  @Valid
  private List<@Valid AtomLink> links;

  public DeploymentDto id(String id) {
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

  public DeploymentDto tenantId(String tenantId) {
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

  public DeploymentDto deploymentTime(OffsetDateTime deploymentTime) {
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

  public DeploymentDto source(String source) {
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

  public DeploymentDto name(String name) {
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

  public DeploymentDto links(List<@Valid AtomLink> links) {
    this.links = links;
    return this;
  }

  public DeploymentDto addLinksItem(AtomLink linksItem) {
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
    DeploymentDto deploymentDto = (DeploymentDto) o;
    return Objects.equals(this.id, deploymentDto.id) &&
        Objects.equals(this.tenantId, deploymentDto.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDto.deploymentTime) &&
        Objects.equals(this.source, deploymentDto.source) &&
        Objects.equals(this.name, deploymentDto.name) &&
        Objects.equals(this.links, deploymentDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDto {\n");
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

