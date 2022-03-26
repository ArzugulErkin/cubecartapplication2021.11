package com.unitedcoder.datatypes;


import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //Scanner Object
        Scanner inputValue=new Scanner(System.in);
        System.out.println("Please enter the first digit: ");
        int x1=inputValue.nextInt();
        System.out.println("Please enter the second digit: ");
        int x2=inputValue.nextInt();
        System.out.println("Please enter the third digit: ");
        int x3=inputValue.nextInt();
        System.out.println("Please enter the fourth digit: ");
        int x4=inputValue.nextInt();
        System.out.printf("%d * (%d + %d) * %d=%d",x1,x2,x3,x4,x1*(x2+x3)*x4);
    }
}
