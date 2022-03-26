package com.unitedcoder.configutility;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAutomation {
    public static void main(String[] args) {
        //set up chrome driver
        //Define chromedriver location
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        //define chromedriver object instance
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        //read application config
        EnvironmentUtility environmentUtility = new EnvironmentUtility();
        String environmentName = System.getenv("environment").toUpperCase();
        String configFile = environmentUtility.getConfigFileByEnvironment(Environment.valueOf(environmentName));
        String url = ApplicationConfig.readFromConfigProperties(configFile, "url");
        String username = ApplicationConfig.readFromConfigProperties(configFile, "username");
        String password = ApplicationConfig.readFromConfigProperties(configFile, "password");
        //login
        driver.get(url);
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        //verify login
        WebElement logoutLink = driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
        ScreenShotUtility screenshotUtility = new ScreenShotUtility();
        if (logoutLink.isDisplayed()) {
            System.out.println("Login Successfully!");
            screenshotUtility.takeScreenshot("image", "login", driver);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Login Failed!!");
        }
        //logout and close the browser
        logoutLink.click();
        driver.quit();
    }
}
