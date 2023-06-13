package com.tosan.camunda.camundaclient.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tosan.camunda.camundaclient.generated.model.AbstractVendorVersionInformationDto;
import com.tosan.camunda.camundaclient.generated.model.TelemetryCountDto;
import com.tosan.camunda.camundaclient.generated.model.TelemetryLicenseKeyDto;
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
 * TelemetryInternalsDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T23:54:11.217695800+03:30[GMT+03:30]")
public class TelemetryInternalsDto {

  @Valid
  private Map<String, AbstractVendorVersionInformationDto> database;

  @Valid
  private Map<String, AbstractVendorVersionInformationDto> applicationServer;

  @Valid
  private Map<String, TelemetryLicenseKeyDto> licenseKey;

  @Valid
  private List<String> camundaIntegration;

  @Valid
  private Map<String, TelemetryCountDto> commands;

  @Valid
  private Map<String, TelemetryCountDto> metrics;

  @Valid
  private List<String> webapps;

  @Valid
  private Map<String, AbstractVendorVersionInformationDto> jdk;

  public TelemetryInternalsDto database(Map<String, AbstractVendorVersionInformationDto> database) {
    this.database = database;
    return this;
  }

  public TelemetryInternalsDto putDatabaseItem(String key, AbstractVendorVersionInformationDto databaseItem) {
    if (this.database == null) {
      this.database = new HashMap<>();
    }
    this.database.put(key, databaseItem);
    return this;
  }

  /**
   * Vendor and version of the connected database.
   * @return database
  */
  @Valid 
  @Schema(name = "database", description = "Vendor and version of the connected database.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("database")
  public Map<String, AbstractVendorVersionInformationDto> getDatabase() {
    return database;
  }

  public void setDatabase(Map<String, AbstractVendorVersionInformationDto> database) {
    this.database = database;
  }

  public TelemetryInternalsDto applicationServer(Map<String, AbstractVendorVersionInformationDto> applicationServer) {
    this.applicationServer = applicationServer;
    return this;
  }

  public TelemetryInternalsDto putApplicationServerItem(String key, AbstractVendorVersionInformationDto applicationServerItem) {
    if (this.applicationServer == null) {
      this.applicationServer = new HashMap<>();
    }
    this.applicationServer.put(key, applicationServerItem);
    return this;
  }

  /**
   * Vendor and version of the application server.
   * @return applicationServer
  */
  @Valid 
  @Schema(name = "application-server", description = "Vendor and version of the application server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application-server")
  public Map<String, AbstractVendorVersionInformationDto> getApplicationServer() {
    return applicationServer;
  }

  public void setApplicationServer(Map<String, AbstractVendorVersionInformationDto> applicationServer) {
    this.applicationServer = applicationServer;
  }

  public TelemetryInternalsDto licenseKey(Map<String, TelemetryLicenseKeyDto> licenseKey) {
    this.licenseKey = licenseKey;
    return this;
  }

  public TelemetryInternalsDto putLicenseKeyItem(String key, TelemetryLicenseKeyDto licenseKeyItem) {
    if (this.licenseKey == null) {
      this.licenseKey = new HashMap<>();
    }
    this.licenseKey.put(key, licenseKeyItem);
    return this;
  }

  /**
   * Information about the Camunda license key.
   * @return licenseKey
  */
  @Valid 
  @Schema(name = "license-key", description = "Information about the Camunda license key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("license-key")
  public Map<String, TelemetryLicenseKeyDto> getLicenseKey() {
    return licenseKey;
  }

  public void setLicenseKey(Map<String, TelemetryLicenseKeyDto> licenseKey) {
    this.licenseKey = licenseKey;
  }

  public TelemetryInternalsDto camundaIntegration(List<String> camundaIntegration) {
    this.camundaIntegration = camundaIntegration;
    return this;
  }

  public TelemetryInternalsDto addCamundaIntegrationItem(String camundaIntegrationItem) {
    if (this.camundaIntegration == null) {
      this.camundaIntegration = new ArrayList<>();
    }
    this.camundaIntegration.add(camundaIntegrationItem);
    return this;
  }

  /**
   * List of Camunda integrations used (e.g., Camunda Spring Boot Starter, Camunda Run, WildFly/JBoss subsystem, Camunda EJB).
   * @return camundaIntegration
  */
  
  @Schema(name = "camunda-integration", description = "List of Camunda integrations used (e.g., Camunda Spring Boot Starter, Camunda Run, WildFly/JBoss subsystem, Camunda EJB).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("camunda-integration")
  public List<String> getCamundaIntegration() {
    return camundaIntegration;
  }

  public void setCamundaIntegration(List<String> camundaIntegration) {
    this.camundaIntegration = camundaIntegration;
  }

  public TelemetryInternalsDto commands(Map<String, TelemetryCountDto> commands) {
    this.commands = commands;
    return this;
  }

  public TelemetryInternalsDto putCommandsItem(String key, TelemetryCountDto commandsItem) {
    if (this.commands == null) {
      this.commands = new HashMap<>();
    }
    this.commands.put(key, commandsItem);
    return this;
  }

  /**
   * The count of executed commands after the last retrieved data.
   * @return commands
  */
  @Valid 
  @Schema(name = "commands", description = "The count of executed commands after the last retrieved data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commands")
  public Map<String, TelemetryCountDto> getCommands() {
    return commands;
  }

  public void setCommands(Map<String, TelemetryCountDto> commands) {
    this.commands = commands;
  }

  public TelemetryInternalsDto metrics(Map<String, TelemetryCountDto> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TelemetryInternalsDto putMetricsItem(String key, TelemetryCountDto metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * The collected metrics are the number of root process instance executions started, the number of activity instances started or also known as flow node instances, and the number of executed decision instances and elements.
   * @return metrics
  */
  @Valid 
  @Schema(name = "metrics", description = "The collected metrics are the number of root process instance executions started, the number of activity instances started or also known as flow node instances, and the number of executed decision instances and elements.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics")
  public Map<String, TelemetryCountDto> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, TelemetryCountDto> metrics) {
    this.metrics = metrics;
  }

  public TelemetryInternalsDto webapps(List<String> webapps) {
    this.webapps = webapps;
    return this;
  }

  public TelemetryInternalsDto addWebappsItem(String webappsItem) {
    if (this.webapps == null) {
      this.webapps = new ArrayList<>();
    }
    this.webapps.add(webappsItem);
    return this;
  }

  /**
   * The webapps enabled in this installation of Camunda.
   * @return webapps
  */
  
  @Schema(name = "webapps", description = "The webapps enabled in this installation of Camunda.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webapps")
  public List<String> getWebapps() {
    return webapps;
  }

  public void setWebapps(List<String> webapps) {
    this.webapps = webapps;
  }

  public TelemetryInternalsDto jdk(Map<String, AbstractVendorVersionInformationDto> jdk) {
    this.jdk = jdk;
    return this;
  }

  public TelemetryInternalsDto putJdkItem(String key, AbstractVendorVersionInformationDto jdkItem) {
    if (this.jdk == null) {
      this.jdk = new HashMap<>();
    }
    this.jdk.put(key, jdkItem);
    return this;
  }

  /**
   * Vendor and version of the installed JDK.
   * @return jdk
  */
  @Valid 
  @Schema(name = "jdk", description = "Vendor and version of the installed JDK.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jdk")
  public Map<String, AbstractVendorVersionInformationDto> getJdk() {
    return jdk;
  }

  public void setJdk(Map<String, AbstractVendorVersionInformationDto> jdk) {
    this.jdk = jdk;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryInternalsDto telemetryInternalsDto = (TelemetryInternalsDto) o;
    return Objects.equals(this.database, telemetryInternalsDto.database) &&
        Objects.equals(this.applicationServer, telemetryInternalsDto.applicationServer) &&
        Objects.equals(this.licenseKey, telemetryInternalsDto.licenseKey) &&
        Objects.equals(this.camundaIntegration, telemetryInternalsDto.camundaIntegration) &&
        Objects.equals(this.commands, telemetryInternalsDto.commands) &&
        Objects.equals(this.metrics, telemetryInternalsDto.metrics) &&
        Objects.equals(this.webapps, telemetryInternalsDto.webapps) &&
        Objects.equals(this.jdk, telemetryInternalsDto.jdk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(database, applicationServer, licenseKey, camundaIntegration, commands, metrics, webapps, jdk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryInternalsDto {\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    applicationServer: ").append(toIndentedString(applicationServer)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    camundaIntegration: ").append(toIndentedString(camundaIntegration)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    webapps: ").append(toIndentedString(webapps)).append("\n");
    sb.append("    jdk: ").append(toIndentedString(jdk)).append("\n");
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

