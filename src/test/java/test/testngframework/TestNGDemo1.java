package test.testngframework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;
import static java.lang.Math.*;

public class TestNGDemo1 {

    @BeforeSuite
    public void beforeSuitTest(){
        System.out.println("Before Suit Test Will run first!!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test will run after suite!!");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before Groups Test!!");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class!!!!");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Test!!");
    }

    @Test(enabled = true,groups = "smoke test")
    public void addProductTest(){
        System.out.println("This is for adding new Product!!");
        Assert.assertTrue("add Product".contains("Product"));
    }

    @Test(priority = 1,dependsOnMethods = "viewCustomer")
    public void deleteProduct(){
        System.out.println("This Test is for delete product!!");
        Assert.assertTrue(max(100,90)==100);

    }
    @Test(priority = 2,dependsOnGroups = "smoke test")
    public void viewCustomer(){
        System.out.println("This Test is for view customer list!! ");
        Assert.assertTrue(min(20,30)==20);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method!!");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class!!");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("after Groups!!");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After Test!!!");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite!!!");
    }

}




