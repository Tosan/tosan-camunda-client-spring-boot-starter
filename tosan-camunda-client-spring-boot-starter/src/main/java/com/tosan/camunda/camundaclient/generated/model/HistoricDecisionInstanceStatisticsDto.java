package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HistoricDecisionInstanceStatisticsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class HistoricDecisionInstanceStatisticsDto {

  private String decisionDefinitionKey = null;

  private Integer evaluations = null;

  public HistoricDecisionInstanceStatisticsDto decisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
    return this;
  }

  /**
   * A key of decision definition.
   * @return decisionDefinitionKey
  */
  
  @Schema(name = "decisionDefinitionKey", description = "A key of decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDefinitionKey")
  public String getDecisionDefinitionKey() {
    return decisionDefinitionKey;
  }

  public void setDecisionDefinitionKey(String decisionDefinitionKey) {
    this.decisionDefinitionKey = decisionDefinitionKey;
  }

  public HistoricDecisionInstanceStatisticsDto evaluations(Integer evaluations) {
    this.evaluations = evaluations;
    return this;
  }

  /**
   * A number of evaluation for decision definition.
   * @return evaluations
  */
  
  @Schema(name = "evaluations", description = "A number of evaluation for decision definition.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("evaluations")
  public Integer getEvaluations() {
    return evaluations;
  }

  public void setEvaluations(Integer evaluations) {
    this.evaluations = evaluations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricDecisionInstanceStatisticsDto historicDecisionInstanceStatisticsDto = (HistoricDecisionInstanceStatisticsDto) o;
    return Objects.equals(this.decisionDefinitionKey, historicDecisionInstanceStatisticsDto.decisionDefinitionKey) &&
        Objects.equals(this.evaluations, historicDecisionInstanceStatisticsDto.evaluations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decisionDefinitionKey, evaluations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricDecisionInstanceStatisticsDto {\n");
    sb.append("    decisionDefinitionKey: ").append(toIndentedString(decisionDefinitionKey)).append("\n");
    sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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

