package com.unitedcoder.oopsconcept.abstractclass;

import com.unitedcoder.oopsconcept.interfaceconcept.USBank;

public class ICICBank extends Bank implements USBank {
    @Override
    public void loan() {
        System.out.println("Bank loan....");
    }

    @Override
    public void transaction() {

    }
}
