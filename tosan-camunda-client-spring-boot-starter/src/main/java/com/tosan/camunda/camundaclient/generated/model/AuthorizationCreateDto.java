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
 * AuthorizationCreateDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthorizationCreateDto {

  private Integer type = null;

  @Valid
  private List<String> permissions;

  private String userId = null;

  private String groupId = null;

  private Integer resourceType = null;

  private String resourceId = null;

  public AuthorizationCreateDto type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the authorization (0=global, 1=grant, 2=revoke). See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service.md#authorization-type) for more information about authorization types.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the authorization (0=global, 1=grant, 2=revoke). See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service.md#authorization-type) for more information about authorization types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public AuthorizationCreateDto permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AuthorizationCreateDto addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * An array of Strings holding the permissions provided by this authorization.
   * @return permissions
  */
  
  @Schema(name = "permissions", description = "An array of Strings holding the permissions provided by this authorization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public AuthorizationCreateDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user this authorization has been created for. The value `*` represents a global authorization ranging over all users.
   * @return userId
  */
  
  @Schema(name = "userId", description = "The id of the user this authorization has been created for. The value `*` represents a global authorization ranging over all users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AuthorizationCreateDto groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The id of the group this authorization has been created for.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The id of the group this authorization has been created for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public AuthorizationCreateDto resourceType(Integer resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * An integer representing the resource type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types.
   * @return resourceType
  */
  
  @Schema(name = "resourceType", description = "An integer representing the resource type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType")
  public Integer getResourceType() {
    return resourceType;
  }

  public void setResourceType(Integer resourceType) {
    this.resourceType = resourceType;
  }

  public AuthorizationCreateDto resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * The resource Id. The value `*` represents an authorization ranging over all instances of a resource.
   * @return resourceId
  */
  
  @Schema(name = "resourceId", description = "The resource Id. The value `*` represents an authorization ranging over all instances of a resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
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
    AuthorizationCreateDto authorizationCreateDto = (AuthorizationCreateDto) o;
    return Objects.equals(this.type, authorizationCreateDto.type) &&
        Objects.equals(this.permissions, authorizationCreateDto.permissions) &&
        Objects.equals(this.userId, authorizationCreateDto.userId) &&
        Objects.equals(this.groupId, authorizationCreateDto.groupId) &&
        Objects.equals(this.resourceType, authorizationCreateDto.resourceType) &&
        Objects.equals(this.resourceId, authorizationCreateDto.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, permissions, userId, groupId, resourceType, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationCreateDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

