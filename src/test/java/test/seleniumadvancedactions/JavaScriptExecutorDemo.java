package test.seleniumadvancedactions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "c:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.twoplugs.com/");
    }
    @Test
    public void highLightElement(){
        sleep(3);
        WebElement join=driver.findElement(By.xpath("//span[text()=\"Join now for free\"]"));
        waitForElementPresent(join);
        JavaScriptUsafulMethods.highLightElement(join,driver);
    }
    @Test
    public void drowElement(){
        sleep(5);
        WebElement join=driver.findElement(By.xpath("//span[text()=\"Join now for free\"]"));
        waitForElementPresent(join);
        waitForElementPresent(join);
        JavaScriptUsafulMethods.setElementBorder(join,driver);
    }
   /* @Test
    public void clickWithJs(){
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=customers&node=email");
        WebElement loginButton=driver.findElement(By.id("login"));
        waitForElementPresent(loginButton);
        JavaScriptUsafulMethods.clickWithJS(loginButton,driver);
        String title=   JavaScriptUsafulMethods.getTitle(driver);
        System.out.println(title);
        JavaScriptUsafulMethods.generateAlert(driver,"You Clicked Login Button without entering username and password");
        sleep(2);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }*/
    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();

    }
    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
