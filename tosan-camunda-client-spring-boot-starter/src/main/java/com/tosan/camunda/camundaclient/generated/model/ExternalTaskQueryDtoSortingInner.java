package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExternalTaskQueryDtoSortingInner
 */

@JsonTypeName("ExternalTaskQueryDto_sorting_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExternalTaskQueryDtoSortingInner {

  /**
   * Sort the results lexicographically by a given criterion. Must be used in conjunction with the sortOrder parameter.
   */
  public enum SortByEnum {
    ID("id"),
    
    LOCKEXPIRATIONTIME("lockExpirationTime"),
    
    PROCESSINSTANCEID("processInstanceId"),
    
    PROCESSDEFINITIONID("processDefinitionId"),
    
    PROCESSDEFINITIONKEY("processDefinitionKey"),
    
    TASKPRIORITY("taskPriority"),
    
    TENANTID("tenantId");

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

  public ExternalTaskQueryDtoSortingInner sortBy(SortByEnum sortBy) {
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

  public ExternalTaskQueryDtoSortingInner sortOrder(SortOrderEnum sortOrder) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskQueryDtoSortingInner externalTaskQueryDtoSortingInner = (ExternalTaskQueryDtoSortingInner) o;
    return Objects.equals(this.sortBy, externalTaskQueryDtoSortingInner.sortBy) &&
        Objects.equals(this.sortOrder, externalTaskQueryDtoSortingInner.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortBy, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskQueryDtoSortingInner {\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

