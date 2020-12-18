package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import pojos_.Registrations;
import utilities.ConfigurationReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US_23_StepDefinitions_Ibr {
    Response response;
    ObjectMapper obj= new ObjectMapper();
    Registrations[] applicant;

    @Given("Send a GET request to REST API endpoint {string}")
    public void send_a_GET_request_to_REST_API_endpoint(String url) {
       response = given().auth().oauth2(ConfigurationReader.getProperty("token"))
               .contentType(ContentType.JSON)
               .when()
               .get(url);
      // response.prettyPrint();


    }

    @Given("Verify the Status Code")
    public void verify_the_Status_Code() {

        response.then().
                assertThat().
                statusCode(200);


    }

    @Given("Get all Applicant's info as De Serialization")
    public void get_all_Applicant_s_info_as_De_Serialization() throws IOException {

        applicant = obj.readValue(response.asString(),Registrations[].class);

    }

    @Then("Verify all customers you created")
    public void verify_all_customers_you_created() {

        Registrations verifyCustomer = new Registrations(1602, "123-45-6789", "settar",
                "techproed", "Gallows road 123", "123-345-2354", 1552, "user2",
                "hisetkal@gmail.com", "2020-10-16T10:28:36.868Z");

        List<Integer> IDSon = new ArrayList<>();
        for (Registrations w:applicant ){
            IDSon.add(w.getId());
        }

      Assert.assertTrue(IDSon.contains(verifyCustomer.getId()));


            }
        }



