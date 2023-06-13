package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tosan.camunda.camundaclient.generated.model.HistoricProcessInstanceQueryDto;
import com.tosan.camunda.camundaclient.generated.model.ProcessInstanceQueryDto;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessInstanceSuspensionStateDtoAllOf
 */

@JsonTypeName("ProcessInstanceSuspensionStateDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceSuspensionStateDtoAllOf {

  private String processDefinitionId = null;

  private String processDefinitionKey = null;

  private String processDefinitionTenantId = null;

  private Boolean processDefinitionWithoutTenantId = null;

  @Valid
  private List<String> processInstanceIds;

  private ProcessInstanceQueryDto processInstanceQuery;

  private HistoricProcessInstanceQueryDto historicProcessInstanceQuery;

  public ProcessInstanceSuspensionStateDtoAllOf processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

  /**
   * The process definition id of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of `suspended`.
   * @return processDefinitionId
  */
  
  @Schema(name = "processDefinitionId", description = "The process definition id of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of `suspended`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionId")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public ProcessInstanceSuspensionStateDtoAllOf processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

  /**
   * The process definition key of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionTenantId`, and `processDefinitionWithoutTenantId`.
   * @return processDefinitionKey
  */
  
  @Schema(name = "processDefinitionKey", description = "The process definition key of the process instances to activate or suspend.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionTenantId`, and `processDefinitionWithoutTenantId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionKey")
  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }

  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }

  public ProcessInstanceSuspensionStateDtoAllOf processDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
    return this;
  }

  /**
   * Only activate or suspend process instances of a process definition which belongs to a tenant with the given id.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionKey`, and `processDefinitionWithoutTenantId`.
   * @return processDefinitionTenantId
  */
  
  @Schema(name = "processDefinitionTenantId", description = "Only activate or suspend process instances of a process definition which belongs to a tenant with the given id.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionKey`, and `processDefinitionWithoutTenantId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionTenantId")
  public String getProcessDefinitionTenantId() {
    return processDefinitionTenantId;
  }

  public void setProcessDefinitionTenantId(String processDefinitionTenantId) {
    this.processDefinitionTenantId = processDefinitionTenantId;
  }

  public ProcessInstanceSuspensionStateDtoAllOf processDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
    return this;
  }

  /**
   * Only activate or suspend process instances of a process definition which belongs to no tenant. Value may only be true, as false is the default behavior.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionKey`, and `processDefinitionTenantId`.
   * @return processDefinitionWithoutTenantId
  */
  
  @Schema(name = "processDefinitionWithoutTenantId", description = "Only activate or suspend process instances of a process definition which belongs to no tenant. Value may only be true, as false is the default behavior.  **Note**: This parameter can be used only with combination of `suspended`, `processDefinitionKey`, and `processDefinitionTenantId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processDefinitionWithoutTenantId")
  public Boolean getProcessDefinitionWithoutTenantId() {
    return processDefinitionWithoutTenantId;
  }

  public void setProcessDefinitionWithoutTenantId(Boolean processDefinitionWithoutTenantId) {
    this.processDefinitionWithoutTenantId = processDefinitionWithoutTenantId;
  }

  public ProcessInstanceSuspensionStateDtoAllOf processInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
    return this;
  }

  public ProcessInstanceSuspensionStateDtoAllOf addProcessInstanceIdsItem(String processInstanceIdsItem) {
    if (this.processInstanceIds == null) {
      this.processInstanceIds = new ArrayList<>();
    }
    this.processInstanceIds.add(processInstanceIdsItem);
    return this;
  }

  /**
   * A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.  **Note**: This parameter can be used only with combination of `suspended`, `processInstanceQuery`, and `historicProcessInstanceQuery`.
   * @return processInstanceIds
  */
  
  @Schema(name = "processInstanceIds", description = "A list of process instance ids which defines a group of process instances which will be activated or suspended by the operation.  **Note**: This parameter can be used only with combination of `suspended`, `processInstanceQuery`, and `historicProcessInstanceQuery`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceIds")
  public List<String> getProcessInstanceIds() {
    return processInstanceIds;
  }

  public void setProcessInstanceIds(List<String> processInstanceIds) {
    this.processInstanceIds = processInstanceIds;
  }

  public ProcessInstanceSuspensionStateDtoAllOf processInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
    return this;
  }

  /**
   * Get processInstanceQuery
   * @return processInstanceQuery
  */
  @Valid 
  @Schema(name = "processInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processInstanceQuery")
  public ProcessInstanceQueryDto getProcessInstanceQuery() {
    return processInstanceQuery;
  }

  public void setProcessInstanceQuery(ProcessInstanceQueryDto processInstanceQuery) {
    this.processInstanceQuery = processInstanceQuery;
  }

  public ProcessInstanceSuspensionStateDtoAllOf historicProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
    return this;
  }

  /**
   * Get historicProcessInstanceQuery
   * @return historicProcessInstanceQuery
  */
  @Valid 
  @Schema(name = "historicProcessInstanceQuery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("historicProcessInstanceQuery")
  public HistoricProcessInstanceQueryDto getHistoricProcessInstanceQuery() {
    return historicProcessInstanceQuery;
  }

  public void setHistoricProcessInstanceQuery(HistoricProcessInstanceQueryDto historicProcessInstanceQuery) {
    this.historicProcessInstanceQuery = historicProcessInstanceQuery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceSuspensionStateDtoAllOf processInstanceSuspensionStateDtoAllOf = (ProcessInstanceSuspensionStateDtoAllOf) o;
    return Objects.equals(this.processDefinitionId, processInstanceSuspensionStateDtoAllOf.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, processInstanceSuspensionStateDtoAllOf.processDefinitionKey) &&
        Objects.equals(this.processDefinitionTenantId, processInstanceSuspensionStateDtoAllOf.processDefinitionTenantId) &&
        Objects.equals(this.processDefinitionWithoutTenantId, processInstanceSuspensionStateDtoAllOf.processDefinitionWithoutTenantId) &&
        Objects.equals(this.processInstanceIds, processInstanceSuspensionStateDtoAllOf.processInstanceIds) &&
        Objects.equals(this.processInstanceQuery, processInstanceSuspensionStateDtoAllOf.processInstanceQuery) &&
        Objects.equals(this.historicProcessInstanceQuery, processInstanceSuspensionStateDtoAllOf.historicProcessInstanceQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, processDefinitionKey, processDefinitionTenantId, processDefinitionWithoutTenantId, processInstanceIds, processInstanceQuery, historicProcessInstanceQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceSuspensionStateDtoAllOf {\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionTenantId: ").append(toIndentedString(processDefinitionTenantId)).append("\n");
    sb.append("    processDefinitionWithoutTenantId: ").append(toIndentedString(processDefinitionWithoutTenantId)).append("\n");
    sb.append("    processInstanceIds: ").append(toIndentedString(processInstanceIds)).append("\n");
    sb.append("    processInstanceQuery: ").append(toIndentedString(processInstanceQuery)).append("\n");
    sb.append("    historicProcessInstanceQuery: ").append(toIndentedString(historicProcessInstanceQuery)).append("\n");
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

