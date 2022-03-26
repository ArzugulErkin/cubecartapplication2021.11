package com.unitedcoder.datatypes;

public class InstanceOfDemo {
    public static void main(String[] args) {
        String s1=new String("Student");
        boolean b1=s1 instanceof Object;
        System.out.println(b1);

        Integer i=100;
        System.out.println(i instanceof Integer);

    }
}
