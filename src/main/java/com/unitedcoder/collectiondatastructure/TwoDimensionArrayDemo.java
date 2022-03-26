package com.unitedcoder.collectiondatastructure;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {
//        int[][] a1=new int[3][];
//        int[] a2[]={};
        int[][] a={
                {1,2,3,4},
                {9,8,5},
                {10,90,30,40,20},
                {100,90,70,40,2,30}
        };
        System.out.println(a.length);
        System.out.println(a[2].length);
        System.out.println(a[1][1]);//8
        System.out.println(a[2][3]);//40

        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
                sum+=a[i][j];
            }
            System.out.println();
           // System.out.println(sum);
        }
        System.out.println(sum);





    }
}
