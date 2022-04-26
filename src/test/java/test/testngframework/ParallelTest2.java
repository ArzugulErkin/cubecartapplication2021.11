package test.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;

public class ParallelTest2 {

    WebDriver driver;
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test
    public void login(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        loginPage=new LoginPage(driver);
        loginPage.login();
        dashboardPage=new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.verifyLogin());
    }
}
