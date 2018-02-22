/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.5.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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

/**
 * ChannelShipmentResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T12:58:19.006+01:00")
public class ChannelShipmentResponse {
  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("Lines")
  private List<ChannelShipmentLineResponse> lines = new ArrayList<ChannelShipmentLineResponse>();

  @SerializedName("TrackTraceNo")
  private String trackTraceNo = null;

  @SerializedName("TrackTraceUrl")
  private String trackTraceUrl = null;

  @SerializedName("Method")
  private String method = null;

  public ChannelShipmentResponse channelOrderNo(String channelOrderNo) {
    this.channelOrderNo = channelOrderNo;
    return this;
  }

   /**
   * Get channelOrderNo
   * @return channelOrderNo
  **/
  @ApiModelProperty(required = true, value = "")
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

  public ChannelShipmentResponse trackTraceNo(String trackTraceNo) {
    this.trackTraceNo = trackTraceNo;
    return this;
  }

   /**
   * Get trackTraceNo
   * @return trackTraceNo
  **/
  @ApiModelProperty(value = "")
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
   * Get trackTraceUrl
   * @return trackTraceUrl
  **/
  @ApiModelProperty(value = "")
  public String getTrackTraceUrl() {
    return trackTraceUrl;
  }

  public void setTrackTraceUrl(String trackTraceUrl) {
    this.trackTraceUrl = trackTraceUrl;
  }

  public ChannelShipmentResponse method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelShipmentResponse channelShipmentResponse = (ChannelShipmentResponse) o;
    return Objects.equals(this.channelOrderNo, channelShipmentResponse.channelOrderNo) &&
        Objects.equals(this.lines, channelShipmentResponse.lines) &&
        Objects.equals(this.trackTraceNo, channelShipmentResponse.trackTraceNo) &&
        Objects.equals(this.trackTraceUrl, channelShipmentResponse.trackTraceUrl) &&
        Objects.equals(this.method, channelShipmentResponse.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelOrderNo, lines, trackTraceNo, trackTraceUrl, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelShipmentResponse {\n");
    
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    trackTraceNo: ").append(toIndentedString(trackTraceNo)).append("\n");
    sb.append("    trackTraceUrl: ").append(toIndentedString(trackTraceUrl)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

