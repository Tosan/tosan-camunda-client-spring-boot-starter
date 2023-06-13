package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * MigrationVariableValidationReportDtoAllOf
 */

@JsonTypeName("MigrationVariableValidationReportDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class MigrationVariableValidationReportDtoAllOf {

  @Valid
  private List<String> failures;

  public MigrationVariableValidationReportDtoAllOf failures(List<String> failures) {
    this.failures = failures;
    return this;
  }

  public MigrationVariableValidationReportDtoAllOf addFailuresItem(String failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<>();
    }
    this.failures.add(failuresItem);
    return this;
  }

  /**
   * A list of variable validation report messages.
   * @return failures
  */
  
  @Schema(name = "failures", description = "A list of variable validation report messages.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MigrationVariableValidationReportDtoAllOf migrationVariableValidationReportDtoAllOf = (MigrationVariableValidationReportDtoAllOf) o;
    return Objects.equals(this.failures, migrationVariableValidationReportDtoAllOf.failures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MigrationVariableValidationReportDtoAllOf {\n");
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

