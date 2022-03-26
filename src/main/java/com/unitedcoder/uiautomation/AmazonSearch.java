package com.unitedcoder.uiautomation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
    public static void main(String[] args) {
        //Define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        WebDriver driver=new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com/");
        //driver.navigate().refresh();
        //driver.navigate().back();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone"+ Keys.ENTER);
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone"+Keys.ENTER);
        WebElement result=driver.findElement(By.xpath("//*[contains(text(),\"iphone\")]"));
        if(result.isDisplayed())
            System.out.println("Amazon Search Test Passed");
        else
            System.out.println("Test Failed!!!!");
        driver.close();//close current driver
        driver.quit();//close all driver instance
    }
}
