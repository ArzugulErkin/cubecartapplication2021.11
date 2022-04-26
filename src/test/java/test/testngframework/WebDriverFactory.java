package test.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private WebDriver driver;
    public void setDriver()
    {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    public WebDriver getDriver()
    {
        return driver;
    }
}

