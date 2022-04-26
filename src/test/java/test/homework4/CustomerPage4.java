package test.homework4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import test.pageobjectmodel.TestUtility;

import java.util.List;

public class CustomerPage4 {

    WebDriver driver;
    TestUtility testUtility;

    @FindBy(linkText = "Add Customer")
    WebElement addCustomerLink;

    @FindBy(id = "cust-firstname")
    WebElement customerFirstNameField;
    @FindBy(id = "cust-lastname")
    WebElement customerLastNameField;
    @FindBy(id = "cust-email")
    WebElement customerEmailField;
    @FindBy(xpath = "//input[@value=\"Save\"]")
    WebElement saveButton;
    @FindBy(css="i.fa.fa-trash")
    WebElement deleteIcon;
    @FindBy(xpath = "//*[contains(text(),'Customer successfully deleted.')]")
    WebElement successMessageForDelete;

    @FindAll(
            @FindBy(xpath = "//*[@id=\"customer-list\"]/table/tbody/tr")
    )
    List<WebElement> customersList;

    @FindBy(xpath = "//*[@id=\"customer-list\"]/table")
    WebElement customerListTable;

    String customerName=null;

    public CustomerPage4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        testUtility=new TestUtility(driver);
    }

    public void addCustomer(){
        testUtility.waitForElementPresent(addCustomerLink);
        addCustomerLink.click();
        testUtility.waitForElementPresent(customerFirstNameField);
        customerName=testUtility.generateFirstName();
        customerFirstNameField.sendKeys(customerName);
        testUtility.waitForElementPresent(customerLastNameField);
        customerLastNameField.sendKeys(testUtility.generateLastName());
        testUtility.waitForElementPresent(customerEmailField);
        customerEmailField.sendKeys("abc"+System.currentTimeMillis()+"@gmail.com");
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }

    public boolean verifyCustomerAddedSuccessfully(){
        return driver.getPageSource().contains(customerName);
    }

    public void deleteCustomer(){
        testUtility.waitForElementPresent(deleteIcon);
        deleteIcon.click();
        testUtility.waitForAlertPresent();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

    public boolean verifyCustomerDeletedSuccessfully(){
        testUtility.waitForElementPresent(successMessageForDelete);
        return successMessageForDelete.isDisplayed();
    }

    public boolean viewCustomers(){
        testUtility.waitForElementPresent(customerListTable);
        return customersList.size()>1;

    }
}
