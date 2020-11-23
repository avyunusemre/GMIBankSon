package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIManageAccountsPage {

    public GMIManageAccountsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[1]/a")
    public WebElement accountsID;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[2]")
    public WebElement description;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[3]")
    public WebElement balance;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[4]/span")
    public WebElement accountType;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[5]/span")
    public WebElement accountStatusType;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[6]/span")
    public WebElement createDate;

    @FindBy(xpath = "//*[@class='table]/tbody/tr[1]/td[7]/span")
    public WebElement closedDate;

    @FindBy(xpath = "//*[@class='table]/tbody/tr[1]/td[8]")
    public WebElement employee;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[1]")
    public WebElement accountsView;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[2]")
    public WebElement accountsEdit;

    @FindBy(xpath = "//*[@class='table']/tbody/tr[1]/td[10]/div/a[3]")
    public WebElement accountsDelete;

    @FindBy(xpath = "//*[@id='jh-create-entity']/span")
    public WebElement createANewAccount;

}
