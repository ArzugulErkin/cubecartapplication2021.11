package com.unitedcoder.uiautomation;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MultipleAmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        DateTime browserOpenedTime=new DateTime();
        driver.get("https://www.amazon.com/");
        List<String> products=new ArrayList<>();
        products.add("Java Book");
        products.add("Yoga mat");
        products.add("Hard Disk");
        products.add("Monitor");
        for(String value:products) {
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.clear();
            searchBox.sendKeys(value+ Keys.ENTER);
            //driver.navigate().back();
        }
        driver.close();
        driver.quit();
        DateTime testEndTime=new DateTime();
        Period period=new Period(browserOpenedTime,testEndTime, PeriodType.seconds());
        System.out.println("Total Test time is: "+period.getSeconds());

    }
}
