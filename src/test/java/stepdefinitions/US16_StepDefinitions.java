package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.GMICustomerAccountPage;
import pages.GMICustomerPage;
import pages.GMIHomePage;
import pages.GMILoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US16_StepDefinitions {
    GMIHomePage gmiHomePage = new GMIHomePage();
    GMILoginPage gmiLoginPage = new GMILoginPage();
    GMICustomerPage gmiCustomerPage = new GMICustomerPage();
    GMICustomerAccountPage gmiCustomerAccountPage = new
            GMICustomerAccountPage();

    @Given("User is on GMIBank Login page")
    public void user_is_on_GMIBank_Login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
       // Driver.waitForVisibility(gmiLoginPage.loginPageText,5);
       // Assert.assertTrue(gmiLoginPage.loginPageText.isDisplayed());
    }

    @When("user provide valid username {string}")
    public void user_provide_valid_username(String username) {
        gmiLoginPage.userNameBox.sendKeys(username);
    }

    @When("user provide valid password {string}")
    public void user_provide_valid_password(String password) {
        gmiLoginPage.passwordBox.sendKeys(password);
    }

    @When("user click sign in button")
    public void user_click_sign_in_button()  {
        gmiLoginPage.signInButton.click();

    }

    @When("verify  username when user logged in")
    public void verify_username_when_user_logged_in() {
     //   Driver.waitForVisibility(gmiCustomerPage.signedInUserName,5);
       // Assert.assertTrue(gmiCustomerPage.signedInUserName.isDisplayed());
    }


    @When("user goes to Transfer Money under My Operation")
    public void user_goes_to_Transfer_Money_under_My_Operation() {
        gmiCustomerPage.myOperations.click();
        gmiCustomerPage.transferMoney.click();
    }

    @Then("verify user is on Customer Accounts page")
    public void verify_user_is_on_Customer_Accounts_page() {
     //   Driver.waitForPageToLoad(5);
        String  pageText = gmiCustomerAccountPage.transferPageText.getText();
        //System.out.println(pageText);
        Assert.assertEquals(pageText,ConfigurationReader.getProperty("transfer"));

    }

    @Then("verify user has minimum two accounts")
    public void verify_user_has_minimum_two_accounts() {
        WebElement fromMenu = gmiCustomerAccountPage.fromAccountBox;
      //  Driver.waitForVisibility(fromMenu,10);
        Select select = new Select(fromMenu);
        int actualAccountNumber = select.getOptions().size();
        if (actualAccountNumber<2){ Assert.fail(); }
    }
    @When("user select an account from FROM box {string}")
    public void user_select_an_account_from_FROM_box(String accountID) {
        WebElement fromMenu = gmiCustomerAccountPage.fromAccountBox;
     //   Driver.waitForVisibility(fromMenu,10);
        Select select = new Select(fromMenu);
        select.selectByValue(accountID);

    }

    @Then("verify selected account is displayed in the FROM box {string}")
    public void verify_selected_account_is_displayed_in_the_FROM_box(String accountID) {
        Assert.assertEquals(gmiCustomerAccountPage.fromAccountBox.getAttribute(ConfigurationReader.getProperty("visible_value")),accountID);
    }
    @When("user select an account from TO box {string}")
    public void user_select_an_account_from_TO_box(String accountID) {
        WebElement fromMenu = gmiCustomerAccountPage.toAccountBox;
      //  Driver.waitForVisibility(fromMenu,10);
        Select select = new Select(fromMenu);
        select.selectByValue(accountID);
    }
    @Then("verify selected account is displayed in the TO box {string}")
    public void verify_selected_account_is_displayed_in_the_TO_box(String accountID) {
        Assert.assertEquals(gmiCustomerAccountPage.toAccountBox.getAttribute(ConfigurationReader.getProperty("visible_value")),accountID);
    }
    @When("user provide an amount that user want to transfer {string}")
    public void user_provide_an_amount_that_user_want_to_transfer(String amount) {
        gmiCustomerAccountPage.balanceBox.sendKeys(amount);
    }

    @Then("verify the amount is visible in the box {string}")
    public void verify_the_amount_is_visible_in_the_box(String amount) {
        Assert.assertEquals(gmiCustomerAccountPage.balanceBox.getAttribute(ConfigurationReader.getProperty("visible_value")),amount);
    }
    @When("user provide description to the box {string}")
    public void user_provide_description_to_the_box(String description) {
        gmiCustomerAccountPage.descriptionBox.sendKeys(description);
    }

    @Then("verify the description is visible int the box {string}")
    public void verify_the_description_is_visible_int_the_box(String description) {
        Assert.assertEquals(gmiCustomerAccountPage.descriptionBox.getAttribute(ConfigurationReader.getProperty("visible_value")),description);
    }
    @When("user click Make Transfer button")
    public void user_click_Make_Transfer_button() {
        gmiCustomerAccountPage.makeTransferButton.click();
    }

    @Then("verify success message {string}")
    public void verify_success_message(String expectedSuccessMessage) {
      //  Driver.waitForVisibility(gmiCustomerAccountPage.successPopUpMessage,5);
        String actualSuccessMessage = gmiCustomerAccountPage.successPopUpMessage.getText();
        //String actualSuccessMessage = Driver.getDriver().switchTo().alert().getText();
    //    ReusableMethods.waitFor(3);
        Assert.assertEquals(expectedSuccessMessage,actualSuccessMessage);
    }



}
