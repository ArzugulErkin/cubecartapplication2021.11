package com.unitedcoder.oopsconcept.interfaceconcept;


public class Calculator implements ISimpleCalculater,IScientificCalculator {
    @Override
    public double calculatePower(int base, int power) {
        double power1= Math.pow(base,power);
        return power1;
    }

    @Override
    public double calculateSquareRoot(long l) {
        double s=Math.sqrt(l);
        return s;
    }

    @Override
    public double calculateAbsoluteValue(int x) {
        double abs=Math.abs(x);
        return abs;
    }

    @Override
    public double addTwoNumbers(double d1, double d2) {
        double sum=d1+d2;
        System.out.println(String.format("%.2f+%.2f=%.2f",d1,d2,sum));
        return sum;
    }

    @Override
    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*i2;
        System.out.println(String.format("%d*%d=%d",i1,i2,result));
        return result;
    }

    @Override
    public long substractTwoNumbers(long l1, long l2) {
        System.out.println(String.format("%d-%d=%d",l1,l2,l1-l2));
        return l1-l2;
    }

    @Override
    public double divideTwoNumbers(double d1, double d2) {
        if(d2!=0){
            float f=(float)(d1/d2);
            return f;
        }
        else {
            System.out.println("Your denominator is Zero!!");
            return 0;
        }
    }
}
