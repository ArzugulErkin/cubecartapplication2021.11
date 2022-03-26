package com.unitedcoder.classconcepts;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleAmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        Products amazonProducts=new Products();
       // String[] parameter=new String[]{"Iphone Case","Monitir","Hard Disk"};
        amazonProducts.setProducts(new String[]{"Iphone Case","Monitir","Hard Disk"});
        int navigateCount=1;
        for(String value:amazonProducts.getProducts()) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys(value+ Keys.ENTER);
            if(navigateCount<amazonProducts.getProducts().length){
            driver.navigate().back();
            }
            navigateCount++;
        }
        driver.close();
        driver.quit();

    }
}
