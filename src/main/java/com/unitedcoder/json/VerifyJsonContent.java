package com.unitedcoder.json;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContent {
    public static void main(String[] args) {
        FileInputStream fileInputStream= null;
        try {
            fileInputStream = new FileInputStream("Test_Data/rahulCourse.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        JsonPath jsonPath=new JsonPath(fileInputStream);
        int courseSize=jsonPath.getInt("courses.size()");
        System.out.println(courseSize);
        int dashboardSize=jsonPath.getInt("dashboard.size()");
        System.out.println(dashboardSize);
        int amount=jsonPath.getInt("dashboard.purchaseAmount");
        System.out.println(amount);

        String firstCourseTitle=jsonPath.get("courses[0].title");
        System.out.println(firstCourseTitle);

        int sum=0;
        for(int i=0;i<courseSize;i++){
            int price=jsonPath.getInt("courses["+i+"].price");
            int copies=jsonPath.getInt("courses["+i+"].copies");
            int amount1=price*copies;
            sum=sum+amount1;
        }
        System.out.println(sum);
        if(sum==amount){
            System.out.println("Correct Calculation!!");
        }
        else {
            System.out.println("Incorrect Calculation!!");
        }
    }
}
