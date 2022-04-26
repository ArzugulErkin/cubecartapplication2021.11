package test.seleniumadvancedactions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUsafulMethods {
    public static void highLightElement(WebElement element, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String backGroundColor=element.getCssValue("backgroundColor");
        for(int i=0;i<10;i++){
            changeElementColor("#D42D1B",element,driver);
            changeElementColor(backGroundColor,element,driver);
        }
    }
    public static void changeElementColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;//downcasting
        js.executeScript("arguments[0].style.backgroundColor= '"+color+"'",element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void setElementBorder(WebElement element,WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='4px solid red'",element);
    }
    public static void clickWithJS(WebElement element,WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
        //js.executeScript("document.getElementByID('').value=''");
    }
    public static String getTitle(WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String title=js.executeScript("return document.title").toString();
        return title;
    }
    public static void generateAlert(WebDriver driver,String message){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("alert('"+message+"')");
    }
    public static void scrollToElementAppears(WebElement element,WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrolltoView(true);",element);

    }
    public static void refresh(WebDriver driver){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("history.go(0)");
    }

}
