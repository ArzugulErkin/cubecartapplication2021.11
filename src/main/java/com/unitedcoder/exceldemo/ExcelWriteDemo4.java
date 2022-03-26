package com.unitedcoder.exceldemo;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo4 {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        String fileName="Test_Data/TestReport.xlsx";
        List<String> testResult=new ArrayList<>();
        testResult.add("testname,testmodule,teststatus,executesAt,executedBy");
        testResult.add("Login,Login,Passed,2022-03-15,Aynigar");
        testResult.add("AddProduct,Inventory,Passed,2022-03-15,Aynigar");
        excelUtility.writeToExcelMultipleCells(fileName,"TestResult",testResult);
    }
}
