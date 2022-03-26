package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(30);
        set1.add(10);
        set1.add(40);
        set1.add(20);
        set1.add(70);
        set1.add(100);
        System.out.println(set1);
        Set<Integer> set2=new TreeSet<>();
        set2.add(30);
        set2.add(10);
        set2.add(40);
        set2.add(20);
        set2.add(70);
        set2.add(100);
        System.out.println(set2);
        Set<Integer> set3=new LinkedHashSet<>();
        set3.add(30);
        set3.add(10);
        set3.add(40);
        set3.add(20);
        set3.add(70);
        set3.add(100);
        System.out.println(set3);
    }
}
