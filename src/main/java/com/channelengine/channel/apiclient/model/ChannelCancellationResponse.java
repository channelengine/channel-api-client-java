/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.13.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelCancellationLineResponse;
import com.channelengine.channel.apiclient.model.MancoReason;
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelCancellationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelCancellationResponse {
  public static final String SERIALIZED_NAME_CHANNEL_ORDER_NO = "ChannelOrderNo";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ORDER_NO)
  private String channelOrderNo;

  public static final String SERIALIZED_NAME_LINES = "Lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ChannelCancellationLineResponse> lines = new ArrayList<ChannelCancellationLineResponse>();

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private MancoReason reasonCode;


  public ChannelCancellationResponse channelOrderNo(String channelOrderNo) {
    
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * The unique order reference used by the Channel.
   * @return channelOrderNo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique order reference used by the Channel.")

  public String getChannelOrderNo() {
    return channelOrderNo;
  }


  public void setChannelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
  }


  public ChannelCancellationResponse lines(List<ChannelCancellationLineResponse> lines) {
    
    this.lines = lines;
    return this;
  }

  public ChannelCancellationResponse addLinesItem(ChannelCancellationLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ChannelCancellationLineResponse> getLines() {
    return lines;
  }


  public void setLines(List<ChannelCancellationLineResponse> lines) {
    this.lines = lines;
  }


  public ChannelCancellationResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date at which the cancellation was created in ChannelEngine.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the cancellation was created in ChannelEngine.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ChannelCancellationResponse updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date at which the cancellation was last modified in ChannelEngine.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date at which the cancellation was last modified in ChannelEngine.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ChannelCancellationResponse reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason for cancellation (text).
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason for cancellation (text).")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ChannelCancellationResponse reasonCode(MancoReason reasonCode) {
    
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MancoReason getReasonCode() {
    return reasonCode;
  }


  public void setReasonCode(MancoReason reasonCode) {
    this.reasonCode = reasonCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelCancellationResponse channelCancellationResponse = (ChannelCancellationResponse) o;
    return Objects.equals(this.channelOrderNo, channelCancellationResponse.channelOrderNo) &&
        Objects.equals(this.lines, channelCancellationResponse.lines) &&
        Objects.equals(this.createdAt, channelCancellationResponse.createdAt) &&
        Objects.equals(this.updatedAt, channelCancellationResponse.updatedAt) &&
        Objects.equals(this.reason, channelCancellationResponse.reason) &&
        Objects.equals(this.reasonCode, channelCancellationResponse.reasonCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, lines, createdAt, updatedAt, reason, reasonCode);
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
    sb.append("class ChannelCancellationResponse {\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
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

