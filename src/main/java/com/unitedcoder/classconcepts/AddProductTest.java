package com.unitedcoder.classconcepts;

import com.unitedcoder.dropdownlist.SelectClassDemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddProductTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:\\webdriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecart.unitedcoderschool.com/ecommerce/admin_w4vqap.php?_g=categories");
        LoginUser cubeCartUser=new LoginUser("testautomation","automation123!");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(cubeCartUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(cubeCartUser.getPassword());
        driver.findElement(By.id("login")).click();
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        productsLink.click();
        WebElement addProductLink=driver.findElement(By.xpath("//*[text()='Add Product']"));
        addProductLink.click();
        ProductContent productContent=new ProductContent("JavaBook"+System.currentTimeMillis());
        driver.findElement(By.id("name")).sendKeys(productContent.getProductName());
        WebElement conditionDropDown=driver.findElement(By.id("condition"));
        //Select select=new Select(conditionDropDown);
        //select.selectByVisibleText(DropDownContent.Refurbished.name());
        //select.selectByIndex(2);
        SelectClassDemo1.selectValueFromDropDown(conditionDropDown,"new");
        WebElement googleCategoryDropDown=driver.findElement(By.xpath("//*[@id=\"general\"]/fieldset[3]/div[7]/span/div/a/span"));
        googleCategoryDropDown.click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
        String successfulMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div[2]")).getText();
        if(driver.getPageSource().contains(successfulMessage)){
            System.out.println("Product added successfully, test pass!!!");
        }
        else
            System.out.println("Test Failed");
        driver.close();
        driver.quit();
    }
}
