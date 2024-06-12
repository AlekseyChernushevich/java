package com.chernushevich.lesson6;

public class Cat extends Animal{
    public Cat (String food, String location){
        super(food, location);
    }
    @Override
    public void makeNoise (){
        System.out.println("Кот мяукает ");
    }
    @Override
    public void eat () {
    System.out.println("Кот ест " + getFood());
    }
    @Override
    public void sleep() {
    System.out.println("Кот урчит в " + getLocation());
    }

    }
