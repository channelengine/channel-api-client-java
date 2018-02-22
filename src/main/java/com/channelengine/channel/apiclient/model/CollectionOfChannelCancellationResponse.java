/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * OpenAPI spec version: 2.5.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelCancellationResponse;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CollectionOfChannelCancellationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-22T13:01:43.495+01:00")
public class CollectionOfChannelCancellationResponse {
  @SerializedName("Content")
  private List<ChannelCancellationResponse> content = null;

  @SerializedName("Count")
  private Integer count = null;

  @SerializedName("TotalCount")
  private Integer totalCount = null;

  @SerializedName("ItemsPerPage")
  private Integer itemsPerPage = null;

  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("ValidationErrors")
  private Map<String, List<String>> validationErrors = null;

  public CollectionOfChannelCancellationResponse content(List<ChannelCancellationResponse> content) {
    this.content = content;
    return this;
  }

  public CollectionOfChannelCancellationResponse addContentItem(ChannelCancellationResponse contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<ChannelCancellationResponse>();
    }
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<ChannelCancellationResponse> getContent() {
    return content;
  }

  public void setContent(List<ChannelCancellationResponse> content) {
    this.content = content;
  }

  public CollectionOfChannelCancellationResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of items in the current response
   * @return count
  **/
  @ApiModelProperty(value = "The number of items in the current response")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CollectionOfChannelCancellationResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of items
   * @return totalCount
  **/
  @ApiModelProperty(value = "The total number of items")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public CollectionOfChannelCancellationResponse itemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

   /**
   * The number of items per page
   * @return itemsPerPage
  **/
  @ApiModelProperty(value = "The number of items per page")
  public Integer getItemsPerPage() {
    return itemsPerPage;
  }

  public void setItemsPerPage(Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
  }

  public CollectionOfChannelCancellationResponse statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public CollectionOfChannelCancellationResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public CollectionOfChannelCancellationResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CollectionOfChannelCancellationResponse validationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public CollectionOfChannelCancellationResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new HashMap<String, List<String>>();
    }
    this.validationErrors.put(key, validationErrorsItem);
    return this;
  }

   /**
   * Get validationErrors
   * @return validationErrors
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionOfChannelCancellationResponse collectionOfChannelCancellationResponse = (CollectionOfChannelCancellationResponse) o;
    return Objects.equals(this.content, collectionOfChannelCancellationResponse.content) &&
        Objects.equals(this.count, collectionOfChannelCancellationResponse.count) &&
        Objects.equals(this.totalCount, collectionOfChannelCancellationResponse.totalCount) &&
        Objects.equals(this.itemsPerPage, collectionOfChannelCancellationResponse.itemsPerPage) &&
        Objects.equals(this.statusCode, collectionOfChannelCancellationResponse.statusCode) &&
        Objects.equals(this.success, collectionOfChannelCancellationResponse.success) &&
        Objects.equals(this.message, collectionOfChannelCancellationResponse.message) &&
        Objects.equals(this.validationErrors, collectionOfChannelCancellationResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, count, totalCount, itemsPerPage, statusCode, success, message, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionOfChannelCancellationResponse {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

