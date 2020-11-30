package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GMIRegisterPage;
import pages.GMIRegistrationPage;
import utilities.Driver;

public class US01_Stepdefinitions {

   GMIRegistrationPage gmiRegistrationPage=new GMIRegistrationPage();
   GMIRegisterPage gmIregisterPage=new GMIRegisterPage();

    @Given("User is on GMIBank home page")
    public void user_is_on_GMIBank_home_page() {

        Driver.getDriver().get("http://www.gmibank.com/");

    }

    @Given("user should navigate to registration page")
    public void user_should_navigate_to_registration_page() {
       gmIregisterPage.registerIcon.click();
       gmIregisterPage.registerButton.click();


    }


    @And("click on SSN box {string}")
    public void clickOnSSNBox(String ssn) {
        gmIregisterPage.ssnBox.click();
        gmIregisterPage.ssnBox.sendKeys(ssn);
    }

    @And("user click the First Name")
    public void userClickTheFirstName() {
        gmiRegistrationPage.FirstName.click();
    }

    @When("I fill the  correct SSN , I should not see the error message")
    public void iFillTheCorrectSSNIShouldNotSeeTheErrorMessage() {
        Assert.assertTrue(gmIregisterPage.invalidList.size()==0);



    }

    @When("I do not enter SSN,I should see the error message")
    public void iDoNotEnterSSNIShouldSeeTheErrorMessage() {
        Assert.assertTrue(gmIregisterPage.InvalidMessage.isEnabled());
    }
    @Given("Enter the name with chars without blank {string}")
    public void enter_the_name_with_chars_without_blank(String string) {
      gmiRegistrationPage.FirstName.sendKeys(string);
    }

    @When("I enter correct name,I should not see any message")
    public void i_enter_correct_name_I_should_not_see_any_message() {
        Assert.assertFalse(gmIregisterPage.nameInvalidMessage.isEnabled());
    }
    @Given("Enter the name with chars with blank {string}")
    public void enter_the_name_with_chars_with_blank(String string) {
       gmiRegistrationPage.FirstName.sendKeys(string);
    }

    @When("I enter correct name with blank ,I should  see any message")
    public void i_enter_correct_name_with_blank_I_should_see_any_message() {
       Assert.assertFalse(gmIregisterPage.nameInvalidMessage.isDisplayed());

    }

    @And("user click last name box")
    public void userClickLastNameBox() {
        gmIregisterPage.lastName.click();
    }

    @Given("user enter valid last name {string}")
    public void user_enter_valid_last_name(String string) {
       gmIregisterPage.lastName.sendKeys(string);
    }

    @When("When I enter my all last name correct, I should not see the error message")
    public void whenIEnterMyAllLastNameCorrectIShouldNotSeeTheErrorMessage() {

        Assert.assertTrue(gmIregisterPage.nameInvalidMessage.isEnabled());


    }

    @Given("user should click address box")
    public void user_should_click_address_box() {
       gmIregisterPage.addressBox.click();
    }

    @Given("user should enter the address along with zip code {string}")
    public void user_should_enter_the_address_along_with_zip_code(String string) {
        gmIregisterPage.addressBox.sendKeys(string);
    }

    @When("user enter valid adress, user should not see any message;")
    public void user_enter_valid_adress_user_should_not_see_any_message() {
        Assert.assertTrue(gmIregisterPage.addressBox.equals(gmIregisterPage.addressBox.getText()));

    }
    @Given("user should click the mobile phone box")
    public void user_should_click_the_mobile_phone_box() {
        gmIregisterPage.mobilePhone.click();

    }

    @Given("user should enter valid mobile phone {string}")
    public void user_should_enter_valid_mobile_phone(String string) {
        gmIregisterPage.mobilePhone.sendKeys(string);
    }

    @When("user should not enter valid mobile phone, I should see Invalid Mobile Phone message")
    public void user_should_not_enter_valid_mobile_phone_I_should_see_Invalid_Mobile_Phone_message() {
        Assert.assertTrue(gmIregisterPage.invalidMobilePhoneMessage.isDisplayed());

    }
    @Given("user should click on Username box")
    public void user_should_click_on_Username_box() {
       gmIregisterPage.userNameBox.click();
    }

    @Given("user should fill the box user name with any chars without digit {string}")
    public void user_should_fill_the_box_user_name_with_any_chars_without_digit(String string) {
      gmIregisterPage.userNameBox.sendKeys(string);
    }

    @When("user fill not valid username,user should see any message")
    public void user_fill_not_valid_username_user_should_see_any_message() {


    }

    @Given("user should click on e mail box")
    public void user_should_click_on_e_mail_box() {
        gmIregisterPage.emailBox.click();
    }

    @Given("user  should a valid e mail format that contains {string} ,{string} extensions {string}")
    public void user_should_a_valid_e_mail_format_that_contains_extensions(String string, String string2, String string3) {
        gmIregisterPage.emailBox.sendKeys(string);
    }

    @When("user fill not valid format for e mail, user should see message")
    public void user_fill_not_valid_format_for_e_mail_user_should_see_message() {
       Assert.assertTrue(gmIregisterPage.emailBoxInvalidMessage.isDisplayed());
    }



}
