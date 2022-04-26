package test.testngframework;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.pageobjectmodel.DashboardPage;
import test.pageobjectmodel.LoginPage;

import static com.unitedcoder.cubecartautomation.TestBase.*;

public class ParametrizationDemo {
    @BeforeClass
    public void setup(){
        browserSetUp();
    }

    @Parameters({"username","password"})
    @Test
    public void login(String userName,String password){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.login1(userName,password);
        DashboardPage dashboardPage=new DashboardPage(driver);
        dashboardPage.logout();
    }

    @AfterClass
    public void tearDown(){
        closeBrowser();
    }

}
