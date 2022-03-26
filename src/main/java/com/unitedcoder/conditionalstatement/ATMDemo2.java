package com.unitedcoder.conditionalstatement;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo2 {
    public static void main(String[] args) {
        int pinNumber = 783994;
        int balance = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your pin number: ");
        String password = scanner.next();
        if(StringUtils.isNumeric(password)) {
            if (pinNumber==Integer.parseInt(password)) {
                System.out.println("Your pin number was entered correctly, please select any option: withdraw, check balance, money transfer  ");
                String menu = scanner.next();
                if (menu.equalsIgnoreCase("Withdraw")) {
                    System.out.println("Please enter the amount you want to withdraw: ");
                    int amount1 = scanner.nextInt();
                    if(balance>=amount1) {
                        System.out.println("You have enough money to withdraw!!");
                        System.out.printf("Please take your cash, your account balance now is %d", balance - amount1);
                    }
                    else {
                        System.out.println("You dont have enough money to withdraw!!");
                    }
                } else {
                    System.out.println("Please choose correct menu!!!");
                }
            } else
                System.out.println("Your pin number was incorrect, please enter the correct pin and try again!!!");
        }
        else {
            System.out.println("Please enter digit pin number!!!");
        }
    }
}
