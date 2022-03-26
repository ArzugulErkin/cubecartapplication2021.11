package com.unitedcoder.datatypes;

public class StringDemo2 {
    public static void main(String[] args) {
        //index  length
        String school="United 2 Coder";
        String course="Java Selenium Test Automation";

        System.out.println(school.indexOf("C"));
        System.out.println(course.indexOf("Test"));
        System.out.println(course.indexOf('t'));
        System.out.println(course.indexOf('t',course.indexOf('t')+1));
        System.out.println(course.lastIndexOf("t"));
        //returns -1 if doesnt exist
        System.out.println(school.indexOf(6));
        System.out.println(school.charAt(5));

        String city="Rotterdam";
        System.out.println(city.length());

        //Sub String
        String description="SPIDERCASE Designed for iPhone 13 Pro Max Case," +
                " Crystal Clear Not Yellowing Military Grade Drop Protection Slim Thin Clear…";
        //System.out.println(description.substring(24,33));

        int indexForI=description.indexOf('i',description.indexOf('i')+1);
        System.out.println("Index for i is: "+indexForI);
        int indexFor3="iphone 13".length();
        System.out.println("Index for 3 is: "+(indexForI+indexFor3));
        System.out.println(description.substring(indexForI,indexForI+indexFor3));

        int i1=description.indexOf("3")+1;
        System.out.println(description.substring(indexForI,i1));





    }
}
