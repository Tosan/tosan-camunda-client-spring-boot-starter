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
 * AbstractVendorVersionInformationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class AbstractVendorVersionInformationDto {

  private String vendor = null;

  private String version = null;

  public AbstractVendorVersionInformationDto vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Information about the vendor.
   * @return vendor
  */
  
  @Schema(name = "vendor", description = "Information about the vendor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendor")
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public AbstractVendorVersionInformationDto version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Information about the version.
   * @return version
  */
  
  @Schema(name = "version", description = "Information about the version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractVendorVersionInformationDto abstractVendorVersionInformationDto = (AbstractVendorVersionInformationDto) o;
    return Objects.equals(this.vendor, abstractVendorVersionInformationDto.vendor) &&
        Objects.equals(this.version, abstractVendorVersionInformationDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendor, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractVendorVersionInformationDto {\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

