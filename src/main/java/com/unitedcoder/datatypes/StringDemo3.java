package com.unitedcoder.datatypes;

public class StringDemo3 {
    public static void main(String[] args) {
        String expectedResult="Customer Saved SUCCESSFULLY";
        String actualResult="Customer saved successfully";
        //toLowerCase(), toUpperCase()
       expectedResult=expectedResult.toLowerCase();
        System.out.println(expectedResult);
        actualResult=actualResult.toLowerCase();
        System.out.println(actualResult);
        System.out.println(expectedResult.equals(actualResult));
        System.out.println(expectedResult.toUpperCase());
        System.out.println(expectedResult);
        //equalIgnoreCase
        String s1="Hello";
        String s2="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        //System.out.println(10==20);
       // System.out.println(expectedResult.equals(actualResult));
        //replace
        String course="Java Selenium Course";
        //course=course.replace("Java","Python").replace(" ","");
        course=course.replace("a ","a");
        System.out.println(course);
        //14/12/2021      14-12-2021
        String currentData="14/12/2021";
        currentData=currentData.replace("/","-");
        System.out.println("EU format: "+currentData);

        String result=" All Test Passed ";
        System.out.println(result.length());
        result=result.trim();
        System.out.println(result.length());
        System.out.println(result);





    }
}
