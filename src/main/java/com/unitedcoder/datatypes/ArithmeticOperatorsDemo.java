package com.unitedcoder.datatypes;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        //calculate rectangle area  Premier of rectangle
      int width=40;
      int height=35;
      int area=width*height;
      int premier=2*(width+height);
      System.out.println("Area of rectangle is: "+area);
      System.out.println("Premier of rectangle is: "+premier);

      //division
       // System.out.println(10/0);
        float division=(float)width/height;
        System.out.println(division);
        //% reminder
        System.out.println(5%3);

        // ++ increment  -- decrement
        int number=100;
        number++;//101
        System.out.println(number);
        ++number;//102
        System.out.println(number);
        number--;
        System.out.println(number);
        --number;
        System.out.println(number);
        number+=7;//number=number+2
        number*=2;
        System.out.println(number);
        number/=2;
        System.out.println(number);


    }

}
