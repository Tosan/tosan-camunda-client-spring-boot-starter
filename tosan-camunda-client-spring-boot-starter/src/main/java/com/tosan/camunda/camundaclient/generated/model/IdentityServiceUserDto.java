package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * IdentityServiceUserDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class IdentityServiceUserDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("displayName")
  private String displayName = null;

  public IdentityServiceUserDto id(String id) {
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

  public IdentityServiceUserDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The firstname of the user.
   * @return firstName
   **/
  @Schema(description = "The firstname of the user.")
  
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
   **/
  @Schema(description = "The lastname of the user.")
  
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
   **/
  @Schema(description = "The displayName is generated from the id or firstName and lastName if available.")
  
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
