package com.unitedcoder.datatypes;

import com.unitedcoder.javabasics.Test;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {

        System.out.println(Math.max(200,300));
        System.out.println(Math.min(100,10));
        System.out.println(Math.abs(-30));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(2,3));//2*2*2
        //Random numbers:  0.0    -    0.99999999999
        System.out.println(Math.random());
        //0-10
        int number=(int)(Math.random()*11)+1;
        System.out.println(number);
        Random random=new Random();
        int x=random.nextInt();
        System.out.println(x);







    }
}
