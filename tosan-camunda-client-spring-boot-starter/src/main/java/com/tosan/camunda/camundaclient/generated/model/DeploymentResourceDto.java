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
 * A JSON object corresponding to the &#x60;Resource&#x60; interface in the engine. Its properties are as follows:
 */

@Schema(name = "DeploymentResourceDto", description = "A JSON object corresponding to the `Resource` interface in the engine. Its properties are as follows:")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class DeploymentResourceDto {

  private String id = null;

  private String name = null;

  private String deploymentId = null;

  public DeploymentResourceDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the deployment resource.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the deployment resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeploymentResourceDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the deployment resource
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the deployment resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentResourceDto deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The id of the deployment.
   * @return deploymentId
  */
  
  @Schema(name = "deploymentId", description = "The id of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentId")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResourceDto deploymentResourceDto = (DeploymentResourceDto) o;
    return Objects.equals(this.id, deploymentResourceDto.id) &&
        Objects.equals(this.name, deploymentResourceDto.name) &&
        Objects.equals(this.deploymentId, deploymentResourceDto.deploymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deploymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResourceDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
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

