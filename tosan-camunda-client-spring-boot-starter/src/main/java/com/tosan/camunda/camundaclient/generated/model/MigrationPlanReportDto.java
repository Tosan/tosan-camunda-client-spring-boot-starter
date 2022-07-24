package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * MigrationPlanReportDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class MigrationPlanReportDto   {
  @JsonProperty("instructionReports")
  @Valid
  private List<MigrationInstructionValidationReportDto> instructionReports = null;

  @JsonProperty("variableReports")
  @Valid
  private Map<String, MigrationVariableValidationReportDto> variableReports = null;

  public MigrationPlanReportDto instructionReports(List<MigrationInstructionValidationReportDto> instructionReports) {
    this.instructionReports = instructionReports;
    return this;
  }

  public MigrationPlanReportDto addInstructionReportsItem(MigrationInstructionValidationReportDto instructionReportsItem) {
    if (this.instructionReports == null) {
      this.instructionReports = new ArrayList<>();
    }
    this.instructionReports.add(instructionReportsItem);
    return this;
  }

  /**
   * The list of instruction validation reports. If no validation errors are detected it is an empty list.
   * @return instructionReports
   **/
  @Schema(description = "The list of instruction validation reports. If no validation errors are detected it is an empty list.")
      @Valid
    public List<MigrationInstructionValidationReportDto> getInstructionReports() {
    return instructionReports;
  }

  public void setInstructionReports(List<MigrationInstructionValidationReportDto> instructionReports) {
    this.instructionReports = instructionReports;
  }

  public MigrationPlanReportDto variableReports(Map<String, MigrationVariableValidationReportDto> variableReports) {
    this.variableReports = variableReports;
    return this;
  }

  public MigrationPlanReportDto putVariableReportsItem(String key, MigrationVariableValidationReportDto variableReportsItem) {
    if (this.variableReports == null) {
      this.variableReports = new HashMap<>();
    }
    this.variableReports.put(key, variableReportsItem);
    return this;
  }

  /**
   * A map of variable reports. Each key is a variable name and each value a JSON object consisting of the variable's type, value, value info object and a list of failures.
   * @return variableReports
   **/
  @Schema(description = "A map of variable reports. Each key is a variable name and each value a JSON object consisting of the variable's type, value, value info object and a list of failures.")
      @Valid
    public Map<String, MigrationVariableValidationReportDto> getVariableReports() {
    return variableReports;
  }

  public void setVariableReports(Map<String, MigrationVariableValidationReportDto> variableReports) {
    this.variableReports = variableReports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MigrationPlanReportDto migrationPlanReportDto = (MigrationPlanReportDto) o;
    return Objects.equals(this.instructionReports, migrationPlanReportDto.instructionReports) &&
        Objects.equals(this.variableReports, migrationPlanReportDto.variableReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionReports, variableReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationPlanReportDto {\n");
    
    sb.append("    instructionReports: ").append(toIndentedString(instructionReports)).append("\n");
    sb.append("    variableReports: ").append(toIndentedString(variableReports)).append("\n");
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
