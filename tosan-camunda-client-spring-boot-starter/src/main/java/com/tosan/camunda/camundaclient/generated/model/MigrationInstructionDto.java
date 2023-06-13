package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationInstructionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationInstructionDto {

  @Valid
  private List<String> sourceActivityIds;

  @Valid
  private List<String> targetActivityIds;

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
  */
  
  @Schema(name = "sourceActivityIds", description = "The activity ids from the source process definition being mapped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceActivityIds")
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
  */
  
  @Schema(name = "targetActivityIds", description = "The activity ids from the target process definition being mapped.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targetActivityIds")
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
  */
  
  @Schema(name = "updateEventTrigger", description = "Configuration flag whether event triggers defined are going to be updated during migration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateEventTrigger")
  public Boolean getUpdateEventTrigger() {
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

