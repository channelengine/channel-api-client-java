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
import com.channelengine.channel.apiclient.model.ChannelProductChangesResponse;
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

/**
 * SingleOfChannelProductChangesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SingleOfChannelProductChangesResponse {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ChannelProductChangesResponse content;

  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_LOG_ID = "LogId";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private Integer logId;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "ValidationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private Map<String, List<String>> validationErrors = null;


  public SingleOfChannelProductChangesResponse content(ChannelProductChangesResponse content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelProductChangesResponse getContent() {
    return content;
  }


  public void setContent(ChannelProductChangesResponse content) {
    this.content = content;
  }


  public SingleOfChannelProductChangesResponse statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  public SingleOfChannelProductChangesResponse logId(Integer logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLogId() {
    return logId;
  }


  public void setLogId(Integer logId) {
    this.logId = logId;
  }


  public SingleOfChannelProductChangesResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public SingleOfChannelProductChangesResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public SingleOfChannelProductChangesResponse validationErrors(Map<String, List<String>> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public SingleOfChannelProductChangesResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(Map<String, List<String>> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleOfChannelProductChangesResponse singleOfChannelProductChangesResponse = (SingleOfChannelProductChangesResponse) o;
    return Objects.equals(this.content, singleOfChannelProductChangesResponse.content) &&
        Objects.equals(this.statusCode, singleOfChannelProductChangesResponse.statusCode) &&
        Objects.equals(this.logId, singleOfChannelProductChangesResponse.logId) &&
        Objects.equals(this.success, singleOfChannelProductChangesResponse.success) &&
        Objects.equals(this.message, singleOfChannelProductChangesResponse.message) &&
        Objects.equals(this.validationErrors, singleOfChannelProductChangesResponse.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, statusCode, logId, success, message, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleOfChannelProductChangesResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

