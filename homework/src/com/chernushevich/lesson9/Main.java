package com.chernushevich.lesson9;

import com.chernushevich.lesson4.Cat;

public class Main {
    public static void main(String[] args) {

       Garage garage = new Garage();

       Car car1 = new Sedan("Toyota", "Camry", "2020", "Red", "2.5");
       Car car2 = new Sedan("Audi", "100", "1993", "Blue", "2.3");
       Car car3 = new SUV("RAM", "1500", "2021", "Black", "5.7");
       Car car4 = new SUV("Toyota", "Tundra", "2011", "White", "5.7");
       Car car5 = new Truck("IVECO", "Eurostar", "1995", "White", "12.0");
       Car car6 = new Truck("Mercedes-Benz", "Sprinter", "2015", "Silver", "2.2");
       Car car7 = new Coupe("Audi", "AudiTT", "1998", "Black", "1.8");
       Car car8 = new Coupe("MiniCooper", "Coupe", "2012", "Braun", "1.6");
    }
}
