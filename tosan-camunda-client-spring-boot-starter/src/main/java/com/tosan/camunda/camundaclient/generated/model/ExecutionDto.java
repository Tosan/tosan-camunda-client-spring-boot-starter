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
 * ExecutionDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ExecutionDto {

  private String id = null;

  private String processInstanceId = null;

  private Boolean ended = null;

  private String tenantId = null;

  public ExecutionDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the Execution.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the Execution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ExecutionDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * The id of the root of the execution tree representing the process instance.
   * @return processInstanceId
  */
  
  @Schema(name = "processInstanceId", description = "The id of the root of the execution tree representing the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceId")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ExecutionDto ended(Boolean ended) {
    this.ended = ended;
    return this;
  }

  /**
   * Indicates if the execution is ended.
   * @return ended
  */
  
  @Schema(name = "ended", description = "Indicates if the execution is ended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ended")
  public Boolean getEnded() {
    return ended;
  }

  public void setEnded(Boolean ended) {
    this.ended = ended;
  }

  public ExecutionDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The id of the tenant this execution belongs to. Can be `null` if the execution belongs to no single tenant.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The id of the tenant this execution belongs to. Can be `null` if the execution belongs to no single tenant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenantId")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutionDto executionDto = (ExecutionDto) o;
    return Objects.equals(this.id, executionDto.id) &&
        Objects.equals(this.processInstanceId, executionDto.processInstanceId) &&
        Objects.equals(this.ended, executionDto.ended) &&
        Objects.equals(this.tenantId, executionDto.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processInstanceId, ended, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

