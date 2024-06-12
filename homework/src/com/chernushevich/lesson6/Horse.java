package com.chernushevich.lesson6;

public class Horse extends Animal {
    public Horse(String food, String location) {
        super(food, location);
    }
    @Override
    public void makeNoise (){
        System.out.println("Лошадь ржет");
    }
    @Override
    public void eat (){
        System.out.println("Лошадь жует" + getFood());
    }
   @Override
   public void sleep() {
        System.out.println("Лошадь сопит в" + getLocation());
    }
}
