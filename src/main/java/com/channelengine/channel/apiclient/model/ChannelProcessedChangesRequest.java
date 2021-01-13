/*
 * ChannelEngine Channel API
 * ChannelEngine API for channels
 *
 * The version of the OpenAPI document: 2.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.channelengine.channel.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.channelengine.channel.apiclient.model.ChannelProductReferencesRequest;
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
 * ChannelProcessedChangesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChannelProcessedChangesRequest {
  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private List<ChannelProductReferencesRequest> created = null;

  public static final String SERIALIZED_NAME_UPDATED = "Updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private List<String> updated = null;

  public static final String SERIALIZED_NAME_REMOVED = "Removed";
  @SerializedName(SERIALIZED_NAME_REMOVED)
  private List<String> removed = null;


  public ChannelProcessedChangesRequest created(List<ChannelProductReferencesRequest> created) {
    
    this.created = created;
    return this;
  }

  public ChannelProcessedChangesRequest addCreatedItem(ChannelProductReferencesRequest createdItem) {
    if (this.created == null) {
      this.created = new ArrayList<ChannelProductReferencesRequest>();
    }
    this.created.add(createdItem);
    return this;
  }

   /**
   * A collection of pairs of merchant and channel references  of the products which are successfully created. The channel references  are saved such that in subsequent calls these can be used instead of the  merchant references.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A collection of pairs of merchant and channel references  of the products which are successfully created. The channel references  are saved such that in subsequent calls these can be used instead of the  merchant references.")

  public List<ChannelProductReferencesRequest> getCreated() {
    return created;
  }


  public void setCreated(List<ChannelProductReferencesRequest> created) {
    this.created = created;
  }


  public ChannelProcessedChangesRequest updated(List<String> updated) {
    
    this.updated = updated;
    return this;
  }

  public ChannelProcessedChangesRequest addUpdatedItem(String updatedItem) {
    if (this.updated == null) {
      this.updated = new ArrayList<String>();
    }
    this.updated.add(updatedItem);
    return this;
  }

   /**
   * The channel references of the products which are successfully updated.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel references of the products which are successfully updated.")

  public List<String> getUpdated() {
    return updated;
  }


  public void setUpdated(List<String> updated) {
    this.updated = updated;
  }


  public ChannelProcessedChangesRequest removed(List<String> removed) {
    
    this.removed = removed;
    return this;
  }

  public ChannelProcessedChangesRequest addRemovedItem(String removedItem) {
    if (this.removed == null) {
      this.removed = new ArrayList<String>();
    }
    this.removed.add(removedItem);
    return this;
  }

   /**
   * The channel references of the products which are successfully removed.
   * @return removed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The channel references of the products which are successfully removed.")

  public List<String> getRemoved() {
    return removed;
  }


  public void setRemoved(List<String> removed) {
    this.removed = removed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelProcessedChangesRequest channelProcessedChangesRequest = (ChannelProcessedChangesRequest) o;
    return Objects.equals(this.created, channelProcessedChangesRequest.created) &&
        Objects.equals(this.updated, channelProcessedChangesRequest.updated) &&
        Objects.equals(this.removed, channelProcessedChangesRequest.removed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, removed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelProcessedChangesRequest {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

