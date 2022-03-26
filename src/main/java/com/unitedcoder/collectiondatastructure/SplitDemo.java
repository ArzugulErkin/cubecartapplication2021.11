package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String school="United_Coder_School";
        String s1="Hello,World";
        String[] arr=school.split("_");
        //System.out.println(Arrays.toString(arr));
        for(String s:arr){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(arr[1]);

        String[] arr1=s1.split(",");
        for(String s2:arr1){
            System.out.print(s2+" ");
        }

        String name="AABCCBDDB";
        String[] x=name.split("B");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(Arrays.toString(x));
    }
}
