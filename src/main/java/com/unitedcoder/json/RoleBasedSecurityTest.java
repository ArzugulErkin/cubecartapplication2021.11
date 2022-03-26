package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.classconcepts.LoginUser;
import com.unitedcoder.cubecartautomation.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoleBasedSecurityTest extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        TestResult testResult=new TestResult();
        String startTime=TestHelper.getToday()+" "+TestHelper.getCurrentTime();
        testResult.setTestStartTime(startTime);
        testResult.setTestExecutedBy(TestHelper.getCurrentUser());
        ObjectMapper objectMapper=new ObjectMapper();
        Users loginUser=null;
        try {
            loginUser=objectMapper.readValue(new File("Test_Data/User.json"),Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<TestResultObject> testResultObjects=new ArrayList<>();
        List<User> allUsers=loginUser.getUsers();
        for(User eachUser:allUsers) {
            TestResultObject testResultObject = new TestResultObject();
            if (eachUser.isActive()) {
                testResultObject.setTestModule("Login");
                testResultObject.setTestName("Login");

                String testDate = TestHelper.getToday();
                testResultObject.setTestDate(testDate);
                String testTime = TestHelper.getCurrentTime();
                testResultObject.setTestTime(testTime);

                WebElement userNameField = driver.findElement(By.id("username"));
                waitForElementPresent(userNameField, 5);
                String userName = eachUser.getUsername();
                userNameField.sendKeys(userName);
                WebElement passwordField = driver.findElement(By.id("password"));
                waitForElementPresent(passwordField, 5);
                String password = eachUser.getPassword();
                passwordField.sendKeys(password);
                WebElement loginButton = driver.findElement(By.id("login"));
                loginButton.click();
                WebElement productsLink = driver.findElement(By.id("nav_products"));
                waitForElementPresent(productsLink, 10);
                if (productsLink.isDisplayed()) {
                    System.out.println("Login Test Passed");//log
                    testResultObject.setTestStatus(true);
                } else {
                    System.out.println("Login Test Failed");
                    testResultObject.setTestStatus(false);
                }
                WebElement logoutLink = driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
                waitForElementPresent(logoutLink, 10);
                logoutLink.click();
            }
            testResultObjects.add(testResultObject);
        }
        driver.close();
        driver.quit();
        testResult.setTestEndTime(TestHelper.getToday()+" "+TestHelper.getCurrentTime());
        testResult.setTestResultObjectList(testResultObjects);
        try {
            objectMapper.writeValue(new File("Test_Data\\login-test-result.json"),testResult);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
