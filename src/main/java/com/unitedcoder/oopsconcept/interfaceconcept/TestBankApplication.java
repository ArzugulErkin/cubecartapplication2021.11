package com.unitedcoder.oopsconcept.interfaceconcept;


public class TestBankApplication {
    public static void main(String[] args) {
        USBank hsbc=new HSBCBank();
        hsbc.credit();
        hsbc.debit();
        hsbc.transaction();
        BrazilBank brazilBank=new HSBCBank();
        brazilBank.billUtility();
        brazilBank.loan();

        HSBCBank hsbcBank=new HSBCBank();

    }
}
