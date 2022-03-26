package com.unitedcoder.oopsconcept.inheritanceconcept;

public class TestCar {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        bmw.stop();
        bmw.theftSafety();
        bmw.refuel();

        Car c=new Car();
        c.start();
        c.stop();
        c.refuel();

        Car car=new BMW();//Top casting  run time polymorphism
        car.start();
        car.stop();
        car.refuel();

        BMW bmw1=(BMW)new Car();//down casting
    }
}
