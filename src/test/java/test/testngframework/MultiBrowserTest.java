package test.testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

    public class MultiBrowserTest {

        WebDriver driver;

        @Parameters("browsername")
        @BeforeTest
        public void setUp(String browsername){
            System.out.println("browser name is: "+browsername);

            if(browsername.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
                driver=new ChromeDriver();
            }
            else if(browsername.equalsIgnoreCase("fire fox")){
                System.setProperty("webdriver.gecko.driver","c:\\webdriver\\geckodriver.exe");
                driver=new FirefoxDriver();
            }
        }

        @Test
        public void Test1(){
            driver.get("https://www.amazon.com");
        }

    }


