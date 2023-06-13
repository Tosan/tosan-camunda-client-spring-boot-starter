package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.MigrationPlanDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationExecutionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationExecutionDto {

  private MigrationPlanDto migrationPlan;

  @Valid
  private List<String> processInstanceIds;

  private ProcessInstanceQueryDto processInstanceQuery;

  private Boolean skipCustomListeners = null;

  private Boolean skipIoMappings = null;

  public MigrationExecutionDto migrationPlan(MigrationPlanDto migrationPlan) {
    this.migrationPlan = migrationPlan;
    return this;
  }

  /**
   * Get migrationPlan
   * @return migrationPlan
  */
  @Valid 
  @Schema(name = "migrationPlan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("migrationPlan")
  public MigrationPlanDto getMigrationPlan() {
    return migrationPlan;
  }

  public void setMigrationPlan(MigrationPlanDto migrationPlan) {
    this.migrationPlan = migrationPlan;
  }

  public MigrationExecutionDto processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public MigrationExecutionDto addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list of process instance ids to migrate.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list of process instance ids to migrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public MigrationExecutionDto processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

  /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  */
  @Valid 
  @Schema(name = "processInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceQuery")
  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }

  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }

  public MigrationExecutionDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
    return this;
  }

  /**
   * A boolean value to control whether execution listeners should be invoked during migration.
   * @return skipCustomListeners
  */
  
  @Schema(name = "skipCustomListeners", description = "A boolean value to control whether execution listeners should be invoked during migration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipCustomListeners")
  public Boolean getSkipCustomListeners() {
    return skipCustomListeners;
  }

  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }

  public MigrationExecutionDto skipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
    return this;
  }

  /**
   * A boolean value to control whether input/output mappings should be executed during migration.
   * @return skipIoMappings
  */
  
  @Schema(name = "skipIoMappings", description = "A boolean value to control whether input/output mappings should be executed during migration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipIoMappings")
  public Boolean getSkipIoMappings() {
    return skipIoMappings;
  }

  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationExecutionDto migrationExecutionDto = (MigrationExecutionDto) o;
    return Objects.equals(this.migrationPlan, migrationExecutionDto.migrationPlan) &&
        Objects.equals(this.processInstanceIds, migrationExecutionDto.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, migrationExecutionDto.processInstanceQuery) &&
        Objects.equals(this.skipCustomListeners, migrationExecutionDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, migrationExecutionDto.skipIoMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(migrationPlan, processInstanceIds, processInstanceQuery, skipCustomListeners, skipIoMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationExecutionDto {\n");
    sb.append("    migrationPlan: ").append(toIndentedString(migrationPlan)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
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

