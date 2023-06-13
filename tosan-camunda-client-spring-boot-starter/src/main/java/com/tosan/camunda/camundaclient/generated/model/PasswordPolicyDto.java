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
 * PasswordPolicyDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class PasswordPolicyDto {

  @Valid
  private List<@Valid PasswordPolicyRuleDto> rules;

  public PasswordPolicyDto rules(List<@Valid PasswordPolicyRuleDto> rules) {
    this.rules = rules;
    return this;
  }

  public PasswordPolicyDto addRulesItem(PasswordPolicyRuleDto rulesItem) {
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
    PasswordPolicyDto passwordPolicyDto = (PasswordPolicyDto) o;
    return Objects.equals(this.rules, passwordPolicyDto.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyDto {\n");
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

