package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricActivityStatisticsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricActivityStatisticsDto {

  private String id = null;

  private Long instances = null;

  private Long canceled = null;

  private Long finished = null;

  private Long completeScope = null;

  private Long openIncidents = null;

  private Long resolvedIncidents = null;

  private Long deletedIncidents = null;

  public HistoricActivityStatisticsDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the activity the results are aggregated for.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the activity the results are aggregated for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoricActivityStatisticsDto instances(Long instances) {
    this.instances = instances;
    return this;
  }

  /**
   * The total number of all running instances of the activity.
   * @return instances
  */
  
  @Schema(name = "instances", description = "The total number of all running instances of the activity.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instances")
  public Long getInstances() {
    return instances;
  }

  public void setInstances(Long instances) {
    this.instances = instances;
  }

  public HistoricActivityStatisticsDto canceled(Long canceled) {
    this.canceled = canceled;
    return this;
  }

  /**
   * The total number of all canceled instances of the activity. **Note:** Will be `0` (not `null`), if canceled activity instances were excluded.
   * @return canceled
  */
  
  @Schema(name = "canceled", description = "The total number of all canceled instances of the activity. **Note:** Will be `0` (not `null`), if canceled activity instances were excluded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("canceled")
  public Long getCanceled() {
    return canceled;
  }

  public void setCanceled(Long canceled) {
    this.canceled = canceled;
  }

  public HistoricActivityStatisticsDto finished(Long finished) {
    this.finished = finished;
    return this;
  }

  /**
   * The total number of all finished instances of the activity. **Note:** Will be `0` (not `null`), if finished activity instances were excluded.
   * @return finished
  */
  
  @Schema(name = "finished", description = "The total number of all finished instances of the activity. **Note:** Will be `0` (not `null`), if finished activity instances were excluded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finished")
  public Long getFinished() {
    return finished;
  }

  public void setFinished(Long finished) {
    this.finished = finished;
  }

  public HistoricActivityStatisticsDto completeScope(Long completeScope) {
    this.completeScope = completeScope;
    return this;
  }

  /**
   * The total number of all instances which completed a scope of the activity. **Note:** Will be `0` (not `null`), if activity instances which completed a scope were excluded.
   * @return completeScope
  */
  
  @Schema(name = "completeScope", description = "The total number of all instances which completed a scope of the activity. **Note:** Will be `0` (not `null`), if activity instances which completed a scope were excluded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completeScope")
  public Long getCompleteScope() {
    return completeScope;
  }

  public void setCompleteScope(Long completeScope) {
    this.completeScope = completeScope;
  }

  public HistoricActivityStatisticsDto openIncidents(Long openIncidents) {
    this.openIncidents = openIncidents;
    return this;
  }

  /**
   * The total number of open incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.
   * @return openIncidents
  */
  
  @Schema(name = "openIncidents", description = "The total number of open incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openIncidents")
  public Long getOpenIncidents() {
    return openIncidents;
  }

  public void setOpenIncidents(Long openIncidents) {
    this.openIncidents = openIncidents;
  }

  public HistoricActivityStatisticsDto resolvedIncidents(Long resolvedIncidents) {
    this.resolvedIncidents = resolvedIncidents;
    return this;
  }

  /**
   * The total number of resolved incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.
   * @return resolvedIncidents
  */
  
  @Schema(name = "resolvedIncidents", description = "The total number of resolved incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolvedIncidents")
  public Long getResolvedIncidents() {
    return resolvedIncidents;
  }

  public void setResolvedIncidents(Long resolvedIncidents) {
    this.resolvedIncidents = resolvedIncidents;
  }

  public HistoricActivityStatisticsDto deletedIncidents(Long deletedIncidents) {
    this.deletedIncidents = deletedIncidents;
    return this;
  }

  /**
   * The total number of deleted incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.
   * @return deletedIncidents
  */
  
  @Schema(name = "deletedIncidents", description = "The total number of deleted incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletedIncidents")
  public Long getDeletedIncidents() {
    return deletedIncidents;
  }

  public void setDeletedIncidents(Long deletedIncidents) {
    this.deletedIncidents = deletedIncidents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricActivityStatisticsDto historicActivityStatisticsDto = (HistoricActivityStatisticsDto) o;
    return Objects.equals(this.id, historicActivityStatisticsDto.id) &&
        Objects.equals(this.instances, historicActivityStatisticsDto.instances) &&
        Objects.equals(this.canceled, historicActivityStatisticsDto.canceled) &&
        Objects.equals(this.finished, historicActivityStatisticsDto.finished) &&
        Objects.equals(this.completeScope, historicActivityStatisticsDto.completeScope) &&
        Objects.equals(this.openIncidents, historicActivityStatisticsDto.openIncidents) &&
        Objects.equals(this.resolvedIncidents, historicActivityStatisticsDto.resolvedIncidents) &&
        Objects.equals(this.deletedIncidents, historicActivityStatisticsDto.deletedIncidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances, canceled, finished, completeScope, openIncidents, resolvedIncidents, deletedIncidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricActivityStatisticsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    canceled: ").append(toIndentedString(canceled)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    completeScope: ").append(toIndentedString(completeScope)).append("\n");
    sb.append("    openIncidents: ").append(toIndentedString(openIncidents)).append("\n");
    sb.append("    resolvedIncidents: ").append(toIndentedString(resolvedIncidents)).append("\n");
    sb.append("    deletedIncidents: ").append(toIndentedString(deletedIncidents)).append("\n");
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

