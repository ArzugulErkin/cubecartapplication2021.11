package com.unitedcoder.conditionalstatement;

public class ConditionalDemo1 {
    public static void main(String[] args) {
        int i=100;
        if(i<=100&&i==100){//false
            System.out.println("i is greater than or equal to 100");
        }else{
            System.out.println("i is less than and not equal to 100");
        }

        int x=300;
        if(x==200){
            System.out.printf("x=%d \n",x);
        }else {
            System.out.println("Unknown!!!");
        }
    }
}
