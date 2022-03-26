package com.unitedcoder.loopdemo;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMLoopDemo {
    public static void main(String[] args) {
        int pinNumber=12345;
        int balance=1000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your pin number: ");
        int chance=3;

        int i=0;
        do{
            i++;
            String password=scanner.nextLine();
            if(StringUtils.isNumeric(password)&&pinNumber==Integer.parseInt(password)){
                System.out.println("Please enter withdraw amount....");
                int money=scanner.nextInt();
                if(money<balance){
                    System.out.println("Please take the cash...");
                    System.out.println("Your balance was: "+(balance-money));
                }
                else {
                    System.out.println("You dont have enough money");
                }
                break;
            }
            else {
                System.out.println("Your pin number is incorrect(or invalid) please try again");
                System.out.println(String.format("This is %d times you are trying, you only can try %d time",i,chance-i));
            }
        }while (i<chance);
    }
}
