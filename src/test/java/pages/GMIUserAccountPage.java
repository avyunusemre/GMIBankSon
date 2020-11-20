package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIUserAccountPage {

    public GMIUserAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='entity-menu']/a/span")
    public WebElement userMyOperationsMenu;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement userManageCustomersButton;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]/span")
    public WebElement userManageAccountsButton;

    @FindBy(xpath = "//*[@id='jh-create-entity']/span")
    public WebElement userCreateANewCustomer;


    @FindBy(xpath = "//*[@id='account-menu']/a/span")
    public WebElement userInfoMenu;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[1]/span")
    public WebElement userInfoButton;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[2]/span")
    public WebElement userPasswordButton;

    @FindBy(xpath = "//*[@id='account-menu']/div/a[3]/span")
    public WebElement userSignOutButton;

}
