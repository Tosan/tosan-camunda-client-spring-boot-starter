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
 * UserProfileDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class UserProfileDto {

  private String id = null;

  private String firstName = null;

  private String lastName = null;

  private String email = null;

  public UserProfileDto id(String id) {
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

  public UserProfileDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the user.
   * @return firstName
  */
  
  @Schema(name = "firstName", description = "The first name of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserProfileDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The first name of the user.
   * @return lastName
  */
  
  @Schema(name = "lastName", description = "The first name of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserProfileDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user.
   * @return email
  */
  
  @Schema(name = "email", description = "The email of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileDto userProfileDto = (UserProfileDto) o;
    return Objects.equals(this.id, userProfileDto.id) &&
        Objects.equals(this.firstName, userProfileDto.firstName) &&
        Objects.equals(this.lastName, userProfileDto.lastName) &&
        Objects.equals(this.email, userProfileDto.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

