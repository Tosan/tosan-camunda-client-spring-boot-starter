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
 * IdentityLinkDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class IdentityLinkDto {

  private String userId = null;

  private String groupId = null;

  private String type = null;

  /**
   * Default constructor
   * @deprecated Use {@link IdentityLinkDto#IdentityLinkDto(String)}
   */
  @Deprecated
  public IdentityLinkDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IdentityLinkDto(String type) {
    this.type = type;
  }

  public IdentityLinkDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user participating in this link. Either `userId` or `groupId` is set.
   * @return userId
  */
  
  @Schema(name = "userId", description = "The id of the user participating in this link. Either `userId` or `groupId` is set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public IdentityLinkDto groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The id of the group participating in this link. Either `groupId` or `userId` is set.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The id of the group participating in this link. Either `groupId` or `userId` is set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public IdentityLinkDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the identity link. The value of the this property can be user-defined. The Process Engine provides three pre-defined Identity Link `type`s:  * `candidate` * `assignee` - reserved for the task assignee * `owner` - reserved for the task owner  **Note**: When adding or removing an Identity Link, the `type` property must be defined.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the identity link. The value of the this property can be user-defined. The Process Engine provides three pre-defined Identity Link `type`s:  * `candidate` * `assignee` - reserved for the task assignee * `owner` - reserved for the task owner  **Note**: When adding or removing an Identity Link, the `type` property must be defined.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityLinkDto identityLinkDto = (IdentityLinkDto) o;
    return Objects.equals(this.userId, identityLinkDto.userId) &&
        Objects.equals(this.groupId, identityLinkDto.groupId) &&
        Objects.equals(this.type, identityLinkDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, groupId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityLinkDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

