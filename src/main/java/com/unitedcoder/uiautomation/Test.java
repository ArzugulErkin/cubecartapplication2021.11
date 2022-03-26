package com.unitedcoder.uiautomation;

public class Test {
    public static void main(String[] args) {
        String s1="1-16 of over 1,000 results for";
        int beginIndex=s1.lastIndexOf("1");
        int i2=s1.lastIndexOf("0");
        System.out.println(beginIndex);
        System.out.println(i2);
        System.out.println(s1.substring(beginIndex,i2+1));
    }
}
