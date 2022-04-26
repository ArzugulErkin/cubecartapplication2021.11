package test.testngframework;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import test.pageobjectmodel.ProductsPage;
import test.pageobjectmodel.CustomerPage;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;


@Listeners(TestNGResultListener.class)
public class CubeCartTestNGFrameworkDemo {

    protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProductsPage productsPage;
    CustomerPage customerPage;

    @BeforeMethod
    public void setup(){
        WebDriverFactory webDriverFactory=new WebDriverFactory();
        webDriverFactory.setDriver();
        driver.set(webDriverFactory.getDriver());
        driver.get().navigate().to("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        loginPage=new LoginPage(driver.get());
        loginPage.login();
    }
    @Test
    public void addProduct(){
        dashboardPage=new DashboardPage(driver.get());
        customerPage=new CustomerPage(driver.get());
        Assert.assertTrue(dashboardPage.verifyLogin());
        dashboardPage.clickOnProductsLink();
        productsPage=new ProductsPage(driver.get());
        productsPage.addProduct();
        Assert.assertTrue(productsPage.verifyProductAdded());
        Assert.assertTrue(productsPage.verifyNewProductAdded());
    }

    @Test
    public void addCustomer(){
        dashboardPage=new DashboardPage(driver.get());
        customerPage=new CustomerPage(driver.get());
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
        driver.get().quit();
    }
}

    /*//this Runner Class is for parallel methods run it with testng.xml file..
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();//for make driver thread safe
    LoginPage loginPage;
    DashboardPage dashboardPage;
    ProductsPage productsPage;
    CustomerPage customerPage;

    @BeforeMethod
    public void setup(){
        WebDriverFactory webDriverFactory=new WebDriverFactory();
        webDriverFactory.setDriver();
        driver.set(webDriverFactory.getDriver());
        driver.get().navigate().to("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        loginPage=new LoginPage(driver.get());
        loginPage.login();
    }
    @Test
    public void addProduct(){
        dashboardPage=new DashboardPage(driver.get());
        customerPage=new CustomerPage(driver.get());
        Assert.assertTrue(dashboardPage.verifyLogin());
        dashboardPage.clickOnProductsLink();
        productsPage=new ProductsPage(driver.get());
        productsPage.addProduct();
        Assert.assertTrue(productsPage.verifyProductAdded());
        Assert.assertTrue(productsPage.verifyNewProductAdded());
    }

    @Test
    public void addCustomer(){
        dashboardPage=new DashboardPage(driver.get());
        customerPage=new CustomerPage(driver.get());
        dashboardPage.clickOnCustomerListLink();
        customerPage.addCustomer();
        Assert.assertTrue(customerPage.verifyCustomerAddedSuccessfully());
    }

    @AfterClass
    public void tearDown(){
        driver.get().quit();
    }
*/


   /* protected ThreadLocal<WebDriver> driver=new ThreadLocal<>();
        static LoginPage loginPage;
        static DashboardPage dashboardPage;
        ProductsPage productsPage;
        static CustomerPage customerPage;


        @BeforeMethod

        public  void setup(){

            WebDriverFactory webDriverFactory=new WebDriverFactory();
            webDriverFactory.setDriver();
            driver.set(webDriverFactory.getDriver());
            driver.get().navigate().to("webdriver.chrome.driver\",\"c:\\\\webdriver\\\\chromedriver.exe");
            loginPage=new LoginPage(driver.get());
            loginPage.login();
        }

        @Test
        public void addProduct(){
            dashboardPage=new DashboardPage(driver.get());
            customerPage=new CustomerPage(driver.get());
            Assert.assertTrue(dashboardPage.verifyLogin());
            dashboardPage.clickOnProductsLink();
            productsPage=new ProductsPage(driver.get());
            productsPage.addProduct();
            Assert.assertTrue(productsPage.verifyProductAdded());
            Assert.assertTrue(productsPage.verifyNewProductAdded());
        }

        @Test(enabled = false)
        public void addCustomer(){
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

        @AfterMethod
        public  void tearDown(){
            dashboardPage.logout();
            driver.get().close();
            driver.get().quit();
        }*/



