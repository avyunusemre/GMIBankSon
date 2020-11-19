package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class GMIUserInfoPage {

    WebElement currentElement;

    public GMIUserInfoPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="account-menu")
    private WebElement accountMenu;

    @FindBy(xpath="//span[text()='Sign in']")
    private WebElement signIn;

    @FindBy(name="username")
    private WebElement username;


    @FindBy(name="password")
    private WebElement password;

    @FindBy(xpath="//button//span[text()='Sign in']")
    private WebElement signInButton;

    @FindBy(xpath="//span[text()='User Info']")
    private WebElement userInfo;

    @FindBy(xpath="//h2//span")
    private WebElement settingsTitle;

    @FindBy(xpath="//input[@name='firstName']")
    private WebElement firstName;

    @FindBy(xpath="//input[@name='lastName']")
    private WebElement lastName;

    @FindBy(xpath="//input[@name='email']")
    private WebElement email;

    @FindBy(xpath="//select[@name='langKey']")
    private WebElement languagedropd;

    @FindBy(xpath="//button//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath="//div[@role='alert']//span//strong")
    private WebElement settingsSaveMessage;

    @FindBy(xpath="//div[@class='invalid-feedback']")
    private WebElement invalidFeedback;



    public void findElementAndClick(String elementname){


        switch (elementname)
        {

            case "accountMenu":
                currentElement=accountMenu;
                break;

            case "signIn":
                currentElement=signIn;
                break;

            case "signInButton":
                currentElement=signInButton;
                break;
            case "userInfo":
                currentElement=userInfo;
                break;

            case "saveButton":
                currentElement=saveButton;
                break;
        }

        clickFunction(currentElement);
    }

    public void findElementAndSendKeys(String elementname,String value){


        switch (elementname)
        {

            case "username":
                currentElement=username;
                break;

            case "password":
                currentElement=password;
                break;

            case "firstName":
                currentElement=firstName;
                break;

            case "lastName":
                currentElement=lastName;
                break;

            case "email":
                currentElement=email;
                break;

        }

        sendKeysFunction(currentElement,value);
    }



    public void findElementAndVerifyContainsText(String elementname,String mesaj,String textorValue){

        switch (elementname){

            case "settingsTitle":
                currentElement=settingsTitle;
                break;

            case "firstName":
                currentElement=firstName;
                break;
            case "lastName":
                currentElement=lastName;
                break;

            case "email":
                currentElement=email;
                break;

            case "languagedropd":
                currentElement=languagedropd;
                break;

            case "settingsSaveMessage":
                currentElement=settingsSaveMessage;
                break;

            case "invalidFeedback":
                currentElement=invalidFeedback;
                break;



        }


        verifyElement(currentElement,mesaj,textorValue);

    }


    public void contolDropdawnOptions(String elementname){

        switch (elementname){

            case "languagedropd":
                currentElement=languagedropd;
                break;
        }

        Driver.waitForVisibility(currentElement,15);

        Select select = new Select(currentElement);

        List<WebElement> optionslist=new ArrayList<>();
        optionslist=select.getOptions();

        ArrayList<String> optionslisttext=new ArrayList<>();
        Assert.assertTrue(optionslist.size()==2);

        for (WebElement n:optionslist) {

            optionslisttext.add(n.getText());
        }

        Assert.assertTrue(optionslisttext.contains("English"));
        Assert.assertTrue(optionslisttext.contains("Türkçe"));

    }


    public static void clickFunction(WebElement element) {

        Driver.waitForClickablility(element,15);
        Driver.scrollToElement(element);
        element.click();

    }


    public static void sendKeysFunction(WebElement element, String value) {

        Driver.waitForVisibility(element,15);
        Driver.scrollToElement(element);
        element.clear();
        element.sendKeys(value);

    }



    public static void verifyElement(WebElement element,String text,String textorValue ){

        Driver.waitForVisibility(element,15);

        switch (textorValue){

            case "text":
                System.out.println("element: "+element.getText());
                Assert.assertTrue(element.getText().contains(text));
                break;

        case "value":
                System.out.println("element: "+element.getAttribute("value"));
                Assert.assertTrue(element.getAttribute("value").equals(text));
                break;
            case "selectedDrobdown":
                Select select = new Select(element);
                WebElement option = select.getFirstSelectedOption();
                String defaultItem = option.getText();
                System.out.println( "defaultItem: "+defaultItem);
                Assert.assertTrue(text.equals(defaultItem));
                break;


        }



    }


}
