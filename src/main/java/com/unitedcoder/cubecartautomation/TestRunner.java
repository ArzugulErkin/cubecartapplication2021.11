package com.unitedcoder.cubecartautomation;

import com.unitedcoder.classconcepts.LoginUser;

public class TestRunner extends TestBase {
    public static void main(String[] args) {
        browserSetUp();
        LoginPage loginPage=new LoginPage();
        LoginUser loginUser=new LoginUser("testautomation1","automation123!");
        loginPage.logIn(loginUser);
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.verifyLogin();
        dashboardPage.clickOnCategoriesLink();
        CategoryPage categoryPage=new CategoryPage();
        categoryPage.addCategory();
        categoryPage.verifyCategorySavedSuccessfully();
        categoryPage.deleteCategory();
        categoryPage.verifyCategoryDeletedSuccessfully();
        closeBrowser();
    }
}
