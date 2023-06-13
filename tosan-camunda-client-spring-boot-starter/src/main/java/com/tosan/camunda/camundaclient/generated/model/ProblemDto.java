package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProblemDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProblemDto {

  private String message = null;

  private Integer line = null;

  private Integer column = null;

  private String mainElementId = null;

  @Valid
  private List<String> elementIds;

  public ProblemDto message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message of the problem.
   * @return message
  */
  
  @Schema(name = "message", description = "The message of the problem.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProblemDto line(Integer line) {
    this.line = line;
    return this;
  }

  /**
   * The line where the problem occurred.
   * @return line
  */
  
  @Schema(name = "line", description = "The line where the problem occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public ProblemDto column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * The column where the problem occurred.
   * @return column
  */
  
  @Schema(name = "column", description = "The column where the problem occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("column")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  public ProblemDto mainElementId(String mainElementId) {
    this.mainElementId = mainElementId;
    return this;
  }

  /**
   * The main element id where the problem occurred.
   * @return mainElementId
  */
  
  @Schema(name = "mainElementId", description = "The main element id where the problem occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mainElementId")
  public String getMainElementId() {
    return mainElementId;
  }

  public void setMainElementId(String mainElementId) {
    this.mainElementId = mainElementId;
  }

  public ProblemDto elementIds(List<String> elementIds) {
    this.elementIds = elementIds;
    return this;
  }

  public ProblemDto addElementIdsItem(String elementIdsItem) {
    if (this.elementIds == null) {
      this.elementIds = new ArrayList<>();
    }
    this.elementIds.add(elementIdsItem);
    return this;
  }

  /**
   * A list of element id affected by the problem.
   * @return elementIds
  */
  
  @Schema(name = "elementIds", description = "A list of element id affected by the problem.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementIds")
  public List<String> getElementIds() {
    return elementIds;
  }

  public void setElementIds(List<String> elementIds) {
    this.elementIds = elementIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDto problemDto = (ProblemDto) o;
    return Objects.equals(this.message, problemDto.message) &&
        Objects.equals(this.line, problemDto.line) &&
        Objects.equals(this.column, problemDto.column) &&
        Objects.equals(this.mainElementId, problemDto.mainElementId) &&
        Objects.equals(this.elementIds, problemDto.elementIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, line, column, mainElementId, elementIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDto {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    mainElementId: ").append(toIndentedString(mainElementId)).append("\n");
    sb.append("    elementIds: ").append(toIndentedString(elementIds)).append("\n");
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

