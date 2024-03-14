package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * MsgB
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-14T15:05:33.913095300+03:00[Europe/Moscow]")


public class MsgB   {
  @JsonProperty("txt")
  private String txt = null;

  @JsonProperty("createdDt")
  private String createdDt = null;

  @JsonProperty("currentTemp")
  private String currentTemp = null;

  public MsgB txt(String txt) {
    this.txt = txt;
    return this;
  }

  /**
   * Некое текстовое сообщение
   * @return txt
   **/
  @Schema(example = "Привет!", description = "Некое текстовое сообщение")
  
    public String getTxt() {
    return txt;
  }

  public void setTxt(String txt) {
    this.txt = txt;
  }

  public MsgB createdDt(String createdDt) {
    this.createdDt = createdDt;
    return this;
  }

  /**
   * Дата формирования сообщения
   * @return createdDt
   **/
  @Schema(example = "2024-03-13T18:00:00Z", description = "Дата формирования сообщения")
  
    public String getCreatedDt() {
    return createdDt;
  }

  public void setCreatedDt(String createdDt) {
    this.createdDt = createdDt;
  }

  public MsgB currentTemp(String currentTemp) {
    this.currentTemp = currentTemp;
    return this;
  }

  /**
   * Температура по Цельсию
   * @return currentTemp
   **/
  @Schema(example = "28", description = "Температура по Цельсию")
  
    public String getCurrentTemp() {
    return currentTemp;
  }

  public void setCurrentTemp(String currentTemp) {
    this.currentTemp = currentTemp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgB msgB = (MsgB) o;
    return Objects.equals(this.txt, msgB.txt) &&
        Objects.equals(this.createdDt, msgB.createdDt) &&
        Objects.equals(this.currentTemp, msgB.currentTemp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txt, createdDt, currentTemp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgB {\n");
    
    sb.append("    txt: ").append(toIndentedString(txt)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
    sb.append("    currentTemp: ").append(toIndentedString(currentTemp)).append("\n");
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
