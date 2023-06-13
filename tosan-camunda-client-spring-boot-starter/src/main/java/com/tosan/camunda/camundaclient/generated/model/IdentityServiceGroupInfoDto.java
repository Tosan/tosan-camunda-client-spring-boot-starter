package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.IdentityServiceGroupDto;
import com.tosan.camunda.camundaclient.generated.model.IdentityServiceUserDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * IdentityServiceGroupInfoDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class IdentityServiceGroupInfoDto {

  @Valid
  private List<@Valid IdentityServiceGroupDto> groups;

  @Valid
  private List<@Valid IdentityServiceUserDto> groupUsers;

  public IdentityServiceGroupInfoDto groups(List<@Valid IdentityServiceGroupDto> groups) {
    this.groups = groups;
    return this;
  }

  public IdentityServiceGroupInfoDto addGroupsItem(IdentityServiceGroupDto groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * An array of group objects.
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", description = "An array of group objects.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid IdentityServiceGroupDto> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid IdentityServiceGroupDto> groups) {
    this.groups = groups;
  }

  public IdentityServiceGroupInfoDto groupUsers(List<@Valid IdentityServiceUserDto> groupUsers) {
    this.groupUsers = groupUsers;
    return this;
  }

  public IdentityServiceGroupInfoDto addGroupUsersItem(IdentityServiceUserDto groupUsersItem) {
    if (this.groupUsers == null) {
      this.groupUsers = new ArrayList<>();
    }
    this.groupUsers.add(groupUsersItem);
    return this;
  }

  /**
   * An array that contains all users that are member in one of the groups.
   * @return groupUsers
  */
  @Valid 
  @Schema(name = "groupUsers", description = "An array that contains all users that are member in one of the groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupUsers")
  public List<@Valid IdentityServiceUserDto> getGroupUsers() {
    return groupUsers;
  }

  public void setGroupUsers(List<@Valid IdentityServiceUserDto> groupUsers) {
    this.groupUsers = groupUsers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityServiceGroupInfoDto identityServiceGroupInfoDto = (IdentityServiceGroupInfoDto) o;
    return Objects.equals(this.groups, identityServiceGroupInfoDto.groups) &&
        Objects.equals(this.groupUsers, identityServiceGroupInfoDto.groupUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, groupUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityServiceGroupInfoDto {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    groupUsers: ").append(toIndentedString(groupUsers)).append("\n");
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

