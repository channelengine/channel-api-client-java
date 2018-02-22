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


import com.channelengine.channel.apiclient.model.ChannelReturnRequest;
import com.channelengine.channel.apiclient.model.CollectionOfChannelReturnResponse;
import com.channelengine.channel.apiclient.model.ModelApiResponse;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnApi {
    private ApiClient apiClient;

    public ReturnApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReturnApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for returnDeclareForChannel
     * @param model  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call returnDeclareForChannelCall(ChannelReturnRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = model;

        // create path and map variables
        String localVarPath = "/v2/returns/channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call returnDeclareForChannelValidateBeforeCall(ChannelReturnRequest model, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'model' is set
        if (model == null) {
            throw new ApiException("Missing the required parameter 'model' when calling returnDeclareForChannel(Async)");
        }
        

        com.squareup.okhttp.Call call = returnDeclareForChannelCall(model, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create Return
     * Mark (part of) an order as returned by the customer.
     * @param model  (required)
     * @return ModelApiResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelApiResponse returnDeclareForChannel(ChannelReturnRequest model) throws ApiException {
        ApiResponse<ModelApiResponse> resp = returnDeclareForChannelWithHttpInfo(model);
        return resp.getData();
    }

    /**
     * Create Return
     * Mark (part of) an order as returned by the customer.
     * @param model  (required)
     * @return ApiResponse&lt;ModelApiResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelApiResponse> returnDeclareForChannelWithHttpInfo(ChannelReturnRequest model) throws ApiException {
        com.squareup.okhttp.Call call = returnDeclareForChannelValidateBeforeCall(model, null, null);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Return (asynchronously)
     * Mark (part of) an order as returned by the customer.
     * @param model  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call returnDeclareForChannelAsync(ChannelReturnRequest model, final ApiCallback<ModelApiResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = returnDeclareForChannelValidateBeforeCall(model, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelApiResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for returnGetDeclaredByMerchant
     * @param createdSince  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call returnGetDeclaredByMerchantCall(OffsetDateTime createdSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/returns/channel";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (createdSince != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("createdSince", createdSince));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apikey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call returnGetDeclaredByMerchantValidateBeforeCall(OffsetDateTime createdSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createdSince' is set
        if (createdSince == null) {
            throw new ApiException("Missing the required parameter 'createdSince' when calling returnGetDeclaredByMerchant(Async)");
        }
        

        com.squareup.okhttp.Call call = returnGetDeclaredByMerchantCall(createdSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Returns
     * Get all returns created by the merchant. This call is supposed  to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;  call.
     * @param createdSince  (required)
     * @return CollectionOfChannelReturnResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionOfChannelReturnResponse returnGetDeclaredByMerchant(OffsetDateTime createdSince) throws ApiException {
        ApiResponse<CollectionOfChannelReturnResponse> resp = returnGetDeclaredByMerchantWithHttpInfo(createdSince);
        return resp.getData();
    }

    /**
     * Get Returns
     * Get all returns created by the merchant. This call is supposed  to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;  call.
     * @param createdSince  (required)
     * @return ApiResponse&lt;CollectionOfChannelReturnResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionOfChannelReturnResponse> returnGetDeclaredByMerchantWithHttpInfo(OffsetDateTime createdSince) throws ApiException {
        com.squareup.okhttp.Call call = returnGetDeclaredByMerchantValidateBeforeCall(createdSince, null, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelReturnResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Returns (asynchronously)
     * Get all returns created by the merchant. This call is supposed  to be used by channels. Merchants should use the &#39;GET /v2/returns/merchant&#39;  call.
     * @param createdSince  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call returnGetDeclaredByMerchantAsync(OffsetDateTime createdSince, final ApiCallback<CollectionOfChannelReturnResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = returnGetDeclaredByMerchantValidateBeforeCall(createdSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionOfChannelReturnResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
