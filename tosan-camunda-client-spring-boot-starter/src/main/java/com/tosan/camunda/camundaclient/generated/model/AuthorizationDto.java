package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * AuthorizationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthorizationDto {

  private String id = null;

  private Integer type = null;

  @Valid
  private List<String> permissions;

  private String userId = null;

  private String groupId = null;

  private Integer resourceType = null;

  private String resourceId = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime removalTime = null;

  private String rootProcessInstanceId = null;

  public AuthorizationDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the authorization.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the authorization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuthorizationDto type(Integer type) {
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

  public AuthorizationDto permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AuthorizationDto addPermissionsItem(String permissionsItem) {
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

  public AuthorizationDto userId(String userId) {
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

  public AuthorizationDto groupId(String groupId) {
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

  public AuthorizationDto resourceType(Integer resourceType) {
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

  public AuthorizationDto resourceId(String resourceId) {
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

  public AuthorizationDto removalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
    return this;
  }

  /**
   * The removal time indicates the date a historic instance authorization is cleaned up. A removal time can only be assigned to a historic instance authorization. Can be `null` when not related to a historic instance resource or when the removal time strategy is end and the root process instance is not finished. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.
   * @return removalTime
  */
  @Valid 
  @Schema(name = "removalTime", description = "The removal time indicates the date a historic instance authorization is cleaned up. A removal time can only be assigned to a historic instance authorization. Can be `null` when not related to a historic instance resource or when the removal time strategy is end and the root process instance is not finished. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removalTime")
  public OffsetDateTime getRemovalTime() {
    return removalTime;
  }

  public void setRemovalTime(OffsetDateTime removalTime) {
    this.removalTime = removalTime;
  }

  public AuthorizationDto rootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
    return this;
  }

  /**
   * The process instance id of the root process instance the historic instance authorization is related to. Can be `null` if not related to a historic instance resource.
   * @return rootProcessInstanceId
  */
  
  @Schema(name = "rootProcessInstanceId", description = "The process instance id of the root process instance the historic instance authorization is related to. Can be `null` if not related to a historic instance resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootProcessInstanceId")
  public String getRootProcessInstanceId() {
    return rootProcessInstanceId;
  }

  public void setRootProcessInstanceId(String rootProcessInstanceId) {
    this.rootProcessInstanceId = rootProcessInstanceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationDto authorizationDto = (AuthorizationDto) o;
    return Objects.equals(this.id, authorizationDto.id) &&
        Objects.equals(this.type, authorizationDto.type) &&
        Objects.equals(this.permissions, authorizationDto.permissions) &&
        Objects.equals(this.userId, authorizationDto.userId) &&
        Objects.equals(this.groupId, authorizationDto.groupId) &&
        Objects.equals(this.resourceType, authorizationDto.resourceType) &&
        Objects.equals(this.resourceId, authorizationDto.resourceId) &&
        Objects.equals(this.removalTime, authorizationDto.removalTime) &&
        Objects.equals(this.rootProcessInstanceId, authorizationDto.rootProcessInstanceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, permissions, userId, groupId, resourceType, resourceId, removalTime, rootProcessInstanceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    removalTime: ").append(toIndentedString(removalTime)).append("\n");
    sb.append("    rootProcessInstanceId: ").append(toIndentedString(rootProcessInstanceId)).append("\n");
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

