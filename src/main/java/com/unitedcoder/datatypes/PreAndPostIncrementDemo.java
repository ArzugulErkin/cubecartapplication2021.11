package com.unitedcoder.datatypes;

public class PreAndPostIncrementDemo {
    public static void main(String[] args) {
        // Pre increment : first plus one and then perform the operation
        int a=100;
        int b=100+(++a);//a=101 b=201
        int c=++a;//a=102   c=102
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //post increment: first perform the operation and then plus one
        int x=200;
        int y=100+(x++);//y=300
        int z=x++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        int z1=x;
        System.out.println(z1);

         int m=10;
         int n=++m;
         int s=++m+200;
        System.out.println(m);//12
        System.out.println(n);//11
        System.out.println(s);//212

        int b1=20;
        int b2=b1++;
        int b3=(b1++)+300;
        System.out.println(b1);//22
        System.out.println(b2);//20
        System.out.println(b3);//321

        //Pre decrement int a=100;
        int p1=100;
        int p2=--p1;
        System.out.println(p1);
        System.out.println(p2);
        //Post decrement
        int f1=200;
        int f2=f1--;
        System.out.println(f1);
        System.out.println(f2);



    }
}
