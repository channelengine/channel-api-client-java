/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelShipmentLineResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelShipmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelShipmentResponse {
  public static final String SERIALIZED_NAME_CHANNEL_ORDER_NO = "ChannelOrderNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ORDER_NO)
  private String channelOrderNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ChannelShipmentLineResponse> lines = new ArrayList<ChannelShipmentLineResponse>();

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_TRACK_TRACE_NO = "TrackTraceNo";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_NO)
  private String trackTraceNo;

  public static final String SERIALIZED_NAME_TRACK_TRACE_URL = "TrackTraceUrl";
  @SerializedName(SERIALIZED_NAME_TRACK_TRACE_URL)
  private String trackTraceUrl;

  public static final String SERIALIZED_NAME_RETURN_TRACK_TRACE_NO = "ReturnTrackTraceNo";
  @SerializedName(SERIALIZED_NAME_RETURN_TRACK_TRACE_NO)
  private String returnTrackTraceNo;

  public static final String SERIALIZED_NAME_METHOD = "Method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE = "ShippedFromCountryCode";
  @SerializedName(SERIALIZED_NAME_SHIPPED_FROM_COUNTRY_CODE)
  private String shippedFromCountryCode;


  public ChannelShipmentResponse channelOrderNo(String channelOrderNo) {
    
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Channel.
   * @return channelOrderNo
  **/
  @ApiModelProperty(required = true, value = "The unique order reference used by the Channel.")

  public String getChannelOrderNo() {
    return channelOrderNo;
  }


  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }


  public ChannelShipmentResponse lines(List<ChannelShipmentLineResponse> lines) {
    
    this.lines = lines;
    return this;
  }

  public ChannelShipmentResponse addLinesItem(ChannelShipmentLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ChannelShipmentLineResponse> getLines() {
    return lines;
  }


  public void setLines(List<ChannelShipmentLineResponse> lines) {
    this.lines = lines;
  }


  public ChannelShipmentResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date at which the shipment was created in ChannelEngine.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the shipment was created in ChannelEngine.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ChannelShipmentResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date at which the shipment was last modified in ChannelEngine.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the shipment was last modified in ChannelEngine.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ChannelShipmentResponse trackTraceNo(String trackTraceNo) {
    
    this.trackTraceNo = trackTraceNo;
    return this;
  }

   /**
   * The unique shipping reference used by the Shipping carrier (track&amp;trace number).
   * @return trackTraceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique shipping reference used by the Shipping carrier (track&trace number).")

  public String getTrackTraceNo() {
    return trackTraceNo;
  }


  public void setTrackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
  }


  public ChannelShipmentResponse trackTraceUrl(String trackTraceUrl) {
    
    this.trackTraceUrl = trackTraceUrl;
    return this;
  }

   /**
   * A link to a page of the carrier where the customer can track the shipping of her package.
   * @return trackTraceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A link to a page of the carrier where the customer can track the shipping of her package.")

  public String getTrackTraceUrl() {
    return trackTraceUrl;
  }


  public void setTrackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
  }


  public ChannelShipmentResponse returnTrackTraceNo(String returnTrackTraceNo) {
    
    this.returnTrackTraceNo = returnTrackTraceNo;
    return this;
  }

   /**
   * The unique return shipping reference that may be used by the Shipping carrier (track &amp; trace number) if the shipment is returned.
   * @return returnTrackTraceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique return shipping reference that may be used by the Shipping carrier (track & trace number) if the shipment is returned.")

  public String getReturnTrackTraceNo() {
    return returnTrackTraceNo;
  }


  public void setReturnTrackTraceNo(String returnTrackTraceNo) {
    this.returnTrackTraceNo = returnTrackTraceNo;
  }


  public ChannelShipmentResponse method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Shipment method: the carrier used for shipping the package. E.g. DHL, postNL.
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipment method: the carrier used for shipping the package. E.g. DHL, postNL.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public ChannelShipmentResponse shippedFromCountryCode(String shippedFromCountryCode) {
    
    this.shippedFromCountryCode = shippedFromCountryCode;
    return this;
  }

   /**
   * The code of the country from where the package is being shipped.
   * @return shippedFromCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The code of the country from where the package is being shipped.")

  public String getShippedFromCountryCode() {
    return shippedFromCountryCode;
  }


  public void setShippedFromCountryCode(String shippedFromCountryCode) {
    this.shippedFromCountryCode = shippedFromCountryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelShipmentResponse channelShipmentResponse = (ChannelShipmentResponse) o;
    return Objects.equals(this.channelOrderNo, channelShipmentResponse.channelOrderNo) &&
        Objects.equals(this.lines, channelShipmentResponse.lines) &&
        Objects.equals(this.createdAt, channelShipmentResponse.createdAt) &&
        Objects.equals(this.updatedAt, channelShipmentResponse.updatedAt) &&
        Objects.equals(this.trackTraceNo, channelShipmentResponse.trackTraceNo) &&
        Objects.equals(this.trackTraceUrl, channelShipmentResponse.trackTraceUrl) &&
        Objects.equals(this.returnTrackTraceNo, channelShipmentResponse.returnTrackTraceNo) &&
        Objects.equals(this.method, channelShipmentResponse.method) &&
        Objects.equals(this.shippedFromCountryCode, channelShipmentResponse.shippedFromCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, lines, createdAt, updatedAt, trackTraceNo, trackTraceUrl, returnTrackTraceNo, method, shippedFromCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelShipmentResponse {\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    trackTraceNo: ").append(toIndentedString(trackTraceNo)).append("\n");
    sb.append("    trackTraceUrl: ").append(toIndentedString(trackTraceUrl)).append("\n");
    sb.append("    returnTrackTraceNo: ").append(toIndentedString(returnTrackTraceNo)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    shippedFromCountryCode: ").append(toIndentedString(shippedFromCountryCode)).append("\n");
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

