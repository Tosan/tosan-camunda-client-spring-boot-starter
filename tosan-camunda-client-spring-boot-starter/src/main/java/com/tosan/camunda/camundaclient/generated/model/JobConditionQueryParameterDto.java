package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * JobConditionQueryParameterDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobConditionQueryParameterDto   {
  /**
   * Comparison operator to be used.
   */
  public enum OperatorEnum {
    GT("gt"),
    
    LT("lt");

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
  private OffsetDateTime value = null;

  public JobConditionQueryParameterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Comparison operator to be used.
   * @return operator
   **/
  @Schema(description = "Comparison operator to be used.")
  
    public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public JobConditionQueryParameterDto value(OffsetDateTime value) {
    this.value = value;
    return this;
  }

  /**
   * Date value to compare with.
   * @return value
   **/
  @Schema(description = "Date value to compare with.")
  
    @Valid
    public OffsetDateTime getValue() {
    return value;
  }

  public void setValue(OffsetDateTime value) {
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
    JobConditionQueryParameterDto jobConditionQueryParameterDto = (JobConditionQueryParameterDto) o;
    return Objects.equals(this.operator, jobConditionQueryParameterDto.operator) &&
        Objects.equals(this.value, jobConditionQueryParameterDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobConditionQueryParameterDto {\n");
    
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
