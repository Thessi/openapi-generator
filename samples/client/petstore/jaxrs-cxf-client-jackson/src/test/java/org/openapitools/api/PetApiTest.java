/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.api;

import java.io.File;
import org.openapitools.model.ModelApiResponse;
import org.openapitools.model.Pet;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * OpenAPI Petstore
 *
 * <p>This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API tests for PetApi 
 */
public class PetApiTest {


    private PetApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://petstore.swagger.io/v2", PetApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Add a new pet to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() {
        Pet body = null;
        //api.addPet(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Deletes a pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() {
        Long petId = null;
        String apiKey = null;
        //api.deletePet(petId, apiKey);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() {
        List<String> status = null;
        //List<Pet> response = api.findPetsByStatus(status);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() {
        List<String> tags = null;
        //List<Pet> response = api.findPetsByTags(tags);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() {
        Long petId = null;
        //Pet response = api.getPetById(petId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Update an existing pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() {
        Pet body = null;
        //api.updatePet(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * Updates a pet in the store with form data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() {
        Long petId = null;
        String name = null;
        String status = null;
        //api.updatePetWithForm(petId, name, status);
        
        // TODO: test validations
        
        
    }
    
    /**
     * uploads an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() {
        Long petId = null;
        String additionalMetadata = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment file = null;
        //ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
}