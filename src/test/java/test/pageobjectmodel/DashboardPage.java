package test.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    TestUtility testUtility;
    @FindBy(id="nav_products")
    WebElement productsLink;

    @FindBy(id="Customer List")
    WebElement customersLink;

    @FindBy(id="nav_categories")
    WebElement categoriesLink;

    @FindBy(css="i.fa.fa.sign-out")
    WebElement logOutLink;

    public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }
    public boolean verifyLogin(){
        testUtility.waitForElementPresent(productsLink);
        return productsLink.isDisplayed();
    }
    public void clickOnProductsLink(){
        testUtility.waitForElementPresent(productsLink);
        productsLink.click();
    }
    public void clickOnCustomerListLink(){
        testUtility.waitForElementPresent(customersLink);
        customersLink.click();
    }
    public void clickOnCategoryLink(){
        testUtility.waitForElementPresent(categoriesLink);
        categoriesLink.click();
    }
    public void logout(){
        testUtility.waitForElementPresent(logOutLink);
        logOutLink.click();
    }

}
