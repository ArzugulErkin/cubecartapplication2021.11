package com.unitedcoder.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.cubecartautomation.TestBase;

import java.io.File;
import java.io.IOException;

public class AutomationWIthJson extends TestBase {
    public static void main(String[] args){
        ObjectMapper objectMapper=new ObjectMapper();
        CubeCartTestData cubecartTestData=new CubeCartTestData();
        try {
            cubecartTestData=objectMapper.readValue(new File("Test_Data/cubecart_test.json"),CubeCartTestData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        browserSetUp();FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.login(cubecartTestData.getLoginUser());
        functionLibrary.addProduct(cubecartTestData.getProduct());
        functionLibrary.logout();
        //closeBrowser();
    }
    }
