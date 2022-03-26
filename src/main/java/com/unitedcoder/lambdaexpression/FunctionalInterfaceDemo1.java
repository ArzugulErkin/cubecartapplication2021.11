package com.unitedcoder.lambdaexpression;

@FunctionalInterface
public interface FunctionalInterfaceDemo1 {
    void book();
}

//class Test implements FunctionalInterfaceDemo1 {
//
//    @Override
//    public void book() {
//        System.out.println("Reading book......");
//    }
//}

class TestClass {
    public static void main(String[] args) {
//        FunctionalInterfaceDemo1 demo1 = new Test();
//        demo1.book();
        FunctionalInterfaceDemo1 demo1=()-> System.out.println("I am Reading.....");
        demo1.book();

    }
}
