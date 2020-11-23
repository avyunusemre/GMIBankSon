package pages;

import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMICustomerTransfer {

    public GMICustomerTransfer(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement accountType;


    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement accountName;


    @FindBy(xpath = "//tbody/tr[2]/td[2]")
    public WebElement accountName2;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement accountBalance;


    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement viewTransectionBtn;

    @FindBy(xpath = "//button[text()]")
    public WebElement viewTransectionBtn1;


    @FindBy(xpath = "//td[text()='Transfer 100.00 from account ID: 5778 ']")
    public WebElement doneTranferText;

}
