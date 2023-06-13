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
 * AuthorizationCheckResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthorizationCheckResultDto {

  private String permissionName = null;

  private String resourceName = null;

  private String resourceId = null;

  private Boolean isAuthorized = null;

  public AuthorizationCheckResultDto permissionName(String permissionName) {
    this.permissionName = permissionName;
    return this;
  }

  /**
   * Name of the permission which was checked.
   * @return permissionName
  */
  
  @Schema(name = "permissionName", description = "Name of the permission which was checked.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissionName")
  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }

  public AuthorizationCheckResultDto resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource for which the permission check was performed.
   * @return resourceName
  */
  
  @Schema(name = "resourceName", description = "The name of the resource for which the permission check was performed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceName")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public AuthorizationCheckResultDto resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The id of the resource for which the permission check was performed.
   * @return resourceId
  */
  
  @Schema(name = "resourceId", description = "The id of the resource for which the permission check was performed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AuthorizationCheckResultDto isAuthorized(Boolean isAuthorized) {
    this.isAuthorized = isAuthorized;
    return this;
  }

  /**
   * True / false for isAuthorized.
   * @return isAuthorized
  */
  
  @Schema(name = "isAuthorized", description = "True / false for isAuthorized.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAuthorized")
  public Boolean getIsAuthorized() {
    return isAuthorized;
  }

  public void setIsAuthorized(Boolean isAuthorized) {
    this.isAuthorized = isAuthorized;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationCheckResultDto authorizationCheckResultDto = (AuthorizationCheckResultDto) o;
    return Objects.equals(this.permissionName, authorizationCheckResultDto.permissionName) &&
        Objects.equals(this.resourceName, authorizationCheckResultDto.resourceName) &&
        Objects.equals(this.resourceId, authorizationCheckResultDto.resourceId) &&
        Objects.equals(this.isAuthorized, authorizationCheckResultDto.isAuthorized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionName, resourceName, resourceId, isAuthorized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCheckResultDto {\n");
    sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
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

