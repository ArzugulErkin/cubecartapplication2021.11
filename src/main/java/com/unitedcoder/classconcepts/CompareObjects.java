package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareObjects {
    public static void main(String[] args) {
        ArrayList<Car> carList=new ArrayList<>();
        carList.add(new Car("White","Toyota",90000,"Rav4","Japan",2022));
        carList.add(new Car("Black","Benz",70000,"S30","German",2025));
        carList.add(new Car("Red","Mercedes",60000,"DE","German",2021));
        //comparable interface  comparator method
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getPrice));
//        System.out.println(carList);
//        carList.sort(Comparator.comparing(Car::getYear).reversed());
        Collections.sort(carList);
        System.out.println(carList);

    }
}
