package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIManageCustomersPage {

    public GMIManageCustomersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[1]/a")
    public WebElement customersID;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[2]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[3]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[4]")
    public WebElement middleInitial;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[5]")
    public WebElement email;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[6]")
    public WebElement mobilePhoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[7]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[8]")
    public WebElement address;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[9]/span")
    public WebElement customersCreateDate;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[1]")
    public WebElement customersView;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[2]")
    public WebElement customersEdit;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement customersDelete;

}
