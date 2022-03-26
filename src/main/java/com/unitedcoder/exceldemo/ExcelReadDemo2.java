package com.unitedcoder.exceldemo;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ExcelReadDemo2 {
    public static void main(String[] args) {
        String fileName="Test_Data/CountryInfo.xlsx";
//        FileInputStream fileInputStream= null;
//        try {
//            fileInputStream = new FileInputStream(fileName);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet=workbook.getSheetAt(0);
        int rowCount=sheet.getLastRowNum();
        //System.out.println(rowCount);
        int columCount=sheet.getRow(1).getLastCellNum();
        for(int r=0;r<=rowCount;r++){
            XSSFRow rows=sheet.getRow(r);
            for(int c=0;c<columCount;c++){
                XSSFCell cell=rows.getCell(c);
                switch (cell.getCellType()){
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
