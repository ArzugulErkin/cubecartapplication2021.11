package com.unitedcoder.csvfiles;

import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVFileUtility {
    public List<String> readCSVFile(String filePath, String fileName, String header){
        List<String> values=new ArrayList<>();
        Reader reader=null;
        try {
          reader=new FileReader(filePath+ File.separator+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CSVParser records=null;
        try {
            records=CSVFormat.RFC4180.withFirstRecordAsHeader().withHeader(header).parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord record:records){
            String content=record.get(header);
            values.add(content);
            //System.out.println(String.format("search words %s",content));
        }

        return values;
    }
}
