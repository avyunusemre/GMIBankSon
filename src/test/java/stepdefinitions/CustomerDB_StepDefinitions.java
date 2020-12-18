package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;
import utilities.ConfigurationReader;
import utilities.DatabaseUtility;
import utilities.ReadTxt;
import utilities.WriteToTxt;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CustomerDB_StepDefinitions {

    List<Object> allSSNs = new ArrayList<>();
    List<String> listOfCurrentSSNs = new ArrayList<>();

    @Given("user create a connection with db using {string}, {string} and {string}")
    public void user_create_a_connection_with_db_using_and(String query, String userName, String password) {
        DatabaseUtility.createConnection("jdbc:postgresql://157.230.48.97:5432/gmibank_db","techprodb_user","Techpro_@126");

    }

    @Given("user reads the Customers' data using {string} and {string}")
    public void user_reads_the_Customers_data_using_and(String query, String columnName) {

        allSSNs = DatabaseUtility.getColumnData(query, columnName);
        for (int i = 0; i < allSSNs.size(); i++) {
            //System.out.println(allSSNs.get(i).toString().trim());
            listOfCurrentSSNs.add(allSSNs.get(i).toString().trim());

        }
    }

    @Given("user validate the customer's data")
    public void user_validate_the_customer_s_data() {


        ReadTxt.returnCustomerSSNList("NewFile.txt");
        Assert.assertTrue(listOfCurrentSSNs.containsAll(ReadTxt.returnCustomerSSNList("NewFile.txt")));

    }

    @Then("user prints all using pdf")
    public void user_prints_all_using_pdf() {

    }

}
