package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[] arr1=new int[]{100,200,30,40,10,5};
        int[] arr2=new int[]{20,200,40,50,80,100};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        for(int i=arr2.length-1;i>=0;i--){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        Arrays.fill(arr1,5);
        System.out.println(Arrays.toString(arr1));

       boolean b1= Arrays.equals(arr1,arr2);
       System.out.println(b1);

        //copy two array
        int[] arr3={20,40,10};
        int[] arr4=Arrays.copyOf(arr3,3);
        System.out.println(Arrays.toString(arr4));

        int[] arr5={90,20,100,300};
        int[] arr6=new int[arr5.length];
        for(int i=0;i<arr5.length;i++){
            arr6[i]=arr5[i];
        }
        System.out.println(Arrays.toString(arr6));
        System.out.println(arr6);



    }
}
