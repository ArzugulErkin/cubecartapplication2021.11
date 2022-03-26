package com.unitedcoder.loopdemo;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        //1-100
        int i=1;
        do{
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }while (i<=100);
        System.out.println();
        //do while loop -- code at least execute one time
        int num1=100;
        while (num1>100){
            System.out.println(num1);
            num1--;
        }

        int num2=100;
        do{
            System.out.println(num2);
            i--;
        }while (num2>100);

    }
}
