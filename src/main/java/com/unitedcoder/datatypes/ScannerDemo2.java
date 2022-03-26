package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your school name: ");
        String schoolName=input.nextLine();
        System.out.println("Please enter your achool address : ");
        String address=input.next();
        System.out.println("Please enter your school zip code: ");
        String zipCode=input.next();
        System.out.printf("Your School Full address is %s %s %s",schoolName,address,zipCode);
    }
}
