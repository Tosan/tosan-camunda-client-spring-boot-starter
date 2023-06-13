package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AuthenticationResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AuthenticationResult {

  private String authenticatedUser = null;

  private Boolean isAuthenticated = null;

  @Valid
  private List<String> tenants;

  @Valid
  private List<String> groups;

  public AuthenticationResult authenticatedUser(String authenticatedUser) {
    this.authenticatedUser = authenticatedUser;
    return this;
  }

  /**
   * An id of authenticated user.
   * @return authenticatedUser
  */
  
  @Schema(name = "authenticatedUser", description = "An id of authenticated user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("authenticatedUser")
  public String getAuthenticatedUser() {
    return authenticatedUser;
  }

  public void setAuthenticatedUser(String authenticatedUser) {
    this.authenticatedUser = authenticatedUser;
  }

  public AuthenticationResult isAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
    return this;
  }

  /**
   * A flag indicating if user is authenticated.
   * @return isAuthenticated
  */
  
  @Schema(name = "isAuthenticated", description = "A flag indicating if user is authenticated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAuthenticated")
  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }

  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  public AuthenticationResult tenants(List<String> tenants) {
    this.tenants = tenants;
    return this;
  }

  public AuthenticationResult addTenantsItem(String tenantsItem) {
    if (this.tenants == null) {
      this.tenants = new ArrayList<>();
    }
    this.tenants.add(tenantsItem);
    return this;
  }

  /**
   * Will be null.
   * @return tenants
  */
  
  @Schema(name = "tenants", description = "Will be null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tenants")
  public List<String> getTenants() {
    return tenants;
  }

  public void setTenants(List<String> tenants) {
    this.tenants = tenants;
  }

  public AuthenticationResult groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public AuthenticationResult addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Will be null.
   * @return groups
  */
  
  @Schema(name = "groups", description = "Will be null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationResult authenticationResult = (AuthenticationResult) o;
    return Objects.equals(this.authenticatedUser, authenticationResult.authenticatedUser) &&
        Objects.equals(this.isAuthenticated, authenticationResult.isAuthenticated) &&
        Objects.equals(this.tenants, authenticationResult.tenants) &&
        Objects.equals(this.groups, authenticationResult.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticatedUser, isAuthenticated, tenants, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationResult {\n");
    sb.append("    authenticatedUser: ").append(toIndentedString(authenticatedUser)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

