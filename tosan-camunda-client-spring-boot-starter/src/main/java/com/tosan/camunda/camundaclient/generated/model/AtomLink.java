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
 * AtomLink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AtomLink {

  private String rel = null;

  private String href = null;

  private String method = null;

  public AtomLink rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * The relation of the link to the object that belongs to.
   * @return rel
  */
  
  @Schema(name = "rel", description = "The relation of the link to the object that belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rel")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public AtomLink href(String href) {
    this.href = href;
    return this;
  }

  /**
   * The url of the link.
   * @return href
  */
  
  @Schema(name = "href", description = "The url of the link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AtomLink method(String method) {
    this.method = method;
    return this;
  }

  /**
   * The http method.
   * @return method
  */
  
  @Schema(name = "method", description = "The http method.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AtomLink atomLink = (AtomLink) o;
    return Objects.equals(this.rel, atomLink.rel) &&
        Objects.equals(this.href, atomLink.href) &&
        Objects.equals(this.method, atomLink.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href, method);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtomLink {\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

