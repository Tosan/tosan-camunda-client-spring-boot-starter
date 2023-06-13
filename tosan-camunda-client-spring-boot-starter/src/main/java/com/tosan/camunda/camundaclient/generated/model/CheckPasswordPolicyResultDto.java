package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.PasswordPolicyRuleDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CheckPasswordPolicyResultDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CheckPasswordPolicyResultDto {

  private Boolean valid = null;

  @Valid
  private List<@Valid PasswordPolicyRuleDto> rules;

  public CheckPasswordPolicyResultDto valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * `true` if the password is compliant with the policy, otherwise `false`.
   * @return valid
  */
  
  @Schema(name = "valid", description = "`true` if the password is compliant with the policy, otherwise `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public CheckPasswordPolicyResultDto rules(List<@Valid PasswordPolicyRuleDto> rules) {
    this.rules = rules;
    return this;
  }

  public CheckPasswordPolicyResultDto addRulesItem(PasswordPolicyRuleDto rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * An array of password policy rules. Each element of the array is representing one rule of the policy.
   * @return rules
  */
  @Valid 
  @Schema(name = "rules", description = "An array of password policy rules. Each element of the array is representing one rule of the policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rules")
  public List<@Valid PasswordPolicyRuleDto> getRules() {
    return rules;
  }

  public void setRules(List<@Valid PasswordPolicyRuleDto> rules) {
    this.rules = rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckPasswordPolicyResultDto checkPasswordPolicyResultDto = (CheckPasswordPolicyResultDto) o;
    return Objects.equals(this.valid, checkPasswordPolicyResultDto.valid) &&
        Objects.equals(this.rules, checkPasswordPolicyResultDto.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPasswordPolicyResultDto {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

