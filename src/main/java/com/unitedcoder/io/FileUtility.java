package com.unitedcoder.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    //create a method to write a text file
    public void writeToFile(String fileFolder,String fileName,String extension,String content){
        //create a folder if folder doesnt exist
        String rootPath=System.getProperty("user.dir");
        String finalFolder=rootPath+ File.separator+fileFolder;
        File file=new File(fileFolder);
        if(!file.exists()) {
            file.mkdir();
            System.out.println("Folder is created");
        }
            //final file name
            String finalFileName=finalFolder+File.separator+fileName+extension;
            File myFile=new File(finalFileName);
        FileWriter writer=null;
        try {
            writer= new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
       BufferedWriter bufferedWriter=new BufferedWriter(writer);
        try {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
