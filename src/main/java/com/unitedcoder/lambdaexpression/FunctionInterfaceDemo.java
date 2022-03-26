package com.unitedcoder.lambdaexpression;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> f1=f->f*f;
        System.out.println(f1.apply(10));
        Function<String,Integer> f2=a->(a.length());
        System.out.println(f2.apply("Code"));
        Function<Integer,Integer> f3=f->f*2;
        System.out.println(f3.andThen(f1).apply(4));
        System.out.println(f3.compose(f3).apply(5));
    }
}
