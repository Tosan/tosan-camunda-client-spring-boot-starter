package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * HistoricActivityStatisticsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class HistoricActivityStatisticsDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instances")
  private Long instances = null;

  @JsonProperty("canceled")
  private Long canceled = null;

  @JsonProperty("finished")
  private Long finished = null;

  @JsonProperty("completeScope")
  private Long completeScope = null;

  @JsonProperty("openIncidents")
  private Long openIncidents = null;

  @JsonProperty("resolvedIncidents")
  private Long resolvedIncidents = null;

  @JsonProperty("deletedIncidents")
  private Long deletedIncidents = null;

  public HistoricActivityStatisticsDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the activity the results are aggregated for.
   * @return id
   **/
  @Schema(description = "The id of the activity the results are aggregated for.")
  
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
   **/
  @Schema(description = "The total number of all running instances of the activity.")
  
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
   **/
  @Schema(description = "The total number of all canceled instances of the activity. **Note:** Will be `0` (not `null`), if canceled activity instances were excluded.")
  
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
   **/
  @Schema(description = "The total number of all finished instances of the activity. **Note:** Will be `0` (not `null`), if finished activity instances were excluded.")
  
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
   **/
  @Schema(description = "The total number of all instances which completed a scope of the activity. **Note:** Will be `0` (not `null`), if activity instances which completed a scope were excluded.")
  
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
   **/
  @Schema(description = "The total number of open incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.")
  
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
   **/
  @Schema(description = "The total number of resolved incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.")
  
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
   **/
  @Schema(description = "The total number of deleted incidents for the activity. **Note:** Will be `0` (not `null`), if `incidents` is set to `false`.")
  
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
