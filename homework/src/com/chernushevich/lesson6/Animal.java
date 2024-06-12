package com.chernushevich.lesson6;

public class Animal {
   private String food;
   private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
        System.out.println("Какое-то животное шумит");
    }
    public void eat (){
        System.out.println("Какое-то животное ест");
    }
    public void sleep (){
        System.out.println("Какое-то животное спит");
    }


    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }
  }
