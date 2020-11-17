package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GMIUserInfoPage;

import java.util.List;

public class US06_StepDefinitions {

    GMIUserInfoPage gmiUserInfoPage=new GMIUserInfoPage();

    @Given("Click to element with element name")
    public void clickToElementWithElementName(DataTable elements) {

        List<String> elementstoClick = elements.asList(String.class);
        for (String n : elementstoClick) {
            System.out.println(n);
            gmiUserInfoPage.findElementAndClick(n);


        }




    }

    @Then("Compare text using element name")
    public void compareTextUsingElementName(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            gmiUserInfoPage.findElementAndVerifyContainsText(elementsNameAndValue.get(i).get(0),
                    elementsNameAndValue.get(i).get(1),elementsNameAndValue.get(i).get(2));

        }



    }



    @Then("Check drowdown options")
    public void checkDrowdownOptions(DataTable elements) {

        List<String> elementstoCheck = elements.asList(String.class);
        for (String n : elementstoCheck) {
            System.out.println(n);
            gmiUserInfoPage.contolDropdawnOptions(n);


        }

    }


    @And("Send text to element with element name")
    public void sendTextToElementWithElementName(DataTable elements) {

        List<List<String>>  elementsNameAndValue=elements.asLists(String.class);

        for (int i = 0; i <elementsNameAndValue.size() ; i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            gmiUserInfoPage.findElementAndSendKeys(elementsNameAndValue.get(i).get(0),elementsNameAndValue.get(i).get(1));

        }



    }
}
