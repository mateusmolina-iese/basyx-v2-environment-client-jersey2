/*
 * BaSyx AAS Environment Component
 * AAS Environment API
 *
 * The version of the OpenAPI document: 2.0
 * Contact: basyx-dev@eclipse.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.mateusmolina.basyx.aasenvironment.client.api;

import com.github.mateusmolina.basyx.aasenvironment.client.invoker.*;
import com.github.mateusmolina.basyx.aasenvironment.client.invoker.auth.*;
import com.github.mateusmolina.basyx.aasenvironment.client.model.OperationRequest;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Result;
import com.github.mateusmolina.basyx.aasenvironment.client.model.Submodel;
import com.github.mateusmolina.basyx.aasenvironment.client.model.SubmodelElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubmodelRepositoryApiApi
 */
public class SubmodelRepositoryApiApiTest {

    private final SubmodelRepositoryApiApi api = new SubmodelRepositoryApiApi();

    /**
     * Deletes a Submodel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSubmodelByIdTest() throws ApiException {
        //String submodelIdentifier = null;
        //Result response = api.deleteSubmodelById(submodelIdentifier);
        // TODO: test validations
    }

    /**
     * Deletes a submodel element at a specified path within the submodel elements hierarchy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSubmodelElementByPathSubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //Result response = api.deleteSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath);
        // TODO: test validations
    }

    /**
     * Returns all submodel elements including their hierarchy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllSubmodelElementsTest() throws ApiException {
        //String submodelIdentifier = null;
        //String limit = null;
        //String cursor = null;
        //String level = null;
        //String extent = null;
        //String response = api.getAllSubmodelElements(submodelIdentifier, limit, cursor, level, extent);
        // TODO: test validations
    }

    /**
     * Returns all Submodels
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllSubmodelsTest() throws ApiException {
        //String semanticId = null;
        //String idShort = null;
        //String limit = null;
        //String cursor = null;
        //String level = null;
        //String extent = null;
        //Result response = api.getAllSubmodels(semanticId, idShort, limit, cursor, level, extent);
        // TODO: test validations
    }

    /**
     * Returns a specific Submodel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubmodelByIdTest() throws ApiException {
        //String submodelIdentifier = null;
        //String level = null;
        //String extent = null;
        //Result response = api.getSubmodelById(submodelIdentifier, level, extent);
        // TODO: test validations
    }

    /**
     * Returns the metadata attributes of a specific Submodel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubmodelByIdMetadataTest() throws ApiException {
        //String submodelIdentifier = null;
        //String level = null;
        //Result response = api.getSubmodelByIdMetadata(submodelIdentifier, level);
        // TODO: test validations
    }

    /**
     * Returns a specific Submodel in the ValueOnly representation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubmodelByIdValueOnlyTest() throws ApiException {
        //String submodelIdentifier = null;
        //String level = null;
        //String extent = null;
        //Result response = api.getSubmodelByIdValueOnly(submodelIdentifier, level, extent);
        // TODO: test validations
    }

    /**
     * Returns a specific submodel element from the Submodel at a specified path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubmodelElementByPathSubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //String level = null;
        //String extent = null;
        //Result response = api.getSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, level, extent);
        // TODO: test validations
    }

    /**
     * Returns a specific submodel element from the Submodel at a specified path in the ValueOnly representation
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSubmodelElementByPathValueOnlySubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //String level = null;
        //String extent = null;
        //Object response = api.getSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, level, extent);
        // TODO: test validations
    }

    /**
     * Synchronously or asynchronously invokes an Operation at a specified path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void invokeOperationSubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //OperationRequest operationRequest = null;
        //String async = null;
        //Result response = api.invokeOperationSubmodelRepo(submodelIdentifier, idShortPath, operationRequest, async);
        // TODO: test validations
    }

    /**
     * Updates the value of an existing SubmodelElement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchSubmodelElementByPathValueOnlySubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //Object body = null;
        //String level = null;
        //Result response = api.patchSubmodelElementByPathValueOnlySubmodelRepo(submodelIdentifier, idShortPath, body, level);
        // TODO: test validations
    }

    /**
     * Creates a new Submodel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSubmodelTest() throws ApiException {
        //Submodel submodel = null;
        //Result response = api.postSubmodel(submodel);
        // TODO: test validations
    }

    /**
     * Creates a new submodel element at a specified path within submodel elements hierarchy
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSubmodelElementByPathSubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //String idShortPath = null;
        //SubmodelElement submodelElement = null;
        //String level = null;
        //String extent = null;
        //Result response = api.postSubmodelElementByPathSubmodelRepo(submodelIdentifier, idShortPath, submodelElement, level, extent);
        // TODO: test validations
    }

    /**
     * Creates a new submodel element
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postSubmodelElementSubmodelRepoTest() throws ApiException {
        //String submodelIdentifier = null;
        //SubmodelElement submodelElement = null;
        //Result response = api.postSubmodelElementSubmodelRepo(submodelIdentifier, submodelElement);
        // TODO: test validations
    }

    /**
     * Updates an existing Submodel
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putSubmodelByIdTest() throws ApiException {
        //String submodelIdentifier = null;
        //Submodel submodel = null;
        //String level = null;
        //Result response = api.putSubmodelById(submodelIdentifier, submodel, level);
        // TODO: test validations
    }

}
