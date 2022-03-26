package com.unitedcoder.exceldemo;

import java.util.ArrayList;
import java.util.List;

public class ExcelWriteDemo1 {
    public static void main(String[] args) {
        ExcelUtility excelUtility=new ExcelUtility();
        String fileName="Test_Data/loginInfo.xlsx";
        List<String> contents=new ArrayList<>();
        contents.add("username,password");
        contents.add("testautomation,automation123!");
        contents.add("testautomation1,automation123!");
        excelUtility.writeToExcelMultipleCells(fileName,"CubeCartLoginUser",contents);
    }
}
