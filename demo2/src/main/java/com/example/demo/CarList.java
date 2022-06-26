package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Component
public class CarList {

    private List<Car> listOfFixedCars;
    private List<Car> listOfBrokenCars;

    private CarList(){
        this.listOfBrokenCars = new ArrayList<>();
        this.listOfFixedCars = new ArrayList<>();
    }

    public void addCar(Car auto){
        System.out.println("dodano nowe auto "+auto.toString());
        listOfBrokenCars.add(auto);
    }

    public int carQuantityToFix(){
        System.out.println("liczba zepsutych aut "+listOfBrokenCars.size());
        return listOfBrokenCars.size();
    }
    public int carQuantityFixed(){
        System.out.println("liczba Nnaprawionyc aut "+listOfFixedCars.size());
        return listOfFixedCars.size();
    }
    public int carQuantity(){
        System.out.println("liczba wszystkich aut "+ (listOfFixedCars.size()+listOfBrokenCars.size()));
        return listOfFixedCars.size()+listOfBrokenCars.size();
    }

    public void carRapairment (String carName) {
        for (Car car : listOfBrokenCars) {
            if (car.name.equals(carName)) {
                car.condition = true;
                listOfFixedCars.add(car);
                listOfBrokenCars.remove(car);
                System.out.println(carName +" zostało naprawione");
            }
            else {
                System.out.println("Brak auta na warsztacie");
            }
        }
    }
//    public List<Car> viewAllCars() {
//        while (iterator.hasNext())
//        return (List<Car>) iterator.next();
//        return null;
//    }
//
//    Iterator<Car> iterator = listOfFixedCars.iterator();
}
