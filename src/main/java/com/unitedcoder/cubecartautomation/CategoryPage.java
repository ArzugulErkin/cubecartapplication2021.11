package com.unitedcoder.cubecartautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryPage extends TestBase {
    String myCategoryName;

    public void addCategory(){
        WebElement addCategoryLink=driver.findElement(By.linkText("Add Category"));
        waitForElementPresent(addCategoryLink,10);
        addCategoryLink.click();
        WebElement statusCheckBox=driver.findElement(By.xpath("//img[@rel=\"#status\"]"));
        waitForElementPresent(statusCheckBox,5);
        statusCheckBox.click();
        WebElement visibleCheckBox=driver.findElement(By.xpath("//img[@rel=\"#visible\"]"));
        waitForElementPresent(visibleCheckBox,5);
        visibleCheckBox.click();
        WebElement categoryNameField=driver.findElement(By.id("name"));
        waitForElementPresent(categoryNameField,5);
        myCategoryName="Cheese"+System.currentTimeMillis();
        categoryNameField.sendKeys(myCategoryName);
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        saveButton.click();
    }

    public boolean verifyCategorySavedSuccessfully(){
        WebElement successMessage=driver.findElement(By.cssSelector("div.success"));
        waitForElementPresent(successMessage,10);
        if(successMessage.isDisplayed()) {
            System.out.println("Category saved Successfully");
            return true;
        }
        else {
            System.out.println("Category not saved!");
            return false;
        }
    }

    public void deleteCategory(){
        sleep(2);
        List<WebElement> rows=driver.findElements(By.xpath("//div[@id=\"categories\"]/table/tbody/tr"));
        int rowCount=rows.size();
        for(int i=1;i<rowCount;i++) {
            WebElement categoryNameField = driver.findElement(By.xpath("//*[@id='categories']/table/tbody/tr["+i+"]/td[5]"));
            waitForElementPresent(categoryNameField,5);
            String categoryName=categoryNameField.getText();
            if(categoryName.equalsIgnoreCase(myCategoryName)){
                WebElement deleteIcon=driver.findElement(By.xpath("//*[@id=\"categories\"]/table/tbody/tr["+i+"]/td[7]/a[4]/i"));
                waitForElementPresent(deleteIcon,5);
                deleteIcon.click();
                waitForAlertPresent();
                Alert alert=driver.switchTo().alert();
                alert.accept();
            }
        }

    }

    public boolean verifyCategoryDeletedSuccessfully(){
        WebElement successMessage=driver.findElement(By.cssSelector("div.success"));
        waitForElementPresent(successMessage,10);
        if(successMessage.isDisplayed()) {
            System.out.println("Category deleted Successfully");
            return true;
        }
        else {
            System.out.println("Category not deleted!");
            return false;
        }

    }
}
