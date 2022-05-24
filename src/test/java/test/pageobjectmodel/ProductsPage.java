package test.pageobjectmodel;

import com.unitedcoder.exceldemo.ExcelUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;
    TestUtility testUtility;//null
    String excelFile="Test_Data/doc1.xlsx";
    ExcelUtility excelUtility;
   // Actions actions;


    @FindBy(linkText = "Add Product")
    WebElement addProductLink;

    @FindBy(id = "name")
    WebElement productNameField;

    @FindBy(id = "product_code")
    WebElement productCodeField;

    @FindBy(id = "product_weight")
    WebElement productWeightField;

    @FindBy(id= "stock_level")
    WebElement stockLevelField;

    @FindBy(xpath= "//input[@value=\"Save\"]")
    WebElement saveButton;

    @FindBy(linkText = "View All")
    WebElement viewAllLink;

    @FindBy(css="div.success")
    WebElement successfullMessage;
    @FindBy(xpath = "(//*[@type='submit' and @value='Go'])[1]")
            WebElement goButton;

    String productName=null;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        excelUtility=new ExcelUtility();
        testUtility=new TestUtility(driver);
        //actions=new Actions(driver);
    }


    public void addProduct(){
        productName=excelUtility.readFromExcelCell(excelFile,"Product_Info",1,0);
        String productCode=excelUtility.readFromExcelCell(excelFile,"Product_Info",1,1);
        String productWeight=excelUtility.readFromExcelCell(excelFile,"Product_Info",1,2);
        String stockLevel=excelUtility.readFromExcelCell(excelFile,"Product_Info",1,3);

        testUtility.waitForElementPresent(addProductLink);
        addProductLink.click();
        testUtility.waitForElementPresent(productNameField);
        productNameField.sendKeys(productName);
        testUtility.waitForElementPresent(productCodeField);
        productCodeField.sendKeys(productCode);
        testUtility.waitForElementPresent(productWeightField);
        productWeightField.sendKeys(productWeight);
        testUtility.waitForElementPresent(stockLevelField);
        stockLevelField.sendKeys(stockLevel);
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }
    public void addProduct(String productName,String productCode){
        testUtility.waitForElementPresent(addProductLink);
        addProductLink.click();
        testUtility.waitForElementPresent(productNameField);
        productNameField.sendKeys(productName);
        testUtility.waitForElementPresent(productCodeField);
        productCodeField.sendKeys(productCode);
        testUtility.waitForElementPresent(saveButton);
        saveButton.click();
    }
    public boolean verifyNewProductAdded(){
        testUtility.sleep(3);
        testUtility.waitForElementPresent(viewAllLink);
        viewAllLink.click();
        return driver.getPageSource().contains(productName);
    }

    public boolean verifyProductAdded(){
        testUtility.waitForElementPresent(successfullMessage);
        return successfullMessage.isDisplayed();
    }
}
