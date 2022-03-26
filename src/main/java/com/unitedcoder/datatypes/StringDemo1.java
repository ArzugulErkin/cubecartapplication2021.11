package com.unitedcoder.datatypes;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1="name";
        String s2="name";
        System.out.println(s1==s2);//true
        String s3=new String("Hello");
        String s4=new String("Hello");
        System.out.println(s3==s4);//false
        System.out.println(10>20);
    }
}
