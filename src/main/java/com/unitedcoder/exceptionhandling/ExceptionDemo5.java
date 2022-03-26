package com.unitedcoder.exceptionhandling;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
            System.out.println(Integer.parseInt("a1234"));
            System.out.println(67897);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
