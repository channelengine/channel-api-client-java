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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets MancoReason
 */
@JsonAdapter(MancoReason.Adapter.class)
public enum MancoReason {
  
  NOT_IN_STOCK("NOT_IN_STOCK"),
  
  DAMAGED("DAMAGED"),
  
  INCOMPLETE("INCOMPLETE"),
  
  CLIENT_CANCELLED("CLIENT_CANCELLED"),
  
  INVALID_ADDRESS("INVALID_ADDRESS"),
  
  OTHER("OTHER");

  private String value;

  MancoReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MancoReason fromValue(String value) {
    for (MancoReason b : MancoReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MancoReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final MancoReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MancoReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MancoReason.fromValue(value);
    }
  }
}

