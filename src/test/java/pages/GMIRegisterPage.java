package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GMIRegisterPage {
    public GMIRegisterPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath ="//span[.='Register']")
    public WebElement registerButton;
    @FindBy(id="ssn")
    public WebElement ssnBox;
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement registerIcon;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement InvalidMessage;
    @FindAll(

            {@FindBy(xpath ="//div[@class='invalid-feedback']" )}
    ) public List<WebElement> invalidList;
    @FindBy(xpath = "invalid-feedback")
    public WebElement nameInvalidMessage;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement lastNameInvalidMessage;
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;
    @FindBy(id="address")
    public WebElement addressBox;
    @FindBy(id="mobilephone")
    public WebElement mobilePhone;
    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidMobilePhoneMessage;
    @FindBy(id="username")
    public WebElement userNameBox;
    @FindBy(id="email")
    public WebElement emailBox;
   @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emailBoxInvalidMessage;




    }

