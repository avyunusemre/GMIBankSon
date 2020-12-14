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

    @Given("Let's see all data on the screen using GET {string}")
    public void let_s_see_all_data_on_the_screen_using_GET(String endpoint) {

        response= given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.
                        getProperty("token")).
                when().
                get(endpoint);
        response.prettyPrint();

    }

    @Given("HTTP Status Code {int}")
    public void http_Status_Code(Integer code) {
        response.
                then().
                assertThat().
                statusCode(code);
    }


    @Given("Let's update the country {string} using PUT endpoint {string} id {int}")
    public void let_s_update_the_country_using_PUT_endpoint_id(String country, String url, Integer id) {

        String update= "{\"id\":id,\"name\": Belgium\"\"}";

        response=given().
                contentType(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.
                        getProperty("token")).
                body(update).
                when().
                put(country);
        response.prettyPrint();
    }

    @Given("After creating with PUT, let's verify the country created {string}")
    public void after_creating_with_PUT_let_s_verify_the_country_created(String string) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Country country=objectMapper.readValue(response.asString(),Country.class);

        String actual=country.getName();

        Assert.assertEquals(actual,string);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+string);
    }

    @Given("Let's update the country {string} using PATCH endpoint {string} id {int}")
    public void let_s_update_the_country_using_PATCH_endpoint_id(String string, String string2, Integer int1) {

    }

    @Given("After creating with PATCH, let's verify the country created {string}")
    public void after_creating_with_PATCH_let_s_verify_the_country_created(String string) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        Country country=objectMapper.readValue(response.asString(),Country.class);

        String actual=country.getName();

        Assert.assertEquals(actual,string);
        System.out.println("Actual: "+actual);
        System.out.println("Expected: "+string);
    }


}
