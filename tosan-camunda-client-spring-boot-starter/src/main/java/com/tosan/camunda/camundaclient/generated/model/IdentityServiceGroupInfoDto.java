package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * IdentityServiceGroupInfoDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class IdentityServiceGroupInfoDto   {
  @JsonProperty("groups")
  @Valid
  private List<IdentityServiceGroupDto> groups = null;

  @JsonProperty("groupUsers")
  @Valid
  private List<IdentityServiceUserDto> groupUsers = null;

  public IdentityServiceGroupInfoDto groups(List<IdentityServiceGroupDto> groups) {
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
   **/
  @Schema(description = "An array of group objects.")
      @Valid
    public List<IdentityServiceGroupDto> getGroups() {
    return groups;
  }

  public void setGroups(List<IdentityServiceGroupDto> groups) {
    this.groups = groups;
  }

  public IdentityServiceGroupInfoDto groupUsers(List<IdentityServiceUserDto> groupUsers) {
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
   **/
  @Schema(description = "An array that contains all users that are member in one of the groups.")
      @Valid
    public List<IdentityServiceUserDto> getGroupUsers() {
    return groupUsers;
  }

  public void setGroupUsers(List<IdentityServiceUserDto> groupUsers) {
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
