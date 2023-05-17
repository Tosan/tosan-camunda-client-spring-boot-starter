package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * AuthorizationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class AuthorizationDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("permissions")
  @Valid
  private List<String> permissions = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("groupId")
  private String groupId = null;

  @JsonProperty("resourceType")
  private Integer resourceType = null;

  @JsonProperty("resourceId")
  private String resourceId = null;

  @JsonProperty("removalTime")
  private OffsetDateTime removalTime = null;

  @JsonProperty("rootProcessInstanceId")
  private String rootProcessInstanceId = null;

  public AuthorizationDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the authorization.
   * @return id
   **/
  @Schema(description = "The id of the authorization.")
  
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
   **/
  @Schema(description = "The type of the authorization (0=global, 1=grant, 2=revoke). See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service.md#authorization-type) for more information about authorization types.")
  
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
   **/
  @Schema(description = "An array of Strings holding the permissions provided by this authorization.")
  
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
   **/
  @Schema(description = "The id of the user this authorization has been created for. The value `*` represents a global authorization ranging over all users.")
  
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
   **/
  @Schema(description = "The id of the group this authorization has been created for.")
  
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
   **/
  @Schema(description = "An integer representing the resource type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/authorization-service/#resources) for a list of integer representations of resource types.")
  
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
   **/
  @Schema(description = "The resource Id. The value `*` represents an authorization ranging over all instances of a resource.")
  
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
   **/
  @Schema(description = "The removal time indicates the date a historic instance authorization is cleaned up. A removal time can only be assigned to a historic instance authorization. Can be `null` when not related to a historic instance resource or when the removal time strategy is end and the root process instance is not finished. Default format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`.")
  
    @Valid
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
   **/
  @Schema(description = "The process instance id of the root process instance the historic instance authorization is related to. Can be `null` if not related to a historic instance resource.")
  
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
