package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.GroupQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A group instance query which defines a list of group instances
 */

@Schema(name = "GroupQueryDto", description = "A group instance query which defines a list of group instances")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class GroupQueryDto {

  private String id = null;

  @Valid
  private List<String> idIn;

  private String name = null;

  private String nameLike = null;

  private String type = null;

  private String member = null;

  private String memberOfTenant = null;

  @Valid
  private List<@Valid GroupQueryDtoSortingInner> sorting;

  public GroupQueryDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Filter by the id of the group.
   * @return id
  */
  
  @Schema(name = "id", description = "Filter by the id of the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GroupQueryDto idIn(List<String> idIn) {
    this.idIn = idIn;
    return this;
  }

  public GroupQueryDto addIdInItem(String idInItem) {
    if (this.idIn == null) {
      this.idIn = new ArrayList<>();
    }
    this.idIn.add(idInItem);
    return this;
  }

  /**
   * Filter by a JSON string array of group ids.
   * @return idIn
  */
  
  @Schema(name = "idIn", description = "Filter by a JSON string array of group ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idIn")
  public List<String> getIdIn() {
    return idIn;
  }

  public void setIdIn(List<String> idIn) {
    this.idIn = idIn;
  }

  public GroupQueryDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Filter by the name of the group.
   * @return name
  */
  
  @Schema(name = "name", description = "Filter by the name of the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GroupQueryDto nameLike(String nameLike) {
    this.nameLike = nameLike;
    return this;
  }

  /**
   * Filter by the name that the parameter is a substring of.
   * @return nameLike
  */
  
  @Schema(name = "nameLike", description = "Filter by the name that the parameter is a substring of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameLike")
  public String getNameLike() {
    return nameLike;
  }

  public void setNameLike(String nameLike) {
    this.nameLike = nameLike;
  }

  public GroupQueryDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Filter by the type of the group.
   * @return type
  */
  
  @Schema(name = "type", description = "Filter by the type of the group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GroupQueryDto member(String member) {
    this.member = member;
    return this;
  }

  /**
   * Only retrieve groups where the given user id is a member of.
   * @return member
  */
  
  @Schema(name = "member", description = "Only retrieve groups where the given user id is a member of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member")
  public String getMember() {
    return member;
  }

  public void setMember(String member) {
    this.member = member;
  }

  public GroupQueryDto memberOfTenant(String memberOfTenant) {
    this.memberOfTenant = memberOfTenant;
    return this;
  }

  /**
   * Only retrieve groups which are members of the given tenant.
   * @return memberOfTenant
  */
  
  @Schema(name = "memberOfTenant", description = "Only retrieve groups which are members of the given tenant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberOfTenant")
  public String getMemberOfTenant() {
    return memberOfTenant;
  }

  public void setMemberOfTenant(String memberOfTenant) {
    this.memberOfTenant = memberOfTenant;
  }

  public GroupQueryDto sorting(List<@Valid GroupQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public GroupQueryDto addSortingItem(GroupQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * Apply sorting of the result
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "Apply sorting of the result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid GroupQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid GroupQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupQueryDto groupQueryDto = (GroupQueryDto) o;
    return Objects.equals(this.id, groupQueryDto.id) &&
        Objects.equals(this.idIn, groupQueryDto.idIn) &&
        Objects.equals(this.name, groupQueryDto.name) &&
        Objects.equals(this.nameLike, groupQueryDto.nameLike) &&
        Objects.equals(this.type, groupQueryDto.type) &&
        Objects.equals(this.member, groupQueryDto.member) &&
        Objects.equals(this.memberOfTenant, groupQueryDto.memberOfTenant) &&
        Objects.equals(this.sorting, groupQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idIn, name, nameLike, type, member, memberOfTenant, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupQueryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    memberOfTenant: ").append(toIndentedString(memberOfTenant)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

