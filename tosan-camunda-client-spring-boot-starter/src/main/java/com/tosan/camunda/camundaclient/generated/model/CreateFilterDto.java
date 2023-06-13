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
 * CreateFilterDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class CreateFilterDto {

  private String resourceType = null;

  private String name = null;

  private String owner = null;

  private Object query;

  private Object properties;

  public CreateFilterDto resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The resource type of the filter.
   * @return resourceType
  */
  
  @Schema(name = "resourceType", description = "The resource type of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public CreateFilterDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFilterDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The user id of the owner of the filter.
   * @return owner
  */
  
  @Schema(name = "owner", description = "The user id of the owner of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public CreateFilterDto query(Object query) {
    this.query = query;
    return this;
  }

  /**
   * The query of the filter as a JSON object.
   * @return query
  */
  
  @Schema(name = "query", description = "The query of the filter as a JSON object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public Object getQuery() {
    return query;
  }

  public void setQuery(Object query) {
    this.query = query;
  }

  public CreateFilterDto properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The properties of a filter as a JSON object.
   * @return properties
  */
  
  @Schema(name = "properties", description = "The properties of a filter as a JSON object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFilterDto createFilterDto = (CreateFilterDto) o;
    return Objects.equals(this.resourceType, createFilterDto.resourceType) &&
        Objects.equals(this.name, createFilterDto.name) &&
        Objects.equals(this.owner, createFilterDto.owner) &&
        Objects.equals(this.query, createFilterDto.query) &&
        Objects.equals(this.properties, createFilterDto.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, name, owner, query, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFilterDto {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

