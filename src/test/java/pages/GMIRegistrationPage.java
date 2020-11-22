package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIRegistrationPage {
    public GMIRegistrationPage() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy  (id = "ssn")
    public WebElement ssnBox;

    @FindBy (xpath = "//input[@name ='firstname']")
    public WebElement FirstName;

    @FindBy (xpath = "//input[@name ='lastname")
    public WebElement LAstName;

    @FindBy (id ="address")
    public WebElement Addressbox;

    @FindBy (id = "mobilephone")
    public WebElement Mobilephonebox;

    @FindBy (id = "username")
    public WebElement Username;

    @FindBy (id = "email")
    public WebElement Emailbox;

    @FindBy (id = "firstPassword")
    public WebElement NewPassword;

    @FindBy (id = "secondPassword")
    public WebElement NewPasswordConfirmation;

    @FindBy (id = "register-submit")
    public WebElement Register;

}