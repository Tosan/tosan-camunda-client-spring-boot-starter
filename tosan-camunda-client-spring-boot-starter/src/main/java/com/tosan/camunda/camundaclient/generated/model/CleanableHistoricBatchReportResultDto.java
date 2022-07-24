package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * CleanableHistoricBatchReportResultDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class CleanableHistoricBatchReportResultDto   {
  @JsonProperty("batchType")
  private String batchType = null;

  @JsonProperty("historyTimeToLive")
  private Integer historyTimeToLive = null;

  @JsonProperty("finishedBatchesCount")
  private Long finishedBatchesCount = null;

  @JsonProperty("cleanableBatchesCount")
  private Long cleanableBatchesCount = null;

  public CleanableHistoricBatchReportResultDto batchType(String batchType) {
    this.batchType = batchType;
    return this;
  }

  /**
   * The type of the batch operation.
   * @return batchType
   **/
  @Schema(description = "The type of the batch operation.")
  
    public String getBatchType() {
    return batchType;
  }

  public void setBatchType(String batchType) {
    this.batchType = batchType;
  }

  public CleanableHistoricBatchReportResultDto historyTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
    return this;
  }

  /**
   * The history time to live of the batch operation.
   * @return historyTimeToLive
   **/
  @Schema(description = "The history time to live of the batch operation.")
  
    public Integer getHistoryTimeToLive() {
    return historyTimeToLive;
  }

  public void setHistoryTimeToLive(Integer historyTimeToLive) {
    this.historyTimeToLive = historyTimeToLive;
  }

  public CleanableHistoricBatchReportResultDto finishedBatchesCount(Long finishedBatchesCount) {
    this.finishedBatchesCount = finishedBatchesCount;
    return this;
  }

  /**
   * The count of the finished batch operations.
   * @return finishedBatchesCount
   **/
  @Schema(description = "The count of the finished batch operations.")
  
    public Long getFinishedBatchesCount() {
    return finishedBatchesCount;
  }

  public void setFinishedBatchesCount(Long finishedBatchesCount) {
    this.finishedBatchesCount = finishedBatchesCount;
  }

  public CleanableHistoricBatchReportResultDto cleanableBatchesCount(Long cleanableBatchesCount) {
    this.cleanableBatchesCount = cleanableBatchesCount;
    return this;
  }

  /**
   * The count of the cleanable historic batch operations, referring to history time to live.
   * @return cleanableBatchesCount
   **/
  @Schema(description = "The count of the cleanable historic batch operations, referring to history time to live.")
  
    public Long getCleanableBatchesCount() {
    return cleanableBatchesCount;
  }

  public void setCleanableBatchesCount(Long cleanableBatchesCount) {
    this.cleanableBatchesCount = cleanableBatchesCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CleanableHistoricBatchReportResultDto cleanableHistoricBatchReportResultDto = (CleanableHistoricBatchReportResultDto) o;
    return Objects.equals(this.batchType, cleanableHistoricBatchReportResultDto.batchType) &&
        Objects.equals(this.historyTimeToLive, cleanableHistoricBatchReportResultDto.historyTimeToLive) &&
        Objects.equals(this.finishedBatchesCount, cleanableHistoricBatchReportResultDto.finishedBatchesCount) &&
        Objects.equals(this.cleanableBatchesCount, cleanableHistoricBatchReportResultDto.cleanableBatchesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchType, historyTimeToLive, finishedBatchesCount, cleanableBatchesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CleanableHistoricBatchReportResultDto {\n");
    
    sb.append("    batchType: ").append(toIndentedString(batchType)).append("\n");
    sb.append("    historyTimeToLive: ").append(toIndentedString(historyTimeToLive)).append("\n");
    sb.append("    finishedBatchesCount: ").append(toIndentedString(finishedBatchesCount)).append("\n");
    sb.append("    cleanableBatchesCount: ").append(toIndentedString(cleanableBatchesCount)).append("\n");
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
