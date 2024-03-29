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


package com.channelengine.channel.apiclient.api;

import com.channelengine.channel.apiclient.ApiCallback;
import com.channelengine.channel.apiclient.ApiClient;
import com.channelengine.channel.apiclient.ApiException;
import com.channelengine.channel.apiclient.ApiResponse;
import com.channelengine.channel.apiclient.Configuration;
import com.channelengine.channel.apiclient.Pair;
import com.channelengine.channel.apiclient.ProgressRequestBody;
import com.channelengine.channel.apiclient.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.channelengine.channel.apiclient.model.CollectionOfChannelCancellationResponse;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CancellationApi {
    private ApiClient localVarApiClient;

    public CancellationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CancellationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for cancellationIndex
     * @param createdSince The date from which you will get all created cancellations (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancellationIndexCall(OffsetDateTime createdSince, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/cancellations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (createdSince != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("createdSince", createdSince));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancellationIndexValidateBeforeCall(OffsetDateTime createdSince, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = cancellationIndexCall(createdSince, _callback);
        return localVarCall;

    }

    /**
     * Get Cancellations.
     * Gets all cancellations created since the supplied date.
     * @param createdSince The date from which you will get all created cancellations (optional)
     * @return CollectionOfChannelCancellationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfChannelCancellationResponse cancellationIndex(OffsetDateTime createdSince) throws ApiException {
        ApiResponse<CollectionOfChannelCancellationResponse> localVarResp = cancellationIndexWithHttpInfo(createdSince);
        return localVarResp.getData();
    }

    /**
     * Get Cancellations.
     * Gets all cancellations created since the supplied date.
     * @param createdSince The date from which you will get all created cancellations (optional)
     * @return ApiResponse&lt;CollectionOfChannelCancellationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfChannelCancellationResponse> cancellationIndexWithHttpInfo(OffsetDateTime createdSince) throws ApiException {
        okhttp3.Call localVarCall = cancellationIndexValidateBeforeCall(createdSince, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelCancellationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Cancellations. (asynchronously)
     * Gets all cancellations created since the supplied date.
     * @param createdSince The date from which you will get all created cancellations (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancellationIndexAsync(OffsetDateTime createdSince, final ApiCallback<CollectionOfChannelCancellationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancellationIndexValidateBeforeCall(createdSince, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfChannelCancellationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
