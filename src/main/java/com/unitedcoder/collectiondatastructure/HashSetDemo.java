package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(20);
        set1.add(10);
        set1.add(100);
        set1.add(50);
        set1.add(200);
        set1.add(200);
        set1.add(20);
        System.out.println(set1);
        System.out.println(set1.size());

        Object[] array=set1.toArray();
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
