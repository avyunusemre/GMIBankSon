package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreateANewCustomerPage;
import pages.GMIEmployeeAccountPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US10_StepDefinitons {

    //div[@role='alert'] alert xpath'i
    GMIEmployeeAccountPage employeeAccountPage = new GMIEmployeeAccountPage();
    GMICreateANewCustomerPage createANewCustomerPage = new GMICreateANewCustomerPage();

    @Given("user fills in the SSN textbox with valid credential {string}")
    public void user_fills_in_the_SSN_textbox_with_valid_credential(String string) {
        createANewCustomerPage.searchSSNBox.sendKeys("123-45-6778");
        ReusableMethods.waitFor(10);
    }


    @Given("user fills in the Middle Initial textbox with valid credential {string}")
    public void user_fills_in_the_Middle_Initial_textbox_with_valid_credential(String string) {
        createANewCustomerPage.middleInitialBox.sendKeys("-");
    }

    @Given("user fills in the Phone Number textbox with valid credential {string}")
    public void user_fills_in_the_Phone_Number_textbox_with_valid_credential(String string) {
        createANewCustomerPage.phoneBox.sendKeys("212-599-0020");
        ReusableMethods.waitFor(10);
    }

    @Given("user fills in the Zip Code text box with valid credential {string}")
    public void user_fills_in_the_Zip_Code_text_box_with_valid_credential(String string) {
        createANewCustomerPage.zipCodeBox.sendKeys("G51 1AG");
        ReusableMethods.waitFor(10);
    }

    @Given("user selects a country from Country dropdown {string}")
    public void user_selects_a_country_from_Country_dropdown(String string) {
        Select select = new Select(createANewCustomerPage.countryDropDown);
        select.selectByIndex(5);
    }


    @Then("user sees success message")
    public void user_sees_success_message() {
        Driver.waitForVisibility(createANewCustomerPage.successMessage,5);
        Assert.assertTrue(createANewCustomerPage.successMessage.isDisplayed());
        System.out.println(createANewCustomerPage.successMessage.getText());

    }

}