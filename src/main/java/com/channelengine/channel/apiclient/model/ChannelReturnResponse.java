/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelReturnLineResponse;
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
 * ChannelReturnResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-13T14:23:09.080+01:00")
public class ChannelReturnResponse {
  @SerializedName("ChannelReturnNo")
  private String channelReturnNo = null;

  @SerializedName("ChannelOrderNo")
  private String channelOrderNo = null;

  @SerializedName("Lines")
  private List<ChannelReturnLineResponse> lines = new ArrayList<ChannelReturnLineResponse>();

  @SerializedName("Id")
  private Integer id = null;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    PRODUCT_DEFECT("PRODUCT_DEFECT"),
    
    PRODUCT_UNSATISFACTORY("PRODUCT_UNSATISFACTORY"),
    
    REFUSED("REFUSED"),
    
    REFUSED_DAMAGED("REFUSED_DAMAGED"),
    
    WRONG_ADDRESS("WRONG_ADDRESS"),
    
    NOT_COLLECTED("NOT_COLLECTED"),
    
    OTHER("OTHER");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Reason")
  private ReasonEnum reason = null;

  @SerializedName("CustomerComment")
  private String customerComment = null;

  @SerializedName("MerchantComment")
  private String merchantComment = null;

  @SerializedName("RefundInclVat")
  private Double refundInclVat = null;

  @SerializedName("RefundExclVat")
  private Double refundExclVat = null;

  public ChannelReturnResponse channelReturnNo(String channelReturnNo) {
    this.channelReturnNo = channelReturnNo;
    return this;
  }

   /**
   * Get channelReturnNo
   * @return channelReturnNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChannelReturnNo() {
    return channelReturnNo;
  }

  public void setChannelReturnNo(String channelReturnNo) {
    this.channelReturnNo = channelReturnNo;
  }

  public ChannelReturnResponse channelOrderNo(String channelOrderNo) {
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

  public ChannelReturnResponse lines(List<ChannelReturnLineResponse> lines) {
    this.lines = lines;
    return this;
  }

  public ChannelReturnResponse addLinesItem(ChannelReturnLineResponse linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ChannelReturnLineResponse> getLines() {
    return lines;
  }

  public void setLines(List<ChannelReturnLineResponse> lines) {
    this.lines = lines;
  }

  public ChannelReturnResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ChannelReturnResponse reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public ChannelReturnResponse customerComment(String customerComment) {
    this.customerComment = customerComment;
    return this;
  }

   /**
   * Get customerComment
   * @return customerComment
  **/
  @ApiModelProperty(value = "")
  public String getCustomerComment() {
    return customerComment;
  }

  public void setCustomerComment(String customerComment) {
    this.customerComment = customerComment;
  }

  public ChannelReturnResponse merchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
    return this;
  }

   /**
   * Get merchantComment
   * @return merchantComment
  **/
  @ApiModelProperty(value = "")
  public String getMerchantComment() {
    return merchantComment;
  }

  public void setMerchantComment(String merchantComment) {
    this.merchantComment = merchantComment;
  }

  public ChannelReturnResponse refundInclVat(Double refundInclVat) {
    this.refundInclVat = refundInclVat;
    return this;
  }

   /**
   * Get refundInclVat
   * @return refundInclVat
  **/
  @ApiModelProperty(value = "")
  public Double getRefundInclVat() {
    return refundInclVat;
  }

  public void setRefundInclVat(Double refundInclVat) {
    this.refundInclVat = refundInclVat;
  }

  public ChannelReturnResponse refundExclVat(Double refundExclVat) {
    this.refundExclVat = refundExclVat;
    return this;
  }

   /**
   * Get refundExclVat
   * @return refundExclVat
  **/
  @ApiModelProperty(value = "")
  public Double getRefundExclVat() {
    return refundExclVat;
  }

  public void setRefundExclVat(Double refundExclVat) {
    this.refundExclVat = refundExclVat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelReturnResponse channelReturnResponse = (ChannelReturnResponse) o;
    return Objects.equals(this.channelReturnNo, channelReturnResponse.channelReturnNo) &&
        Objects.equals(this.channelOrderNo, channelReturnResponse.channelOrderNo) &&
        Objects.equals(this.lines, channelReturnResponse.lines) &&
        Objects.equals(this.id, channelReturnResponse.id) &&
        Objects.equals(this.reason, channelReturnResponse.reason) &&
        Objects.equals(this.customerComment, channelReturnResponse.customerComment) &&
        Objects.equals(this.merchantComment, channelReturnResponse.merchantComment) &&
        Objects.equals(this.refundInclVat, channelReturnResponse.refundInclVat) &&
        Objects.equals(this.refundExclVat, channelReturnResponse.refundExclVat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelReturnNo, channelOrderNo, lines, id, reason, customerComment, merchantComment, refundInclVat, refundExclVat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelReturnResponse {\n");
    
    sb.append("    channelReturnNo: ").append(toIndentedString(channelReturnNo)).append("\n");
    sb.append("    channelOrderNo: ").append(toIndentedString(channelOrderNo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    customerComment: ").append(toIndentedString(customerComment)).append("\n");
    sb.append("    merchantComment: ").append(toIndentedString(merchantComment)).append("\n");
    sb.append("    refundInclVat: ").append(toIndentedString(refundInclVat)).append("\n");
    sb.append("    refundExclVat: ").append(toIndentedString(refundExclVat)).append("\n");
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
