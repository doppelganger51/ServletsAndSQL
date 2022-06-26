package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private CarList listOfCars;
    @Value("${konfiguracja.nazwa}")
    public String nazwa;
    @Value("${konfiguracja.czas}")
    public int czas;
    @Value("${konfiguracja.miejsce}")
    public String miejsce;


    @RequestMapping("/ile_w_calosci")
    public int ileMamyAut(){

        return listOfCars.carQuantity();
    }

    @RequestMapping("/ile_zepsutych")
    public int ileMamyZepsutychAut(){

        return listOfCars.carQuantityToFix();
    }

    @RequestMapping("/ile_naprawionych")
    public int ileMamyNaprawionychAut(){

        return listOfCars.carQuantityFixed();
    }

    @RequestMapping(
            value="/addCar",
            method = RequestMethod.GET
    )
    public boolean addCar(@RequestParam("name") String name, @RequestParam("speed") int speed) {
        try {
            listOfCars.addCar(new Car(name, speed));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
//metoda naprawiania auta po jego nazwie
@RequestMapping(
        value="/fixCar",
        method=RequestMethod.GET
)
    public String carRapair (@RequestParam("name")String name) {
        listOfCars.carRapairment(name);
        return (name + "do naprawy");
    }
}



