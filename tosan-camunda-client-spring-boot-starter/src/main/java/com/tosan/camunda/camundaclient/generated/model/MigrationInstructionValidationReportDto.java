package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.MigrationInstructionDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationInstructionValidationReportDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationInstructionValidationReportDto {

  private MigrationInstructionDto instruction;

  @Valid
  private List<String> failures;

  public MigrationInstructionValidationReportDto instruction(MigrationInstructionDto instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
  */
  @Valid 
  @Schema(name = "instruction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instruction")
  public MigrationInstructionDto getInstruction() {
    return instruction;
  }

  public void setInstruction(MigrationInstructionDto instruction) {
    this.instruction = instruction;
  }

  public MigrationInstructionValidationReportDto failures(List<String> failures) {
    this.failures = failures;
    return this;
  }

  public MigrationInstructionValidationReportDto addFailuresItem(String failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<>();
    }
    this.failures.add(failuresItem);
    return this;
  }

  /**
   * A list of instruction validation report messages.
   * @return failures
  */
  
  @Schema(name = "failures", description = "A list of instruction validation report messages.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failures")
  public List<String> getFailures() {
    return failures;
  }

  public void setFailures(List<String> failures) {
    this.failures = failures;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationInstructionValidationReportDto migrationInstructionValidationReportDto = (MigrationInstructionValidationReportDto) o;
    return Objects.equals(this.instruction, migrationInstructionValidationReportDto.instruction) &&
        Objects.equals(this.failures, migrationInstructionValidationReportDto.failures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instruction, failures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationInstructionValidationReportDto {\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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

