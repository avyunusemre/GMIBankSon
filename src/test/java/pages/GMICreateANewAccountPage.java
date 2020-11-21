package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMICreateANewAccountPage {

    public GMICreateANewAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='tp-account-description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//*[@id='tp-account-balance']")
    public WebElement balanceBox;

    @FindBy(xpath = "//*[@id='tp-account-accountType']")
    public WebElement accountTypeDropDown;

    @FindBy(xpath = "//*[@id='tp-account-accountStatusType']")
    public WebElement accountStatusTypeDropDown;

    @FindBy(xpath = "//*[@id='tp-account-createDate']")
    public WebElement createDateBox;

    @FindBy(xpath = "//*[@id='tp-account-closedDate']")
    public WebElement closeDateBox;

    @FindBy(xpath = "//*[@id='tp-account-employee']")
    public WebElement employeeDropDown;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButton;

}
