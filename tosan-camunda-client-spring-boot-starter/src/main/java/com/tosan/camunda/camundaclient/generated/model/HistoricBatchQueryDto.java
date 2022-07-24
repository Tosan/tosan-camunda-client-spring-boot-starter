package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Query for the historic batches to set the removal time for.
 */
@Schema(description = "Query for the historic batches to set the removal time for.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricBatchQueryDto   {
  @JsonProperty("batchId")
  private String batchId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("completed")
  private Boolean completed = null;

  @JsonProperty("tenantIdIn")
  @Valid
  private List<String> tenantIdIn = null;

  @JsonProperty("withoutTenantId")
  private Boolean withoutTenantId = null;

  @JsonProperty("sorting")
  @Valid
  private List<HistoricBatchQueryDtoSorting> sorting = null;

  public HistoricBatchQueryDto batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Filter by batch id.
   * @return batchId
   **/
  @Schema(description = "Filter by batch id.")
  
    public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public HistoricBatchQueryDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Filter by batch type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.
   * @return type
   **/
  @Schema(description = "Filter by batch type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public HistoricBatchQueryDto completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   *  Filter completed or not completed batches. If the value is `true`, only completed batches, i.e., end time is set, are returned. Otherwise, if the value is `false`, only running batches, i.e., end time is null, are returned.
   * @return completed
   **/
  @Schema(description = " Filter completed or not completed batches. If the value is `true`, only completed batches, i.e., end time is set, are returned. Otherwise, if the value is `false`, only running batches, i.e., end time is null, are returned.")
  
    public Boolean isCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public HistoricBatchQueryDto tenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
    return this;
  }

  public HistoricBatchQueryDto addTenantIdInItem(String tenantIdInItem) {
    if (this.tenantIdIn == null) {
      this.tenantIdIn = new ArrayList<>();
    }
    this.tenantIdIn.add(tenantIdInItem);
    return this;
  }

  /**
   * Filter by a comma-separated list of tenant ids. A batch matches if it has one of the given tenant ids.
   * @return tenantIdIn
   **/
  @Schema(description = "Filter by a comma-separated list of tenant ids. A batch matches if it has one of the given tenant ids.")
  
    public List<String> getTenantIdIn() {
    return tenantIdIn;
  }

  public void setTenantIdIn(List<String> tenantIdIn) {
    this.tenantIdIn = tenantIdIn;
  }

  public HistoricBatchQueryDto withoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
    return this;
  }

  /**
   * Only include batches which belong to no tenant. Value can effectively only be `true`, as `false` is the default behavior.
   * @return withoutTenantId
   **/
  @Schema(description = "Only include batches which belong to no tenant. Value can effectively only be `true`, as `false` is the default behavior.")
  
    public Boolean isWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricBatchQueryDto sorting(List<HistoricBatchQueryDtoSorting> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricBatchQueryDto addSortingItem(HistoricBatchQueryDtoSorting sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint
   * @return sorting
   **/
  @Schema(description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint")
      @Valid
    public List<HistoricBatchQueryDtoSorting> getSorting() {
    return sorting;
  }

  public void setSorting(List<HistoricBatchQueryDtoSorting> sorting) {
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
    HistoricBatchQueryDto historicBatchQueryDto = (HistoricBatchQueryDto) o;
    return Objects.equals(this.batchId, historicBatchQueryDto.batchId) &&
        Objects.equals(this.type, historicBatchQueryDto.type) &&
        Objects.equals(this.completed, historicBatchQueryDto.completed) &&
        Objects.equals(this.tenantIdIn, historicBatchQueryDto.tenantIdIn) &&
        Objects.equals(this.withoutTenantId, historicBatchQueryDto.withoutTenantId) &&
        Objects.equals(this.sorting, historicBatchQueryDto.sorting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchId, type, completed, tenantIdIn, withoutTenantId, sorting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricBatchQueryDto {\n");
    
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    tenantIdIn: ").append(toIndentedString(tenantIdIn)).append("\n");
    sb.append("    withoutTenantId: ").append(toIndentedString(withoutTenantId)).append("\n");
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
