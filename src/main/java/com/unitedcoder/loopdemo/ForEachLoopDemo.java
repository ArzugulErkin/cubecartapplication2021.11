package com.unitedcoder.loopdemo;


public class ForEachLoopDemo {
    public static void main(String[] args) {

        int sum=0;
        for(int i=0;i<4;i++){
            sum+=Integer.parseInt(args[i]);//args[4]
            System.out.println(String.format("i=%d  args=%s sum=%d",i,args[i],sum));
        }
        System.out.println(sum);


        //for each loop
        int sum1=0;
         for(String values:args){
             sum1+=Integer.parseInt(values);
         }
        System.out.println(sum1);


    }
}
