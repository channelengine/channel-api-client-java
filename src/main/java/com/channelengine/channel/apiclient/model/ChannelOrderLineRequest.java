/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.10.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.Condition;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelOrderLineRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelOrderLineRequest {
  public static final String SERIALIZED_NAME_CHANNEL_PRODUCT_NO = "ChannelProductNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PRODUCT_NO)
  private String channelProductNo;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_CANCELLATION_REQUESTED_QUANTITY = "CancellationRequestedQuantity";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_REQUESTED_QUANTITY)
  private Integer cancellationRequestedQuantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE_INCL_VAT = "UnitPriceInclVat";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE_INCL_VAT)
  private BigDecimal unitPriceInclVat;

  public static final String SERIALIZED_NAME_FEE_FIXED = "FeeFixed";
  @SerializedName(SERIALIZED_NAME_FEE_FIXED)
  private BigDecimal feeFixed;

  public static final String SERIALIZED_NAME_FEE_RATE = "FeeRate";
  @SerializedName(SERIALIZED_NAME_FEE_RATE)
  private BigDecimal feeRate;

  public static final String SERIALIZED_NAME_CONDITION = "Condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private Condition condition;

  public static final String SERIALIZED_NAME_EXPECTED_DELIVERY_DATE = "ExpectedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_EXPECTED_DELIVERY_DATE)
  private OffsetDateTime expectedDeliveryDate;


  public ChannelOrderLineRequest channelProductNo(String channelProductNo) {
    
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique product reference used by the channel.
   * @return channelProductNo
  **/
  @ApiModelProperty(required = true, value = "The unique product reference used by the channel.")

  public String getChannelProductNo() {
    return channelProductNo;
  }


  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }


  public ChannelOrderLineRequest merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The unique product reference used by the merchant.
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the merchant.")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public ChannelOrderLineRequest quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items of the product.
   * minimum: 0
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of items of the product.")

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
   * The number of items for which cancellation was requested by the customer.  Some channels allow a customer to cancel an order until it has been shipped.  When an order has already been acknowledged in ChannelEngine, it can only be cancelled by creating a cancellation.  Use this field to check whether it is still possible to cancel the order. If this is the case, submit a cancellation to ChannelEngine.
   * minimum: 0
   * @return cancellationRequestedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items for which cancellation was requested by the customer.  Some channels allow a customer to cancel an order until it has been shipped.  When an order has already been acknowledged in ChannelEngine, it can only be cancelled by creating a cancellation.  Use this field to check whether it is still possible to cancel the order. If this is the case, submit a cancellation to ChannelEngine.")

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
   * minimum: 0
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
   * A fixed fee that is charged by the Channel for this orderline.  This fee rate is based on the currency of the Channel  This field is optional, send 0 if not applicable.
   * minimum: 0
   * @return feeFixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A fixed fee that is charged by the Channel for this orderline.  This fee rate is based on the currency of the Channel  This field is optional, send 0 if not applicable.")

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
   * minimum: 0
   * @return feeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.")

  public BigDecimal getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(BigDecimal feeRate) {
    this.feeRate = feeRate;
  }


  public ChannelOrderLineRequest condition(Condition condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Get condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Condition getCondition() {
    return condition;
  }


  public void setCondition(Condition condition) {
    this.condition = condition;
  }


  public ChannelOrderLineRequest expectedDeliveryDate(OffsetDateTime expectedDeliveryDate) {
    
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }

   /**
   * Expected delivery date from channels, empty if channels not support this value
   * @return expectedDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expected delivery date from channels, empty if channels not support this value")

  public OffsetDateTime getExpectedDeliveryDate() {
    return expectedDeliveryDate;
  }


  public void setExpectedDeliveryDate(OffsetDateTime expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelOrderLineRequest channelOrderLineRequest = (ChannelOrderLineRequest) o;
    return Objects.equals(this.channelProductNo, channelOrderLineRequest.channelProductNo) &&
        Objects.equals(this.merchantProductNo, channelOrderLineRequest.merchantProductNo) &&
        Objects.equals(this.quantity, channelOrderLineRequest.quantity) &&
        Objects.equals(this.cancellationRequestedQuantity, channelOrderLineRequest.cancellationRequestedQuantity) &&
        Objects.equals(this.unitPriceInclVat, channelOrderLineRequest.unitPriceInclVat) &&
        Objects.equals(this.feeFixed, channelOrderLineRequest.feeFixed) &&
        Objects.equals(this.feeRate, channelOrderLineRequest.feeRate) &&
        Objects.equals(this.condition, channelOrderLineRequest.condition) &&
        Objects.equals(this.expectedDeliveryDate, channelOrderLineRequest.expectedDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, merchantProductNo, quantity, cancellationRequestedQuantity, unitPriceInclVat, feeFixed, feeRate, condition, expectedDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOrderLineRequest {\n");
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    cancellationRequestedQuantity: ").append(toIndentedString(cancellationRequestedQuantity)).append("\n");
    sb.append("    unitPriceInclVat: ").append(toIndentedString(unitPriceInclVat)).append("\n");
    sb.append("    feeFixed: ").append(toIndentedString(feeFixed)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
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

