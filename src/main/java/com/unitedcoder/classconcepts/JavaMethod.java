package com.unitedcoder.classconcepts;

public class JavaMethod {
    public static void main(String[] args) {
       int[] a = new int[]{10, 90, 30, 40, 20, 60, 5};
//        int maxValue = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (maxValue < a[i]) {
//                maxValue = a[i];
//            }
//        }
//        JavaMethod javaMethod=new JavaMethod();
//        javaMethod.findMaxNumberOfAnArray(a);
        System.out.println(findMaxNumberOfAnArray(a));
    }

    public static int findMaxNumberOfAnArray(int[] arr){
        int maxValue=0;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
