package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MultiFormVariableBinaryDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MultiFormVariableBinaryDto   {
  @JsonProperty("data")
  private Resource data = null;

  /**
   * The name of the variable type. Either Bytes for a byte array variable or File for a file variable.
   */
  public enum ValueTypeEnum {
    BYTES("Bytes"),
    
    FILE("File");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueTypeEnum fromValue(String text) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("valueType")
  private ValueTypeEnum valueType = null;

  public MultiFormVariableBinaryDto data(Resource data) {
    this.data = data;
    return this;
  }

  /**
   * The binary data to be set. For File variables, this multipart can contain the filename, binary value and MIME type of the file variable to be set Only the filename is mandatory.
   * @return data
   **/
  @Schema(description = "The binary data to be set. For File variables, this multipart can contain the filename, binary value and MIME type of the file variable to be set Only the filename is mandatory.")
  
    @Valid
    public Resource getData() {
    return data;
  }

  public void setData(Resource data) {
    this.data = data;
  }

  public MultiFormVariableBinaryDto valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * The name of the variable type. Either Bytes for a byte array variable or File for a file variable.
   * @return valueType
   **/
  @Schema(description = "The name of the variable type. Either Bytes for a byte array variable or File for a file variable.")
  
    public ValueTypeEnum getValueType() {
    return valueType;
  }

  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiFormVariableBinaryDto multiFormVariableBinaryDto = (MultiFormVariableBinaryDto) o;
    return Objects.equals(this.data, multiFormVariableBinaryDto.data) &&
        Objects.equals(this.valueType, multiFormVariableBinaryDto.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFormVariableBinaryDto {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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
