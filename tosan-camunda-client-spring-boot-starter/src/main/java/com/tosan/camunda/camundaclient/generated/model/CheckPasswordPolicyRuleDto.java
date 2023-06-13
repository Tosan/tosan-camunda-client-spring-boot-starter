package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckPasswordPolicyRuleDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CheckPasswordPolicyRuleDto {

  private Boolean valid = null;

  private String placeholder = null;

  @Valid
  private Map<String, String> parameter = new HashMap<>();

  public CheckPasswordPolicyRuleDto valid(Boolean valid) {
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

  public CheckPasswordPolicyRuleDto placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * A placeholder string that contains the name of a password policy rule.
   * @return placeholder
  */
  
  @Schema(name = "placeholder", description = "A placeholder string that contains the name of a password policy rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placeholder")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public CheckPasswordPolicyRuleDto parameter(Map<String, String> parameter) {
    this.parameter = parameter;
    return this;
  }

  public CheckPasswordPolicyRuleDto putParameterItem(String key, String parameterItem) {
    if (this.parameter == null) {
      this.parameter = new HashMap<>();
    }
    this.parameter.put(key, parameterItem);
    return this;
  }

  /**
   * A map that describes the characteristics of a password policy rule, such as the minimum number of digits.
   * @return parameter
  */
  
  @Schema(name = "parameter", description = "A map that describes the characteristics of a password policy rule, such as the minimum number of digits.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameter")
  public Map<String, String> getParameter() {
    return parameter;
  }

  public void setParameter(Map<String, String> parameter) {
    this.parameter = parameter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPasswordPolicyRuleDto checkPasswordPolicyRuleDto = (CheckPasswordPolicyRuleDto) o;
    return Objects.equals(this.valid, checkPasswordPolicyRuleDto.valid) &&
        Objects.equals(this.placeholder, checkPasswordPolicyRuleDto.placeholder) &&
        Objects.equals(this.parameter, checkPasswordPolicyRuleDto.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, placeholder, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPasswordPolicyRuleDto {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

