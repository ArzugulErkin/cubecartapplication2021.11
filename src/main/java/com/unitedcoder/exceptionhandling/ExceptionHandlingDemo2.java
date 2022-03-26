package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo2 {

    public static void main(String[] args) throws InterruptedException {
        test();
        test1();
    }


    public static void test() throws InterruptedException {
        Thread.sleep(3000);//compile
    }
    public static void test1(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
