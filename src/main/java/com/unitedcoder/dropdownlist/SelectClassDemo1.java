package com.unitedcoder.dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClassDemo1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=\"Allow All Cookies\"]")).click();
        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
        Thread.sleep(3000);
        WebElement month=driver.findElement(By.id("month"));
        WebElement day=driver.findElement(By.id("day"));
        WebElement year=driver.findElement(By.id("year"));
        //11-06-2000
        Select selectMonth=new Select(month);
        Select selectDate=new Select(day);
        Select selectYear=new Select(year);
        selectMonth.selectByIndex(5);
        selectDate.selectByValue("11");
        selectYear.selectByVisibleText("2000");
        System.out.println(selectMonth.isMultiple());
        //selectValueFromDropDown(month,"5");
//        selectValueFromDropDown(day,"10");
//        selectValueFromDropDown(year,"1999");
//       List<WebElement> options=selectYear.getOptions();
//       for(int i=0;i<options.size();i++){
//           System.out.println(options.get(i).getText());
//       }

      List<WebElement> months= driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        for(int i=0;i<months.size();i++){
            System.out.println(months.get(i).getText());
        }

    }
    public static void selectValueFromDropDown(WebElement webElement,String value){
        Select s1=new Select(webElement);
        s1.selectByValue(value);
    }
}
