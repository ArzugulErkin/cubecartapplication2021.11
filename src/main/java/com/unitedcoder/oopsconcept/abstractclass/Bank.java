package com.unitedcoder.oopsconcept.abstractclass;

public abstract class Bank {
    int i=100;
    final int i1=200;
    final static int i3=400;

    public abstract void loan();
    public void credit(){
        System.out.println("Bank credit.......");
    }
    public void debit(){
        System.out.println("Bank debit......");
    };
}
