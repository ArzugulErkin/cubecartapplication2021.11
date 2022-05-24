package test.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeadLessRunner  {
    WebDriver driver=null;

     LoginPage loginPage;
   DashboardPage dashboardPage;
    ProductsPage productsPage;


    @BeforeClass
    public  void setup(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("headless ");//set up thw browser in headless mode
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        loginPage=new LoginPage(driver);
        loginPage.login();
        dashboardPage=new DashboardPage(driver);

    }

    @Test
    public void addProduct(){

        dashboardPage.clickOnProductsLink();
        productsPage=new ProductsPage(driver);
        productsPage.addProduct();
        Assert.assertTrue(productsPage.verifyProductAdded());

    }


    @AfterClass
    public  void tearDown(){
        dashboardPage.logout();
        driver.close();
        driver.quit();
    }
}


