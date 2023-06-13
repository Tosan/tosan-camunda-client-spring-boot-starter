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
 * UserCredentialsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class UserCredentialsDto {

  private String password = null;

  private String authenticatedUserPassword = null;

  public UserCredentialsDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The users new password.
   * @return password
  */
  
  @Schema(name = "password", description = "The users new password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserCredentialsDto authenticatedUserPassword(String authenticatedUserPassword) {
    this.authenticatedUserPassword = authenticatedUserPassword;
    return this;
  }

  /**
   * The password of the authenticated user who changes the password of the user (i.e., the user with passed id as path parameter).
   * @return authenticatedUserPassword
  */
  
  @Schema(name = "authenticatedUserPassword", description = "The password of the authenticated user who changes the password of the user (i.e., the user with passed id as path parameter).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticatedUserPassword")
  public String getAuthenticatedUserPassword() {
    return authenticatedUserPassword;
  }

  public void setAuthenticatedUserPassword(String authenticatedUserPassword) {
    this.authenticatedUserPassword = authenticatedUserPassword;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCredentialsDto userCredentialsDto = (UserCredentialsDto) o;
    return Objects.equals(this.password, userCredentialsDto.password) &&
        Objects.equals(this.authenticatedUserPassword, userCredentialsDto.authenticatedUserPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, authenticatedUserPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCredentialsDto {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authenticatedUserPassword: ").append(toIndentedString(authenticatedUserPassword)).append("\n");
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

