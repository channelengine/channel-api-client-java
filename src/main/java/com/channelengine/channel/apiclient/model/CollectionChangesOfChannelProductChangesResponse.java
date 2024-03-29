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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CollectionChangesOfChannelProductChangesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CollectionChangesOfChannelProductChangesResponse {
  public static final String SERIALIZED_NAME_CONTENT = "Content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private ChannelProductChangesResponse content;

  public static final String SERIALIZED_NAME_TO_BE_CREATED_TOTAL_COUNT = "ToBeCreatedTotalCount";
  @SerializedName(SERIALIZED_NAME_TO_BE_CREATED_TOTAL_COUNT)
  private Integer toBeCreatedTotalCount;

  public static final String SERIALIZED_NAME_TO_BE_UPDATED_TOTAL_COUNT = "ToBeUpdatedTotalCount";
  @SerializedName(SERIALIZED_NAME_TO_BE_UPDATED_TOTAL_COUNT)
  private Integer toBeUpdatedTotalCount;

  public static final String SERIALIZED_NAME_TO_BE_DELETED_TOTAL_COUNT = "ToBeDeletedTotalCount";
  @SerializedName(SERIALIZED_NAME_TO_BE_DELETED_TOTAL_COUNT)
  private Integer toBeDeletedTotalCount;

  public static final String SERIALIZED_NAME_STATUS_CODE = "StatusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public static final String SERIALIZED_NAME_REQUEST_ID = "RequestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_LOG_ID = "LogId";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private String logId;

  public static final String SERIALIZED_NAME_SUCCESS = "Success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "ValidationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private Map<String, List<String>> validationErrors = null;


  public CollectionChangesOfChannelProductChangesResponse content(ChannelProductChangesResponse content) {
    
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


  public CollectionChangesOfChannelProductChangesResponse toBeCreatedTotalCount(Integer toBeCreatedTotalCount) {
    
    this.toBeCreatedTotalCount = toBeCreatedTotalCount;
    return this;
  }

   /**
   * Get toBeCreatedTotalCount
   * @return toBeCreatedTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToBeCreatedTotalCount() {
    return toBeCreatedTotalCount;
  }


  public void setToBeCreatedTotalCount(Integer toBeCreatedTotalCount) {
    this.toBeCreatedTotalCount = toBeCreatedTotalCount;
  }


  public CollectionChangesOfChannelProductChangesResponse toBeUpdatedTotalCount(Integer toBeUpdatedTotalCount) {
    
    this.toBeUpdatedTotalCount = toBeUpdatedTotalCount;
    return this;
  }

   /**
   * Get toBeUpdatedTotalCount
   * @return toBeUpdatedTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToBeUpdatedTotalCount() {
    return toBeUpdatedTotalCount;
  }


  public void setToBeUpdatedTotalCount(Integer toBeUpdatedTotalCount) {
    this.toBeUpdatedTotalCount = toBeUpdatedTotalCount;
  }


  public CollectionChangesOfChannelProductChangesResponse toBeDeletedTotalCount(Integer toBeDeletedTotalCount) {
    
    this.toBeDeletedTotalCount = toBeDeletedTotalCount;
    return this;
  }

   /**
   * Get toBeDeletedTotalCount
   * @return toBeDeletedTotalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToBeDeletedTotalCount() {
    return toBeDeletedTotalCount;
  }


  public void setToBeDeletedTotalCount(Integer toBeDeletedTotalCount) {
    this.toBeDeletedTotalCount = toBeDeletedTotalCount;
  }


  public CollectionChangesOfChannelProductChangesResponse statusCode(Integer statusCode) {
    
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


  public CollectionChangesOfChannelProductChangesResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CollectionChangesOfChannelProductChangesResponse logId(String logId) {
    
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogId() {
    return logId;
  }


  public void setLogId(String logId) {
    this.logId = logId;
  }


  public CollectionChangesOfChannelProductChangesResponse success(Boolean success) {
    
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


  public CollectionChangesOfChannelProductChangesResponse message(String message) {
    
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


  public CollectionChangesOfChannelProductChangesResponse validationErrors(Map<String, List<String>> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public CollectionChangesOfChannelProductChangesResponse putValidationErrorsItem(String key, List<String> validationErrorsItem) {
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
    CollectionChangesOfChannelProductChangesResponse collectionChangesOfChannelProductChangesResponse = (CollectionChangesOfChannelProductChangesResponse) o;
    return Objects.equals(this.content, collectionChangesOfChannelProductChangesResponse.content) &&
        Objects.equals(this.toBeCreatedTotalCount, collectionChangesOfChannelProductChangesResponse.toBeCreatedTotalCount) &&
        Objects.equals(this.toBeUpdatedTotalCount, collectionChangesOfChannelProductChangesResponse.toBeUpdatedTotalCount) &&
        Objects.equals(this.toBeDeletedTotalCount, collectionChangesOfChannelProductChangesResponse.toBeDeletedTotalCount) &&
        Objects.equals(this.statusCode, collectionChangesOfChannelProductChangesResponse.statusCode) &&
        Objects.equals(this.requestId, collectionChangesOfChannelProductChangesResponse.requestId) &&
        Objects.equals(this.logId, collectionChangesOfChannelProductChangesResponse.logId) &&
        Objects.equals(this.success, collectionChangesOfChannelProductChangesResponse.success) &&
        Objects.equals(this.message, collectionChangesOfChannelProductChangesResponse.message) &&
        Objects.equals(this.validationErrors, collectionChangesOfChannelProductChangesResponse.validationErrors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, toBeCreatedTotalCount, toBeUpdatedTotalCount, toBeDeletedTotalCount, statusCode, requestId, logId, success, message, validationErrors);
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
    sb.append("class CollectionChangesOfChannelProductChangesResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toBeCreatedTotalCount: ").append(toIndentedString(toBeCreatedTotalCount)).append("\n");
    sb.append("    toBeUpdatedTotalCount: ").append(toIndentedString(toBeUpdatedTotalCount)).append("\n");
    sb.append("    toBeDeletedTotalCount: ").append(toIndentedString(toBeDeletedTotalCount)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

