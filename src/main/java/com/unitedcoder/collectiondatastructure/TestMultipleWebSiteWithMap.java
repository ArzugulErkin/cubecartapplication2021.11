package com.unitedcoder.collectiondatastructure;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestMultipleWebSiteWithMap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        Map<String,String> websites=new HashMap<>();
        websites.put("Google","https://www.google.com");
        websites.put("Yahoo","https://www.yahoo.com");
        websites.put("YouTube","https://www.youtube.com");
        websites.put("CNN","https://www.cnn.com");
        Set<String> keys=websites.keySet();
        for(String k:keys) {
            StopWatch watch=new StopWatch();
            watch.start();
            driver.get(websites.get(k));
            if(driver.getTitle().contains(k)){
                System.out.println(k+" opened successfully, Test Pass!!!");
                watch.stop();
                System.out.println(k+"opened within "+watch.getTime(TimeUnit.MILLISECONDS));
            }
            else {
                System.out.println(k+" not opened successfully, Test Fail!!!!");
            }
        }
        driver.close();
        driver.quit();
    }
}
