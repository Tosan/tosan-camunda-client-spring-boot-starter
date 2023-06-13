package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckPasswordPolicyRuleDtoAllOf
 */

@JsonTypeName("CheckPasswordPolicyRuleDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CheckPasswordPolicyRuleDtoAllOf {

  private Boolean valid = null;

  public CheckPasswordPolicyRuleDtoAllOf valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * `true` if the password is compliant with this rule, otherwise `false`.
   * @return valid
  */
  
  @Schema(name = "valid", description = "`true` if the password is compliant with this rule, otherwise `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPasswordPolicyRuleDtoAllOf checkPasswordPolicyRuleDtoAllOf = (CheckPasswordPolicyRuleDtoAllOf) o;
    return Objects.equals(this.valid, checkPasswordPolicyRuleDtoAllOf.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPasswordPolicyRuleDtoAllOf {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

