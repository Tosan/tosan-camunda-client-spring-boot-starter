package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * MissingAuthorizationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MissingAuthorizationDto   {
  @JsonProperty("permissionName")
  private String permissionName = null;

  @JsonProperty("resourceName")
  private String resourceName = null;

  @JsonProperty("resourceId")
  private String resourceId = null;

  public MissingAuthorizationDto permissionName(String permissionName) {
    this.permissionName = permissionName;
    return this;
  }

  /**
   * The permission name that the user is missing.
   * @return permissionName
   **/
  @Schema(description = "The permission name that the user is missing.")
  
    public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

  public MissingAuthorizationDto resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource that the user is missing permission for.
   * @return resourceName
   **/
  @Schema(description = "The name of the resource that the user is missing permission for.")
  
    public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public MissingAuthorizationDto resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The id of the resource that the user is missing permission for.
   * @return resourceId
   **/
  @Schema(description = "The id of the resource that the user is missing permission for.")
  
    public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingAuthorizationDto missingAuthorizationDto = (MissingAuthorizationDto) o;
    return Objects.equals(this.permissionName, missingAuthorizationDto.permissionName) &&
        Objects.equals(this.resourceName, missingAuthorizationDto.resourceName) &&
        Objects.equals(this.resourceId, missingAuthorizationDto.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionName, resourceName, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingAuthorizationDto {\n");
    
    sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
