package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.AtomLink;
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
 * ProcessInstanceWithVariablesDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class ProcessInstanceWithVariablesDto {

  @Valid
  private Map<String, VariableValueDto> variables;

  private String id = null;

  private String definitionId = null;

  private String businessKey = null;

  private String caseInstanceId = null;

  private Boolean ended = null;

  private Boolean suspended = null;

  private String tenantId = null;

  @Valid
  private List<@Valid AtomLink> links;

  public ProcessInstanceWithVariablesDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessInstanceWithVariablesDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * The id of the process instance.
   * @return variables
  */
  @Valid 
  @Schema(name = "variables", description = "The id of the process instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }

  public ProcessInstanceWithVariablesDto id(String id) {
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

  public ProcessInstanceWithVariablesDto definitionId(String definitionId) {
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

  public ProcessInstanceWithVariablesDto businessKey(String businessKey) {
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

  public ProcessInstanceWithVariablesDto caseInstanceId(String caseInstanceId) {
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

  public ProcessInstanceWithVariablesDto ended(Boolean ended) {
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

  public ProcessInstanceWithVariablesDto suspended(Boolean suspended) {
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

  public ProcessInstanceWithVariablesDto tenantId(String tenantId) {
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

  public ProcessInstanceWithVariablesDto links(List<@Valid AtomLink> links) {
    this.links = links;
    return this;
  }

  public ProcessInstanceWithVariablesDto addLinksItem(AtomLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * The links associated to this resource, with `method`, `href` and `rel`.
   * @return links
  */
  @Valid 
  @Schema(name = "links", description = "The links associated to this resource, with `method`, `href` and `rel`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("links")
  public List<@Valid AtomLink> getLinks() {
    return links;
  }

  public void setLinks(List<@Valid AtomLink> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceWithVariablesDto processInstanceWithVariablesDto = (ProcessInstanceWithVariablesDto) o;
    return Objects.equals(this.variables, processInstanceWithVariablesDto.variables) &&
        Objects.equals(this.id, processInstanceWithVariablesDto.id) &&
        Objects.equals(this.definitionId, processInstanceWithVariablesDto.definitionId) &&
        Objects.equals(this.businessKey, processInstanceWithVariablesDto.businessKey) &&
        Objects.equals(this.caseInstanceId, processInstanceWithVariablesDto.caseInstanceId) &&
        Objects.equals(this.ended, processInstanceWithVariablesDto.ended) &&
        Objects.equals(this.suspended, processInstanceWithVariablesDto.suspended) &&
        Objects.equals(this.tenantId, processInstanceWithVariablesDto.tenantId) &&
        Objects.equals(this.links, processInstanceWithVariablesDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variables, id, definitionId, businessKey, caseInstanceId, ended, suspended, tenantId, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceWithVariablesDto {\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

