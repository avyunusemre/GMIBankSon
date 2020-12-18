package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import org.junit.Assert;
import pojos_.Country;
import pojos_.Customers;
import utilities.*;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CustomerDB_StepDefinitions {

    List<Object> allSSNs = new ArrayList<>();
    List<String> listOfCurrentSSNs = new ArrayList<>();

    @Given("user create a connection with db using {string}, {string} and {string}")
    public void user_create_a_connection_with_db_using_and(String query, String userName, String password) {
        DatabaseUtility.createConnection();

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
        String query = "Select * from tp_customer;";
        DatabaseUtility.createConnection();
        List<Customers> listOfCustomers = new ArrayList<>();


        List<List<Object>> list = DatabaseUtility.getQueryResultList(query);
        for (int i = 0; i < 10 ;i++) {
            Customers customers = new Customers();
            Country country = new Country();
            customers.setFirstName(list.get(i).get(1).toString());
            customers.setSsn(list.get(i).get(10).toString());
            country.setName(list.get(i).get(8).toString());
            customers.setState(list.get(i).get(14).toString());
            customers.setCountry(country);
            listOfCustomers.add(customers);
        }
        System.out.println(list);

        PDFGenarator.pdfGeneratorRowsAndCellsWithList("AllCustomers",listOfCustomers,"AllApplicantData.pdf");
    }


}
