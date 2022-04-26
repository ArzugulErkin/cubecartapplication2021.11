package test.testngframework;


import com.unitedcoder.cubecartautomation.TestBase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;




public class DataProviderDemo extends TestBase {

    @BeforeClass
    public void setup(){
        browserSetUp();
    }

    @Test(dataProvider = "loginInfo")
    public void roleBasedSecurityTest(String userName,String password){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login1(userName,password);
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.logout();
    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    @DataProvider
    public Object[][] loginInfo(){
        Object[][] loginData=new Object[][]{
                {"testautomation1","automation123!"},
                {"testautomation2","automation123!"}
        };
        return loginData;
    }
}


