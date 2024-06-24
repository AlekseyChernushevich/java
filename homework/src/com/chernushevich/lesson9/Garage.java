package com.chernushevich.lesson9;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map <Car,Integer> cars;

    public Garage(){
        cars = new HashMap<>();
    }
    public void addCar(Car car) {
        cars.put(car, cars.getOrDefault(car,0) + 1);
    }






    }
}
