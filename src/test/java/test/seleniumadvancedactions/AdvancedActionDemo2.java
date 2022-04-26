package test.seleniumadvancedactions;
import com.unitedcoder.configutility.ScreenShotUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AdvancedActionDemo2 {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dragAndDropTest(){
        driver.get("https://jqueryui.com/droppable/");
        WebElement iframe=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        // actions.clickAndHold(draggable).moveToElement(droppable).release().perform();
        //actions.dragAndDrop(draggable,droppable).perform();
        actions.dragAndDropBy(draggable,20,0).perform();
        actions.dragAndDrop(draggable,droppable).perform();
        Assert.assertTrue(droppable.getText().contains("Dropped"));
    }

   /* @Test
    public void multipleWindowTest(){
        driver.get("https://seleniummastertutorial.com/");
        WebElement newWindowLink=driver.findElement(By.id("windowsButton"));
        String currentWindow=driver.getWindowHandle();
        newWindowLink.click();
        for(String childWindow:driver.getWindowHandles()){
            System.out.println("window name is: "+childWindow);
            if(!childWindow.equalsIgnoreCase(currentWindow)){
                driver.switchTo().window(childWindow);
                WebElement button=driver.findElement(By.xpath("//*[@id=\"navback\"]/a"));
                Assert.assertTrue(button.isDisplayed());
            }
        }
    }*/

    @Test
    public void iterateMultipleWindows(){
        driver.get("https://seleniummastertutorial.com/");
        WebElement newWindowLink=driver.findElement(By.id("windowsButton"));
        newWindowLink.click();
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        String currentWindow=iterator.next();
        String newWindow=iterator.next();
        driver.switchTo().window(newWindow);
        WebElement button=driver.findElement(By.xpath("//*[@id=\"navback\"]/a"));
        Assert.assertTrue(button.isDisplayed());
    }

    @Test
    public void selectableTest(){
        driver.get("https://jqueryui.com/selectable/");
        WebElement iframe=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        List<WebElement> items=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
        int itemCount=items.size();
        int count=0;
        for(WebElement eachItem:items){
            eachItem.click();
            count++;
        }
        Assert.assertEquals(count,itemCount);
    }

    @Test
    public void multipleLinkTest() {
        driver.get("https://jqueryui.com/");
        List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"sidebar\"]//a"));
        List<String> urls = new ArrayList<>();
        ScreenShotUtility screenShotUtility=new ScreenShotUtility();
        for (WebElement eachLink : allLinks) {
            String url = eachLink.getAttribute("href");
            urls.add(url);
        }
        int count = 0;
        for (String eachUrl : urls) {
            driver.navigate().to(eachUrl);
            screenShotUtility.takeScreenshot("image",eachUrl
                    .replace("https://jqueryui.com/","".replaceAll("/","")),driver);
            count++;
            if(count>5)
                break;
        }
        Assert.assertTrue(urls.size()>1);
    }

    @Test
    public void verifyBrokenLink(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links=driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
        for(WebElement eachLink:links){
            String url=eachLink.getAttribute("href");
            HttpURLConnection connection=null;
            try {
                connection=(HttpURLConnection)new URL(url).openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                connection.setRequestMethod("HEAD");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            try {
                connection.connect();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int responseCode=0;
            try {
                responseCode=connection.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(responseCode);
            if(responseCode>400){
                System.out.println("The Link with Test "+eachLink.getText()+ " is broken link"+" with response Code "+responseCode);
            }


        }

    }


//    @AfterClass
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


