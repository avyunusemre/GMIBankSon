package stepdefinitions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos_.Country;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.given;

public class US26_YEmre {

    Response response;
    ObjectMapper obj = new ObjectMapper();
    Country[] countries;
    Country updatedCountry;
    Response putResponse;
    Integer firstCountryId;

    @Given("Send a GET request to REST API endpoint")
    public void send_a_GET_request_to_REST_API_endpoint() {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_countries_endpoint"))
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        //response.prettyPrint();

    }

    @Given("Verify the HTTP Status code")
    public void verify_the_HTTP_Status_code() {

        response.then()
                .assertThat()
                .statusCode(200);
    }

    @Given("get all countries as De-Serialization")
    public void get_all_countries_as_De_Serialization() throws Exception {

        countries = obj.readValue(response.asString(),Country[].class);
    }

    @Given("Send a PUT request to REST API endpoint and update first country")
    public void send_a_PUT_request_to_REST_API_endpoint_and_update_first_country() throws JsonProcessingException {

        firstCountryId = countries[0].getId();
        System.out.println(firstCountryId);

        updatedCountry = new Country(firstCountryId,"Dalmacya", null);
        String updated = obj.writeValueAsString(updatedCountry);
        System.out.println(updated);

        putResponse = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).body(updated)
                .when()
                .put(ConfigurationReader.getProperty("api_countries_endpoint") + firstCountryId)
        .then().statusCode(200).extract().response();

    }

    @Then("Verify the updated country has been updated")
    public void verify_the_updated_country_has_been_updated() {
        Assert.assertEquals("Dalmacya",countries[0].getName());
    }


}
