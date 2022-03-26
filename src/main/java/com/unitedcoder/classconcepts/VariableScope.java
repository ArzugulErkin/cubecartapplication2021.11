package com.unitedcoder.classconcepts;



public class VariableScope {
    //Global variable---class level variable
    String s="Name";
    static String name="gjs";
    int age=29;
    int a=100;

    public void printName(){
        System.out.println(s);
        String name="Tom";//local variable
        System.out.println(name);
    }
    public static void sum(int a){
        System.out.println(a+10);
    }
    public void sum1(int a){
        System.out.println(a+100);
    }
    public static void main(String[] args) {
        VariableScope variableScope=new VariableScope();
        System.out.println(name);
        sum(20);
        variableScope.sum1(100);
    }



}
