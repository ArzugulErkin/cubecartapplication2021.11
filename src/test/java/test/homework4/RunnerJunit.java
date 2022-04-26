package test.homework4;

import com.unitedcoder.cubecartautomation.TestBase;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunnerJunit extends TestBase {
    static LoginPage4 loginPage4;
 DashboardPage4 dashboardPage4;
  ProductsPage4 productsPage4;
      TestUtility4 testUtility4;

@BeforeClass
    public static void setUp(){
        browserSetUp();
        LoginPage4 loginPage4=new LoginPage4(driver);
        loginPage4.login();


    }
    @Test

    public void addMultpleProduct(){
        DashboardPage4 dashboardPage4=new DashboardPage4(driver);
        dashboardPage4.clickOnProductsLink();
        ProductsPage4 productsPage4=new ProductsPage4(driver);
        productsPage4.addMultipleProduct();
    }

}
