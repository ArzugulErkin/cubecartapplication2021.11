package com.unitedcoder.uiautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) throws InterruptedException {
        //Define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        WebDriver driver=new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=\"Allow All Cookies\"]")).click();

    }
}
