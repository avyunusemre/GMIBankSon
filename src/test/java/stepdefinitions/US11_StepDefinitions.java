package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreateANewCustomerPage;
import pages.GMIEmployeeAccountPage;
import utilities.Driver;

public class US11_StepDefinitions {

    GMICreateANewCustomerPage createANewCustomerPage = new GMICreateANewCustomerPage();
    GMIEmployeeAccountPage employeeAccountPage = new GMIEmployeeAccountPage();

    @Given("user creates a date {string}")
    public void user_creates_a_date(String string) throws InterruptedException {
        createANewCustomerPage.createDateBox.sendKeys(string);
    }

    @Given("user choose a user from user dropdown")
    public void user_choose_a_user_from_user_dropdown() {
        Select select = new Select(createANewCustomerPage.userDropDown);
        select.selectByIndex(3);
    }

    @Given("user click on the zelle enrolled")
    public void user_click_on_the_zelle_enrolled() {
        createANewCustomerPage.zelleCheckBox.click();
    }

    @Then("user sees create a new button")
    public void user_sees_create_a_new_button() {
        Driver.waitForVisibility(employeeAccountPage.createANewCustomer,3);
        Assert.assertTrue(employeeAccountPage.createANewCustomer.isDisplayed());
        System.out.println(createANewCustomerPage.successMessage.getText());
    }

    @Then("user don't see the create a new customer button")
    public void user_don_t_see_the_create_a_new_customer_button() {
        Driver.waitForVisibility(employeeAccountPage.createANewCustomer,3);
        Assert.assertFalse(employeeAccountPage.createANewCustomer.isDisplayed());
        System.out.println(createANewCustomerPage.successMessage.getText());
    }



}
