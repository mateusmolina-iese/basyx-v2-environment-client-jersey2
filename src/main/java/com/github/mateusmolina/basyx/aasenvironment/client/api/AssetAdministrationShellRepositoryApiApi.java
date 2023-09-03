package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiResponse;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.github.mateusmolina.basyx.aasenvironment.client.model.AssetAdministrationShell;
import com.github.mateusmolina.basyx.aasenvironment.client.model.AssetInformation;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Reference;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import com.github.mateusmolina.basyx.aasenvironment.client.model.SpecificAssetID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T13:20:12.648099800+02:00[Europe/Berlin]")
public class AssetAdministrationShellRepositoryApiApi {
  private ApiClient apiClient;

  public AssetAdministrationShellRepositoryApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AssetAdministrationShellRepositoryApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Deletes an Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Asset Administration Shell deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result deleteAssetAdministrationShellById(String aasIdentifier) throws ApiException {
    return deleteAssetAdministrationShellByIdWithHttpInfo(aasIdentifier).getData();
  }

  /**
   * Deletes an Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Asset Administration Shell deleted successfully </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> deleteAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling deleteAssetAdministrationShellById");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.deleteAssetAdministrationShellById", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself!
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Submodel reference deleted successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result deleteSubmodelReferenceByIdAasRepository(String aasIdentifier, String submodelIdentifier) throws ApiException {
    return deleteSubmodelReferenceByIdAasRepositoryWithHttpInfo(aasIdentifier, submodelIdentifier).getData();
  }

  /**
   * Deletes the submodel reference from the Asset Administration Shell. Does not delete the submodel itself!
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param submodelIdentifier The Submodel’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Submodel reference deleted successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> deleteSubmodelReferenceByIdAasRepositoryWithHttpInfo(String aasIdentifier, String submodelIdentifier) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling deleteSubmodelReferenceByIdAasRepository");
    }
    if (submodelIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'submodelIdentifier' when calling deleteSubmodelReferenceByIdAasRepository");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}/submodel-refs/{submodelIdentifier}"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier))
            .replaceAll("\\{submodelIdentifier}", apiClient.escapeString(submodelIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.deleteSubmodelReferenceByIdAasRepository", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all Asset Administration Shells
   * 
   * @param assetIds A list of specific Asset identifiers (optional)
   * @param idShort The Asset Administration Shell’s IdShort (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Asset Administration Shells </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public String getAllAssetAdministrationShells(List<SpecificAssetID> assetIds, String idShort, String limit, String cursor) throws ApiException {
    return getAllAssetAdministrationShellsWithHttpInfo(assetIds, idShort, limit, cursor).getData();
  }

  /**
   * Returns all Asset Administration Shells
   * 
   * @param assetIds A list of specific Asset identifiers (optional)
   * @param idShort The Asset Administration Shell’s IdShort (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Asset Administration Shells </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getAllAssetAdministrationShellsWithHttpInfo(List<SpecificAssetID> assetIds, String idShort, String limit, String cursor) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("multi", "assetIds", assetIds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "idShort", idShort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.getAllAssetAdministrationShells", "/shells", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all submodel references
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result getAllSubmodelReferencesAasRepository(String aasIdentifier, String limit, String cursor) throws ApiException {
    return getAllSubmodelReferencesAasRepositoryWithHttpInfo(aasIdentifier, limit, cursor).getData();
  }

  /**
   * Returns all submodel references
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getAllSubmodelReferencesAasRepositoryWithHttpInfo(String aasIdentifier, String limit, String cursor) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling getAllSubmodelReferencesAasRepository");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}/submodel-refs"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.getAllSubmodelReferencesAasRepository", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result getAssetAdministrationShellById(String aasIdentifier) throws ApiException {
    return getAssetAdministrationShellByIdWithHttpInfo(aasIdentifier).getData();
  }

  /**
   * Returns a specific Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling getAssetAdministrationShellById");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.getAssetAdministrationShellById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns the Asset Information
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return AssetInformation
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Asset Information </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public AssetInformation getAssetInformationAasRepository(String aasIdentifier) throws ApiException {
    return getAssetInformationAasRepositoryWithHttpInfo(aasIdentifier).getData();
  }

  /**
   * Returns the Asset Information
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;AssetInformation&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Asset Information </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AssetInformation> getAssetInformationAasRepositoryWithHttpInfo(String aasIdentifier) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling getAssetInformationAasRepository");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}/asset-information"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<AssetInformation> localVarReturnType = new GenericType<AssetInformation>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.getAssetInformationAasRepository", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new Asset Administration Shell
   * 
   * @param assetAdministrationShell  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Asset Administration Shell created successfully </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result postAssetAdministrationShell(AssetAdministrationShell assetAdministrationShell) throws ApiException {
    return postAssetAdministrationShellWithHttpInfo(assetAdministrationShell).getData();
  }

  /**
   * Creates a new Asset Administration Shell
   * 
   * @param assetAdministrationShell  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Asset Administration Shell created successfully </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postAssetAdministrationShellWithHttpInfo(AssetAdministrationShell assetAdministrationShell) throws ApiException {
    // Check required parameters
    if (assetAdministrationShell == null) {
      throw new ApiException(400, "Missing the required parameter 'assetAdministrationShell' when calling postAssetAdministrationShell");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.postAssetAdministrationShell", "/shells", "POST", new ArrayList<>(), assetAdministrationShell,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a submodel reference at the Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param reference  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel reference created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result postSubmodelReferenceAasRepository(String aasIdentifier, Reference reference) throws ApiException {
    return postSubmodelReferenceAasRepositoryWithHttpInfo(aasIdentifier, reference).getData();
  }

  /**
   * Creates a submodel reference at the Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param reference  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Submodel reference created successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postSubmodelReferenceAasRepositoryWithHttpInfo(String aasIdentifier, Reference reference) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling postSubmodelReferenceAasRepository");
    }
    if (reference == null) {
      throw new ApiException(400, "Missing the required parameter 'reference' when calling postSubmodelReferenceAasRepository");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}/submodel-refs"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.postSubmodelReferenceAasRepository", localVarPath, "POST", new ArrayList<>(), reference,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Updates an existing Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param assetAdministrationShell  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Asset Administration Shell updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result putAssetAdministrationShellById(String aasIdentifier, AssetAdministrationShell assetAdministrationShell) throws ApiException {
    return putAssetAdministrationShellByIdWithHttpInfo(aasIdentifier, assetAdministrationShell).getData();
  }

  /**
   * Updates an existing Asset Administration Shell
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param assetAdministrationShell  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 204 </td><td> Asset Administration Shell updated successfully </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> putAssetAdministrationShellByIdWithHttpInfo(String aasIdentifier, AssetAdministrationShell assetAdministrationShell) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling putAssetAdministrationShellById");
    }
    if (assetAdministrationShell == null) {
      throw new ApiException(400, "Missing the required parameter 'assetAdministrationShell' when calling putAssetAdministrationShellById");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.putAssetAdministrationShellById", localVarPath, "PUT", new ArrayList<>(), assetAdministrationShell,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Updates the Asset Information
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param assetInformation  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Asset Information updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public Result putAssetInformationAasRepository(String aasIdentifier, AssetInformation assetInformation) throws ApiException {
    return putAssetInformationAasRepositoryWithHttpInfo(aasIdentifier, assetInformation).getData();
  }

  /**
   * Updates the Asset Information
   * 
   * @param aasIdentifier The Asset Administration Shell’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param assetInformation  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Asset Information updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized, e.g. the server refused the authorization attempt. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> putAssetInformationAasRepositoryWithHttpInfo(String aasIdentifier, AssetInformation assetInformation) throws ApiException {
    // Check required parameters
    if (aasIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'aasIdentifier' when calling putAssetInformationAasRepository");
    }
    if (assetInformation == null) {
      throw new ApiException(400, "Missing the required parameter 'assetInformation' when calling putAssetInformationAasRepository");
    }

    // Path parameters
    String localVarPath = "/shells/{aasIdentifier}/asset-information"
            .replaceAll("\\{aasIdentifier}", apiClient.escapeString(aasIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("AssetAdministrationShellRepositoryApiApi.putAssetInformationAasRepository", localVarPath, "PUT", new ArrayList<>(), assetInformation,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
