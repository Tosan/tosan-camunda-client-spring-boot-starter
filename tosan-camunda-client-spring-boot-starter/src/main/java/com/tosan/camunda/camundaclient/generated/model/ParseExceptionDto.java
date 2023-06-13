package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ResourceReportDto;
import java.util.HashMap;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ParseExceptionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ParseExceptionDto {

  @Valid
  private Map<String, ResourceReportDto> details;

  private String type = null;

  private String message = null;

  public ParseExceptionDto details(Map<String, ResourceReportDto> details) {
    this.details = details;
    return this;
  }

  public ParseExceptionDto putDetailsItem(String key, ResourceReportDto detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

  /**
   * A JSON Object containing list of errors and warnings occurred during deployment.
   * @return details
  */
  @Valid 
  @Schema(name = "details", description = "A JSON Object containing list of errors and warnings occurred during deployment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Map<String, ResourceReportDto> getDetails() {
    return details;
  }

  public void setDetails(Map<String, ResourceReportDto> details) {
    this.details = details;
  }

  public ParseExceptionDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * An exception class indicating the occurred error.
   * @return type
  */
  
  @Schema(name = "type", description = "An exception class indicating the occurred error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
  */
  
  @Schema(name = "message", description = "A detailed message of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
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
    return Objects.equals(this.details, parseExceptionDto.details) &&
        Objects.equals(this.type, parseExceptionDto.type) &&
        Objects.equals(this.message, parseExceptionDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseExceptionDto {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

