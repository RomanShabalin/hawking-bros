package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * OpenMeteoResponseCurrentUnits
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-14T15:05:33.913095300+03:00[Europe/Moscow]")


public class OpenMeteoResponseCurrentUnits   {
  @JsonProperty("time")
  private String time = null;

  @JsonProperty("interval")
  private String interval = null;

  @JsonProperty("temperature_2m")
  private String temperature2m = null;

  public OpenMeteoResponseCurrentUnits time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(description = "")
  
    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public OpenMeteoResponseCurrentUnits interval(String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Get interval
   * @return interval
   **/
  @Schema(description = "")
  
    public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public OpenMeteoResponseCurrentUnits temperature2m(String temperature2m) {
    this.temperature2m = temperature2m;
    return this;
  }

  /**
   * Get temperature2m
   * @return temperature2m
   **/
  @Schema(description = "")
  
    public String getTemperature2m() {
    return temperature2m;
  }

  public void setTemperature2m(String temperature2m) {
    this.temperature2m = temperature2m;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenMeteoResponseCurrentUnits openMeteoResponseCurrentUnits = (OpenMeteoResponseCurrentUnits) o;
    return Objects.equals(this.time, openMeteoResponseCurrentUnits.time) &&
        Objects.equals(this.interval, openMeteoResponseCurrentUnits.interval) &&
        Objects.equals(this.temperature2m, openMeteoResponseCurrentUnits.temperature2m);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, interval, temperature2m);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenMeteoResponseCurrentUnits {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    temperature2m: ").append(toIndentedString(temperature2m)).append("\n");
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
