package com.unitedcoder.oopsconcept.interfaceconcept;

public class HSBCBank implements USBank,BrazilBank{
    @Override
    public void credit() {
        System.out.println("HSBC------Credit");
    }

    @Override
    public void debit() {
        System.out.println("HSBC-----Debit");
    }

    @Override
    public void transaction() {
        System.out.println("HSBC----transaction");
    }

    @Override
    public void loan() {
        System.out.println("HSBC-----Loan");
    }

    @Override
    public void billUtility() {
        System.out.println("HSBC----billUtility");

    }
}
