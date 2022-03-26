package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        // given 3 numbers
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        //100 200 300
        if(number1>number2&&number1>number3){
            System.out.printf("%d is the biggest number \n",number1);
        }
        else if(number2>number3){
            System.out.printf("%d is the biggest number \n",number2);
        }
        else {
            System.out.printf("%d is the biggest number ",number3);
        }
    }
}
