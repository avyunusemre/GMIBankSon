package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GMICreateANewCustomerPage;
import pages.GMIUserAccountPage;
import pages.GMIUserInfoPage;

public class US09_StepDefinitions_TC02 {

    GMIUserAccountPage userAccountPage = new GMIUserAccountPage();
    GMICreateANewCustomerPage createANewCustomerPage = new GMICreateANewCustomerPage();
    GMIUserInfoPage userInfoPage = new GMIUserInfoPage();

    @Given("Click in the Last Name search box")
    public void click_in_the_Last_Name_search_box() {createANewCustomerPage.lastNameBox.click(); }


    @Given("Show the text of the Last Name search box : Yildirim")
    public void show_the_text_of_the_Last_Name_search_box_Yildirim() {
        String lastNameText = createANewCustomerPage.lastNameBox.getAttribute("value");
        Assert.assertEquals(lastNameText,"Yildirim");
        System.out.println("+++"+ lastNameText);


    }

    @Given("Click in the Address search box")
    public void click_in_the_Address_search_box() { createANewCustomerPage.addressBox.click();}

    @Then("Show the text of the address search box :Willem Alexander Straat Amterdam")
    public void show_the_text_of_the_address_search_box_Willem_Alexander_Straat_Amterdam() {
        String addressText = createANewCustomerPage.addressBox.getAttribute("value");
        Assert.assertEquals(addressText,"Willem Alexander Straat Amterdam ");
        System.out.println("==="+ addressText);
    }

}
