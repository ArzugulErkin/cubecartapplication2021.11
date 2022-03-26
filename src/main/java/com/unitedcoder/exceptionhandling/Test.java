package com.unitedcoder.exceptionhandling;

import com.unitedcoder.classconcepts.Car;

public class Test {
    public static void main(String[] args) {
        String s=null;
        Car c=new Car();
        c=null;
        System.out.println(s.length());
    }
}
