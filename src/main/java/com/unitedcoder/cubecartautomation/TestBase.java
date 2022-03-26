package com.unitedcoder.cubecartautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static String browserName="chrome";

    public static void browserSetUp(){
        if(driver==null){
            if(browserName.equalsIgnoreCase("chrome")){
                //switch (browserName){
                 //   case "chrome":
                System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
                driver=new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
                //break;
               // case "fireFox":
            }
            else if(browserName.equalsIgnoreCase("Fire fox")){
                System.setProperty("webdriver.gecko.driver","c:\\webdriver\\geckodriver.exe");
                driver=new FirefoxDriver();
                driver.manage().window().maximize();
                driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
            }
        }
    }

    public static void closeBrowser(){
        driver.close();
        //driver=null;
        driver.quit();
    }

    //static wait
    public static void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //implcit wait
    public static void implicitWait(int second){
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }
    //explicit wait
    public static void waitForElementPresent(WebElement element,int timeOut){
        WebDriverWait wait=new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //fluent wait
    public static void fluentWait(WebElement element){
        Wait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(20,TimeUnit.SECONDS)
                .pollingEvery(100,TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //wait for Alert
    public void waitForAlertPresent(){
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
