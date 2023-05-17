package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * A JSON object with the following properties:
 */
@Schema(description = "A JSON object with the following properties:")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class RedeploymentDto   {
  @JsonProperty("resourceIds")
  @Valid
  private List<String> resourceIds = null;

  @JsonProperty("resourceNames")
  @Valid
  private List<String> resourceNames = null;

  @JsonProperty("source")
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
   **/
  @Schema(description = "A list of deployment resource ids to re-deploy.")
  
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
   **/
  @Schema(description = "A list of deployment resource names to re-deploy.")
  
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
   **/
  @Schema(description = "Sets the source of the deployment.")
  
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
