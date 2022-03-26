package com.unitedcoder.loopdemo;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        //1--1000
        for(int i=1;i<=100;i++){//1 2..1000  1001
            System.out.print(i+" ");
        }
        System.out.println();

     //100-1
        for(int i=100;i>0;i--){
            System.out.print(i+" ");
        }

        //infinite loop
//        for(int i=100;;i--){
//            System.out.print(i+" ");
//        }
        System.out.println();
        //even numbers between 1-1000
        for(int i=1;i<=1000;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=2;i<=1000;i=i+2){
                System.out.print(i+" ");
        }

    }
}
