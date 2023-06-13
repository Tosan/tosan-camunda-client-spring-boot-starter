package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.HistoricBatchQueryDtoSortingInner;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Query for the historic batches to set the removal time for.
 */

@Schema(name = "HistoricBatchQueryDto", description = "Query for the historic batches to set the removal time for.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricBatchQueryDto {

  private String batchId = null;

  private String type = null;

  private Boolean completed = null;

  @Valid
  private List<String> tenantIdIn;

  private Boolean withoutTenantId = null;

  @Valid
  private List<@Valid HistoricBatchQueryDtoSortingInner> sorting;

  public HistoricBatchQueryDto batchId(String batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * Filter by batch id.
   * @return batchId
  */
  
  @Schema(name = "batchId", description = "Filter by batch id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchId")
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
  */
  
  @Schema(name = "type", description = "Filter by batch type. See the [User Guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/batch/#creating-a-batch) for more information about batch types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
  */
  
  @Schema(name = "completed", description = " Filter completed or not completed batches. If the value is `true`, only completed batches, i.e., end time is set, are returned. Otherwise, if the value is `false`, only running batches, i.e., end time is null, are returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public Boolean getCompleted() {
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
  */
  
  @Schema(name = "tenantIdIn", description = "Filter by a comma-separated list of tenant ids. A batch matches if it has one of the given tenant ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantIdIn")
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
  */
  
  @Schema(name = "withoutTenantId", description = "Only include batches which belong to no tenant. Value can effectively only be `true`, as `false` is the default behavior.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("withoutTenantId")
  public Boolean getWithoutTenantId() {
    return withoutTenantId;
  }

  public void setWithoutTenantId(Boolean withoutTenantId) {
    this.withoutTenantId = withoutTenantId;
  }

  public HistoricBatchQueryDto sorting(List<@Valid HistoricBatchQueryDtoSortingInner> sorting) {
    this.sorting = sorting;
    return this;
  }

  public HistoricBatchQueryDto addSortingItem(HistoricBatchQueryDtoSortingInner sortingItem) {
    if (this.sorting == null) {
      this.sorting = new ArrayList<>();
    }
    this.sorting.add(sortingItem);
    return this;
  }

  /**
   * An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint
   * @return sorting
  */
  @Valid 
  @Schema(name = "sorting", description = "An array of criteria to sort the result by. Each element of the array is                        an object that specifies one ordering. The position in the array                        identifies the rank of an ordering, i.e., whether it is primary, secondary,                        etc. Has no effect for the `/count` endpoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sorting")
  public List<@Valid HistoricBatchQueryDtoSortingInner> getSorting() {
    return sorting;
  }

  public void setSorting(List<@Valid HistoricBatchQueryDtoSortingInner> sorting) {
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

