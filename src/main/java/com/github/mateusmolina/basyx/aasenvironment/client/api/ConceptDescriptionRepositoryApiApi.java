package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiException;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiClient;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.ApiResponse;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Configuration;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.github.mateusmolina.basyx.aasenvironment.client.model.ConceptDescription;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-03T13:20:12.648099800+02:00[Europe/Berlin]")
public class ConceptDescriptionRepositoryApiApi {
  private ApiClient apiClient;

  public ConceptDescriptionRepositoryApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConceptDescriptionRepositoryApiApi(ApiClient apiClient) {
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
   * Deletes a Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Concept Description deleted successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public Result deleteConceptDescriptionById(String cdIdentifier) throws ApiException {
    return deleteConceptDescriptionByIdWithHttpInfo(cdIdentifier).getData();
  }

  /**
   * Deletes a Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Concept Description deleted successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> deleteConceptDescriptionByIdWithHttpInfo(String cdIdentifier) throws ApiException {
    // Check required parameters
    if (cdIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'cdIdentifier' when calling deleteConceptDescriptionById");
    }

    // Path parameters
    String localVarPath = "/concept-descriptions/{cdIdentifier}"
            .replaceAll("\\{cdIdentifier}", apiClient.escapeString(cdIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ConceptDescriptionRepositoryApiApi.deleteConceptDescriptionById", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns all Concept Descriptions
   * 
   * @param idShort The Concept Description’s IdShort (optional)
   * @param isCaseOf IsCaseOf reference (UTF8-BASE64-URL-encoded) (optional)
   * @param dataSpecificationRef DataSpecification reference (UTF8-BASE64-URL-encoded) (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Concept Descriptions </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public String getAllConceptDescriptions(String idShort, String isCaseOf, String dataSpecificationRef, String limit, String cursor) throws ApiException {
    return getAllConceptDescriptionsWithHttpInfo(idShort, isCaseOf, dataSpecificationRef, limit, cursor).getData();
  }

  /**
   * Returns all Concept Descriptions
   * 
   * @param idShort The Concept Description’s IdShort (optional)
   * @param isCaseOf IsCaseOf reference (UTF8-BASE64-URL-encoded) (optional)
   * @param dataSpecificationRef DataSpecification reference (UTF8-BASE64-URL-encoded) (optional)
   * @param limit The maximum number of elements in the response array (optional)
   * @param cursor A server-generated identifier retrieved from pagingMetadata that specifies from which position the result listing should continue (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Requested Concept Descriptions </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> getAllConceptDescriptionsWithHttpInfo(String idShort, String isCaseOf, String dataSpecificationRef, String limit, String cursor) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "idShort", idShort)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCaseOf", isCaseOf));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataSpecificationRef", dataSpecificationRef));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("ConceptDescriptionRepositoryApiApi.getAllConceptDescriptions", "/concept-descriptions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Returns a specific Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public Result getConceptDescriptionById(String cdIdentifier) throws ApiException {
    return getConceptDescriptionByIdWithHttpInfo(cdIdentifier).getData();
  }

  /**
   * Returns a specific Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> getConceptDescriptionByIdWithHttpInfo(String cdIdentifier) throws ApiException {
    // Check required parameters
    if (cdIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'cdIdentifier' when calling getConceptDescriptionById");
    }

    // Path parameters
    String localVarPath = "/concept-descriptions/{cdIdentifier}"
            .replaceAll("\\{cdIdentifier}", apiClient.escapeString(cdIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ConceptDescriptionRepositoryApiApi.getConceptDescriptionById", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Creates a new Concept Description
   * 
   * @param conceptDescription  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Concept Description created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public Result postConceptDescription(ConceptDescription conceptDescription) throws ApiException {
    return postConceptDescriptionWithHttpInfo(conceptDescription).getData();
  }

  /**
   * Creates a new Concept Description
   * 
   * @param conceptDescription  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Conflict, a resource which shall be created exists already. Might be thrown if a Submodel or SubmodelElement with the same ShortId is contained in a POST request. </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Concept Description created successfully </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> postConceptDescriptionWithHttpInfo(ConceptDescription conceptDescription) throws ApiException {
    // Check required parameters
    if (conceptDescription == null) {
      throw new ApiException(400, "Missing the required parameter 'conceptDescription' when calling postConceptDescription");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ConceptDescriptionRepositoryApiApi.postConceptDescription", "/concept-descriptions", "POST", new ArrayList<>(), conceptDescription,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
  /**
   * Updates an existing Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param conceptDescription  (required)
   * @return Result
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Concept Description updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public Result putConceptDescriptionById(String cdIdentifier, ConceptDescription conceptDescription) throws ApiException {
    return putConceptDescriptionByIdWithHttpInfo(cdIdentifier, conceptDescription).getData();
  }

  /**
   * Updates an existing Concept Description
   * 
   * @param cdIdentifier The Concept Description’s unique id (UTF8-BASE64-URL-encoded) (required)
   * @param conceptDescription  (required)
   * @return ApiResponse&lt;Result&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Default error handling for unmentioned status codes </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Concept Description updated successfully </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request, e.g. the request parameters of the format of the request body is wrong. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Result> putConceptDescriptionByIdWithHttpInfo(String cdIdentifier, ConceptDescription conceptDescription) throws ApiException {
    // Check required parameters
    if (cdIdentifier == null) {
      throw new ApiException(400, "Missing the required parameter 'cdIdentifier' when calling putConceptDescriptionById");
    }
    if (conceptDescription == null) {
      throw new ApiException(400, "Missing the required parameter 'conceptDescription' when calling putConceptDescriptionById");
    }

    // Path parameters
    String localVarPath = "/concept-descriptions/{cdIdentifier}"
            .replaceAll("\\{cdIdentifier}", apiClient.escapeString(cdIdentifier));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    GenericType<Result> localVarReturnType = new GenericType<Result>() {};
    return apiClient.invokeAPI("ConceptDescriptionRepositoryApiApi.putConceptDescriptionById", localVarPath, "PUT", new ArrayList<>(), conceptDescription,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               null, localVarReturnType, false);
  }
}
