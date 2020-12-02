package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreateANewAccountPage;
import pages.GMIEmployeeAccountPage;
import pages.GMIManageAccountsPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US13_StepDefinition {

    GMICreateANewAccountPage createANewAccountPage=new GMICreateANewAccountPage();
    GMIEmployeeAccountPage employeeAccountPage=new GMIEmployeeAccountPage();
    GMIManageAccountsPage manageAccountsPage=new GMIManageAccountsPage();



    @Given("user clicks on Manage Account")
    public void user_clicks_on_Manage_Account() {
        Driver.wait(3);
        employeeAccountPage.manageAccountsButton.click();
    }

    @Given("user clicks on Create a new Account")
    public void user_clicks_on_Create_a_new_Account() {
        Driver.wait(3);
        manageAccountsPage.createANewAccount.click();
    }

    @Given("user create a description {string}")
    public void user_create_a_description(String string) {
        Driver.wait(3);
        createANewAccountPage.descriptionBox.sendKeys(string);
    }

    @Given("user fills the balance box {string}")
    public void user_fills_the_balance_box(String string) {
        Driver.wait(3);
        createANewAccountPage.balanceBox.sendKeys(string);
    }

    @Given("user selects a valid account type from Account Type Drop-down {string}")
    public void user_selects_a_valid_account_type_from_Account_Type_Drop_down(String string) {
        Driver.wait(3);
        Select drpAccountType=new Select(createANewAccountPage.accountTypeDropDown);
        drpAccountType.selectByVisibleText(string);
    }

    @Given("user selects a valid account status type from Account Status Type Drop-down {string}")
    public void user_selects_a_valid_account_status_type_from_Account_Status_Type_Drop_down(String string) {
        Driver.wait(3);
        Select drpAccountStatus=new Select(createANewAccountPage.accountStatusTypeDropDown);
        drpAccountStatus.selectByVisibleText(string);
    }

    @Given("user selects a valid employee from Employee Drop-down")
    public void user_selects_a_valid_employee_from_Employee_Drop_down() {
        Driver.wait(3);
        Select drpEmployee=new Select(createANewAccountPage.employeeDropDown);
        drpEmployee.selectByIndex(0);
    }

}
