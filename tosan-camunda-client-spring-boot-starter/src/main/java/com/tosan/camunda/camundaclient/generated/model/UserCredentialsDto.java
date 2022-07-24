package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * UserCredentialsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class UserCredentialsDto   {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("authenticatedUserPassword")
  private String authenticatedUserPassword = null;

  public UserCredentialsDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The users new password.
   * @return password
   **/
  @Schema(description = "The users new password.")
  
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
   **/
  @Schema(description = "The password of the authenticated user who changes the password of the user (i.e., the user with passed id as path parameter).")
  
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
