package com.unitedcoder.datatypes;

public class DataTypeConversionDemo1 {
    public static void main(String[] args) {
        //Widening casting-small to large
        int i1=200;
        long l1=i1;
        System.out.println(String.format("i1=%d l1=%d",i1,l1));

        int i2=100;
        double d1=i2;
        System.out.printf("i2=%d d1=%.1f \n",i2,d1);

        char c=8;
        int i3=c;
        System.out.printf("i3=%d \n",i3);
        System.out.println(c+10);

        //narrowing casting
        int i4=65;
        char c1=(char)i4;
        System.out.println(c1);

        long l2=2147483646l;
        int i5=(int)l2;
        System.out.printf("i5=%d \n",i5);

        //Convert numeric String to primitive data types
        String s1="100";
        System.out.println(s1+100);
        int i6=Integer.parseInt(s1);
        System.out.printf("i6=%d \n",i6);
        System.out.println(i6+100);

        String price1="$20";
        String price2="$30";
        price1=price1.replace("$","");
        price2=price2.replace("$","");
        System.out.println("Price 1 after replace: "+price1);
        System.out.println("Price 2 after replace: "+price2);
        int i7=Integer.parseInt(price1);
        int i8=Integer.parseInt(price2);
        int sum=i7+i8;
        System.out.println("Sum price of the two products are: "+sum);

        byte b1=Byte.parseByte(price1);
        long l7=Long.parseLong(price2);

        String s2="true";
        String s3="false";
        boolean b2=Boolean.parseBoolean(s2);
        b2=10>20;
        System.out.println(b2);


        System.out.println(Integer.toBinaryString(1234));
        System.out.println(Integer.toHexString(1234));
        System.out.println(Integer.toOctalString(1234));
        Integer i=1000;//Integer.valueOf(1000)
        Integer i9=new Integer(1000);


    }
}
