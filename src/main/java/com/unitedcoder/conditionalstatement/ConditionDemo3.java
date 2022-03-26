package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class ConditionDemo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your score: 0-100");
        int score=scanner.nextInt();
        if(score>=90 && score<=100){
            System.out.println("Good Job!!! Your grade is 'A' Excellent");
        }
        else if(score<90 && score>=80){
            System.out.println("Good, your grade is 'B'");
        }
        else if(score<80 && score>=70){
            System.out.println("Your grade is 'C' ");
        }
        else
            System.out.println("You failed the exam, please work hard!!!");
    }
}
