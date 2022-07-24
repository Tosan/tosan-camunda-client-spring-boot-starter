package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * JobDuedateDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class JobDuedateDto   {
  @JsonProperty("duedate")
  private OffsetDateTime duedate = null;

  @JsonProperty("cascade")
  private Boolean cascade = null;

  public JobDuedateDto duedate(OffsetDateTime duedate) {
    this.duedate = duedate;
    return this;
  }

  /**
   * The date to set when the job has the next execution.
   * @return duedate
   **/
  @Schema(description = "The date to set when the job has the next execution.")
  
    @Valid
    public OffsetDateTime getDuedate() {
    return duedate;
  }

  public void setDuedate(OffsetDateTime duedate) {
    this.duedate = duedate;
  }

  public JobDuedateDto cascade(Boolean cascade) {
    this.cascade = cascade;
    return this;
  }

  /**
   * A boolean value to indicate if modifications to the due date should cascade to subsequent jobs. (e.g. Modify the due date of a timer by +15 minutes. This flag indicates if a +15 minutes should be applied to all subsequent timers.) This flag only affects timer jobs and only works if due date is not null. Default: `false`
   * @return cascade
   **/
  @Schema(description = "A boolean value to indicate if modifications to the due date should cascade to subsequent jobs. (e.g. Modify the due date of a timer by +15 minutes. This flag indicates if a +15 minutes should be applied to all subsequent timers.) This flag only affects timer jobs and only works if due date is not null. Default: `false`")
  
    public Boolean isCascade() {
    return cascade;
  }

  public void setCascade(Boolean cascade) {
    this.cascade = cascade;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDuedateDto jobDuedateDto = (JobDuedateDto) o;
    return Objects.equals(this.duedate, jobDuedateDto.duedate) &&
        Objects.equals(this.cascade, jobDuedateDto.cascade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duedate, cascade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDuedateDto {\n");
    
    sb.append("    duedate: ").append(toIndentedString(duedate)).append("\n");
    sb.append("    cascade: ").append(toIndentedString(cascade)).append("\n");
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
