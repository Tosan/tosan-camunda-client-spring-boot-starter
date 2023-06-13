package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.SchemaLogQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SchemaLogQueryDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class SchemaLogQueryDto {

  private String version = null;

  @Valid
  private List<@Valid SchemaLogQueryDtoSortingInner> sorting;

  public SchemaLogQueryDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the schema.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of the schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SchemaLogQueryDto sorting(List<@Valid SchemaLogQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public SchemaLogQueryDto addSortingItem(SchemaLogQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. 
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid SchemaLogQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid SchemaLogQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLogQueryDto schemaLogQueryDto = (SchemaLogQueryDto) o;
    return Objects.equals(this.version, schemaLogQueryDto.version) &&
        Objects.equals(this.sorting, schemaLogQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLogQueryDto {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    sorting: ").append(toIndentedString(sorting)).append("\n");
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

