package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.MsgACoordinates;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * MsgA
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-14T15:05:33.913095300+03:00[Europe/Moscow]")


public class MsgA   {
  @JsonProperty("msg")
  private String msg = null;

  /**
   * Язык сообщения
   */
  public enum LngEnum {
    RU("ru"),
    
    EN("en"),
    
    ES("es");

    private String value;

    LngEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LngEnum fromValue(String text) {
      for (LngEnum b : LngEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("lng")
  private LngEnum lng = null;

  @JsonProperty("coordinates")
  private MsgACoordinates coordinates = null;

  public MsgA msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Некое текстовое сообщение
   * @return msg
   **/
  @Schema(example = "Привет!", description = "Некое текстовое сообщение")
  
    public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public MsgA lng(LngEnum lng) {
    this.lng = lng;
    return this;
  }

  /**
   * Язык сообщения
   * @return lng
   **/
  @Schema(example = "ru", description = "Язык сообщения")
  
    public LngEnum getLng() {
    return lng;
  }

  public void setLng(LngEnum lng) {
    this.lng = lng;
  }

  public MsgA coordinates(MsgACoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   * @return coordinates
   **/
  @Schema(description = "")
  
    @Valid
    public MsgACoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(MsgACoordinates coordinates) {
    this.coordinates = coordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgA msgA = (MsgA) o;
    return Objects.equals(this.msg, msgA.msg) &&
        Objects.equals(this.lng, msgA.lng) &&
        Objects.equals(this.coordinates, msgA.coordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msg, lng, coordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgA {\n");
    
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
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
