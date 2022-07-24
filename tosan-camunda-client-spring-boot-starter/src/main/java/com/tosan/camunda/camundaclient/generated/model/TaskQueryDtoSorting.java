package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * TaskQueryDtoSorting
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class TaskQueryDtoSorting   {
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortByEnum fromValue(String text) {
      for (SortByEnum b : SortByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sortBy")
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SortOrderEnum fromValue(String text) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("sortOrder")
  private SortOrderEnum sortOrder = null;

  @JsonProperty("parameters")
  private SortTaskQueryParametersDto parameters = null;

  public TaskQueryDtoSorting sortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   * @return sortBy
   **/
  @Schema(description = "Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.")
  
    public SortByEnum getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortByEnum sortBy) {
    this.sortBy = sortBy;
  }

  public TaskQueryDtoSorting sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.
   * @return sortOrder
   **/
  @Schema(description = "Sort the results in a given order. Values may be `asc` for ascending order or `desc` for descending order. Must be used in conjunction with the sortBy parameter.")
  
    public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public TaskQueryDtoSorting parameters(SortTaskQueryParametersDto parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Get parameters
   * @return parameters
   **/
  @Schema(description = "")
  
    @Valid
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
    TaskQueryDtoSorting taskQueryDtoSorting = (TaskQueryDtoSorting) o;
    return Objects.equals(this.sortBy, taskQueryDtoSorting.sortBy) &&
        Objects.equals(this.sortOrder, taskQueryDtoSorting.sortOrder) &&
        Objects.equals(this.parameters, taskQueryDtoSorting.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskQueryDtoSorting {\n");
    
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
