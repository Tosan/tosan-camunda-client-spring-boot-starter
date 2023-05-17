package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * ProcessDefinitionStatisticsResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ProcessDefinitionStatisticsResultDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("instances")
  private Integer instances = null;

  @JsonProperty("failedJobs")
  private Integer failedJobs = null;

  @JsonProperty("incidents")
  @Valid
  private List<IncidentStatisticsResultDto> incidents = null;

  @JsonProperty("definition")
  private ProcessDefinitionDto definition = null;

  public ProcessDefinitionStatisticsResultDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process definition the results are aggregated for.
   * @return id
   **/
  @Schema(description = "The id of the process definition the results are aggregated for.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessDefinitionStatisticsResultDto instances(Integer instances) {
    this.instances = instances;
    return this;
  }

  /**
   * The total number of running process instances of this process definition.
   * @return instances
   **/
  @Schema(description = "The total number of running process instances of this process definition.")
  
    public Integer getInstances() {
    return instances;
  }

  public void setInstances(Integer instances) {
    this.instances = instances;
  }

  public ProcessDefinitionStatisticsResultDto failedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
    return this;
  }

  /**
   * The total number of failed jobs for the running instances. **Note**: Will be `0` (not `null`), if failed jobs were excluded.
   * @return failedJobs
   **/
  @Schema(description = "The total number of failed jobs for the running instances. **Note**: Will be `0` (not `null`), if failed jobs were excluded.")
  
    public Integer getFailedJobs() {
    return failedJobs;
  }

  public void setFailedJobs(Integer failedJobs) {
    this.failedJobs = failedJobs;
  }

  public ProcessDefinitionStatisticsResultDto incidents(List<IncidentStatisticsResultDto> incidents) {
    this.incidents = incidents;
    return this;
  }

  public ProcessDefinitionStatisticsResultDto addIncidentsItem(IncidentStatisticsResultDto incidentsItem) {
    if (this.incidents == null) {
      this.incidents = new ArrayList<>();
    }
    this.incidents.add(incidentsItem);
    return this;
  }

  /**
   * Each item in the resulting array is an object which contains `incidentType` and `incidentCount`. **Note**: Will be an empty array, if `incidents` or `incidentsForType` were excluded. Furthermore, the array will be also empty if no incidents were found.
   * @return incidents
   **/
  @Schema(description = "Each item in the resulting array is an object which contains `incidentType` and `incidentCount`. **Note**: Will be an empty array, if `incidents` or `incidentsForType` were excluded. Furthermore, the array will be also empty if no incidents were found.")
      @Valid
    public List<IncidentStatisticsResultDto> getIncidents() {
    return incidents;
  }

  public void setIncidents(List<IncidentStatisticsResultDto> incidents) {
    this.incidents = incidents;
  }

  public ProcessDefinitionStatisticsResultDto definition(ProcessDefinitionDto definition) {
    this.definition = definition;
    return this;
  }

  /**
   * Get definition
   * @return definition
   **/
  @Schema(description = "")
  
    @Valid
    public ProcessDefinitionDto getDefinition() {
    return definition;
  }

  public void setDefinition(ProcessDefinitionDto definition) {
    this.definition = definition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionStatisticsResultDto processDefinitionStatisticsResultDto = (ProcessDefinitionStatisticsResultDto) o;
    return Objects.equals(this.id, processDefinitionStatisticsResultDto.id) &&
        Objects.equals(this.instances, processDefinitionStatisticsResultDto.instances) &&
        Objects.equals(this.failedJobs, processDefinitionStatisticsResultDto.failedJobs) &&
        Objects.equals(this.incidents, processDefinitionStatisticsResultDto.incidents) &&
        Objects.equals(this.definition, processDefinitionStatisticsResultDto.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instances, failedJobs, incidents, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionStatisticsResultDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
    sb.append("    failedJobs: ").append(toIndentedString(failedJobs)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
