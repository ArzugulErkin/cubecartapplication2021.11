package com.unitedcoder.exceptionhandling;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        int x=100;
        if(x>20){
            throw new NullPointerException("It cant be greater than 20");
        }
        else {
            throw new ArithmeticException("It cant be less than 20");
        }
    }
}
