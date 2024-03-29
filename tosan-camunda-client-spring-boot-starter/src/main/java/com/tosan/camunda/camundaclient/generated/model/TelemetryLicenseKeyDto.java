package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TelemetryLicenseKeyDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TelemetryLicenseKeyDto {

  private String customer = null;

  private String type = null;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate validUntil = null;

  private Boolean unlimited = null;

  @Valid
  private Map<String, String> features = new HashMap<>();

  private String raw = null;

  public TelemetryLicenseKeyDto customer(String customer) {
    this.customer = customer;
    return this;
  }

  /**
   * The name of the customer the license was issued for.
   * @return customer
  */
  
  @Schema(name = "customer", description = "The name of the customer the license was issued for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer")
  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public TelemetryLicenseKeyDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The license type.
   * @return type
  */
  
  @Schema(name = "type", description = "The license type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TelemetryLicenseKeyDto validUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
    return this;
  }

  /**
   * The expiration date of the license.
   * @return validUntil
  */
  @Valid 
  @Schema(name = "valid-until", description = "The expiration date of the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid-until")
  public LocalDate getValidUntil() {
    return validUntil;
  }

  public void setValidUntil(LocalDate validUntil) {
    this.validUntil = validUntil;
  }

  public TelemetryLicenseKeyDto unlimited(Boolean unlimited) {
    this.unlimited = unlimited;
    return this;
  }

  /**
   * Flag that indicates if the license is unlimited.
   * @return unlimited
  */
  
  @Schema(name = "unlimited", description = "Flag that indicates if the license is unlimited.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unlimited")
  public Boolean getUnlimited() {
    return unlimited;
  }

  public void setUnlimited(Boolean unlimited) {
    this.unlimited = unlimited;
  }

  public TelemetryLicenseKeyDto features(Map<String, String> features) {
    this.features = features;
    return this;
  }

  public TelemetryLicenseKeyDto putFeaturesItem(String key, String featuresItem) {
    if (this.features == null) {
      this.features = new HashMap<>();
    }
    this.features.put(key, featuresItem);
    return this;
  }

  /**
   * A map of features included in the license.
   * @return features
  */
  
  @Schema(name = "features", description = "A map of features included in the license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("features")
  public Map<String, String> getFeatures() {
    return features;
  }

  public void setFeatures(Map<String, String> features) {
    this.features = features;
  }

  public TelemetryLicenseKeyDto raw(String raw) {
    this.raw = raw;
    return this;
  }

  /**
   * The raw license information.
   * @return raw
  */
  
  @Schema(name = "raw", description = "The raw license information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryLicenseKeyDto telemetryLicenseKeyDto = (TelemetryLicenseKeyDto) o;
    return Objects.equals(this.customer, telemetryLicenseKeyDto.customer) &&
        Objects.equals(this.type, telemetryLicenseKeyDto.type) &&
        Objects.equals(this.validUntil, telemetryLicenseKeyDto.validUntil) &&
        Objects.equals(this.unlimited, telemetryLicenseKeyDto.unlimited) &&
        Objects.equals(this.features, telemetryLicenseKeyDto.features) &&
        Objects.equals(this.raw, telemetryLicenseKeyDto.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, type, validUntil, unlimited, features, raw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryLicenseKeyDto {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

