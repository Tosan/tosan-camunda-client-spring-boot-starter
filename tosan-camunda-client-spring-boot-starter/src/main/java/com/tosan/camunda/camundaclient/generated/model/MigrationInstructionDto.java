package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * MigrationInstructionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MigrationInstructionDto   {
  @JsonProperty("sourceActivityIds")
  @Valid
  private List<String> sourceActivityIds = null;

  @JsonProperty("targetActivityIds")
  @Valid
  private List<String> targetActivityIds = null;

  @JsonProperty("updateEventTrigger")
  private Boolean updateEventTrigger = null;

  public MigrationInstructionDto sourceActivityIds(List<String> sourceActivityIds) {
    this.sourceActivityIds = sourceActivityIds;
    return this;
  }

  public MigrationInstructionDto addSourceActivityIdsItem(String sourceActivityIdsItem) {
    if (this.sourceActivityIds == null) {
      this.sourceActivityIds = new ArrayList<>();
    }
    this.sourceActivityIds.add(sourceActivityIdsItem);
    return this;
  }

  /**
   * The activity ids from the source process definition being mapped.
   * @return sourceActivityIds
   **/
  @Schema(description = "The activity ids from the source process definition being mapped.")
  
    public List<String> getSourceActivityIds() {
    return sourceActivityIds;
  }

  public void setSourceActivityIds(List<String> sourceActivityIds) {
    this.sourceActivityIds = sourceActivityIds;
  }

  public MigrationInstructionDto targetActivityIds(List<String> targetActivityIds) {
    this.targetActivityIds = targetActivityIds;
    return this;
  }

  public MigrationInstructionDto addTargetActivityIdsItem(String targetActivityIdsItem) {
    if (this.targetActivityIds == null) {
      this.targetActivityIds = new ArrayList<>();
    }
    this.targetActivityIds.add(targetActivityIdsItem);
    return this;
  }

  /**
   * The activity ids from the target process definition being mapped.
   * @return targetActivityIds
   **/
  @Schema(description = "The activity ids from the target process definition being mapped.")
  
    public List<String> getTargetActivityIds() {
    return targetActivityIds;
  }

  public void setTargetActivityIds(List<String> targetActivityIds) {
    this.targetActivityIds = targetActivityIds;
  }

  public MigrationInstructionDto updateEventTrigger(Boolean updateEventTrigger) {
    this.updateEventTrigger = updateEventTrigger;
    return this;
  }

  /**
   * Configuration flag whether event triggers defined are going to be updated during migration.
   * @return updateEventTrigger
   **/
  @Schema(description = "Configuration flag whether event triggers defined are going to be updated during migration.")
  
    public Boolean isUpdateEventTrigger() {
    return updateEventTrigger;
  }

  public void setUpdateEventTrigger(Boolean updateEventTrigger) {
    this.updateEventTrigger = updateEventTrigger;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationInstructionDto migrationInstructionDto = (MigrationInstructionDto) o;
    return Objects.equals(this.sourceActivityIds, migrationInstructionDto.sourceActivityIds) &&
        Objects.equals(this.targetActivityIds, migrationInstructionDto.targetActivityIds) &&
        Objects.equals(this.updateEventTrigger, migrationInstructionDto.updateEventTrigger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceActivityIds, targetActivityIds, updateEventTrigger);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationInstructionDto {\n");
    
    sb.append("    sourceActivityIds: ").append(toIndentedString(sourceActivityIds)).append("\n");
    sb.append("    targetActivityIds: ").append(toIndentedString(targetActivityIds)).append("\n");
    sb.append("    updateEventTrigger: ").append(toIndentedString(updateEventTrigger)).append("\n");
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
