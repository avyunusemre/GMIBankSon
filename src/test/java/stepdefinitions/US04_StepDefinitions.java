package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.GMILoginPage;

public class US04_StepDefinitions {
    GMILoginPage gmiLoginPage = new GMILoginPage();

    @Given("The Sign in button must be clicked")
    public void the_Sign_in_button_must_be_clicked() {
        gmiLoginPage.signInButton.click();
    }
    @Given("Valid usurname and password must be entered.")
    public void valid_usurname_and_password_must_be_entered_usurname_password() {
        gmiLoginPage.userNameBox.sendKeys("Team5User");
        gmiLoginPage.passwordBox.sendKeys("userTeam5");

    }
    @Given("Click on the sign in")
    public void click_on_the_sign_in() {
        gmiLoginPage.SigninBut.click();
    }
    @Given("Valid usurname and password must be entered2.")
    public void valid_usurname_and_password_must_be_entered2() {

    }
    @Then("click on the cansel")
    public void click_on_the_cansel() {
        gmiLoginPage.CanselButton2.click();
    }





}
