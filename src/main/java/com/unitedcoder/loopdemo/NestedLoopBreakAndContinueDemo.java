package com.unitedcoder.loopdemo;

public class NestedLoopBreakAndContinueDemo {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=10;j++){
                if(j%4==0){
                    //break;
                    continue;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
