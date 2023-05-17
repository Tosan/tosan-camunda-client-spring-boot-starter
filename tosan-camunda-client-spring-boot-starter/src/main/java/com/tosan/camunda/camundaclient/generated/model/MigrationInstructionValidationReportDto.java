package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;

/**
 * MigrationInstructionValidationReportDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MigrationInstructionValidationReportDto   {
  @JsonProperty("instruction")
  private MigrationInstructionDto instruction = null;

  @JsonProperty("failures")
  @Valid
  private List<String> failures = null;

  public MigrationInstructionValidationReportDto instruction(MigrationInstructionDto instruction) {
    this.instruction = instruction;
    return this;
  }

  /**
   * Get instruction
   * @return instruction
   **/
  @Schema(description = "")
  
    @Valid
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
   **/
  @Schema(description = "A list of instruction validation report messages.")
  
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
