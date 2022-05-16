/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.11.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelOrderLineResponse;
import com.channelengine.channel.apiclient.model.ShipmentLineStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ChannelShipmentLineResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelShipmentLineResponse {
  public static final String SERIALIZED_NAME_CHANNEL_PRODUCT_NO = "ChannelProductNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PRODUCT_NO)
  private String channelProductNo;

  public static final String SERIALIZED_NAME_MERCHANT_PRODUCT_NO = "MerchantProductNo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PRODUCT_NO)
  private String merchantProductNo;

  public static final String SERIALIZED_NAME_ORDER_LINE = "OrderLine";
  @SerializedName(SERIALIZED_NAME_ORDER_LINE)
  private ChannelOrderLineResponse orderLine;

  public static final String SERIALIZED_NAME_SHIPMENT_STATUS = "ShipmentStatus";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_STATUS)
  private ShipmentLineStatus shipmentStatus;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "ExtraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private Map<String, String> extraData = null;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;


  public ChannelShipmentLineResponse channelProductNo(String channelProductNo) {
    
    this.channelProductNo = channelProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Channel.
   * @return channelProductNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique product reference used by the Channel.")

  public String getChannelProductNo() {
    return channelProductNo;
  }


  public void setChannelProductNo(String channelProductNo) {
    this.channelProductNo = channelProductNo;
  }


  public ChannelShipmentLineResponse merchantProductNo(String merchantProductNo) {
    
    this.merchantProductNo = merchantProductNo;
    return this;
  }

   /**
   * The unique product reference used by the Merchant.
   * @return merchantProductNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique product reference used by the Merchant.")

  public String getMerchantProductNo() {
    return merchantProductNo;
  }


  public void setMerchantProductNo(String merchantProductNo) {
    this.merchantProductNo = merchantProductNo;
  }


  public ChannelShipmentLineResponse orderLine(ChannelOrderLineResponse orderLine) {
    
    this.orderLine = orderLine;
    return this;
  }

   /**
   * Get orderLine
   * @return orderLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelOrderLineResponse getOrderLine() {
    return orderLine;
  }


  public void setOrderLine(ChannelOrderLineResponse orderLine) {
    this.orderLine = orderLine;
  }


  public ChannelShipmentLineResponse shipmentStatus(ShipmentLineStatus shipmentStatus) {
    
    this.shipmentStatus = shipmentStatus;
    return this;
  }

   /**
   * Get shipmentStatus
   * @return shipmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShipmentLineStatus getShipmentStatus() {
    return shipmentStatus;
  }


  public void setShipmentStatus(ShipmentLineStatus shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }


  public ChannelShipmentLineResponse extraData(Map<String, String> extraData) {
    
    this.extraData = extraData;
    return this;
  }

  public ChannelShipmentLineResponse putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<String, String>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Extra data on the order. Each item must have an unqiue key
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra data on the order. Each item must have an unqiue key")

  public Map<String, String> getExtraData() {
    return extraData;
  }


  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  public ChannelShipmentLineResponse quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Number of items of the product in the shipment.
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of items of the product in the shipment.")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelShipmentLineResponse channelShipmentLineResponse = (ChannelShipmentLineResponse) o;
    return Objects.equals(this.channelProductNo, channelShipmentLineResponse.channelProductNo) &&
        Objects.equals(this.merchantProductNo, channelShipmentLineResponse.merchantProductNo) &&
        Objects.equals(this.orderLine, channelShipmentLineResponse.orderLine) &&
        Objects.equals(this.shipmentStatus, channelShipmentLineResponse.shipmentStatus) &&
        Objects.equals(this.extraData, channelShipmentLineResponse.extraData) &&
        Objects.equals(this.quantity, channelShipmentLineResponse.quantity);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelProductNo, merchantProductNo, orderLine, shipmentStatus, extraData, quantity);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelShipmentLineResponse {\n");
    sb.append("    channelProductNo: ").append(toIndentedString(channelProductNo)).append("\n");
    sb.append("    merchantProductNo: ").append(toIndentedString(merchantProductNo)).append("\n");
    sb.append("    orderLine: ").append(toIndentedString(orderLine)).append("\n");
    sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

