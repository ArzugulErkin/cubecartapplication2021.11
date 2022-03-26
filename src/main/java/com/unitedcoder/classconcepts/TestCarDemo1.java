package com.unitedcoder.classconcepts;

public class TestCarDemo1 {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car c1=new Car("Black","Tesla",800000,"X");
        Car c2=new Car("Red","Mini",40000);
        Car c3=new Car("Yellow","Ferrari",700000);
        cars[0]=c1;
        cars[1]=c2;
        cars[2]=c3;

        for(Car eachCar:cars){
            System.out.println(eachCar.toString());
        }





    }
}
