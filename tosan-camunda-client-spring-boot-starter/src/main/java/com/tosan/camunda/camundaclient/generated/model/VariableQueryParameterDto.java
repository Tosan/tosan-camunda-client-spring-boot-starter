package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VariableQueryParameterDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class VariableQueryParameterDto {

  private String name = null;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private OperatorEnum operator = null;

  private Object value;

  public VariableQueryParameterDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Variable name
   * @return name
  */
  
  @Schema(name = "name", description = "Variable name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariableQueryParameterDto operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Comparison operator to be used. `notLike` is not supported by all endpoints.
   * @return operator
  */
  
  @Schema(name = "operator", description = "Comparison operator to be used. `notLike` is not supported by all endpoints.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public VariableQueryParameterDto value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
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
    VariableQueryParameterDto variableQueryParameterDto = (VariableQueryParameterDto) o;
    return Objects.equals(this.name, variableQueryParameterDto.name) &&
        Objects.equals(this.operator, variableQueryParameterDto.operator) &&
        Objects.equals(this.value, variableQueryParameterDto.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableQueryParameterDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

