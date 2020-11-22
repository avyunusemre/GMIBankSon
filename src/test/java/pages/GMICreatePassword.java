package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMICreatePassword {
    public GMICreatePassword(){ PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="firstPassword")
    public WebElement firstPassword;
    @FindBy(xpath = "//*[@class='invalid-feedback']")
    public WebElement requiredAlert;
    @FindBy(xpath = "//*[@id='strengthBar']/li[2]")
    public WebElement  color;
    @FindBy(id="secondPassword")
    public WebElement secondPassword;
    @FindBy(id="register-submit")
    public WebElement submit;
    @FindBy(id = "account-menu")
    public WebElement dropdown;
    @FindBy(id="currentPassword")
    public WebElement currentPassword;
    @FindBy(id = "newPassword")
    public WebElement newPassword;
    @FindBy(id = "confirmPassword")
    public WebElement confirmPassword;
    @FindBy(xpath = "//*[@id='password-form']/button")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@id='account-menu']/div/a[2]")
    public WebElement paasss;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement alert;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertError;
    @FindBy(xpath = "//*[@id='strengthBar']/li[5]")
    public WebElement passwordStrength5;
}
