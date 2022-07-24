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
 * PatchVariablesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class PatchVariablesDto   {
  @JsonProperty("modifications")
  @Valid
  private Map<String, VariableValueDto> modifications = null;

  @JsonProperty("deletions")
  @Valid
  private List<String> deletions = null;

  public PatchVariablesDto modifications(Map<String, VariableValueDto> modifications) {
    this.modifications = modifications;
    return this;
  }

  public PatchVariablesDto putModificationsItem(String key, VariableValueDto modificationsItem) {
    if (this.modifications == null) {
      this.modifications = new HashMap<>();
    }
    this.modifications.put(key, modificationsItem);
    return this;
  }

  /**
   * A JSON object containing variable key-value pairs.
   * @return modifications
   **/
  @Schema(description = "A JSON object containing variable key-value pairs.")
      @Valid
    public Map<String, VariableValueDto> getModifications() {
    return modifications;
  }

  public void setModifications(Map<String, VariableValueDto> modifications) {
    this.modifications = modifications;
  }

  public PatchVariablesDto deletions(List<String> deletions) {
    this.deletions = deletions;
    return this;
  }

  public PatchVariablesDto addDeletionsItem(String deletionsItem) {
    if (this.deletions == null) {
      this.deletions = new ArrayList<>();
    }
    this.deletions.add(deletionsItem);
    return this;
  }

  /**
   * An array of String keys of variables to be deleted.
   * @return deletions
   **/
  @Schema(description = "An array of String keys of variables to be deleted.")
  
    public List<String> getDeletions() {
    return deletions;
  }

  public void setDeletions(List<String> deletions) {
    this.deletions = deletions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchVariablesDto patchVariablesDto = (PatchVariablesDto) o;
    return Objects.equals(this.modifications, patchVariablesDto.modifications) &&
        Objects.equals(this.deletions, patchVariablesDto.deletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifications, deletions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchVariablesDto {\n");
    
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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
