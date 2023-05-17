package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * MigrationExecutionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MigrationExecutionDto   {
  @JsonProperty("migrationPlan")
  private MigrationPlanDto migrationPlan = null;

  @JsonProperty("processInstanceIds")
  @Valid
  private List<String> processInstanceIds = null;

  @JsonProperty("processInstanceQuery")
  private ProcessInstanceQueryDto processInstanceQuery = null;

  @JsonProperty("skipCustomListeners")
  private Boolean skipCustomListeners = null;

  @JsonProperty("skipIoMappings")
  private Boolean skipIoMappings = null;

  public MigrationExecutionDto migrationPlan(MigrationPlanDto migrationPlan) {
    this.migrationPlan = migrationPlan;
    return this;
  }

  /**
   * Get migrationPlan
   * @return migrationPlan
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "A list of process instance ids to migrate.")
  
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
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "A boolean value to control whether execution listeners should be invoked during migration.")
  
    public Boolean isSkipCustomListeners() {
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
   **/
  @Schema(description = "A boolean value to control whether input/output mappings should be executed during migration.")
  
    public Boolean isSkipIoMappings() {
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
