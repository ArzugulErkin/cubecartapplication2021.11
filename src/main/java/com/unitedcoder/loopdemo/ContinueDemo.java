package com.unitedcoder.loopdemo;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int j=1;j<=10;j++){
            if(j%4==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
