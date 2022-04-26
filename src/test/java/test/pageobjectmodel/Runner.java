package test.pageobjectmodel;

import com.unitedcoder.cubecartautomation.TestBase;
import org.junit.*;

public class Runner extends TestBase {

    static LoginPage loginPage;
    static DashboardPage dashboardPage;
    ProductsPage productsPage;
    static CustomerPage customerPage;

    @BeforeClass
    public static void setup(){
        browserSetUp();
        loginPage=new LoginPage(driver);
        loginPage.login();
        dashboardPage=new DashboardPage(driver);
        customerPage=new CustomerPage(driver);
    }

    @Test
    public void addProduct(){
        Assert.assertTrue(dashboardPage.verifyLogin());
        dashboardPage.clickOnProductsLink();
        productsPage=new ProductsPage(driver);
        productsPage.addProduct();
        Assert.assertTrue(productsPage.verifyProductAdded());
        Assert.assertTrue(productsPage.verifyNewProductAdded());
    }

    @Test
    public void addCustomer(){
        dashboardPage.clickOnCustomerListLink();
        customerPage.addCustomer();
        Assert.assertTrue(customerPage.verifyCustomerAddedSuccessfully());
    }

    @Test
    public void viewCustomer(){
        dashboardPage.clickOnCustomerListLink();
        Assert.assertTrue(customerPage.viewCustomers());
    }

    @Test
    public void deleteCustomer(){
        dashboardPage.clickOnCustomerListLink();
        customerPage.deleteCustomer();
        Assert.assertTrue(customerPage.verifyCustomerDeletedSuccessfully());
    }

    @AfterClass
    public static void tearDown(){
        dashboardPage.logout();
        driver.close();
        driver.quit();
    }
}


