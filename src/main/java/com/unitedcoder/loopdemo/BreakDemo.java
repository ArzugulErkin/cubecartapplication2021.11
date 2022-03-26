package com.unitedcoder.loopdemo;

public class BreakDemo {
    public static void main(String[] args) {
        int i=0;
        for(i=1;i<10;i++){
            if(i>6){
                break;
            }
            System.out.println(i);
    }
        System.out.println(i);
        //1 2 3
        //4 8
        for(int j=1;j<=10;j++){
            if(j%4==0){
                break;
            }
            System.out.println(j);
        }
    }
}
