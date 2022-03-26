package com.unitedcoder.classconcepts;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    //class level variable  global variable
    private String color;
    private String brand;
    private long price;
    private String model;
    private String made;
    private int year;

    public void carStart(){
        System.out.println("Car start......");
    }
    //default  constructor without argumnet
    public Car() {
        //System.out.println("Car is coming!!!!");
    }

    public Car(String color, String brand, long price, String model, String made, int year) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.made = made;
        this.year = year;
    }

    public Car(String color, String brand, long price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public Car(String color, String brand, long price, String model) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    //define public getter and setter method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", brand='" + brand + '\'' +
//                ", price=" + price +
//                ", model='" + model + '\'' +
//                ", made='" + made + '\'' +
//                ", year=" + year +
//                '}';
        return brand+", "+made+", "+color+", "+price+", "+model+", "+year;
    }

    @Override
    public int compareTo(Car car) {
        if(price==car.price)
        return 0;
        else if(price>car.price)
            return 1;
        else
            return -1;
    }
}
