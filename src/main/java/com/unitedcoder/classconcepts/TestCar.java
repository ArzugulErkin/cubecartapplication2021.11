package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static void main(String[] args) {
        Car BMW=new Car();
        BMW.setBrand("BMW");
        BMW.setMade("German");
        BMW.setColor("Black");
        BMW.setPrice(50000);
        BMW.setYear(2021);
        BMW.setModel("X6");
        Car benz=new Car();
        benz.setBrand("benz");
        benz.setMade("German");
        benz.setColor("white");
        benz.setPrice(30000);
        benz.setYear(2021);
        benz.setModel("S300");
        Car honda=new Car();
        honda.setBrand("honda");
        honda.setMade("Japan");
        honda.setColor("Green");
        honda.setPrice(30000);
        honda.setYear(2021);
        honda.setModel("S300");
        List<Car> cars=new ArrayList<>();
        cars.add(BMW);
        cars.add(benz);
        cars.add(honda);

        for(Car car:cars){
            if(car.getMade().equalsIgnoreCase("japan")) {
               // System.out.println(car);
            }
        }

    //   System.out.println(BMW.getBrand());
//        System.out.println(BMW.getColor());
//        System.out.println(BMW.getMade());
//        System.out.println(BMW.getPrice());
//        System.out.println(BMW.getYear());
//        System.out.println(BMW);

    }
}
