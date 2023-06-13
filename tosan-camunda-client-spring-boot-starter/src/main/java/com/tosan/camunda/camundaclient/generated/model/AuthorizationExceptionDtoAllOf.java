package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * AuthorizationExceptionDtoAllOf
 */

@JsonTypeName("AuthorizationExceptionDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthorizationExceptionDtoAllOf {

  private String userId = null;

  @Valid
  private List<@Valid MissingAuthorizationDto> missingAuthorizations;

  public AuthorizationExceptionDtoAllOf userId(String userId) {
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

  public AuthorizationExceptionDtoAllOf missingAuthorizations(List<@Valid MissingAuthorizationDto> missingAuthorizations) {
    this.missingAuthorizations = missingAuthorizations;
    return this;
  }

  public AuthorizationExceptionDtoAllOf addMissingAuthorizationsItem(MissingAuthorizationDto missingAuthorizationsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationExceptionDtoAllOf authorizationExceptionDtoAllOf = (AuthorizationExceptionDtoAllOf) o;
    return Objects.equals(this.userId, authorizationExceptionDtoAllOf.userId) &&
        Objects.equals(this.missingAuthorizations, authorizationExceptionDtoAllOf.missingAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, missingAuthorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationExceptionDtoAllOf {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    missingAuthorizations: ").append(toIndentedString(missingAuthorizations)).append("\n");
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

