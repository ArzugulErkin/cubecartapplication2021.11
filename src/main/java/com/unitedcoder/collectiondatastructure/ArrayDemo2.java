package com.unitedcoder.collectiondatastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr1=new int[]{10,30,20,45,60,100};
        System.out.println(arr1[2]);
        System.out.println(arr1[4]);
        System.out.println(arr1.length);
        int[] arr2={80,90,100};
        System.out.println(arr2[2]);
        System.out.println(arr2.length);

        //for loop
        int sum=0;
        for(int i=0;i<=arr1.length-1;i++){
            sum+=arr1[i];
        }
        System.out.println(sum);
        //for each loop
        int sum1=0;
        for(int summary:arr2){
            sum1+=summary;
        }
        System.out.println(sum1);
    }
}
