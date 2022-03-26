package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //define an integer array
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=15;
        arr[3]=35;
        arr[4]=40;
        arr[5]=50;
        System.out.println(arr[5]);
        System.out.println(arr[3]);
        System.out.println(arr.length);

        //for loop
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //for each loop
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}
