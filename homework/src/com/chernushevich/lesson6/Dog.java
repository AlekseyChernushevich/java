package com.chernushevich.lesson6;

public class Dog extends Animal {
public Dog (String food, String location){
    super(food, location);
}
@Override
public void makeNoise(){
    System.out.println("Собака громко гавкает");
}
@Override
public void eat(){
    System.out.println("Собака грызет" + getFood());
}
public void  sleep(){
    System.out.println("Собака храпит в" + getLocation());
}
}
