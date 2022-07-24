package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * SchemaLogQueryDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class SchemaLogQueryDto   {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("sorting")
  @Valid
  private List<SchemaLogQueryDtoSorting> sorting = null;

  public SchemaLogQueryDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the schema.
   * @return version
   **/
  @Schema(description = "The version of the schema.")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SchemaLogQueryDto sorting(List<SchemaLogQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public SchemaLogQueryDto addSortingItem(SchemaLogQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. 
   * @return sorting
   **/
  @Schema(description = "A JSON array of criteria to sort the result by. Each element of the array is                       a JSON object that specifies one ordering. The position in the array                       identifies the rank of an ordering, i.e., whether it is primary, secondary,                       etc. ")
      @Valid
    public List<SchemaLogQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<SchemaLogQueryDtoSorting> sorting) {
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
