package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pojos_.Country;
import pojos_.Customers;
import pojos_.States;
import utilities.DatabaseUtility;
import utilities.PDFGenerator;
import utilities.ReadTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class US30_StepDefinitions {

    List<Object> allSSN=new ArrayList<>();
    List<String> listOfCurrentSSNs =new ArrayList<>();

    @Given("Create a connection with DB using {string},{string} and {string}")
    public void createAConnectionWithDBUsingAnd(String url, String user, String password) {

        DatabaseUtility.createConnection();


    }

    @Given("Read Customers'data using {string} and {string}")
    public void readCustomersDataUsingAnd(String query, String columnName) {

        allSSN= DatabaseUtility.getColumnData(query,columnName);
        for (Object n :allSSN) {
            //System.out.println(n.toString());
            listOfCurrentSSNs.add(n.toString().trim());
        }




    }

    @Then("Validate the Customers'data")
    public void validateTheCustomersData() {

        List<String>all = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("newFileData.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);

            while(line != null) {

                all.add(line);

                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertTrue(listOfCurrentSSNs.containsAll(all));



    }



    @And("Print Users' data to PDF")
    public void printUsersDataToPDF() {

        List <Customers> listOfCustomer=new ArrayList<>();

        String header="Customer Information";
        String fileName="customerlist.pdf";

        DatabaseUtility.createConnection();
        List<List<Object>> list= DatabaseUtility.getQueryResultList("SELECT * FROM tp_customer");

        for (int i = 0; i <15 ; i++) {
            Country country=new Country();
            Customers customer=new Customers();
            customer.setFirstName(list.get(i).get(1).toString());
            customer.setSsn(list.get(i).get(10).toString());
            customer.setCity(list.get(i).get(9).toString());
            customer.setEmail(list.get(i).get(4).toString());
            customer.setZipCode(list.get(i).get(7).toString());


            listOfCustomer.add(customer);



        }
        System.out.println(listOfCustomer);

        PDFGenerator.pdfGeneratorRowsAndCellsWithList(header,listOfCustomer,fileName);

    }


}
