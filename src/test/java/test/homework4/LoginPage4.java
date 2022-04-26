package test.homework4;

import com.unitedcoder.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.pageobjectmodel.TestUtility;

public class LoginPage4 {

    WebDriver driver;
    String configFile="config-prod.properties";
    TestUtility testUtility;

    @FindBy(id="username")
    WebElement userNameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(id="login")
    WebElement loginBUtton;

    public LoginPage4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }

    //action

    public boolean verifyLoginPageOpened(){
        testUtility.waitForElementPresent(loginBUtton);
        if(loginBUtton.isDisplayed())
            return true;
        else
            return false;
    }

    public void enterUserName(String userName){
        testUtility.waitForElementPresent(userNameField);
        userNameField.sendKeys(userName);
    }

    public void enterPassword(String password){
        testUtility.waitForElementPresent(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        testUtility.waitForElementPresent(loginBUtton);
        loginBUtton.click();
    }

    public void login(){
        enterUserName(ApplicationConfig.readFromConfigProperties(configFile,"username"));
        enterPassword(ApplicationConfig.readFromConfigProperties(configFile,"password"));
        testUtility.waitForElementPresent(loginBUtton);
        loginBUtton.click();


    }

    public void login1(String username,String password){
        enterUserName(username);
        enterPassword(password);
        clickOnLoginButton();

    }
}
