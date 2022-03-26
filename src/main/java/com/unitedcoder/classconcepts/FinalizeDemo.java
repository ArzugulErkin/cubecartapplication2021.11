package com.unitedcoder.classconcepts;

public class FinalizeDemo {
    public void finalize(){
        System.out.println("Garbage Collected, cleaned");
    }

    public static void main(String[] args) {
        FinalizeDemo f1=new FinalizeDemo();
        FinalizeDemo f2=new FinalizeDemo();
        f1=null;//unreferrenced object
        f2=null;
        System.gc();
    }
}
