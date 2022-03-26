package com.unitedcoder.datatypes;

public class ArgumentsDemo {
    public static void main(String[] args) {
        //args[0] args[1]  args[2]
        int a1=Integer.parseInt(args[0]);
        int a2=Integer.parseInt(args[1]);
        int a3=Integer.parseInt(args[2]);
        int a4=Integer.parseInt(args[3]);
        System.out.println(a4);
        System.out.printf("%d + %d + %d = %d",a1,a2,a3,a1+a2+a3);
    }
}
