package com.unitedcoder.datatypes;

public class DataTypeDemo1 {
    public static void main(String[] args) {
        //define variables
        byte age=99;
        System.out.println(age);
        System.out.println("My age is "+age);
        age=100;
        System.out.println("My age is "+age);
        //HR application  12- salary summary
        short s1=2000;
        short s2=1000;
        int s3=s1+s2;
        System.out.println(s1);
        System.out.println(s3);
        long depositMoney=8988888889897l;
        System.out.println("Money in my account : "+depositMoney);
        //decimal digits-float double
        float f1=786.9876f;
        System.out.println(f1);

        double division=10/3d;
        System.out.println(division);

        //boolean
        boolean b1=true;
        boolean b2=false;
        System.out.println("Test Passed"+b1);
        System.out.println("Test Faile"+b2);
        System.out.println(10<20);

        //char
        char c1='A';
        char c2='B';
        System.out.println(c1);
        System.out.println(c2);
        //ASCii value
        int value1=c1;
        int value2=c2;
        System.out.println(String.format("Value of %c in ASCII table is %d ",c1,value1));
        System.out.println(String.format("Value of %c in ASCII table is %d ",c2,value2));
        System.out.printf("Value of %c in ASCII table is %d \n",c2,value2);

        //High level  industry standart
        int a=100;
        int b=200;
        System.out.println(a+b);
        System.out.printf("%d + %d=%d",a,b,a+b);
        System.out.println(a+"+"+b+"="+(a+b));

        String c3="\u0044";
        System.out.println(c3);






    }
}
