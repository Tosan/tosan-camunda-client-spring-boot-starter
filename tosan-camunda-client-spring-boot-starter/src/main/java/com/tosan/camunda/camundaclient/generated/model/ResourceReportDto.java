package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.ProblemDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ResourceReportDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ResourceReportDto {

  @Valid
  private List<@Valid ProblemDto> errors;

  @Valid
  private List<@Valid ProblemDto> warnings;

  public ResourceReportDto errors(List<@Valid ProblemDto> errors) {
    this.errors = errors;
    return this;
  }

  public ResourceReportDto addErrorsItem(ProblemDto errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * A list of errors occurred during parsing.
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", description = "A list of errors occurred during parsing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid ProblemDto> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid ProblemDto> errors) {
    this.errors = errors;
  }

  public ResourceReportDto warnings(List<@Valid ProblemDto> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ResourceReportDto addWarningsItem(ProblemDto warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings occurred during parsing.
   * @return warnings
  */
  @Valid 
  @Schema(name = "warnings", description = "A list of warnings occurred during parsing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public List<@Valid ProblemDto> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid ProblemDto> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceReportDto resourceReportDto = (ResourceReportDto) o;
    return Objects.equals(this.errors, resourceReportDto.errors) &&
        Objects.equals(this.warnings, resourceReportDto.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceReportDto {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

