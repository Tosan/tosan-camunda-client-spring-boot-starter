package com.tosan.camunda.camundaclient.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * AbstractVendorVersionInformationDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")


public class AbstractVendorVersionInformationDto   {
  @JsonProperty("vendor")
  private String vendor = null;

  @JsonProperty("version")
  private String version = null;

  public AbstractVendorVersionInformationDto vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * Information about the vendor.
   * @return vendor
   **/
  @Schema(description = "Information about the vendor.")
  
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
   **/
  @Schema(description = "Information about the version.")
  
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
