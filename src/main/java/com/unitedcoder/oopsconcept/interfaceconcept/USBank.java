package com.unitedcoder.oopsconcept.interfaceconcept;

public interface USBank {
    //final static
   int min_balance=1000000;
   //abstract method  no method body
    //all methods by default public
    void credit();
    void debit();
    void transaction();
}
