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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ReturnStatus
 */
@JsonAdapter(ReturnStatus.Adapter.class)
public enum ReturnStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  RECEIVED("RECEIVED"),
  
  CANCELLED("CANCELLED");

  private String value;

  ReturnStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReturnStatus fromValue(String value) {
    for (ReturnStatus b : ReturnStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReturnStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReturnStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReturnStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReturnStatus.fromValue(value);
    }
  }
}

