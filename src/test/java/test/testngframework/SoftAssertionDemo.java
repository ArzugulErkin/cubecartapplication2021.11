package test.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
    SoftAssert softAsser=new SoftAssert();
    @Test
    public void dummyTest(){
        System.out.println("open broweser");
        Assert.assertEquals(10,10);
        System.out.println("Login");
        Assert.assertEquals(10,10);
        System.out.println("Add product");
        softAsser.assertEquals(20,10);
        System.out.println("Add Customer");
        Assert.assertEquals(10,10);
       // softAsser.assertAll();
    }
}
