package com.unitedcoder.exceldemo;

import com.unitedcoder.cubecartautomation.LoginPage;
import com.unitedcoder.cubecartautomation.ProductsPage;
import com.unitedcoder.cubecartautomation.TestBase;

public class CubeCartAddMultipleProducTest extends TestBase{
    public static void main(String[] args) {
        String fileName="Test_Data/doc1.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcelCell(fileName,"Login-Info",1,0);
        String password=excelUtility.readFromExcelCell(fileName,"Login-Info",1,1);
        browserSetUp();
        LoginPage loginPage=new LoginPage();
        loginPage.logIn(userName,password);
        ProductsPage productsPage=new ProductsPage();
        productsPage.addMultipleProduct(fileName,"Product_Info");
        closeBrowser();
    }
}
