package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * PasswordPolicyRequestDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class PasswordPolicyRequestDto   {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("profile")
  private UserProfileDto profile = null;

  public PasswordPolicyRequestDto password(String password) {
    this.password = password;
    return this;
  }

  /**
   * The candidate password to be check against the password policy.
   * @return password
   **/
  @Schema(description = "The candidate password to be check against the password policy.")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public PasswordPolicyRequestDto profile(UserProfileDto profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
   **/
  @Schema(description = "")
  
    @Valid
    public UserProfileDto getProfile() {
    return profile;
  }

  public void setProfile(UserProfileDto profile) {
    this.profile = profile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordPolicyRequestDto passwordPolicyRequestDto = (PasswordPolicyRequestDto) o;
    return Objects.equals(this.password, passwordPolicyRequestDto.password) &&
        Objects.equals(this.profile, passwordPolicyRequestDto.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRequestDto {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
