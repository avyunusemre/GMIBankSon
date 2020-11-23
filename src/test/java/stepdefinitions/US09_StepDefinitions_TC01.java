package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.internal.common.assertion.AssertionSupport;
import org.junit.Assert;
import pages.GMICreateANewCustomerPage;
import pages.GMIEmployeeAccountPage;
import pages.GMIUserAccountPage;
import pages.GMIUserInfoPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US09_StepDefinitions_TC01 {
    GMIUserAccountPage userAccountPage = new GMIUserAccountPage();
    GMICreateANewCustomerPage createANewCustomerPage = new GMICreateANewCustomerPage();
    GMIUserInfoPage userInfoPage = new GMIUserInfoPage();




    @Given("Click in the First Name search box")
    public void click_in_the_First_Name_search_box() {createANewCustomerPage.firstNameBox.click();}



    @Given("Show the text of the First Name search box: Mustafa")
    public void show_the_text_of_the_First_Name_search_box_Mustafa() {
        String firstNameText = createANewCustomerPage.firstNameBox.getAttribute("value");
        Assert.assertEquals(firstNameText,"Mustafa");
        System.out.println("+++"+ firstNameText);


    }

    @Given("Click in the Mobile Phone search box")
    public void click_in_the_Mobile_Phone_search_box() {createANewCustomerPage.mobilePhoneBox.click(); }

    @Then("Show the text of the Mobile Phone search box :{int}-{int}-{int}")
    public void show_the_text_of_the_Mobile_Phone_search_box(Integer int1, Integer int2, Integer int3) {
        String mobilePhoneNummerText = createANewCustomerPage.mobilePhoneBox.getAttribute("value");
        Assert.assertEquals(mobilePhoneNummerText,"0122-004-0571");
        System.out.println("===="+ mobilePhoneNummerText);


    }

}
