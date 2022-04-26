package test.testngframework;

import com.unitedcoder.cubecartautomation.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;
import test.pageobjectmodel.ProductsPage;
import test.pageobjectmodel.TestUtility;

public class AddMultipleProduct extends TestBase {
   TestUtility testUtility;

    @BeforeClass
    public void setup(){
        testUtility=new TestUtility(driver);
        browserSetUp();
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login();
    }
    @Test(dataProvider = "productInfo")
    public void addProduct(String productName,String productCode){
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.clickOnProductsLink();
        ProductsPage productsPage=new ProductsPage(driver);
        productsPage.addProduct(productName,productCode);
        Assert.assertTrue(productsPage.verifyProductAdded());
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
    @DataProvider
    public Object[][] productInfo(){
        Object[][] data=new Object[][]{
                {testUtility.fakerProductName(),"ABC_68902"},
                {testUtility.fakerProductName(),"BGF_7832"},
                {testUtility.fakerProductName(),"HB_56783"}
        };
        return data;
    }
}

