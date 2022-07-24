package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * ConditionQueryParameterDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ConditionQueryParameterDto   {
  /**
   * Comparison operator to be used. `notLike` is not supported by all endpoints.
   */
  public enum OperatorEnum {
    EQ("eq"),
    
    NEQ("neq"),
    
    GT("gt"),
    
    GTEQ("gteq"),
    
    LT("lt"),
    
    LTEQ("lteq"),
    
    LIKE("like"),
    
    NOTLIKE("notLike");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("operator")
  private OperatorEnum operator = null;

  @JsonProperty("value")
  private Object value = null;

  public ConditionQueryParameterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Comparison operator to be used. `notLike` is not supported by all endpoints.
   * @return operator
   **/
  @Schema(description = "Comparison operator to be used. `notLike` is not supported by all endpoints.")
  
    public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public ConditionQueryParameterDto value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(description = "")
  
    public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionQueryParameterDto conditionQueryParameterDto = (ConditionQueryParameterDto) o;
    return Objects.equals(this.operator, conditionQueryParameterDto.operator) &&
        Objects.equals(this.value, conditionQueryParameterDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionQueryParameterDto {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
