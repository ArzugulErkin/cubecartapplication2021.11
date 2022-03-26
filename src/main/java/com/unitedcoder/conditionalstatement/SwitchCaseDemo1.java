package com.unitedcoder.conditionalstatement;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Please enter number: ");
        String number=data.next();
        if(StringUtils.isNumeric(number)){
            int length=number.length();
            switch (length){
                case 1:
                    System.out.println("The number is between 0-9");
                    break;
                case 2:
                    System.out.println("The number is between 10-99");
                    break;
                case 3:
                    System.out.println("The number is between 100-999");
                    break;
                default:
                    System.out.println("The number is grater than or equal to 1000");
            }
        }
        else {
            System.out.println("Please enter numeric number");
        }

    }
}
