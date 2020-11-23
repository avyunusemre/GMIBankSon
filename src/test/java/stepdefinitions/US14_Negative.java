package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GMICreateANewAccountPage;
import pages.GMIEmployeeAccountPage;

public class US14_Negative {

    GMIEmployeeAccountPage gmiEmployeeAccountPage=new GMIEmployeeAccountPage();
       GMICreateANewAccountPage gmiCreateANewAccountPage=new GMICreateANewAccountPage();
    @Given("user clicks on Manage Accounts")
    public void user_clicks_on_Manage_Accounts() {
    gmiEmployeeAccountPage.manageAccountsButton.click();
  }

    @Given("user clicks on the Create a new Account")
    public void user_clicks_on_the_Create_a_new_Account() {
 gmiEmployeeAccountPage.createANewAccount.click();
    }

    @Given("user enter the {string} as Description")
    public void user_enter_the_as_Description(String string) {
gmiCreateANewAccountPage.descriptionBox.sendKeys(string);
    }

    @Given("user enter the {int} as Balance")
    public void user_enter_the_as_Balance(Integer int1) {
  gmiCreateANewAccountPage.balanceBox.sendKeys("99999");

    }

    @When("user enter the the creation date as {string} and creation time as {string}")
    public void user_enter_the_the_creation_date_as_and_creation_time_as(String string, String string2) {
gmiCreateANewAccountPage.createDateBox.sendKeys(string);
 }

    @When("user clickc on account Save button")
    public void user_clickc_on_account_Save_button() {
gmiCreateANewAccountPage.saveButton.click();
  }

    @Then("user sees green success message on the screen")
    public void user_sees_green_success_message_on_the_screen() {
     Assert.assertTrue(gmiCreateANewAccountPage.createFakeDateSuccesMessage.isDisplayed());
    }

    @Then("user sees the date and time which entered format")
    public void user_sees_the_date_and_time_which_entered_format() {
        String expectedDate="21/32/2019";
        String actualDate=gmiCreateANewAccountPage.createDateBox.getText();
        Assert.assertEquals(expectedDate, actualDate);
  }

    @When("user clicks Employee box")
    public void user_clicks_Employee_box() {
        gmiCreateANewAccountPage.employeeDropDown.click();
  }

    @When("user should not see any option")
    public void user_should_not_see_any_option() {

  }

    @When("user clicks on account Save button")
    public void user_clicks_on_account_Save_button() {
        gmiCreateANewAccountPage.saveButton.click();
  }

    @Then("user does not see Zelle Enrolled box")
    public void user_does_not_see_Zelle_Enrolled_box() {
    }



}
