package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMIEmployeeAccountPage {

    public GMIEmployeeAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='entity-menu']/a/span")
    public WebElement myOperationsMenu;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[1]/span")
    public WebElement manageCustomersButton;

    @FindBy(xpath = "//*[@id='entity-menu']/div/a[2]/span")
    public WebElement manageAccountsButton;

    @FindBy(xpath = "//*[@id='jh-create-entity']/span")
    public WebElement createANewCustomer;


}
