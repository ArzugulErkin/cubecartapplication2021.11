package com.unitedcoder.cubecartautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends TestBase {
    public boolean verifyLogin(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
        if(logoutLink.isDisplayed()){
            System.out.println("Login Successfully!");
            return true;
        }
        else {
            System.out.println("Login Failed!!");
            return false;
        }
    }

    public void clickOnCategoriesLink(){
        WebElement categoryLink=driver.findElement(By.id("nav_categories"));
        waitForElementPresent(categoryLink,10);
        categoryLink.click();
    }
}
