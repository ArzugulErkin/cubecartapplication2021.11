package test.seleniumadvancedactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScripExecutorDemo1 {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void javaSCriptWindowScrollTest() throws InterruptedException {
        driver.get("https://jqueryui.com/");
        //define a java script executor
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.location");//returns current window location
        for(int i=0;i<10;i++){
            js.executeScript("window.scrollBy(0,100)");
            Thread.sleep(2000);
        }
        WebElement widgetElement=driver.findElement(By.linkText("Widget Factory"));
        Assert.assertTrue(widgetElement.isDisplayed());
    }

    @Test
    public void javaScriptClickTest(){
        driver.get("https://jqueryui.com/dialog/#animated");
        WebElement iframe=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        WebElement openDialogElement=driver.findElement(By.id("opener"));
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()",openDialogElement);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement dialogElement=driver.findElement(By.id("ui-id-1"));
            Assert.assertTrue(dialogElement.isDisplayed());




    }
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
