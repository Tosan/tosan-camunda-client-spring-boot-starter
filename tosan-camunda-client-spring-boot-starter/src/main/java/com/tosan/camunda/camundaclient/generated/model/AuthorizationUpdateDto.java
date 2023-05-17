package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * AuthorizationUpdateDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class AuthorizationUpdateDto   {
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

  public AuthorizationUpdateDto permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AuthorizationUpdateDto addPermissionsItem(String permissionsItem) {
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

  public AuthorizationUpdateDto userId(String userId) {
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

  public AuthorizationUpdateDto groupId(String groupId) {
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

  public AuthorizationUpdateDto resourceType(Integer resourceType) {
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

  public AuthorizationUpdateDto resourceId(String resourceId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationUpdateDto authorizationUpdateDto = (AuthorizationUpdateDto) o;
    return Objects.equals(this.permissions, authorizationUpdateDto.permissions) &&
        Objects.equals(this.userId, authorizationUpdateDto.userId) &&
        Objects.equals(this.groupId, authorizationUpdateDto.groupId) &&
        Objects.equals(this.resourceType, authorizationUpdateDto.resourceType) &&
        Objects.equals(this.resourceId, authorizationUpdateDto.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, userId, groupId, resourceType, resourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationUpdateDto {\n");
    
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
