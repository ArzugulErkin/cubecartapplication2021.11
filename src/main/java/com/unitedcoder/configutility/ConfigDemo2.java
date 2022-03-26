package com.unitedcoder.configutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo2 {
    public static void main(String[] args) {
        String configFile="config-qa.properties";
        Properties properties=new Properties();
        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream(configFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("timeout"));
        properties.setProperty("timeout","20");
        FileOutputStream outputStream= null;
        try {
            outputStream = new FileOutputStream(configFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.store(outputStream,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("timeout"));
    }
}
