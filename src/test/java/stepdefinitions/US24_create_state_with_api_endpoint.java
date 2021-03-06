package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos_.States;
import utilities.ConfigurationReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;


public class US24_create_state_with_api_endpoint {
    Response response;

    @Given("user get data with valid token and {string}")
    public void user_get_data_with_valid_and(String endpoint) {
       response = given().
                             auth().
                             oauth2(ConfigurationReader.getProperty("token")).
                             when().get(ConfigurationReader.getProperty("state_api_endpoint"));
       // response.prettyPrint();
    }
    @When("user verify status code {int} and content type JSon")
    public void user_verify_status_code_and_content_type_JSon(Integer statusCode) {
        response.then().assertThat().statusCode(statusCode).contentType(ContentType.JSON);
    }

    @When("user create a new {string} one by one if it is not created already")
    public void user_create_a_new_one_by_one_if_it_is_not_created_already(String state) {
        States states = new States(state,null);

        response = given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                body(states).
                when().
                post(ConfigurationReader.getProperty("state_api_endpoint"));
        response.prettyPrint();
    }

    @Then("validate {string} is created")
    public void validate_is_created(String state) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        States states = objectMapper.readValue(response.asString(),States.class);

        String actual = states.getName();
        Assert.assertEquals(actual,state);
    }


}
