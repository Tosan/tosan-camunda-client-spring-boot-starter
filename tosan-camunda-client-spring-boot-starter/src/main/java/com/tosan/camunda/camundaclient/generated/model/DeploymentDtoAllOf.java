package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeploymentDtoAllOf
 */

@JsonTypeName("DeploymentDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeploymentDtoAllOf {

  private String id = null;

  private String tenantId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deploymentTime = null;

  private String source = null;

  private String name = null;

  public DeploymentDtoAllOf id(String id) {
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

  public DeploymentDtoAllOf tenantId(String tenantId) {
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

  public DeploymentDtoAllOf deploymentTime(OffsetDateTime deploymentTime) {
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

  public DeploymentDtoAllOf source(String source) {
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

  public DeploymentDtoAllOf name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDtoAllOf deploymentDtoAllOf = (DeploymentDtoAllOf) o;
    return Objects.equals(this.id, deploymentDtoAllOf.id) &&
        Objects.equals(this.tenantId, deploymentDtoAllOf.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDtoAllOf.deploymentTime) &&
        Objects.equals(this.source, deploymentDtoAllOf.source) &&
        Objects.equals(this.name, deploymentDtoAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

