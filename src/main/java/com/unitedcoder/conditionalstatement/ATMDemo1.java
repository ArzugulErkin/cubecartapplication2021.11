package com.unitedcoder.conditionalstatement;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {
        int pinNumber = 783994;
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pin number: ");
        int x = scanner.nextInt();
        if (x == pinNumber) {
            System.out.println("Your pin number was entered correctly, please select any option: withdraw, check balance, money transfer  ");
            String menu = scanner.next();
            if (menu.equalsIgnoreCase("Withdraw")) {
                System.out.println("Please enter the amount you want to withdraw: ");
                int amount1 = scanner.nextInt();
                System.out.printf("Please take your cash, your account balance now is %d", balance - amount1);
            }
            else {
                System.out.println("Please choose correct menu!!!");
            }
        }
        else
            System.out.println("Your pin number was incorrect, please enter the correct pin and try again!!!");

    }
}
