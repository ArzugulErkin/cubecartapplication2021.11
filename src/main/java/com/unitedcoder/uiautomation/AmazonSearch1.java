package com.unitedcoder.uiautomation;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch1 {
    public static void main(String[] args) throws InterruptedException {
        //Define chromedriver location
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        WebDriver driver=new ChromeDriver();
        //open browser and navigate
        driver.manage().window().fullscreen();
        //driver.get("https://www.google.com");
        driver.navigate().to("https://www.amazon.com/");
        //set browser size-  Dimension
        Thread.sleep(3000);
        Dimension dimension=new Dimension(800,900);
        driver.manage().window().setSize(dimension);
        //Point--set position
        Point point=new Point(200,100);
        driver.manage().window().setPosition(point);
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Point cordinate=searchBox.getLocation();
        int xLocation=cordinate.getX();
        int yLocation=cordinate.getY();
        System.out.println("X cordinate of search box is: "+xLocation);
        System.out.println("Y cordinate of search box is: "+yLocation);

    }
}
