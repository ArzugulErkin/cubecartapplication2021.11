package com.unitedcoder.datatypes;

public class JavaOperators {
    public static void main(String[] args) {
        int x=1000;
        x+=1000;//x=x+1000
        System.out.println(x);
        x*=2;//x=x*2
        System.out.println(x);
        x-=1000;//x=x-1000
        System.out.println(x);
        x/=5;//x=x/5
        System.out.println(x);
        x-=11;
        System.out.println(x);
        x%=2;//x=x%2
        System.out.println(x);
        //comparison operators
        int i1=1000;
        int i2=2000;
        System.out.println(i1==i2);//false
        System.out.println(i1!=i2);//true
        System.out.println(i1>i2);//false
        System.out.println(i1<i2);//true
        System.out.println(i1>=i2);//false
        System.out.println(i1<=i2);//true

        //logical operators
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(!(b1&&b2));
        System.out.println(b1&&b3);

        int number1=100;
        int number2=200;
        boolean result1=(number1==number2)&&(number1==number2);
        boolean result2=(number1!=number2)&&(number1==number2);
        System.out.println(result1);
        System.out.println(result2);
        //bitwise operator
        byte b4=101;
        byte b5=100;
        System.out.println(b4&b5);
        System.out.println(b4|b5);


    }
}
