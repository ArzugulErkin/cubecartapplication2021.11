package com.unitedcoder.loopdemo;

import java.util.Scanner;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        //sum of 1-100
        int sum=0;
        //int i=1;
        for(int i=1;i<=10;i++){
           sum+=i; //sum=sum+i
            //System.out.printf("i=%d sum=%d \n",i,sum);
        }
        System.out.println(sum);
        //factorial  5=5*4*3*2*1
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        double number=input.nextDouble();
        double factorial=1;
         for(double i=1;i<=number;i++){
             factorial*=i;
         }
        System.out.println(factorial);

         //1-10000 even numbers
        int evenNumberCount=0;
        for(int i=2;i<=10000;i++){
            if(i%2==0){
               evenNumberCount++;
            }
        }
        System.out.println(evenNumberCount);
    }
}
