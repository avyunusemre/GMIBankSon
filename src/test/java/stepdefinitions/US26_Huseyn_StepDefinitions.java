package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos_.Country;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class US26_Huseyn_StepDefinitions {

    Response response;
    ObjectMapper obj=new ObjectMapper();
    Country[] countries;
    Country countryUpdated;
    Response responseUpdated;
    Response response2;
    int firstCountryId;
    String updatedCountry="Scotland";

    @Given("Let's see all data on the screen using GET {string}")
    public void let_s_see_all_data_on_the_screen_using_GET(String string) {

        response= given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.
                        getProperty("token")).
                when().
                get(string);

//        response.prettyPrint();

    }

    @Given("HTTP Status Code {int}")
    public void http_Status_Code(Integer code) {

        response.
                then().
                assertThat().
                statusCode(code);


    }

    @Given("Get all countries as De-Serialization")
    public void get_all_countries_as_De_Serialization() throws Exception {

        countries = obj.readValue(response.asString(), Country[].class);

    }

    @Given("Let's update the first ID country using PUT endpoint {string}")
    public void let_s_update_the_first_ID_country_using_PUT_endpoint(String endpoint) throws Exception {

        firstCountryId = countries[0].getId();

        response2 = given()
                .headers(
                        "Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when()
                .get(endpoint+firstCountryId);
        response2.prettyPrint();


        System.out.println(firstCountryId);

        countryUpdated = new Country(firstCountryId,updatedCountry,null);
        String updated = obj.writeValueAsString(countryUpdated);

        responseUpdated = given()
                .headers(
                        "Authorization",
                        "Bearer " + ConfigurationReader.getProperty("token"),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .body(updated)
                .when()
                .put(endpoint);
        responseUpdated.prettyPrint();
        System.out.println(responseUpdated.getStatusCode());

    }

    @Then("After creating with PUT, let's verify the country created")
    public void after_creating_with_PUT_let_s_verify_the_country_created() {

        String actual=responseUpdated.path("name");

        Assert.assertEquals(updatedCountry, actual);

    }

}
