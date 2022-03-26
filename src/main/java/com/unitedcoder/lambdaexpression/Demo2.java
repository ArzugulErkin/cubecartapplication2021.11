package com.unitedcoder.lambdaexpression;

public interface Demo2 {
    void sum(int a,int b);
   //void sum1();
}

class Test{
    public static void main(String[] args) {
        Demo2 demo2=(a,b)-> System.out.println("Sum of the given value is "+(a+b));
        demo2.sum(100,200);
    }
}
