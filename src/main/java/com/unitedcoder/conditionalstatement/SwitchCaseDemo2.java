package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class SwitchCaseDemo2 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Please enter the month you are in: ");
        int month=data.nextInt();
            switch (month){
                case 3:
                case 4:
                case 5:
                    System.out.println("You are in the Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("You are in the Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("You are in the Autumn");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("You are in the Winter");
                    break;
                default:
                    System.out.println("The number is grater than or equal to 1000");
            }

    }
}
