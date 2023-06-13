package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.MissingAuthorizationDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuthorizationExceptionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthorizationExceptionDto {

  private String userId = null;

  @Valid
  private List<@Valid MissingAuthorizationDto> missingAuthorizations;

  private String type = null;

  private String message = null;

  public AuthorizationExceptionDto userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user that does not have expected permissions
   * @return userId
  */
  
  @Schema(name = "userId", description = "The id of the user that does not have expected permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AuthorizationExceptionDto missingAuthorizations(List<@Valid MissingAuthorizationDto> missingAuthorizations) {
    this.missingAuthorizations = missingAuthorizations;
    return this;
  }

  public AuthorizationExceptionDto addMissingAuthorizationsItem(MissingAuthorizationDto missingAuthorizationsItem) {
    if (this.missingAuthorizations == null) {
      this.missingAuthorizations = new ArrayList<>();
    }
    this.missingAuthorizations.add(missingAuthorizationsItem);
    return this;
  }

  /**
   * 
   * @return missingAuthorizations
  */
  @Valid 
  @Schema(name = "missingAuthorizations", description = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missingAuthorizations")
  public List<@Valid MissingAuthorizationDto> getMissingAuthorizations() {
    return missingAuthorizations;
  }

  public void setMissingAuthorizations(List<@Valid MissingAuthorizationDto> missingAuthorizations) {
    this.missingAuthorizations = missingAuthorizations;
  }

  public AuthorizationExceptionDto type(String type) {
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

  public AuthorizationExceptionDto message(String message) {
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
    AuthorizationExceptionDto authorizationExceptionDto = (AuthorizationExceptionDto) o;
    return Objects.equals(this.userId, authorizationExceptionDto.userId) &&
        Objects.equals(this.missingAuthorizations, authorizationExceptionDto.missingAuthorizations) &&
        Objects.equals(this.type, authorizationExceptionDto.type) &&
        Objects.equals(this.message, authorizationExceptionDto.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, missingAuthorizations, type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationExceptionDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    missingAuthorizations: ").append(toIndentedString(missingAuthorizations)).append("\n");
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

