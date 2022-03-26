package com.unitedcoder.exceldemo;

public class ExcelReadDemo1 {
    public static void main(String[] args) {
        String fileName="Test_Data/doc1.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcelCell(fileName,"Login-Info",1,0);
        excelUtility.readFromExcelCell(fileName,"Login-Info",0,0);
        excelUtility.readFromExcelCell(fileName,"Login-Info",0,1);
        String password=excelUtility.readFromExcelCell(fileName,"Login-Info",1,1);
    }
}
