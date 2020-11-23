package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.GMICreatePassword;
import pages.GMILoginPage;
import pages.GMIUserInfoPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_StepDefinitions {
    GMILoginPage gmiLoginPage = new GMILoginPage();
    GMIUserInfoPage gmiUserInfoPage= new GMIUserInfoPage();
    GMICreatePassword gmiCreatePassword=new GMICreatePassword();
    @Given("Go to home page link")
    public void go_to_home_page_link() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
    }
    /*  @Given("to User Account drob down menu and Click to Sign In")
      public void to_User_Account_drob_down_menu_and_Click_to_Sign_In() {
          // Write code here that turns the phrase above into concrete actions
          throw new io.cucumber.java.PendingException();
      }*/
    @Given("Enter the username with valid credential {string}")
    public void enter_the_username_with_valid_credential(String string) {
        gmiLoginPage.userNameBox.sendKeys(string);
    }
    @Given("Enter the password with valid credential {string}")
    public void enter_the_password_with_valid_credential(String string) {
        gmiLoginPage.passwordBox.sendKeys(string);
    }
    @Given("Click to Sign in button")
    public void click_to_Sign_in_button() {
        gmiLoginPage.signInButton.click();
    }
    @Given("Click to User Account drop down menu and Click to Password")
    public void click_to_User_Account_drop_down_menu_and_Click_to_Password() {
        gmiCreatePassword.dropdown.click();
        WebElement password=gmiCreatePassword.dropdown;
        ReusableMethods.waitForVisibility(password,10);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(gmiCreatePassword.paasss).click().perform();
    }
    @Given("Enter the Current Password with credential {string}")
    public void enter_the_Current_Password_with_credential(String string) {
        gmiCreatePassword.currentPassword.sendKeys(string);
    }
    @Given("Enter the Current Password with credential1 {string}")
    public void enter_the_Current_Password_with_credential1(String string) {
        gmiCreatePassword.newPassword.sendKeys(string);
    }
    @Given("Enter the Current Password with credential2 {string}")
    public void enter_the_Current_Password_with_credential2(String string) {
        gmiCreatePassword.confirmPassword.sendKeys(string);
    }
    @Given("Enter the New Password {string}")
    public void enter_the_New_Password(String string) {
        gmiCreatePassword.newPassword.sendKeys(string);
    }
    @Given("Enter the New Password Confirmation {string}")
    public void enter_the_New_Password_Confirmation(String string) {
        gmiCreatePassword.confirmPassword.sendKeys(string);
    }
    @Then("Click to Save in button")
    public void click_to_Save_in_button() {
        gmiCreatePassword.saveButton.submit();
    }
    @Then("conformed failed message")
    public void conformed_failed_message() {
        //
        String messge=Driver.waitForVisibility((gmiCreatePassword.alertError),5).getText();
        Assert.assertEquals("An error has occurred! The password could not be change",messge);
        System.out.println(messge);
    }
    @Then("Confirmed password changed message")
    public void confirmed_password_changed_message() {
        // Assert.assertTrue(gmiCreatePassword.alert.isDisplayed());
        //  System.out.println(gmiCreatePassword.alert.getText());
        //   Assert.assertTrue(gmiCreatePassword.alert.isDisplayed());
        String messge=Driver.waitForVisibility((gmiCreatePassword.alertError),5).getText();
        Assert.assertEquals("Password changed!",messge);
        System.out.println(messge);
    }
}
