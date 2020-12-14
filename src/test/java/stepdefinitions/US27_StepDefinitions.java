package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import pojos_.States;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US27_StepDefinitions {

    Response response;
    String bearerToken = ConfigurationReader.getProperty("api_barer_token");
    States[] states;
    String Url;
    int stateid;
    String fileName;
    List<States> all;


    @Given("Set states to response {string}")
    public void setStatesToResponse(String url) {


         Url=url;

        response = given().headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

    }

    @Given("User convert to all states to pojo")
    public void userConvertToAllStatesToPojo() throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();

        states=objectMapper.readValue(response.asString(),States[].class);

        System.out.println(states[0].getName());



    }

    @Then("Delete states with {string} and verify status code as {string}")
    public void deleteStatesWithAndVerifyStatusCodeAs(String id, String statusCode) {

       stateid=Integer.parseInt(id);

        given()
        .headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .delete("https://www.gmibank.com/api/tp-states/"+stateid)
                .then()
                .statusCode(Integer.parseInt(statusCode))

                ;





    }





    @And("Verify the state has been deleted")
    public void verifyTheStateHasBeenDeleted() throws IOException {

        response = given().headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(Url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

           response.prettyPrint();
        ObjectMapper objectMapper=new ObjectMapper();

        states=objectMapper.readValue(response.asString(),States[].class);

        List<Integer> statesid=new ArrayList<>();

        for (States n:states) {


            statesid.add(n.getId());
        }



        Assert.assertFalse(statesid.contains(stateid));




    }


    @When("Verify state name with given state id")
    public void verifyStateNameWithGivenStateId(DataTable elements) {

        List<List<String>>  stateidandName=elements.asLists(String.class);

        for (int i = 0; i <stateidandName.size() ; i++) {

            for (States n :states) {



                if (n.getId()==Integer.parseInt(stateidandName.get(i).get(0)))
                {

                    System.out.println(stateidandName.get(i).get(0));
                    System.out.println(stateidandName.get(i).get(1));
                    Assert.assertEquals(n.getName(),stateidandName.get(i).get(1));

                }

            }

        }
    }

    @When("Write all States in txt")
    public void writeAllStatesInTxt() {

        Date now =new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH mm ss");
        String strDate=formatter.format(now);
        strDate=strDate.replaceAll(":","_").replace(" ","");
        System.out.println("strDate = " + strDate);
        fileName="stateslist"+strDate+".txt";
        System.out.println("fileName = " + fileName);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i =0; i<states.length;i++){
                writer.append(states[i].getId()+" , "+states[i].getName()+"\n");

            }
            writer.close();
        } catch(Exception e){
        }

    }

    @Then("Read txt file")
    public void readTxtFile() {

         all = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);

            while(line != null) {
                States states = new States();
                states.setName(line.split(",")[1].trim());
                states.setId(Integer.parseInt(line.split(",")[0].trim()));
                sb.append(System.lineSeparator());
                line = br.readLine();

                all.add(states);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(all);

    }


    @And("Verify that the given State id is within the States read from the file")
    public void verifyThatTheGivenStateIdIsWithinTheStatesReadFromTheFile(DataTable elements) {

        List<Integer> statesID=new ArrayList<>();

        for (States n:all)
        {
            statesID.add(n.getId());
        }



        List<String> givenId = elements.asList(String.class);

        for (String n : givenId) {

            Assert.assertTrue(statesID.contains(Integer.parseInt(n)));


        }




    }
}
