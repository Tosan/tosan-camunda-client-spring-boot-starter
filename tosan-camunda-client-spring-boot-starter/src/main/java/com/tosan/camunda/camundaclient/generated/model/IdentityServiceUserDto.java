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
 * IdentityServiceUserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class IdentityServiceUserDto {

  private String id = null;

  private String firstName = null;

  private String lastName = null;

  private String displayName = null;

  public IdentityServiceUserDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the user.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IdentityServiceUserDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The firstname of the user.
   * @return firstName
  */
  
  @Schema(name = "firstName", description = "The firstname of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public IdentityServiceUserDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The lastname of the user.
   * @return lastName
  */
  
  @Schema(name = "lastName", description = "The lastname of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public IdentityServiceUserDto displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The displayName is generated from the id or firstName and lastName if available.
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "The displayName is generated from the id or firstName and lastName if available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityServiceUserDto identityServiceUserDto = (IdentityServiceUserDto) o;
    return Objects.equals(this.id, identityServiceUserDto.id) &&
        Objects.equals(this.firstName, identityServiceUserDto.firstName) &&
        Objects.equals(this.lastName, identityServiceUserDto.lastName) &&
        Objects.equals(this.displayName, identityServiceUserDto.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityServiceUserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

