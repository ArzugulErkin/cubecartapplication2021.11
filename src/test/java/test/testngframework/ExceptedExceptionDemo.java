package test.testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.unitedcoder.cubecartautomation.TestBase.driver;

public class ExceptedExceptionDemo {

    @Test(expectedExceptions =ArithmeticException.class)
    public void test1(){
        System.out.println("AAA");
        throw new ArithmeticException();


    }
    @Test(expectedExceptions = NoSuchElementException.class)
    public  void test2(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextboxxx"));
    }



}
