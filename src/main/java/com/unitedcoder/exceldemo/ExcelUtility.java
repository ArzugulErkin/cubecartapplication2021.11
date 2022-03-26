package com.unitedcoder.exceldemo;

import com.unitedcoder.classconcepts.LoginUser;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    //write a method to read from excel cells
    public String readFromExcelCell(String fileName,String sheetName,int rowNumber,int columNumber){
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //XSSFSheet sheet=workbook.getSheetAt(0);
        XSSFSheet sheet=workbook.getSheet(sheetName);
        XSSFRow row=sheet.getRow(rowNumber);
        String cellValue=null;
        if(row==null){
            System.out.println("Empty row!!!!");
        }else {
            XSSFCell cell=row.getCell(columNumber);
            CellType cellType=cell.getCellType();
            switch (cellType){
                case NUMERIC:
                    cellValue=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }
        }
        return cellValue;
    }

    public List<LoginUser> readMultipleCellValue(String fileName,String sheetName,int startRow){
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet=workbook.getSheet(sheetName);
        int rowCount=sheet.getLastRowNum();
        List<LoginUser> loginUser=new ArrayList<>();
        for(int r=startRow;r<=rowCount;r++){
            XSSFRow row=sheet.getRow(r);
            if(row==null){
                System.out.println("Empty Row!!!");
            }
            else {
                XSSFCell userNameColumn=row.getCell(0);
                XSSFCell passwordColumn=row.getCell(1);
                loginUser.add(new LoginUser(userNameColumn.getStringCellValue(),passwordColumn.getStringCellValue()));
            }
        }
        System.out.println(loginUser);
        return loginUser;
    }

    public void writeToExcelMultipleCells(String fileName,String sheetName,List<String> contents){
        //define a file to write contents
        File excelFile=new File(fileName);
        //define a work book
        XSSFWorkbook workbook=new XSSFWorkbook();
        //add sheet to the work book
        XSSFSheet sheet=workbook.createSheet(sheetName);
        //define rows in the sheet
        int numberOfRows=contents.size();
        for(int rowNumber=0;rowNumber<numberOfRows;rowNumber++){
            XSSFRow row=sheet.createRow(rowNumber);
            String[] rowContent=contents.get(rowNumber).split(",");
            //define colum to the row
            int totalCell=rowContent.length;
            for(int cellNumber=0;cellNumber<totalCell;cellNumber++){
                XSSFCell cell=row.createCell(cellNumber);
                //add contents to the cell
                cell.setCellValue(rowContent[cellNumber]);
                if(rowContent[cellNumber].equalsIgnoreCase("Passed")){
                    CellStyle style = workbook.createCellStyle();
                    style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
                    style.setFillPattern(FillPatternType.DIAMONDS);
                    cell.setCellStyle(style);
                }
            }
        }
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
