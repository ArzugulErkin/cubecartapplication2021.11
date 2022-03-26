package com.unitedcoder.csvfiles;


import java.util.List;

public class CSVReadDemo {
    public static void main(String[] args) {
        CSVFileUtility csvFileUtility=new CSVFileUtility();
       List<String> value=csvFileUtility.readCSVFile("test-result","searchWords.csv","words");
        System.out.println(value);
    }
}
