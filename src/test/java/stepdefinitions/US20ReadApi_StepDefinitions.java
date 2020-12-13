package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class US20ReadApi_StepDefinitions {

    @Given("use api end point  {string}")
    public void use_api_end_point(String customerEndPointUrl) {

      //  Response response = given().accept()


    }

    @Given("get all customers' information as De-Serialization")
    public void get_all_customers_information_as_De_Serialization() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("find out how many customers are and verify that there are {int} customers")
    public void find_out_how_many_customers_are_and_verify_that_there_are_customers(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("get all the information of the seventh customer")
    public void get_all_the_information_of_the_seventh_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("verify seventh customers ssn is {string} and country name is {string}")
    public void verify_seventh_customers_ssn_is_and_country_name_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Given("verify first customer's firstName {string}")
    public void verify_first_customer_s_firstName(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("verify second customer's lastName {string}")
    public void verify_second_customer_s_lastName(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("verify fifth customer's country {string}")
    public void verify_fifth_customer_s_country(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("verify last customer's user email {string}")
    public void verify_last_customer_s_user_email(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
