package com.unitedcoder.javamethods;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.addTwoNumbers(200,400));
        calculator.calculatorInfo();
        System.out.println(calculator.addTwoNumbers("900","800"));
        System.out.println(calculator.addMultipleNumbers(100,20,30,90,70,60,40,30));
        Calculator.staicSum(100,200);

    }
}
