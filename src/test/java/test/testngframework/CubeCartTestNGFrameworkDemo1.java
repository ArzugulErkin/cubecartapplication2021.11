package test.testngframework;

import com.unitedcoder.cubecartautomation.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import test.pageobjectmodel.CustomerPage;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;
import test.pageobjectmodel.ProductsPage;

    @Listeners(TestNGResultListener.class)
    public class CubeCartTestNGFrameworkDemo1 extends TestBase {

        LoginPage loginPage;
        DashboardPage dashboardPage;
        ProductsPage productsPage;
        CustomerPage customerPage;

        @BeforeMethod
        public void setup(ITestContext context){
            System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
            context.setAttribute("driver",driver);
            loginPage=new LoginPage(driver);
            loginPage.login();


        }
        @Test(groups = {"smoke test"})
        public void addProduct(){
            dashboardPage=new DashboardPage(driver);
            customerPage=new CustomerPage(driver);
            Assert.assertTrue(dashboardPage.verifyLogin());
            dashboardPage.clickOnProductsLink();
            productsPage=new ProductsPage(driver);
            productsPage.addProduct();
            Assert.assertTrue(productsPage.verifyProductAdded());
            Assert.assertTrue(productsPage.verifyNewProductAdded());
        }

        @Test
        public void addCustomer(){
            dashboardPage=new DashboardPage(driver);
            customerPage=new CustomerPage(driver);
            dashboardPage.clickOnCustomerListLink();
            customerPage.addCustomer();
            Assert.assertTrue(customerPage.verifyCustomerAddedSuccessfully());
        }

        @Test(enabled = false)
        public void viewCustomer(){
            dashboardPage.clickOnCustomerListLink();
            Assert.assertTrue(customerPage.viewCustomers());
        }

        @Test(enabled = false)
        public void deleteCustomer(){
            dashboardPage.clickOnCustomerListLink();
            customerPage.deleteCustomer();
            Assert.assertTrue(customerPage.verifyCustomerDeletedSuccessfully());
        }

        @AfterClass
        public void tearDown(){
            driver.quit();
        }
    }




