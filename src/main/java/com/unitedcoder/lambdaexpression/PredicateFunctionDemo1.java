package com.unitedcoder.lambdaexpression;

import java.util.function.Predicate;

public class PredicateFunctionDemo1 {
    public static void main(String[] args) {
        //given value is greater than 90 or not
        Predicate<Integer> predicate=p->(p>90);
        System.out.println(predicate.test(200));

        Predicate<String> p1=s->(s.length()>4);
        System.out.println(p1.test("Selenium"));
        System.out.println(p1.test("City"));
        System.out.println(p1.test("Turkey"));
    }
}
