package com.unitedcoder.csvfiles;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class WriteCSVFile {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("Test ID,Test Type,Test Status").append("\n");
        builder.append("1,regression,Pass").append("\n");
        builder.append("2,regression,Pass").append("\n");
        builder.append("3,regression,Pass").append("\n");
        File file=new File("test-result"+File.separator+"test-result.csv");
        try {
            FileUtils.writeStringToFile(file,builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
