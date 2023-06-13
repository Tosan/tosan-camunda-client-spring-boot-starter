package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.VariableValueDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PatchVariablesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class PatchVariablesDto {

  @Valid
  private Map<String, VariableValueDto> modifications;

  @Valid
  private List<String> deletions;

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
  */
  @Valid 
  @Schema(name = "modifications", description = "A JSON object containing variable key-value pairs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modifications")
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
  */
  
  @Schema(name = "deletions", description = "An array of String keys of variables to be deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deletions")
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

