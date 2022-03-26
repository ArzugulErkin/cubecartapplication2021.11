package com.unitedcoder.loopdemo;

public class WhileLoopDemo {
    public static void main(String[] args) {

        //1-1000 odd numbers
        int i=1;
        int oddNumbersCount=0;
        while(i<=1000){
            if(i%2!=0){
                System.out.print(i+" ");
                oddNumbersCount++;
            }
            i++;
        }
        System.out.println();
        System.out.println(i);
        System.out.println(oddNumbersCount);






    }
}
