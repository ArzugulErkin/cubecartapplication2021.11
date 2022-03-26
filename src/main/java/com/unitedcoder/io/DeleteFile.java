package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
//        boolean isFileDeleted= FileUtils.deleteQuietly(new File(
//               "Test_Result"
//        ));
        //System.out.println("File Deleted "+isFileDeleted);

        FileUtils.deleteQuietly(new File("CustomerModuleTestResult"+
                File.separator+"Test.txt"));
    }
}
