package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * UserProfileDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class UserProfileDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  public UserProfileDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the user.
   * @return id
   **/
  @Schema(description = "The id of the user.")
  
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
   **/
  @Schema(description = "The first name of the user.")
  
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
   **/
  @Schema(description = "The first name of the user.")
  
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
   **/
  @Schema(description = "The email of the user.")
  
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
