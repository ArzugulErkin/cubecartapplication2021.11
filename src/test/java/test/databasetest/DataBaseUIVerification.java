package test.databasetest;


import com.unitedcoder.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import test.pageobjectmodel.CustomerPage;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;

import java.sql.Connection;

public class DataBaseUIVerification {

    WebDriver driver;

    LoginPage loginPage;
    DashboardPage dashboardPage;
    CustomerPage customerPage;
    Connection connection=null;
    final static String configFile="config-qa.properties";
    TestDataHolder testDataHolder;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        loginPage=new LoginPage(driver);
        loginPage.login();
        dashboardPage=new DashboardPage(driver);
        customerPage=new CustomerPage(driver);
        testDataHolder=new TestDataHolder();
        //for data base
        String dbUrl= ApplicationConfig.readFromConfigProperties(configFile,"qa.dbUrl");
        String dbPort=ApplicationConfig.readFromConfigProperties(configFile,"qa.dbPort");
        String defaultDatabase=ApplicationConfig.readFromConfigProperties(configFile,"qa.defaultDatabase");
        String userName=ApplicationConfig.readFromConfigProperties(configFile,"qa.userName");
        String password=ApplicationConfig.readFromConfigProperties(configFile,"qa.password");
        connection=ConnectionManager.connectToDatabaseServer(dbUrl,dbPort,defaultDatabase,userName,password,ConnectionType.MYSQL);

    }

    @Test(description = "Admin user should be able to add customer",groups={"addCustomer"})
    public void addCustomerTest(){
        dashboardPage.clickOnCustomerListLink();
        String firstName="Aynigar"+System.currentTimeMillis();
        String lastName="Alim"+System.currentTimeMillis();
        String customerEmail="abcd"+System.currentTimeMillis()+"@test.com";
        testDataHolder.setCustomerEmail(customerEmail);
        customerPage.addCustomer(firstName,lastName,customerEmail);
        Assert.assertTrue(customerPage.verifyCustomerAddedSuccessfully(testDataHolder.getCustomerEmail()));
    }

    @Test(description = "Admin user should be able to add customer",dependsOnGroups = {"addCustomer"})
    public void verifyCustomerInDataBaseTest(){
        DataAccess dataAccess=new DataAccess();
        boolean isCustomerExist=dataAccess.getCustomer(testDataHolder.getCustomerEmail(),connection);
        Assert.assertTrue(isCustomerExist);

    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
        ConnectionManager.closeDatabaseConnection(connection);
    }
}
