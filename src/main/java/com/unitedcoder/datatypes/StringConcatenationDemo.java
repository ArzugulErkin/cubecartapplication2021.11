package com.unitedcoder.datatypes;

public class StringConcatenationDemo {
    public static void main(String[] args) {
        String s1="Hello, ";//non numeric
        String s2="World";
        String s3=", ";
        //System.out.println(s1+s3+s2);//Hello, World
        System.out.println(s1+s2);
        //for numeric string concatination
        String s4="1000";
        String s5="200";
        System.out.println(s4+s5);//1000200

        //Exercise
        int a=100;
        int b=200;
        String x="Hi";
        String y="Java";
        String z="50";
        String space=" ";
        System.out.println(a+b);//300
        System.out.println(a+z);//10050
        System.out.println(x+y);//HiJava
        System.out.println(a+b+z+x+y);//30050HiJava
        System.out.println(x+y+a*b);//HiJava100200
        System.out.println(x+y+(a+b));//HiJava300
        System.out.println(a+b+x+y+a+b);//300HiJava100200
        String sum=a+space+"A";
        System.out.println(sum);//100 A
        //Concatenation
        String s6="Selenium";
        String s7="Master";
        System.out.println(s6.concat(" "+s7));
        System.out.println(s6+" "+s7);

        System.out.println("Welcome to Selenium Master");//hard code
        System.out.println(String.format("Welcom to %s %s",s6,s7));

        //contains
        String result="1-48 of over 6,000 results for Java";
        boolean verificationResult=result.contains("Java");
        System.out.println("Verification is: "+verificationResult);










    }
}
