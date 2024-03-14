package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OpenMeteoResponseCurrent;
import io.swagger.model.OpenMeteoResponseCurrentUnits;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * OpenMeteoResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-14T15:05:33.913095300+03:00[Europe/Moscow]")


public class OpenMeteoResponse   {
  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  @JsonProperty("generationtime_ms")
  private BigDecimal generationtimeMs = null;

  @JsonProperty("utc_offset_seconds")
  private Integer utcOffsetSeconds = null;

  @JsonProperty("timezone")
  private String timezone = null;

  @JsonProperty("timezone_abbreviation")
  private String timezoneAbbreviation = null;

  @JsonProperty("elevation")
  private BigDecimal elevation = null;

  @JsonProperty("current_units")
  private OpenMeteoResponseCurrentUnits currentUnits = null;

  @JsonProperty("current")
  private OpenMeteoResponseCurrent current = null;

  public OpenMeteoResponse latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   * @return latitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public OpenMeteoResponse longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * @return longitude
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public OpenMeteoResponse generationtimeMs(BigDecimal generationtimeMs) {
    this.generationtimeMs = generationtimeMs;
    return this;
  }

  /**
   * Get generationtimeMs
   * @return generationtimeMs
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getGenerationtimeMs() {
    return generationtimeMs;
  }

  public void setGenerationtimeMs(BigDecimal generationtimeMs) {
    this.generationtimeMs = generationtimeMs;
  }

  public OpenMeteoResponse utcOffsetSeconds(Integer utcOffsetSeconds) {
    this.utcOffsetSeconds = utcOffsetSeconds;
    return this;
  }

  /**
   * Get utcOffsetSeconds
   * @return utcOffsetSeconds
   **/
  @Schema(description = "")
  
    public Integer getUtcOffsetSeconds() {
    return utcOffsetSeconds;
  }

  public void setUtcOffsetSeconds(Integer utcOffsetSeconds) {
    this.utcOffsetSeconds = utcOffsetSeconds;
  }

  public OpenMeteoResponse timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
   **/
  @Schema(description = "")
  
    public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public OpenMeteoResponse timezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
    return this;
  }

  /**
   * Get timezoneAbbreviation
   * @return timezoneAbbreviation
   **/
  @Schema(description = "")
  
    public String getTimezoneAbbreviation() {
    return timezoneAbbreviation;
  }

  public void setTimezoneAbbreviation(String timezoneAbbreviation) {
    this.timezoneAbbreviation = timezoneAbbreviation;
  }

  public OpenMeteoResponse elevation(BigDecimal elevation) {
    this.elevation = elevation;
    return this;
  }

  /**
   * Get elevation
   * @return elevation
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getElevation() {
    return elevation;
  }

  public void setElevation(BigDecimal elevation) {
    this.elevation = elevation;
  }

  public OpenMeteoResponse currentUnits(OpenMeteoResponseCurrentUnits currentUnits) {
    this.currentUnits = currentUnits;
    return this;
  }

  /**
   * Get currentUnits
   * @return currentUnits
   **/
  @Schema(description = "")
  
    @Valid
    public OpenMeteoResponseCurrentUnits getCurrentUnits() {
    return currentUnits;
  }

  public void setCurrentUnits(OpenMeteoResponseCurrentUnits currentUnits) {
    this.currentUnits = currentUnits;
  }

  public OpenMeteoResponse current(OpenMeteoResponseCurrent current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   **/
  @Schema(description = "")
  
    @Valid
    public OpenMeteoResponseCurrent getCurrent() {
    return current;
  }

  public void setCurrent(OpenMeteoResponseCurrent current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenMeteoResponse openMeteoResponse = (OpenMeteoResponse) o;
    return Objects.equals(this.latitude, openMeteoResponse.latitude) &&
        Objects.equals(this.longitude, openMeteoResponse.longitude) &&
        Objects.equals(this.generationtimeMs, openMeteoResponse.generationtimeMs) &&
        Objects.equals(this.utcOffsetSeconds, openMeteoResponse.utcOffsetSeconds) &&
        Objects.equals(this.timezone, openMeteoResponse.timezone) &&
        Objects.equals(this.timezoneAbbreviation, openMeteoResponse.timezoneAbbreviation) &&
        Objects.equals(this.elevation, openMeteoResponse.elevation) &&
        Objects.equals(this.currentUnits, openMeteoResponse.currentUnits) &&
        Objects.equals(this.current, openMeteoResponse.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, generationtimeMs, utcOffsetSeconds, timezone, timezoneAbbreviation, elevation, currentUnits, current);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenMeteoResponse {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    generationtimeMs: ").append(toIndentedString(generationtimeMs)).append("\n");
    sb.append("    utcOffsetSeconds: ").append(toIndentedString(utcOffsetSeconds)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    timezoneAbbreviation: ").append(toIndentedString(timezoneAbbreviation)).append("\n");
    sb.append("    elevation: ").append(toIndentedString(elevation)).append("\n");
    sb.append("    currentUnits: ").append(toIndentedString(currentUnits)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
