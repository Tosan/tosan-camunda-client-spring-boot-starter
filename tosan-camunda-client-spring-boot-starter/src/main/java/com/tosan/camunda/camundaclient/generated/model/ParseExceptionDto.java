package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * ParseExceptionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ParseExceptionDto   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

  public ParseExceptionDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * An exception class indicating the occurred error.
   * @return type
   **/
  @Schema(description = "An exception class indicating the occurred error.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ParseExceptionDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A detailed message of the error.
   * @return message
   **/
  @Schema(description = "A detailed message of the error.")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseExceptionDto parseExceptionDto = (ParseExceptionDto) o;
    return Objects.equals(this.type, parseExceptionDto.type) &&
        Objects.equals(this.message, parseExceptionDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseExceptionDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
