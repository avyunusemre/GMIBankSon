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

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.put;

public class US26_YEmre {

    Response response;
    Response response2;
    ObjectMapper obj = new ObjectMapper();
    Country[] countries;
    Country newFirstCountry;
    Country newLastCountry;
    Country updatedCountry;
    String updatedFirst = "Kamil";
    String updatedLast = "Alamanya";
    Response putResponse;
    Integer firstCountryId;
    Integer lastCountryId;

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

    @Given("Send a PUT request to REST API endpoint and update first country {string}")
    public void send_a_PUT_request_to_REST_API_endpoint_and_update_first_country(String endpoint) throws IOException {

        firstCountryId = countries[0].getId();
        System.out.println(firstCountryId);


        updatedCountry = new Country(firstCountryId, updatedFirst, null);
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
                .put(endpoint)
        .then().statusCode(200).extract().response();

        System.out.println(putResponse.statusCode());


    }

    @Given("Send a PUT request to REST API endpoint and update last country {string}")
    public void send_a_PUT_request_to_REST_API_endpoint_and_update_last_country(String endpoint) throws JsonProcessingException {
        lastCountryId = countries[countries.length-1].getId();
        System.out.println(lastCountryId);

        updatedCountry = new Country(lastCountryId, updatedLast, null);
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
                .put(endpoint)
                .then().statusCode(200).extract().response();

        System.out.println(putResponse.statusCode());
    }

    @Then("Verify the updated last country has been updated")
    public void verify_the_updated_last_country_has_been_updated() throws IOException {

        response2 = given()
                .headers(
                        "Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_countries_endpoint")+lastCountryId);
        response2.prettyPrint();

        newLastCountry = obj.readValue(response2.asString(),Country.class);

        Assert.assertEquals(updatedLast, newLastCountry.getName());
    }

    @Then("Verify the updated country has been updated")
    public void verify_the_updated_country_has_been_updated() throws InterruptedException, IOException {

        response2 = given()
                .headers(
                        "Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(ConfigurationReader.getProperty("api_countries_endpoint")+firstCountryId);
        response2.prettyPrint();

        newFirstCountry = obj.readValue(response2.asString(),Country.class);

        Assert.assertEquals(updatedFirst, newFirstCountry.getName());
    }


}
