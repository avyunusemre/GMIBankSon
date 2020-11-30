package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreateANewCustomerPage;
import pages.GMIManageCustomersPage;
import utilities.Driver;

public class US12_StepDefinition {

    GMIManageCustomersPage manageCustomersPage=new GMIManageCustomersPage();
    GMICreateANewCustomerPage createANewCustomerPage=new GMICreateANewCustomerPage();


    @Given("Verify if the first name is showing {string}")
    public void verify_if_the_first_name_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.firstName.getText(),string);
        System.out.println(manageCustomersPage.firstName.getText());
    }

    @Given("Verify if the last name is showing {string}")
    public void verify_if_the_last_name_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.lastName.getText(),string);
        System.out.println(manageCustomersPage.lastName.getText());
    }

    @Given("Verify if the middle initial is showing {string}")
    public void verify_if_the_middle_initial_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.middleInitial.getText(),string);
        System.out.println(manageCustomersPage.middleInitial.getText());
    }

    @Given("Verify if the email is showing {string}")
    public void verify_if_the_email_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.email.getText(),string);
        System.out.println(manageCustomersPage.email.getText());
    }

    @Given("Verify if the mobile phone number is showing {string}")
    public void verify_if_the_mobile_phone_number_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.mobilePhoneNumber.getText(),string);
        System.out.println(manageCustomersPage.mobilePhoneNumber.getText());
    }

    @Given("Verify if the phone number is showing {string}")
    public void verify_if_the_phone_number_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.phoneNumber.getText(),string);
        System.out.println(manageCustomersPage.phoneNumber.getText());
    }

    @Given("Verify if the address is showing {string}")
    public void verify_if_the_address_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.address.getText(),string);
        System.out.println(manageCustomersPage.address.getText());
    }

    @Then("Verify if the create date is showing {string}")
    public void verify_if_the_create_date_is_showing(String string) {
        Assert.assertEquals(manageCustomersPage.customersCreateDate.getText(),string);
        System.out.println(manageCustomersPage.customersCreateDate.getText());
    }


    @Given("Verify an View button")
    public void verify_an_View_button() {
        Driver.wait(5);
        if (manageCustomersPage.customersView.isDisplayed()){
            System.out.println("View button is available");
        }else {
            System.out.println("View button is not available");
        }
    }

    @Given("Click on the View button")
    public void click_on_the_View_button() {
        manageCustomersPage.customersView.click();
    }

    @Then("Verify an Edit button")
    public void verify_an_Edit_button() {
        if (manageCustomersPage.editButton.isDisplayed()){
            System.out.println("Edit button is available");
        }else {
            System.out.println("Edit button is not available");
        }
    }


    @Given("Verify an Edit button from main page")
    public void verify_an_Edit_button_from_main_page() {
        Driver.wait(5);
        if (manageCustomersPage.customersEdit.isDisplayed()){
            System.out.println("Edit button is available");
        }else {
            System.out.println("Edit button is not available");
        }
    }

    @Given("Click on the Edit button from main page")
    public void click_on_the_Edit_button_from_main_page() {
        Driver.wait(5);
        manageCustomersPage.customersEdit.click();
    }


    @Given("Click on the Edit button")
    public void click_on_the_Edit_button() {
        Driver.wait(5);
        manageCustomersPage.customersEdit.click();
    }

    @Given("Change first name {string}")
    public void change_first_name(String string) {
        createANewCustomerPage.firstNameBox.clear();
        createANewCustomerPage.firstNameBox.sendKeys(string);
    }

    @Given("Change last name {string}")
    public void change_last_name(String string) {
        createANewCustomerPage.lastNameBox.clear();
        createANewCustomerPage.lastNameBox.sendKeys(string);
    }

    @Given("Change middle initial {string}")
    public void change_middle_initial(String string) {
        createANewCustomerPage.middleInitialBox.clear();
        createANewCustomerPage.middleInitialBox.sendKeys(string);
    }

    @Given("Change email {string}")
    public void change_email(String string) {
        createANewCustomerPage.emailbox.clear();
        createANewCustomerPage.emailbox.sendKeys(string);
    }

    @Given("Change mobile phone number {string}")
    public void change_mobile_phone_number(String string) {
        createANewCustomerPage.mobilePhoneBox.clear();
        createANewCustomerPage.mobilePhoneBox.sendKeys(string);
    }

    @Given("Change phone number {string}")
    public void change_phone_number(String string) {
        createANewCustomerPage.phoneBox.clear();
        createANewCustomerPage.phoneBox.sendKeys(string);
    }

    @Given("Change zip code {string}")
    public void change_zip_code(String string) {
        createANewCustomerPage.zipCodeBox.clear();
        createANewCustomerPage.zipCodeBox.sendKeys(string);
    }

    @Given("Change address {string}")
    public void change_address(String string) {
        createANewCustomerPage.addressBox.clear();
        createANewCustomerPage.addressBox.sendKeys(string);
    }

    @Given("Change city {string}")
    public void change_city(String string) {
        createANewCustomerPage.cityBox.clear();
        createANewCustomerPage.cityBox.sendKeys(string);
    }

    @Given("Change SSN {string}")
    public void change_SSN(String string) {
        createANewCustomerPage.SSNbox.clear();
        createANewCustomerPage.SSNbox.sendKeys(string);
    }

    @Given("Change create date {string}")
    public void change_create_date(String string) {
        createANewCustomerPage.createDateBox.sendKeys(string);
    }

    @Given("Change country {string}")
    public void change_country(String string) {
        Select drpCountry=new Select(createANewCustomerPage.countryDropDown);
        drpCountry.selectByVisibleText(string);
    }

    @Given("Change state {string}")
    public void change_state(String string) {
        createANewCustomerPage.stateBox.clear();
        createANewCustomerPage.stateBox.sendKeys(string);
    }

    @Given("Change user")
    public void change_user() {
        Select drpUser=new Select(createANewCustomerPage.userDropDown);
        drpUser.selectByIndex(5);
    }

    @Given("Change account {string}")
    public void change_account(String string) {
        Select drpAccount=new Select(createANewCustomerPage.accountMenu);
        drpAccount.selectByVisibleText(string);
    }

    @Given("Click to checkbox")
    public void click_to_checkbox() {
        createANewCustomerPage.zelleCheckBox.click();
    }

    @Then("Click on the {string} button")
    public void click_on_the_button(String string) {
        createANewCustomerPage.saveButton.click();
    }



    @Given("Click on the Delete button")
    public void click_on_the_Delete_button() {
        Driver.wait(5);
        manageCustomersPage.customersDelete.click();
    }

    @Given("Verify the alert message {string}")
    public void verify_the_alert_message(String string) {
        Driver.wait(3);
        Assert.assertEquals(string,manageCustomersPage.deleteAlertMessage.getText());
    }

    @Then("Click on the Delete button from alert page")
    public void click_on_the_Delete_button_from_alert_page() {
        Assert.assertTrue(manageCustomersPage.alertDeleteButton.isEnabled());
//        manageCustomersPage.alertDeleteButton.click();
    }


}
