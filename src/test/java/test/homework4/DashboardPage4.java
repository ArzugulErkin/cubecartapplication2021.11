package test.homework4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.pageobjectmodel.TestUtility;

public class DashboardPage4 {
    WebDriver driver;
    TestUtility testUtility;

    @FindBy(id="nav_products")
    WebElement productsLink;

    @FindBy(linkText="Customer List")
    WebElement customersLink;

    @FindBy(id="nav_categories")
    WebElement catogorieslink;

    @FindBy(css="i.fa.fa-sign-out")
    WebElement logoutLink;

    public DashboardPage4(WebDriver driver) {
        this.driver = driver;
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
        testUtility.waitForElementPresent(catogorieslink);
        catogorieslink.click();
    }

    public void logout(){
        testUtility.waitForElementPresent(logoutLink);
        logoutLink.click();
    }
}

