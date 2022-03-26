package com.unitedcoder.datatypes;

public class ReferanceValueDemo {
    public static void main(String[] args) {
        int x=100;
        int y=200;
        //Referance Value
        int tempValue=x;
        System.out.println(x);
        x=y;
        System.out.println(x);
        y=tempValue;
        System.out.println("Value of X is: "+x);
        System.out.println("Value of Y is: "+y);
    }
}
