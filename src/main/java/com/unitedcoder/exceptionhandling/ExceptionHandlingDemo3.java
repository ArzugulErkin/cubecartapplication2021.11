package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{5, 10, 20};
            System.out.println(arr[4]);
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Hello");
        }

    }
}
