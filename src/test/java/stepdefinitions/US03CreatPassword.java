package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.GMICreatPassword;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.channels.SelectableChannel;

public class CreatPassword {
    GMICreatPassword gmiCreatPassword=new GMICreatPassword();

    @Given("User is on GMIBank Login pageGiven")
    public void user_is_on_GMIBank_Login_pageGiven() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_account"));

    }

    @Given("user fills in the New Password textbox with valid {string}")
    public void user_fills_in_the_New_Password_textbox_with_valid(String string) {
    gmiCreatPassword.firstPassword.sendKeys("visible_value",string);
    }
    @Given("verify red messages under the box")
    public void verify_red_messages_under_the_box() {
        Assert.assertFalse(gmiCreatPassword.requiredAlert.isDisplayed());
    }

    @Then("verify Password strength")
    public void verify_Password_strength() {
        Select color=new Select(gmiCreatPassword.color);
         color.selectByIndex(5) ;
    }







}
