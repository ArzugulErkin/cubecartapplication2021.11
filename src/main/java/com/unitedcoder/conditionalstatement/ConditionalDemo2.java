package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class ConditionalDemo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first digit");
        int x=scanner.nextInt();
        System.out.println("Please enter the second digit");
        int y=scanner.nextInt();
        System.out.println("Please enter the third digit");
        int z=scanner.nextInt();
        System.out.println("Please enter the summary of three numbers");
        int sum=scanner.nextInt();
        int b=x+y+z;
        if(b==sum){
            System.out.println("Good job, you calculated correct!!!!");
        }else {
            System.out.println("Uppps, wrong answer, please try again!!!");
        }

    }
}
