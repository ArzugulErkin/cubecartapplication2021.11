package com.unitedcoder.loopdemo;

import java.util.Scanner;

public class NestedLoopDemo {
    public static void main(String[] args) {
        //* * * * *
//        Scanner scanner=new Scanner(System.in);
//        int x=scanner.nextInt();
//        for(int i=0;i<x;i++) {
//            System.out.println("* * * * *");
//        }

        for(int i=0;i<5;i++){//outter loop presents row  i=0 i=1
            for(int j=0;j<=i;j++){//inner loopr present column  j=0
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for(int i=0;i<5;i++){//outter loop presents row  i=0 i=1
            for(int j=5;j>i;j--){//inner loopr present column  j=0
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("_____________________________________________________________");

        for(int i=0;i<5;i++){//outter loop presents row  i=0 i=1
            int j=5;
            while(j>i){//inner loopr present column  j=0
                System.out.print("* ");
                j--;
            }
            System.out.println();
        }
    }
}
