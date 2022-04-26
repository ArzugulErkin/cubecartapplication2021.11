package test.homework4;
import com.github.javafaker.Faker;
import com.unitedcoder.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtility4 {
    private int timeout=Integer.parseInt(ApplicationConfig.readFromConfigProperties(
            "config-qa.properties","timeout"
    ));

    private WebDriver driver;

    Faker faker=new Faker();

    public TestUtility4(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String generateFirstName(){
        String firstName=faker.name().firstName();
        return firstName;
    }

    public String generateLastName(){
        String lastName=faker.name().lastName();
        return lastName;
    }

    public void waitForAlertPresent(){
        WebDriverWait wai=new WebDriverWait(driver,timeout);
        wai.until(ExpectedConditions.alertIsPresent());
    }

    public String fakerProductName(){
        String productName=faker.commerce().productName();
        return productName;
    }

    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
