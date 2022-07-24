package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ResourceReportDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ResourceReportDto   {
  @JsonProperty("errors")
  @Valid
  private List<ProblemDto> errors = null;

  @JsonProperty("warnings")
  @Valid
  private List<ProblemDto> warnings = null;

  public ResourceReportDto errors(List<ProblemDto> errors) {
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
   **/
  @Schema(description = "A list of errors occurred during parsing.")
      @Valid
    public List<ProblemDto> getErrors() {
    return errors;
  }

  public void setErrors(List<ProblemDto> errors) {
    this.errors = errors;
  }

  public ResourceReportDto warnings(List<ProblemDto> warnings) {
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
   **/
  @Schema(description = "A list of warnings occurred during parsing.")
      @Valid
    public List<ProblemDto> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ProblemDto> warnings) {
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
