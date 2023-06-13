package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProcessInstanceDtoAllOf
 */

@JsonTypeName("ProcessInstanceDto_allOf")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceDtoAllOf {

  private String id = null;

  private String definitionId = null;

  private String businessKey = null;

  private String caseInstanceId = null;

  private Boolean ended = null;

  private Boolean suspended = null;

  private String tenantId = null;

  public ProcessInstanceDtoAllOf id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the process instance.
   * @return id
  */
  
  @Schema(name = "id", description = "The id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessInstanceDtoAllOf definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

  /**
   * The id of the process definition that this process instance belongs to.
   * @return definitionId
  */
  
  @Schema(name = "definitionId", description = "The id of the process definition that this process instance belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("definitionId")
  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  public ProcessInstanceDtoAllOf businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

  /**
   * The business key of the process instance.
   * @return businessKey
  */
  
  @Schema(name = "businessKey", description = "The business key of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("businessKey")
  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public ProcessInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

  /**
   * The id of the case instance associated with the process instance.
   * @return caseInstanceId
  */
  
  @Schema(name = "caseInstanceId", description = "The id of the case instance associated with the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("caseInstanceId")
  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public ProcessInstanceDtoAllOf ended(Boolean ended) {
    this.ended = ended;
    return this;
  }

  /**
   * A flag indicating whether the process instance has ended or not. Deprecated: will always be false!
   * @return ended
  */
  
  @Schema(name = "ended", description = "A flag indicating whether the process instance has ended or not. Deprecated: will always be false!", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ended")
  public Boolean getEnded() {
    return ended;
  }

  public void setEnded(Boolean ended) {
    this.ended = ended;
  }

  public ProcessInstanceDtoAllOf suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

  /**
   * A flag indicating whether the process instance is suspended or not.
   * @return suspended
  */
  
  @Schema(name = "suspended", description = "A flag indicating whether the process instance is suspended or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suspended")
  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  public ProcessInstanceDtoAllOf tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * The tenant id of the process instance.
   * @return tenantId
  */
  
  @Schema(name = "tenantId", description = "The tenant id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProcessInstanceDtoAllOf processInstanceDtoAllOf = (ProcessInstanceDtoAllOf) o;
    return Objects.equals(this.id, processInstanceDtoAllOf.id) &&
        Objects.equals(this.definitionId, processInstanceDtoAllOf.definitionId) &&
        Objects.equals(this.businessKey, processInstanceDtoAllOf.businessKey) &&
        Objects.equals(this.caseInstanceId, processInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.ended, processInstanceDtoAllOf.ended) &&
        Objects.equals(this.suspended, processInstanceDtoAllOf.suspended) &&
        Objects.equals(this.tenantId, processInstanceDtoAllOf.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, definitionId, businessKey, caseInstanceId, ended, suspended, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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

