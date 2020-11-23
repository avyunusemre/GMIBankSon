package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GMICustomerPage;
import pages.GMICustomerTransfer;

public class US15TCs {


    GMICustomerPage gmiCustomerPage = new GMICustomerPage();
GMICustomerTransfer gmiCustomerTransfer=new GMICustomerTransfer();

    @When("user goes to My Accounts under My Operation")
    public void user_goes_to_My_Accounts_under_My_Operation() {
    gmiCustomerPage.myOperations.click();
    gmiCustomerPage.myAccount.click();
 }

    @When("user sees all account types {string}")
    public void user_sees_all_account_types(String string) {
                  String actualAccountID1=gmiCustomerTransfer.accountType.getText();
                    Assert.assertEquals(string,actualAccountID1 );
                 String actualAcountName=gmiCustomerTransfer.accountName.getText();
  Assert.assertEquals("CHECKING", actualAcountName);
    }

    @Then("user sees the all populated balances")
    public void user_sees_the_all_populated_balances() {
    String accountBalance=gmiCustomerTransfer.accountBalance.getText();
    Assert.assertFalse(accountBalance.isEmpty());

  }

    @When("user clicks on the View Transaction")
    public void user_clicks_on_the_View_Transaction() {
        gmiCustomerTransfer.viewTransectionBtn1.click();

 }

    @Then("user sees the transactions")
    public void user_sees_the_transactions() {
        String transferText=gmiCustomerTransfer.doneTranferText.getText();
        Assert.assertFalse(transferText.isEmpty());
  }






}
