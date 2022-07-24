package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Describes a rule of a password policy.
 */
@Schema(description = "Describes a rule of a password policy.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class PasswordPolicyRuleDto   {
  @JsonProperty("placeholder")
  private String placeholder = null;

  @JsonProperty("parameter")
  @Valid
  private Map<String, String> parameter = null;

  public PasswordPolicyRuleDto placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * A placeholder string that contains the name of a password policy rule.
   * @return placeholder
   **/
  @Schema(description = "A placeholder string that contains the name of a password policy rule.")
  
    public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public PasswordPolicyRuleDto parameter(Map<String, String> parameter) {
    this.parameter = parameter;
    return this;
  }

  public PasswordPolicyRuleDto putParameterItem(String key, String parameterItem) {
    if (this.parameter == null) {
      this.parameter = new HashMap<>();
    }
    this.parameter.put(key, parameterItem);
    return this;
  }

  /**
   * A map that describes the characteristics of a password policy rule, such as the minimum number of digits.
   * @return parameter
   **/
  @Schema(description = "A map that describes the characteristics of a password policy rule, such as the minimum number of digits.")
  
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
    PasswordPolicyRuleDto passwordPolicyRuleDto = (PasswordPolicyRuleDto) o;
    return Objects.equals(this.placeholder, passwordPolicyRuleDto.placeholder) &&
        Objects.equals(this.parameter, passwordPolicyRuleDto.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeholder, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordPolicyRuleDto {\n");
    
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
