package com.unitedcoder.json;

import com.unitedcoder.cubecartautomation.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FunctionLibrary extends TestBase {
    public void login(LoginUser loginUser) {
        WebElement userNameField = driver.findElement(By.id("username"));
        waitForElementPresent(userNameField, 5);
        userNameField.sendKeys(loginUser.getName());
        WebElement passwordField = driver.findElement(By.id("password"));
        waitForElementPresent(passwordField, 5);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        //wait for the logout button to display
        WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementPresent(logoutIcon,30);
    }

    public void logout(){WebElement logoutIcon=driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
    waitForElementPresent(logoutIcon,30);
    logoutIcon.click();
    }

    public boolean addProduct(Product product)   {
        WebElement productLink=driver.findElement(By.linkText("Products"));
        productLink.click();
        WebElement addProductLink=driver.findElement(By.linkText("Add Product"));
        addProductLink.click();
        //fill out the new product form
        WebElement productNameInputBox=driver.findElement(By.id("name"));
        productNameInputBox.sendKeys(product.getProductName()+getCurrentTimestamp());
        //select Apple as the manufacturer
        Select productFactorySelect=new Select(driver.findElement(By.id("manufacturer")));
        productFactorySelect.selectByVisibleText(product.getProductManufacturer());
        WebElement productCodeInputBox=driver.findElement(By.id("product_code"));
        productCodeInputBox.sendKeys(product.getProductCode()+getCurrentTimestamp());
        //add categories
        WebElement categoryTabElement=driver.findElement(By.id("tab_category"));
        categoryTabElement.click();
        WebElement productCategory=driver.findElement(By.id(product.getProductCategory()));
        productCategory.click();
        sleep(5);
        WebElement productSaveButton=driver.findElement(By.cssSelector("input[value='Save']"));
       // productSaveButton.click();
        //verify the confirmation message
        WebElement confirmationMessageElement = driver.findElement(By.cssSelector("div.success"));
        System.out.println("Confirmation message display result for Product: " + confirmationMessageElement.isDisplayed());
        if(confirmationMessageElement.isDisplayed())
            return true;
        else
            return false;
    }
    public String getCurrentTimestamp()
    {
        return String.valueOf(System.currentTimeMillis());
    }
}


