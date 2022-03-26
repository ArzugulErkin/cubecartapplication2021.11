package com.unitedcoder.io;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        String s="Test Passed";
        s=s+"Successfully";
        DateTime date=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        String fileName="CustomerTest"+date.toString(formatter)+".txt";
        File file=new File("CustomerModuleTestResult"+File.separator+fileName);
        try {
            FileUtils.writeStringToFile(file,s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
