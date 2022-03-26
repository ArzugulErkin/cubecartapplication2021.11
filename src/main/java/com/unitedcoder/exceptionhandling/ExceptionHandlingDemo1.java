package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);//run time exception
        }catch (Exception a){
            a.printStackTrace();
            System.out.println("In the catch block");
        }
        System.out.println("Hello World");
    }

}
