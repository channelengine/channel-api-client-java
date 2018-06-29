/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ChannelOrderLineRequest
 */

public class ChannelOrderLineRequest {
  @SerializedName("ChannelProductNo")
  private String channelProductNo = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("CancellationRequestedQuantity")
  private Integer cancellationRequestedQuantity = null;

  @SerializedName("UnitPriceInclVat")
  private BigDecimal unitPriceInclVat = null;

  @SerializedName("FeeFixed")
  private BigDecimal feeFixed = null;

  @SerializedName("FeeRate")
  private BigDecimal feeRate = null;

  /**
   * The condition of the product, this can be used to indicate that a product is a second-hand product
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    NEW("NEW"),
    
    NEW_REFURBISHED("NEW_REFURBISHED"),
    
    USED_AS_NEW("USED_AS_NEW"),
    
    USED_GOOD("USED_GOOD"),
    
    USED_REASONABLE("USED_REASONABLE"),
    
    USED_MEDIOCRE("USED_MEDIOCRE"),
    
    UNKNOWN("UNKNOWN");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String text) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConditionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Condition")
  private ConditionEnum condition = null;

  public ChannelOrderLineRequest channelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique order reference used by the channel
   * @return channelProductNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the channel")
  public String getChannelProductNo() {
    return channelProductNo;
  }

  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }

  public ChannelOrderLineRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items of the product
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of items of the product")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ChannelOrderLineRequest cancellationRequestedQuantity(Integer cancellationRequestedQuantity) {
    this.cancellationRequestedQuantity = cancellationRequestedQuantity;
    return this;
  }

   /**
   * The number of items for which cancellation was requested by the customer.  Some channels allow a customer to cancel an order until it has been shipped.  When an order has already been acknowledged in ChannelEngine, it can only be cancelled by creating a cancellation.  Use this field to check whether it is still possible to cancel the order. If this is the case, submit a cancellation to ChannelEngine
   * @return cancellationRequestedQuantity
  **/
  @ApiModelProperty(required = true, value = "The number of items for which cancellation was requested by the customer.  Some channels allow a customer to cancel an order until it has been shipped.  When an order has already been acknowledged in ChannelEngine, it can only be cancelled by creating a cancellation.  Use this field to check whether it is still possible to cancel the order. If this is the case, submit a cancellation to ChannelEngine")
  public Integer getCancellationRequestedQuantity() {
    return cancellationRequestedQuantity;
  }

  public void setCancellationRequestedQuantity(Integer cancellationRequestedQuantity) {
    this.cancellationRequestedQuantity = cancellationRequestedQuantity;
  }

  public ChannelOrderLineRequest unitPriceInclVat(BigDecimal unitPriceInclVat) {
    this.unitPriceInclVat = unitPriceInclVat;
    return this;
  }

   /**
   * The value of a single unit of the ordered product including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return unitPriceInclVat
  **/
  @ApiModelProperty(required = true, value = "The value of a single unit of the ordered product including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")
  public BigDecimal getUnitPriceInclVat() {
    return unitPriceInclVat;
  }

  public void setUnitPriceInclVat(BigDecimal unitPriceInclVat) {
    this.unitPriceInclVat = unitPriceInclVat;
  }

  public ChannelOrderLineRequest feeFixed(BigDecimal feeFixed) {
    this.feeFixed = feeFixed;
    return this;
  }

   /**
   * A fixed fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.
   * @return feeFixed
  **/
  @ApiModelProperty(value = "A fixed fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.")
  public BigDecimal getFeeFixed() {
    return feeFixed;
  }

  public void setFeeFixed(BigDecimal feeFixed) {
    this.feeFixed = feeFixed;
  }

  public ChannelOrderLineRequest feeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
    return this;
  }

   /**
   * A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.
   * @return feeRate
  **/
  @ApiModelProperty(value = "A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.")
  public BigDecimal getFeeRate() {
    return feeRate;
  }

  public void setFeeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
  }

  public ChannelOrderLineRequest condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the product, this can be used to indicate that a product is a second-hand product
   * @return condition
  **/
  @ApiModelProperty(value = "The condition of the product, this can be used to indicate that a product is a second-hand product")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelOrderLineRequest channelOrderLineRequest = (ChannelOrderLineRequest) o;
    return Objects.equals(this.channelProductNo, channelOrderLineRequest.channelProductNo) &&
        Objects.equals(this.quantity, channelOrderLineRequest.quantity) &&
        Objects.equals(this.cancellationRequestedQuantity, channelOrderLineRequest.cancellationRequestedQuantity) &&
        Objects.equals(this.unitPriceInclVat, channelOrderLineRequest.unitPriceInclVat) &&
        Objects.equals(this.feeFixed, channelOrderLineRequest.feeFixed) &&
        Objects.equals(this.feeRate, channelOrderLineRequest.feeRate) &&
        Objects.equals(this.condition, channelOrderLineRequest.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, quantity, cancellationRequestedQuantity, unitPriceInclVat, feeFixed, feeRate, condition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOrderLineRequest {\n");
    
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    cancellationRequestedQuantity: ").append(toIndentedString(cancellationRequestedQuantity)).append("\n");
    sb.append("    unitPriceInclVat: ").append(toIndentedString(unitPriceInclVat)).append("\n");
    sb.append("    feeFixed: ").append(toIndentedString(feeFixed)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

