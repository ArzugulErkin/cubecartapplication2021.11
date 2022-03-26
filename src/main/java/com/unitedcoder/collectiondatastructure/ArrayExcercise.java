package com.unitedcoder.collectiondatastructure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcercise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int length=scanner.nextInt();
        int[] arr=new int[length];
        //int maxValue=0;
        int minValue=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
            if(i==0){
            minValue=arr[0];}
//            if(maxValue<arr[i]){
//                maxValue=arr[i];
//            }
            if(minValue>arr[i]){
                minValue=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(maxValue);
        System.out.println(minValue);



    }
}
