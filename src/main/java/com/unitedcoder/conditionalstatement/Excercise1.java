package com.unitedcoder.conditionalstatement;

public class Excercise1 {
    public static void main(String[] args) {
        // && &
        boolean b1=false;
        int number=100;
        if(b1&&(number++ >0)){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
        System.out.println("Value of number is : "+number);

        int number1=100;
        if(b1&(number1++>0)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Value of number 1 is: "+number1);
    }
}
