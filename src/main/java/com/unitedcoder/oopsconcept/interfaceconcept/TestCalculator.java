package com.unitedcoder.oopsconcept.interfaceconcept;

public class TestCalculator {
    public static void main(String[] args) {
        ISimpleCalculater calculater=new Calculator();
        IScientificCalculator calculator1=new Calculator();
        calculater.addTwoNumbers(100,200);
        System.out.println(calculater.divideTwoNumbers(10,0));
        System.out.println(10/0);
        calculater.multiplyTwoNumbers(20,90);
        calculater.substractTwoNumbers(90,20);
        System.out.println("Scientific Calculator result----**************");
        System.out.println(calculator1.calculateAbsoluteValue(-30));
        System.out.println(calculator1.calculatePower(10,2));
        System.out.println(calculator1.calculateSquareRoot(9));
    }
}
