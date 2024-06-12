package com.chernushevich.lesson6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("Животное ест: " + animal.getFood());
        System.out.println("Животное находится в: " + animal.getLocation());
    }
}
