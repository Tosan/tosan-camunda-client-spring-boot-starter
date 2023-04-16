package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * ProcessInstanceWithVariablesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class ProcessInstanceWithVariablesDto   {
  private String id;
  private String definitionId;
  private String businessKey;
  private String caseInstanceId;
  private String tenantId;
  private Boolean ended;
  private Boolean suspended;
  @JsonProperty("links")
  @Valid
  private List<AtomLink> links = null;

  public ProcessInstanceWithVariablesDto links(List<AtomLink> links) {
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDefinitionId() {
    return definitionId;
  }

  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }

  public String getBusinessKey() {
    return businessKey;
  }

  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }

  public String getCaseInstanceId() {
    return caseInstanceId;
  }

  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Boolean getEnded() {
    return ended;
  }

  public void setEnded(Boolean ended) {
    this.ended = ended;
  }

  public Boolean getSuspended() {
    return suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }

  /**
   * The links associated to this resource, with `method`, `href` and `rel`.
   * @return links
   **/
  @Schema(description = "The links associated to this resource, with `method`, `href` and `rel`.")
      @Valid
    public List<AtomLink> getLinks() {
    return links;
  }

  public void setLinks(List<AtomLink> links) {
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
    return Objects.equals(this.links, processInstanceWithVariablesDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceWithVariablesDto {\n");
    
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
