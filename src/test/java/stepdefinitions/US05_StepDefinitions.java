package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GMILoginPage;
import utilities.Driver;

public class US05_StepDefinitions {

    GMILoginPage gmiLoginPage = new GMILoginPage();

    @Given("Invalid username must be entered.")
    public void invalid_username_must_be_entered() {
        gmiLoginPage.userNameBox.sendKeys("Team5Use");
        gmiLoginPage.passwordBox.sendKeys("userTeam5");
    }

    @Given("The Sign in button must be clicked.")
    public void the_Sign_in_button_must_be_clicked() {
        gmiLoginPage.SigninBut.click();
    }

    @Then("The user should get an error message on the screen.")
    public void the_user_should_get_an_error_message_on_the_screen() {
        Driver.waitForVisibility(gmiLoginPage.errorMesage,5);
        Assert.assertTrue(gmiLoginPage.errorMesage.isDisplayed());
        System.out.println(gmiLoginPage.errorMesage.getText());
    }

    @Given("Invalid password must be entered.")
    public void invalid_password_must_be_entered() {
        gmiLoginPage.userNameBox.sendKeys("Team5User");
        gmiLoginPage.passwordBox.sendKeys("userTeam");
        gmiLoginPage.SigninBut.click();
        Driver.waitForVisibility(gmiLoginPage.errorMesage,5);
        Assert.assertTrue(gmiLoginPage.errorMesage.isDisplayed());
        System.out.println(gmiLoginPage.errorMesage.getText());
    }

    @Given("Invalid usurname and password must be entered.")
    public void invalid_usurname_and_password_must_be_entered() {
        gmiLoginPage.userNameBox.sendKeys("Team5Use");
        gmiLoginPage.passwordBox.sendKeys("userTeam");
        gmiLoginPage.SigninBut.click();
        Driver.waitForVisibility(gmiLoginPage.errorMesage,5);
        Assert.assertTrue(gmiLoginPage.errorMesage.isDisplayed());
        System.out.println(gmiLoginPage.errorMesage.getText());
    }

    @Given("Did you forget your password? button should be clickable")
    public void did_you_forget_your_password_button_should_be_clickable() {
        gmiLoginPage.userNameBox.sendKeys("JaniAks");
        gmiLoginPage.Did_you_forget_your_password.click();
    }

    @Given("User must enter their e-mail address")
    public void user_must_enter_their_e_mail_address() {
        gmiLoginPage.emailButton.sendKeys("janiaks6@gmail.com");
    }

    @Then("User should be able to click the password reset button")
    public void user_should_be_able_to_click_the_password_reset_button() {
        gmiLoginPage.resetButton.click();
    }

    @Given("User should be able to click the {string} button")
    public void user_should_be_able_to_click_the_button(String string) {
        gmiLoginPage.Register_a_new_account.click();
        gmiLoginPage.Register_a_new_account.click();
    }




}
