package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * FilterDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class FilterDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("resourceType")
  private String resourceType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("query")
  private Object query = null;

  @JsonProperty("properties")
  private Object properties = null;

  @JsonProperty("itemCount")
  private Long itemCount = null;

  public FilterDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the filter.
   * @return id
   **/
  @Schema(description = "The id of the filter.")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FilterDto resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The resource type of the filter.
   * @return resourceType
   **/
  @Schema(description = "The resource type of the filter.")
  
    public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public FilterDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter.
   * @return name
   **/
  @Schema(description = "The name of the filter.")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterDto owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * The user id of the owner of the filter.
   * @return owner
   **/
  @Schema(description = "The user id of the owner of the filter.")
  
    public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public FilterDto query(Object query) {
    this.query = query;
    return this;
  }

  /**
   * The query of the filter as a JSON object.
   * @return query
   **/
  @Schema(description = "The query of the filter as a JSON object.")
  
    public Object getQuery() {
    return query;
  }

  public void setQuery(Object query) {
    this.query = query;
  }

  public FilterDto properties(Object properties) {
    this.properties = properties;
    return this;
  }

  /**
   * The properties of a filter as a JSON object.
   * @return properties
   **/
  @Schema(description = "The properties of a filter as a JSON object.")
  
    public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public FilterDto itemCount(Long itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   *  The number of items matched by the filter itself. Note: Only exists if the query parameter `itemCount` was set to `true`
   * @return itemCount
   **/
  @Schema(description = " The number of items matched by the filter itself. Note: Only exists if the query parameter `itemCount` was set to `true`")
  
    public Long getItemCount() {
    return itemCount;
  }

  public void setItemCount(Long itemCount) {
    this.itemCount = itemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDto filterDto = (FilterDto) o;
    return Objects.equals(this.id, filterDto.id) &&
        Objects.equals(this.resourceType, filterDto.resourceType) &&
        Objects.equals(this.name, filterDto.name) &&
        Objects.equals(this.owner, filterDto.owner) &&
        Objects.equals(this.query, filterDto.query) &&
        Objects.equals(this.properties, filterDto.properties) &&
        Objects.equals(this.itemCount, filterDto.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceType, name, owner, query, properties, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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
