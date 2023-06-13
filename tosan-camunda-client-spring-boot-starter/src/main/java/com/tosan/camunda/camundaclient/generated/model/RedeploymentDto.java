package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A JSON object with the following properties:
 */

@Schema(name = "RedeploymentDto", description = "A JSON object with the following properties:")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class RedeploymentDto {

  @Valid
  private List<String> resourceIds;

  @Valid
  private List<String> resourceNames;

  private String source = null;

  public RedeploymentDto resourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

  public RedeploymentDto addResourceIdsItem(String resourceIdsItem) {
    if (this.resourceIds == null) {
      this.resourceIds = new ArrayList<>();
    }
    this.resourceIds.add(resourceIdsItem);
    return this;
  }

  /**
   * A list of deployment resource ids to re-deploy.
   * @return resourceIds
  */
  
  @Schema(name = "resourceIds", description = "A list of deployment resource ids to re-deploy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceIds")
  public List<String> getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(List<String> resourceIds) {
    this.resourceIds = resourceIds;
  }

  public RedeploymentDto resourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
    return this;
  }

  public RedeploymentDto addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

  /**
   * A list of deployment resource names to re-deploy.
   * @return resourceNames
  */
  
  @Schema(name = "resourceNames", description = "A list of deployment resource names to re-deploy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceNames")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }

  public RedeploymentDto source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Sets the source of the deployment.
   * @return source
  */
  
  @Schema(name = "source", description = "Sets the source of the deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeploymentDto redeploymentDto = (RedeploymentDto) o;
    return Objects.equals(this.resourceIds, redeploymentDto.resourceIds) &&
        Objects.equals(this.resourceNames, redeploymentDto.resourceNames) &&
        Objects.equals(this.source, redeploymentDto.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceIds, resourceNames, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeploymentDto {\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

