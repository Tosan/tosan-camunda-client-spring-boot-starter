package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * CheckPasswordPolicyResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CheckPasswordPolicyResultDto   {
  @JsonProperty("rules")
  @Valid
  private List<PasswordPolicyRuleDto> rules = null;

  public CheckPasswordPolicyResultDto rules(List<PasswordPolicyRuleDto> rules) {
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
   **/
  @Schema(description = "An array of password policy rules. Each element of the array is representing one rule of the policy.")
      @Valid
    public List<PasswordPolicyRuleDto> getRules() {
    return rules;
  }

  public void setRules(List<PasswordPolicyRuleDto> rules) {
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
    return Objects.equals(this.rules, checkPasswordPolicyResultDto.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckPasswordPolicyResultDto {\n");
    
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
