package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tosan.camunda.camundaclient.generated.model.SortTaskQueryParametersDto;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskQueryDtoSortingInner
 */

@JsonTypeName("TaskQueryDto_sorting_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TaskQueryDtoSortingInner {

  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   */
  public enum SortByEnum {
    INSTANCEID("instanceId"),
    
    CASEINSTANCEID("caseInstanceId"),
    
    DUEDATE("dueDate"),
    
    EXECUTIONID("executionId"),
    
    CASEEXECUTIONID("caseExecutionId"),
    
    ASSIGNEE("assignee"),
    
    CREATED("created"),
    
    DESCRIPTION("description"),
    
    ID("id"),
    
    NAME("name"),
    
    NAMECASEINSENSITIVE("nameCaseInsensitive"),
    
    PRIORITY("priority"),
    
    PROCESSVARIABLE("processVariable"),
    
    EXECUTIONVARIABLE("executionVariable"),
    
    TASKVARIABLE("taskVariable"),
    
    CASEEXECUTIONVARIABLE("caseExecutionVariable"),
    
    CASEINSTANCEVARIABLE("caseInstanceVariable");

    private String value;

    SortByEnum(String value) {
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
    public static SortByEnum fromValue(String value) {
      for (SortByEnum b : SortByEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private SortByEnum sortBy = null;

  /**
   * Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.
   */
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    SortOrderEnum(String value) {
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
    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private SortOrderEnum sortOrder = null;

  private SortTaskQueryParametersDto parameters;

  public TaskQueryDtoSortingInner sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   * @return sortBy
  */
  
  @Schema(name = "sortBy", description = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortBy")
  public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }

  public TaskQueryDtoSortingInner sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.
   * @return sortOrder
  */
  
  @Schema(name = "sortOrder", description = "Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public TaskQueryDtoSortingInner parameters(SortTaskQueryParametersDto parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  */
  @Valid 
  @Schema(name = "parameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameters")
  public SortTaskQueryParametersDto getParameters() {
    return parameters;
  }

  public void setParameters(SortTaskQueryParametersDto parameters) {
    this.parameters = parameters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskQueryDtoSortingInner taskQueryDtoSortingInner = (TaskQueryDtoSortingInner) o;
    return Objects.equals(this.sortBy, taskQueryDtoSortingInner.sortBy) &&
        Objects.equals(this.sortOrder, taskQueryDtoSortingInner.sortOrder) &&
        Objects.equals(this.parameters, taskQueryDtoSortingInner.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryDtoSortingInner {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

