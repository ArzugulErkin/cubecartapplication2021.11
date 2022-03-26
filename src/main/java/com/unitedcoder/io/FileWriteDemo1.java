package com.unitedcoder.io;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Add Customer Test Passed.");
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("New Customer addedd successfully.");
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("Customer edited successfully.");
        DateTime date=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("Test_Result",
                "CustomerModuleTest"+date.toString(formatter),".text",stringBuilder.toString());

    }
}
