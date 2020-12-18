package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class GMIRegistrationPage {
    public GMIRegistrationPage() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement AccountBox;

    @FindBy (xpath = "//*[@id=\"account-menu\"]/div/a[2]/span")
    public WebElement RegisterButton;
    @FindBy  (id = "ssn")
    public WebElement ssnBox;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[1]/div")
    public WebElement SSNInvalidFeedback;

    @FindBy (xpath = "//input[@name ='firstname']")
    public WebElement FirstName;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[2]/div")
    public WebElement FirstNameInvalidFeedback;

    @FindBy (xpath = "//input[@name ='lastname']")
    public WebElement LastName;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[3]/div")
    public WebElement LastNameInvalidFeedback;

    @FindBy (id ="address")
    public WebElement Addressbox;

    @FindBy (id = "mobilephone")
    public WebElement Mobilephonebox;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[5]/div")
    public WebElement MobilephoneboxInvalidFeedback;

    @FindBy (id = "username")
    public WebElement Username;

    @FindBy (id = "email")
    public WebElement Emailbox;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[7]/div")
    public WebElement EmailboxInvalidFeedback;

    @FindBy (id = "firstPassword")
    public WebElement NewPassword;

    @FindBy (id = "secondPassword")
    public WebElement NewPasswordConfirmation;

    @FindBy (id = "register-submit")
    public WebElement Register;

    @FindBy (xpath = "//*[@id=\"register-form\"]/div[6]/div")
    public WebElement UserNameRed;

    


}
