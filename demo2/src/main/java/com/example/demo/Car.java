package com.example.demo;
import java.util.Iterator;


import java.util.Iterator;

public class Car {
    public String name;
    public int speed;
    public boolean condition;

    public Car(String name, int speed, boolean condition) {
        this.name = name;
        this.speed = speed;
        this.condition = condition;
    }
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.condition = false;
    }
    @Override
    public String toString() {
        return "Car{" + "name= " + name + "speed= " +speed+'\'' +'}';
    }
}

