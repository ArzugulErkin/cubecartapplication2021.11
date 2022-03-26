package com.unitedcoder.javamethods;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    //method for print calculator information
    public void calculatorInfo(){
        System.out.println("Thanks for using this calculator");
        System.out.println("Hope you enjoy using it!!!!!");
//        String message="Thanks for using this calculator";
//        return  message;
    }

    //method for add two numbers
    public int addTwoNumbers(int i1,int i2){
        int sum=i1+i2;
        return sum;
    }

    public long addTwoNumbers(String s1,String s2){
        if(StringUtils.isNumeric(s1)&StringUtils.isNumeric(s2)){
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;
        }
        else {
            System.out.println("Please provide numeric string");
            return 0;
        }

    }

    public long addMultipleNumbers(long...numbers){
        long sum=0;
        for(long eachNumber:numbers){
            sum+=eachNumber;
        }
        return sum;
    }
    public static int staicSum(int a,int b){
        return a+b;

    }

}
