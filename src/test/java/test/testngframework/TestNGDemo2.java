package test.testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNGDemo2 {
    @Test(description = "this is for test cubecart fonction",enabled = false)
    public void test(){
        System.out.println("test");
        assertEquals(10,20);
    }


    @Test(alwaysRun = true,dependsOnMethods =" test",enabled = false)
    public void test1(){
        System.out.println("Always Run!");
        assertEquals(100,100);
    }

    @Test(timeOut = 3000)
    public void login(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("login test");
        assertEquals(100,100);
    }
    @Test(invocationCount =2 )
    public void test3(){
        System.out.println("test 3 run multple times");
    }





}
