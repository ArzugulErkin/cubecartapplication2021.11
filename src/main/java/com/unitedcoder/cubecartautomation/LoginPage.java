package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBase {

    public void logIn(LoginUser loginUser){
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        waitForElementPresent(passwordField,5);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }

    public void logIn(String userName,String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(userName);
        WebElement passwordField=driver.findElement(By.id("password"));
        waitForElementPresent(passwordField,5);
        passwordField.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
}
