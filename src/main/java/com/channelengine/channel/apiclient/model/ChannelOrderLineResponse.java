/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.7
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
import com.channelengine.channel.apiclient.model.OrderStatusView;
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
 * ChannelOrderLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelOrderLineResponse {
  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OrderStatusView status;

  public static final String SERIALIZED_NAME_IS_FULFILLMENT_BY_MARKETPLACE = "IsFulfillmentByMarketplace";
  @SerializedName(SERIALIZED_NAME_IS_FULFILLMENT_BY_MARKETPLACE)
  private Boolean isFulfillmentByMarketplace;

  public static final String SERIALIZED_NAME_GTIN = "Gtin";
  @SerializedName(SERIALIZED_NAME_GTIN)
  private String gtin;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UNIT_VAT = "UnitVat";
  @SerializedName(SERIALIZED_NAME_UNIT_VAT)
  private BigDecimal unitVat;

  public static final String SERIALIZED_NAME_LINE_TOTAL_INCL_VAT = "LineTotalInclVat";
  @SerializedName(SERIALIZED_NAME_LINE_TOTAL_INCL_VAT)
  private BigDecimal lineTotalInclVat;

  public static final String SERIALIZED_NAME_LINE_VAT = "LineVat";
  @SerializedName(SERIALIZED_NAME_LINE_VAT)
  private BigDecimal lineVat;

  public static final String SERIALIZED_NAME_ORIGINAL_UNIT_PRICE_INCL_VAT = "OriginalUnitPriceInclVat";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_UNIT_PRICE_INCL_VAT)
  private BigDecimal originalUnitPriceInclVat;

  public static final String SERIALIZED_NAME_ORIGINAL_UNIT_VAT = "OriginalUnitVat";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_UNIT_VAT)
  private BigDecimal originalUnitVat;

  public static final String SERIALIZED_NAME_ORIGINAL_LINE_TOTAL_INCL_VAT = "OriginalLineTotalInclVat";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_LINE_TOTAL_INCL_VAT)
  private BigDecimal originalLineTotalInclVat;

  public static final String SERIALIZED_NAME_ORIGINAL_LINE_VAT = "OriginalLineVat";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_LINE_VAT)
  private BigDecimal originalLineVat;

  public static final String SERIALIZED_NAME_ORIGINAL_FEE_FIXED = "OriginalFeeFixed";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FEE_FIXED)
  private BigDecimal originalFeeFixed;

  public static final String SERIALIZED_NAME_BUNDLE_PRODUCT_MERCHANT_PRODUCT_NO = "BundleProductMerchantProductNo";
  @SerializedName(SERIALIZED_NAME_BUNDLE_PRODUCT_MERCHANT_PRODUCT_NO)
  private String bundleProductMerchantProductNo;

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


  public ChannelOrderLineResponse status(OrderStatusView status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderStatusView getStatus() {
    return status;
  }


  public void setStatus(OrderStatusView status) {
    this.status = status;
  }


  public ChannelOrderLineResponse isFulfillmentByMarketplace(Boolean isFulfillmentByMarketplace) {
    
    this.isFulfillmentByMarketplace = isFulfillmentByMarketplace;
    return this;
  }

   /**
   * Is the order fulfilled by the marketplace (amazon: FBA, bol: LVB, etc.)?.
   * @return isFulfillmentByMarketplace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the order fulfilled by the marketplace (amazon: FBA, bol: LVB, etc.)?.")

  public Boolean getIsFulfillmentByMarketplace() {
    return isFulfillmentByMarketplace;
  }


  public void setIsFulfillmentByMarketplace(Boolean isFulfillmentByMarketplace) {
    this.isFulfillmentByMarketplace = isFulfillmentByMarketplace;
  }


  public ChannelOrderLineResponse gtin(String gtin) {
    
    this.gtin = gtin;
    return this;
  }

   /**
   * Either the GTIN (EAN, ISBN, UPC etc) provided by the channel, or the the GTIN belonging to the MerchantProductNo in ChannelEngine.
   * @return gtin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Either the GTIN (EAN, ISBN, UPC etc) provided by the channel, or the the GTIN belonging to the MerchantProductNo in ChannelEngine.")

  public String getGtin() {
    return gtin;
  }


  public void setGtin(String gtin) {
    this.gtin = gtin;
  }


  public ChannelOrderLineResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The product description (or title) provided by the channel.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The product description (or title) provided by the channel.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ChannelOrderLineResponse unitVat(BigDecimal unitVat) {
    
    this.unitVat = unitVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the value of a single unit of the ordered product  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return unitVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of VAT charged over the value of a single unit of the ordered product  (in the shop's base currency calculated using the exchange rate at the time of ordering).")

  public BigDecimal getUnitVat() {
    return unitVat;
  }


  public void setUnitVat(BigDecimal unitVat) {
    this.unitVat = unitVat;
  }


  public ChannelOrderLineResponse lineTotalInclVat(BigDecimal lineTotalInclVat) {
    
    this.lineTotalInclVat = lineTotalInclVat;
    return this;
  }

   /**
   * The total value of the order line (quantity * unit price) including VAT  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return lineTotalInclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total value of the order line (quantity * unit price) including VAT  (in the shop's base currency calculated using the exchange rate at the time of ordering).")

  public BigDecimal getLineTotalInclVat() {
    return lineTotalInclVat;
  }


  public void setLineTotalInclVat(BigDecimal lineTotalInclVat) {
    this.lineTotalInclVat = lineTotalInclVat;
  }


  public ChannelOrderLineResponse lineVat(BigDecimal lineVat) {
    
    this.lineVat = lineVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the total value of the order line (quantity * unit price)  (in the shop&#39;s base currency calculated using the exchange rate at the time of ordering).
   * @return lineVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of VAT charged over the total value of the order line (quantity * unit price)  (in the shop's base currency calculated using the exchange rate at the time of ordering).")

  public BigDecimal getLineVat() {
    return lineVat;
  }


  public void setLineVat(BigDecimal lineVat) {
    this.lineVat = lineVat;
  }


  public ChannelOrderLineResponse originalUnitPriceInclVat(BigDecimal originalUnitPriceInclVat) {
    
    this.originalUnitPriceInclVat = originalUnitPriceInclVat;
    return this;
  }

   /**
   * The value of a single unit of the ordered product including VAT  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalUnitPriceInclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of a single unit of the ordered product including VAT  (in the currency in which the order was paid for, see CurrencyCode).")

  public BigDecimal getOriginalUnitPriceInclVat() {
    return originalUnitPriceInclVat;
  }


  public void setOriginalUnitPriceInclVat(BigDecimal originalUnitPriceInclVat) {
    this.originalUnitPriceInclVat = originalUnitPriceInclVat;
  }


  public ChannelOrderLineResponse originalUnitVat(BigDecimal originalUnitVat) {
    
    this.originalUnitVat = originalUnitVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the value of a single unit of the ordered product  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalUnitVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of VAT charged over the value of a single unit of the ordered product  (in the currency in which the order was paid for, see CurrencyCode).")

  public BigDecimal getOriginalUnitVat() {
    return originalUnitVat;
  }


  public void setOriginalUnitVat(BigDecimal originalUnitVat) {
    this.originalUnitVat = originalUnitVat;
  }


  public ChannelOrderLineResponse originalLineTotalInclVat(BigDecimal originalLineTotalInclVat) {
    
    this.originalLineTotalInclVat = originalLineTotalInclVat;
    return this;
  }

   /**
   * The total value of the order line (quantity * unit price) including VAT  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalLineTotalInclVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total value of the order line (quantity * unit price) including VAT  (in the currency in which the order was paid for, see CurrencyCode).")

  public BigDecimal getOriginalLineTotalInclVat() {
    return originalLineTotalInclVat;
  }


  public void setOriginalLineTotalInclVat(BigDecimal originalLineTotalInclVat) {
    this.originalLineTotalInclVat = originalLineTotalInclVat;
  }


  public ChannelOrderLineResponse originalLineVat(BigDecimal originalLineVat) {
    
    this.originalLineVat = originalLineVat;
    return this;
  }

   /**
   * The total amount of VAT charged over the total value of the order line (quantity * unit price)  (in the currency in which the order was paid for, see CurrencyCode).
   * @return originalLineVat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total amount of VAT charged over the total value of the order line (quantity * unit price)  (in the currency in which the order was paid for, see CurrencyCode).")

  public BigDecimal getOriginalLineVat() {
    return originalLineVat;
  }


  public void setOriginalLineVat(BigDecimal originalLineVat) {
    this.originalLineVat = originalLineVat;
  }


  public ChannelOrderLineResponse originalFeeFixed(BigDecimal originalFeeFixed) {
    
    this.originalFeeFixed = originalFeeFixed;
    return this;
  }

   /**
   * A percentage fee that is charged by the Channel for this orderline.  This fee rate is based on the currency of client  This field is optional, send 0 if not applicable.
   * @return originalFeeFixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A percentage fee that is charged by the Channel for this orderline.  This fee rate is based on the currency of client  This field is optional, send 0 if not applicable.")

  public BigDecimal getOriginalFeeFixed() {
    return originalFeeFixed;
  }


  public void setOriginalFeeFixed(BigDecimal originalFeeFixed) {
    this.originalFeeFixed = originalFeeFixed;
  }


  public ChannelOrderLineResponse bundleProductMerchantProductNo(String bundleProductMerchantProductNo) {
    
    this.bundleProductMerchantProductNo = bundleProductMerchantProductNo;
    return this;
  }

   /**
   * If the product is ordered part of a bundle, this field contains the MerchantProductNo of  the product bundle.
   * @return bundleProductMerchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the product is ordered part of a bundle, this field contains the MerchantProductNo of  the product bundle.")

  public String getBundleProductMerchantProductNo() {
    return bundleProductMerchantProductNo;
  }


  public void setBundleProductMerchantProductNo(String bundleProductMerchantProductNo) {
    this.bundleProductMerchantProductNo = bundleProductMerchantProductNo;
  }


  public ChannelOrderLineResponse channelProductNo(String channelProductNo) {
    
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


  public ChannelOrderLineResponse merchantProductNo(String merchantProductNo) {
    
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


  public ChannelOrderLineResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of items of the product.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of items of the product.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ChannelOrderLineResponse cancellationRequestedQuantity(Integer cancellationRequestedQuantity) {
    
    this.cancellationRequestedQuantity = cancellationRequestedQuantity;
    return this;
  }

   /**
   * The number of items for which cancellation was requested by the customer.  Some channels allow a customer to cancel an order until it has been shipped.  When an order has already been acknowledged in ChannelEngine, it can only be cancelled by creating a cancellation.  Use this field to check whether it is still possible to cancel the order. If this is the case, submit a cancellation to ChannelEngine.
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


  public ChannelOrderLineResponse unitPriceInclVat(BigDecimal unitPriceInclVat) {
    
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


  public ChannelOrderLineResponse feeFixed(BigDecimal feeFixed) {
    
    this.feeFixed = feeFixed;
    return this;
  }

   /**
   * A fixed fee that is charged by the Channel for this orderline.  This fee rate is based on the currency of the Channel  This field is optional, send 0 if not applicable.
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


  public ChannelOrderLineResponse feeRate(BigDecimal feeRate) {
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * A percentage fee that is charged by the Channel for this orderline.  This field is optional, send 0 if not applicable.
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


  public ChannelOrderLineResponse condition(Condition condition) {
    
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


  public ChannelOrderLineResponse expectedDeliveryDate(OffsetDateTime expectedDeliveryDate) {
    
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
    ChannelOrderLineResponse channelOrderLineResponse = (ChannelOrderLineResponse) o;
    return Objects.equals(this.status, channelOrderLineResponse.status) &&
        Objects.equals(this.isFulfillmentByMarketplace, channelOrderLineResponse.isFulfillmentByMarketplace) &&
        Objects.equals(this.gtin, channelOrderLineResponse.gtin) &&
        Objects.equals(this.description, channelOrderLineResponse.description) &&
        Objects.equals(this.unitVat, channelOrderLineResponse.unitVat) &&
        Objects.equals(this.lineTotalInclVat, channelOrderLineResponse.lineTotalInclVat) &&
        Objects.equals(this.lineVat, channelOrderLineResponse.lineVat) &&
        Objects.equals(this.originalUnitPriceInclVat, channelOrderLineResponse.originalUnitPriceInclVat) &&
        Objects.equals(this.originalUnitVat, channelOrderLineResponse.originalUnitVat) &&
        Objects.equals(this.originalLineTotalInclVat, channelOrderLineResponse.originalLineTotalInclVat) &&
        Objects.equals(this.originalLineVat, channelOrderLineResponse.originalLineVat) &&
        Objects.equals(this.originalFeeFixed, channelOrderLineResponse.originalFeeFixed) &&
        Objects.equals(this.bundleProductMerchantProductNo, channelOrderLineResponse.bundleProductMerchantProductNo) &&
        Objects.equals(this.channelProductNo, channelOrderLineResponse.channelProductNo) &&
        Objects.equals(this.merchantProductNo, channelOrderLineResponse.merchantProductNo) &&
        Objects.equals(this.quantity, channelOrderLineResponse.quantity) &&
        Objects.equals(this.cancellationRequestedQuantity, channelOrderLineResponse.cancellationRequestedQuantity) &&
        Objects.equals(this.unitPriceInclVat, channelOrderLineResponse.unitPriceInclVat) &&
        Objects.equals(this.feeFixed, channelOrderLineResponse.feeFixed) &&
        Objects.equals(this.feeRate, channelOrderLineResponse.feeRate) &&
        Objects.equals(this.condition, channelOrderLineResponse.condition) &&
        Objects.equals(this.expectedDeliveryDate, channelOrderLineResponse.expectedDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, isFulfillmentByMarketplace, gtin, description, unitVat, lineTotalInclVat, lineVat, originalUnitPriceInclVat, originalUnitVat, originalLineTotalInclVat, originalLineVat, originalFeeFixed, bundleProductMerchantProductNo, channelProductNo, merchantProductNo, quantity, cancellationRequestedQuantity, unitPriceInclVat, feeFixed, feeRate, condition, expectedDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelOrderLineResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isFulfillmentByMarketplace: ").append(toIndentedString(isFulfillmentByMarketplace)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unitVat: ").append(toIndentedString(unitVat)).append("\n");
    sb.append("    lineTotalInclVat: ").append(toIndentedString(lineTotalInclVat)).append("\n");
    sb.append("    lineVat: ").append(toIndentedString(lineVat)).append("\n");
    sb.append("    originalUnitPriceInclVat: ").append(toIndentedString(originalUnitPriceInclVat)).append("\n");
    sb.append("    originalUnitVat: ").append(toIndentedString(originalUnitVat)).append("\n");
    sb.append("    originalLineTotalInclVat: ").append(toIndentedString(originalLineTotalInclVat)).append("\n");
    sb.append("    originalLineVat: ").append(toIndentedString(originalLineVat)).append("\n");
    sb.append("    originalFeeFixed: ").append(toIndentedString(originalFeeFixed)).append("\n");
    sb.append("    bundleProductMerchantProductNo: ").append(toIndentedString(bundleProductMerchantProductNo)).append("\n");
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

