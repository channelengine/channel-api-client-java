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


import com.channelengine.channel.apiclient.model.CollectionOfChannelShipmentResponse;
import java.io.File;
import com.channelengine.channel.apiclient.model.ModelApiResponse;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipmentApi {
    private ApiClient localVarApiClient;

    public ShipmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShipmentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for shipmentIndex
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param channelOrderNos Filter on the unique references (ids) as used by the channel. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentIndexCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> channelOrderNos, Integer page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/shipments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (channelOrderNos != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "channelOrderNos", channelOrderNos));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
    private okhttp3.Call shipmentIndexValidateBeforeCall(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> channelOrderNos, Integer page, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = shipmentIndexCall(fromDate, toDate, channelOrderNos, page, _callback);
        return localVarCall;

    }

    /**
     * Get Shipments.
     * Gets all shipments created since the supplied date with status CLOSED.
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param channelOrderNos Filter on the unique references (ids) as used by the channel. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return CollectionOfChannelShipmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public CollectionOfChannelShipmentResponse shipmentIndex(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> channelOrderNos, Integer page) throws ApiException {
        ApiResponse<CollectionOfChannelShipmentResponse> localVarResp = shipmentIndexWithHttpInfo(fromDate, toDate, channelOrderNos, page);
        return localVarResp.getData();
    }

    /**
     * Get Shipments.
     * Gets all shipments created since the supplied date with status CLOSED.
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param channelOrderNos Filter on the unique references (ids) as used by the channel. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @return ApiResponse&lt;CollectionOfChannelShipmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CollectionOfChannelShipmentResponse> shipmentIndexWithHttpInfo(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> channelOrderNos, Integer page) throws ApiException {
        okhttp3.Call localVarCall = shipmentIndexValidateBeforeCall(fromDate, toDate, channelOrderNos, page, null);
        Type localVarReturnType = new TypeToken<CollectionOfChannelShipmentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Shipments. (asynchronously)
     * Gets all shipments created since the supplied date with status CLOSED.
     * @param fromDate Filter on the creation date, starting from this date. This date is inclusive. (optional)
     * @param toDate Filter on the creation date, until this date. This date is exclusive. (optional)
     * @param channelOrderNos Filter on the unique references (ids) as used by the channel. (optional)
     * @param page The page to filter on. Starts at 1. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentIndexAsync(OffsetDateTime fromDate, OffsetDateTime toDate, List<String> channelOrderNos, Integer page, final ApiCallback<CollectionOfChannelShipmentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentIndexValidateBeforeCall(fromDate, toDate, channelOrderNos, page, _callback);
        Type localVarReturnType = new TypeToken<CollectionOfChannelShipmentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for shipmentShippingLabel
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentShippingLabelCall(String merchantShipmentNo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v2/orders/{merchantShipmentNo}/shippinglabel"
            .replaceAll("\\{" + "merchantShipmentNo" + "\\}", localVarApiClient.escapeString(merchantShipmentNo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.shippingLabel", "application/json"
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
    private okhttp3.Call shipmentShippingLabelValidateBeforeCall(String merchantShipmentNo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantShipmentNo' is set
        if (merchantShipmentNo == null) {
            throw new ApiException("Missing the required parameter 'merchantShipmentNo' when calling shipmentShippingLabel(Async)");
        }
        

        okhttp3.Call localVarCall = shipmentShippingLabelCall(merchantShipmentNo, _callback);
        return localVarCall;

    }

    /**
     * Download shipping label.
     * Downloads the shipping label for the shipment. There may pass some time between creating the shipment&lt;br /&gt;and the availability of the label. So &#39;404 Not Found&#39; might incidate it is not available yet.
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public File shipmentShippingLabel(String merchantShipmentNo) throws ApiException {
        ApiResponse<File> localVarResp = shipmentShippingLabelWithHttpInfo(merchantShipmentNo);
        return localVarResp.getData();
    }

    /**
     * Download shipping label.
     * Downloads the shipping label for the shipment. There may pass some time between creating the shipment&lt;br /&gt;and the availability of the label. So &#39;404 Not Found&#39; might incidate it is not available yet.
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> shipmentShippingLabelWithHttpInfo(String merchantShipmentNo) throws ApiException {
        okhttp3.Call localVarCall = shipmentShippingLabelValidateBeforeCall(merchantShipmentNo, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Download shipping label. (asynchronously)
     * Downloads the shipping label for the shipment. There may pass some time between creating the shipment&lt;br /&gt;and the availability of the label. So &#39;404 Not Found&#39; might incidate it is not available yet.
     * @param merchantShipmentNo The unique shipment reference as used by the merchant. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> shippingLabel </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call shipmentShippingLabelAsync(String merchantShipmentNo, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = shipmentShippingLabelValidateBeforeCall(merchantShipmentNo, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
