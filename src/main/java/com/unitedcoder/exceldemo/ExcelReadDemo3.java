package com.unitedcoder.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReadDemo3 {

    public List<String> getExcelData(String productName,String sheetName){
        String filePath="Test_Data/doc1.xlsx";
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sheets=workbook.getNumberOfSheets();
        List<String> productInfo=new ArrayList<>();
        for(int i=0;i<sheets;i++){//sheet
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet=workbook.getSheetAt(i);
                Iterator<Row> rows=sheet.iterator();
                while (rows.hasNext()){//row
                    Row r=rows.next();
                    if(r.getCell(0).getStringCellValue().equalsIgnoreCase(productName)){
                        Iterator<Cell> c=r.cellIterator();
                        while (c.hasNext()){//column
                            Cell c1=c.next();
                            if(c1.getCellTypeEnum()== CellType.STRING){
                                productInfo.add(c1.getStringCellValue());
                            }
                            else {
                                productInfo.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                            }
                        }
                    }
                }
            }
        }
        return productInfo;
    }

    public static void main(String[] args) {
        ExcelReadDemo3 excelReadDemo3=new ExcelReadDemo3();
        List<String> productList=excelReadDemo3.getExcelData("Shoes","Product_Info");
        System.out.println(productList);
    }
}
