package com.c2psi.bmv1.dto;

import java.util.Objects;
import com.c2psi.bmv1.dto.ArticleDto;
import com.c2psi.bmv1.dto.SupplyinvoiceDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An arrival in the system
 */
@ApiModel(description = "An arrival in the system")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-08T23:11:35.582723400+01:00[Africa/Douala]")
public class ArrivalDto   {
  @JsonProperty("deliveryQuantity")
  private Double deliveryQuantity;

  @JsonProperty("arrivalDate")
  private String arrivalDate;

  @JsonProperty("arrivalUnitprice")
  private Double arrivalUnitprice;

  /**
   * Gets or Sets arrivalType
   */
  public enum ArrivalTypeEnum {
    STANDARD("Standard"),
    
    DIVERS("Divers");

    private String value;

    ArrivalTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrivalTypeEnum fromValue(String value) {
      for (ArrivalTypeEnum b : ArrivalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("arrivalType")
  private ArrivalTypeEnum arrivalType;

  /**
   * Gets or Sets arrivalNature
   */
  public enum ArrivalNatureEnum {
    CASH("Cash"),
    
    COVER("Cover"),
    
    DAMAGE("Damage");

    private String value;

    ArrivalNatureEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ArrivalNatureEnum fromValue(String value) {
      for (ArrivalNatureEnum b : ArrivalNatureEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("arrivalNature")
  private ArrivalNatureEnum arrivalNature;

  @JsonProperty("arrivalArticle")
  private ArticleDto arrivalArticle;

  @JsonProperty("arrivalInvoice")
  private SupplyinvoiceDto arrivalInvoice;

  public ArrivalDto deliveryQuantity(Double deliveryQuantity) {
    this.deliveryQuantity = deliveryQuantity;
    return this;
  }

  /**
   * Get deliveryQuantity
   * @return deliveryQuantity
  */
  @ApiModelProperty(value = "")


  public Double getDeliveryQuantity() {
    return deliveryQuantity;
  }

  public void setDeliveryQuantity(Double deliveryQuantity) {
    this.deliveryQuantity = deliveryQuantity;
  }

  public ArrivalDto arrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

  /**
   * Get arrivalDate
   * @return arrivalDate
  */
  @ApiModelProperty(value = "")


  public String getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(String arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public ArrivalDto arrivalUnitprice(Double arrivalUnitprice) {
    this.arrivalUnitprice = arrivalUnitprice;
    return this;
  }

  /**
   * Get arrivalUnitprice
   * @return arrivalUnitprice
  */
  @ApiModelProperty(value = "")


  public Double getArrivalUnitprice() {
    return arrivalUnitprice;
  }

  public void setArrivalUnitprice(Double arrivalUnitprice) {
    this.arrivalUnitprice = arrivalUnitprice;
  }

  public ArrivalDto arrivalType(ArrivalTypeEnum arrivalType) {
    this.arrivalType = arrivalType;
    return this;
  }

  /**
   * Get arrivalType
   * @return arrivalType
  */
  @ApiModelProperty(value = "")


  public ArrivalTypeEnum getArrivalType() {
    return arrivalType;
  }

  public void setArrivalType(ArrivalTypeEnum arrivalType) {
    this.arrivalType = arrivalType;
  }

  public ArrivalDto arrivalNature(ArrivalNatureEnum arrivalNature) {
    this.arrivalNature = arrivalNature;
    return this;
  }

  /**
   * Get arrivalNature
   * @return arrivalNature
  */
  @ApiModelProperty(value = "")


  public ArrivalNatureEnum getArrivalNature() {
    return arrivalNature;
  }

  public void setArrivalNature(ArrivalNatureEnum arrivalNature) {
    this.arrivalNature = arrivalNature;
  }

  public ArrivalDto arrivalArticle(ArticleDto arrivalArticle) {
    this.arrivalArticle = arrivalArticle;
    return this;
  }

  /**
   * Get arrivalArticle
   * @return arrivalArticle
  */
  @ApiModelProperty(value = "")

  @Valid

  public ArticleDto getArrivalArticle() {
    return arrivalArticle;
  }

  public void setArrivalArticle(ArticleDto arrivalArticle) {
    this.arrivalArticle = arrivalArticle;
  }

  public ArrivalDto arrivalInvoice(SupplyinvoiceDto arrivalInvoice) {
    this.arrivalInvoice = arrivalInvoice;
    return this;
  }

  /**
   * Get arrivalInvoice
   * @return arrivalInvoice
  */
  @ApiModelProperty(value = "")

  @Valid

  public SupplyinvoiceDto getArrivalInvoice() {
    return arrivalInvoice;
  }

  public void setArrivalInvoice(SupplyinvoiceDto arrivalInvoice) {
    this.arrivalInvoice = arrivalInvoice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrivalDto arrivalDto = (ArrivalDto) o;
    return Objects.equals(this.deliveryQuantity, arrivalDto.deliveryQuantity) &&
        Objects.equals(this.arrivalDate, arrivalDto.arrivalDate) &&
        Objects.equals(this.arrivalUnitprice, arrivalDto.arrivalUnitprice) &&
        Objects.equals(this.arrivalType, arrivalDto.arrivalType) &&
        Objects.equals(this.arrivalNature, arrivalDto.arrivalNature) &&
        Objects.equals(this.arrivalArticle, arrivalDto.arrivalArticle) &&
        Objects.equals(this.arrivalInvoice, arrivalDto.arrivalInvoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryQuantity, arrivalDate, arrivalUnitprice, arrivalType, arrivalNature, arrivalArticle, arrivalInvoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrivalDto {\n");
    
    sb.append("    deliveryQuantity: ").append(toIndentedString(deliveryQuantity)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    arrivalUnitprice: ").append(toIndentedString(arrivalUnitprice)).append("\n");
    sb.append("    arrivalType: ").append(toIndentedString(arrivalType)).append("\n");
    sb.append("    arrivalNature: ").append(toIndentedString(arrivalNature)).append("\n");
    sb.append("    arrivalArticle: ").append(toIndentedString(arrivalArticle)).append("\n");
    sb.append("    arrivalInvoice: ").append(toIndentedString(arrivalInvoice)).append("\n");
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

