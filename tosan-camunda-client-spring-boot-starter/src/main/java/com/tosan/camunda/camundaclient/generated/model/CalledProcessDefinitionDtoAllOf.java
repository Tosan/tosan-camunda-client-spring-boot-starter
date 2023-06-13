package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CalledProcessDefinitionDtoAllOf
 */

@JsonTypeName("CalledProcessDefinitionDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CalledProcessDefinitionDtoAllOf {

  @Valid
  private List<String> calledFromActivityIds;

  private String callingProcessDefinitionId = null;

  public CalledProcessDefinitionDtoAllOf calledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = calledFromActivityIds;
    return this;
  }

  public CalledProcessDefinitionDtoAllOf addCalledFromActivityIdsItem(String calledFromActivityIdsItem) {
    if (this.calledFromActivityIds == null) {
      this.calledFromActivityIds = new ArrayList<>();
    }
    this.calledFromActivityIds.add(calledFromActivityIdsItem);
    return this;
  }

  /**
   * Ids of the CallActivities which call this process.
   * @return calledFromActivityIds
  */
  
  @Schema(name = "calledFromActivityIds", description = "Ids of the CallActivities which call this process.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("calledFromActivityIds")
  public List<String> getCalledFromActivityIds() {
    return calledFromActivityIds;
  }

  public void setCalledFromActivityIds(List<String> calledFromActivityIds) {
    this.calledFromActivityIds = calledFromActivityIds;
  }

  public CalledProcessDefinitionDtoAllOf callingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = callingProcessDefinitionId;
    return this;
  }

  /**
   * The id of the calling process definition
   * @return callingProcessDefinitionId
  */
  
  @Schema(name = "callingProcessDefinitionId", description = "The id of the calling process definition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("callingProcessDefinitionId")
  public String getCallingProcessDefinitionId() {
    return callingProcessDefinitionId;
  }

  public void setCallingProcessDefinitionId(String callingProcessDefinitionId) {
    this.callingProcessDefinitionId = callingProcessDefinitionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalledProcessDefinitionDtoAllOf calledProcessDefinitionDtoAllOf = (CalledProcessDefinitionDtoAllOf) o;
    return Objects.equals(this.calledFromActivityIds, calledProcessDefinitionDtoAllOf.calledFromActivityIds) &&
        Objects.equals(this.callingProcessDefinitionId, calledProcessDefinitionDtoAllOf.callingProcessDefinitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calledFromActivityIds, callingProcessDefinitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalledProcessDefinitionDtoAllOf {\n");
    sb.append("    calledFromActivityIds: ").append(toIndentedString(calledFromActivityIds)).append("\n");
    sb.append("    callingProcessDefinitionId: ").append(toIndentedString(callingProcessDefinitionId)).append("\n");
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

