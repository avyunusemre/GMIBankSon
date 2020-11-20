package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreateANewCustomerPage;
import pages.GMIEmployeeAccountPage;
import utilities.Driver;


public class US10Negative_StepDefinitions {
    GMIEmployeeAccountPage employeeAccountPage = new GMIEmployeeAccountPage();
    GMICreateANewCustomerPage createANewCustomerPage = new GMICreateANewCustomerPage();

    @Given("user clicks on My Operations")
    public void user_clicks_on_My_Operations() {
        employeeAccountPage.myOperationsMenu.click();
    }

    @Given("user clicks on Manage Customer")
    public void user_clicks_on_Manage_Customer() {
        employeeAccountPage.manageCustomersButton.click();
    }

    @Given("user clicks on Create a new Customer")
    public void user_clicks_on_Create_a_new_Customer() {
        employeeAccountPage.createANewCustomer.click();
    }

    @Given("user fills in the SSN textbox {string}")
    public void user_fills_in_the_SSN_textbox(String string) {
       createANewCustomerPage.searchSSNBox.sendKeys(string);
    }

    @Given("user clicks on the Search button")
    public void user_clicks_on_the_Search_button() {
        createANewCustomerPage.searchButton.click();
    }

    @Given("user fills in the Middle Initial textbox with valid credential")
    public void user_fills_in_the_Middle_Initial_textbox_with_valid_credential() {
        createANewCustomerPage.middleInitialBox.sendKeys("a");
    }

    @Given("user fills in the Phone Number textbox with valid credential")
    public void user_fills_in_the_Phone_Number_textbox_with_valid_credential() {
        createANewCustomerPage.phoneBox.sendKeys("231-245-3422");
    }

    @Given("user fills in the Zip Code text box with valid credential")
    public void user_fills_in_the_Zip_Code_text_box_with_valid_credential() {
        createANewCustomerPage.zipCodeBox.sendKeys("68731");
    }

    @Given("user clears in the Address textbox")
    public void user_clears_in_the_Address_textbox() {
        createANewCustomerPage.addressBox.clear();
    }

    @Given("Address only as street should be provided")
    public void address_only_as_street_should_be_provided() {
        createANewCustomerPage.addressBox.clear();
        createANewCustomerPage.addressBox.sendKeys("Broadway St");
    }

    @Given("user fills in the City textbox with valid credential {string}")
    public void user_fills_in_the_City_textbox_with_valid_credential(String string) {
        createANewCustomerPage.cityBox.sendKeys(string);
    }

    @Given("user selects a country from Country dropdown")
    public void user_selects_a_country_from_Country_dropdown() {
        Select select = new Select(createANewCustomerPage.countryDropDown);
        select.selectByIndex(1);
    }

    @Given("user fills in the State textbox with valid credential {string}")
    public void user_fills_in_the_State_textbox_with_valid_credential(String string) {
        createANewCustomerPage.stateBox.sendKeys(string);
    }

    @Given("user selects a account from Account menu {string}")
    public void user_selects_a_account_from_Account_menu(String string) {
        Select select = new Select(createANewCustomerPage.accountMenu);
        Driver.waitForClickablility(createANewCustomerPage.countryDropDown,5);
        select.selectByVisibleText(string);
    }

    @Given("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        Driver.waitForClickablility(createANewCustomerPage.saveButton,5);
        createANewCustomerPage.saveButton.click();
    }

    @Then("user sees redframe around the adress box and feedback message")
    public void user_sees_redframe_around_the_adress_box_and_feedback_message() {
        Driver.waitForVisibility(createANewCustomerPage.feedBackAdress,5);
        Assert.assertTrue(createANewCustomerPage.feedBackAdress.isDisplayed());
        System.out.println(createANewCustomerPage.feedBackAdress.getText());
    }

    @Then("user sees redframe around the citybox and feedback message")
    public void user_sees_redframe_around_the_citybox_and_feedback_message() {
        Driver.waitForVisibility(createANewCustomerPage.feedBackCity,5);
        Assert.assertTrue(createANewCustomerPage.feedBackCity.isDisplayed());
        System.out.println(createANewCustomerPage.feedBackCity.getText());
    }

    @Then("user sees the error message")
    public void user_sees_the_error_message() {
        Driver.waitForVisibility(createANewCustomerPage.errorMessage,5);
        Assert.assertTrue(createANewCustomerPage.errorMessage.isDisplayed());
        System.out.println(createANewCustomerPage.errorMessage.getText());
        Assert.assertTrue(createANewCustomerPage.errorMessage.getText().contains("error"));
    }

}
