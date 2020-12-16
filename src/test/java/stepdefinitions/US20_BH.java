package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.urlEncodingEnabled;

public class US20_BH {
    Response response;
  //  String filepath = ConfigurationReader.getProperty("filePath");
   // String bearer_token = ConfigurationReader.getProperty("api_barer_token");
     List<Object> customers;
    List<Map<String,Object>> customersMap;

    SoftAssert softAssert=new SoftAssert();
    Gson gson=new Gson();



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
        customers= jsonPath.getList("$");

    }

    @Then("user validates the data")
    public void user_validates_the_data()  {

       JsonPath jsonPath = response.jsonPath();

        for (int i = 0; i < customers.size(); i++) {

          //  softAssert.assertEquals(jsonPath.getString("ssn"), customersMap.get(i));


            List<String> actualList = jsonPath.getList("ssn");
            System.out.println(actualList);
            List<String>expectedList=jsonPath.getList("ssn");


              for (int j = 0; j < expectedList.size(); j++) {

               softAssert.assertEquals(actualList.get(i).trim(), expectedList.get(j));
                  System.out.println(expectedList);
               softAssert.assertAll();
            }


        }
    }
    @Then("user validates all data one by one")
    public void user_validates_all_data_one_by_one() {
        JsonPath jsonPath = response.jsonPath();

        for (int i = 0; i < customers.size(); i++) {

            //  softAssert.assertEquals(jsonPath.getString("ssn"), customersMap.get(i));


            List<String> actualList = jsonPath.getList("ssn");
            System.out.println(actualList);
            List<String>expectedList=jsonPath.getList("ssn");


            for (int j = 0; j < expectedList.size(); j++) {

                softAssert.assertEquals(actualList.get(1).trim(), expectedList.get(1));

                System.out.println(expectedList);
                softAssert.assertAll();
            }


        }

    }

}






