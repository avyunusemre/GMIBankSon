package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pojos_.Customers;
import pojos_.States;
import utilities.ConfigurationReader;
import utilities.DatabaseUtility;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.urlEncodingEnabled;

public class US20_BH {
    Response response;
    String filepath = ConfigurationReader.getProperty("filePath");
    String bearer_token = ConfigurationReader.getProperty("api_barer_token");
    Customers[] customers;
    List<Map<String,Object>> customersMap;
    String query;
    SoftAssert softAssert=new SoftAssert();


    @Given("user sets all response using api endpoint {string}")
    public void user_sets_all_response_using_api_endpoint(String string) {

        response = given().headers("Authorization", "Bearer " + ConfigurationReader.getProperty("token"),
                "Content_Type", ContentType.JSON, "Accept", ContentType.JSON).when().get(string).then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();

    }

    @Given("user deserializers country data as json to java")
    public void user_deserializers_country_data_as_json_to_java() throws IOException {
        Gson gson=new Gson();
        JsonPath jsonPath=response.jsonPath();
        jsonPath = response.jsonPath();
        customersMap = jsonPath.getList("$");

    }

    @Then("user validates the data")
    public void user_validates_the_data()  {

        for (int i = 0; i < customers.length; i++){
            Assert.assertEquals(customers[i].getSsn(),customersMap.get(i).get("ssn"));


        }




        }


    }



