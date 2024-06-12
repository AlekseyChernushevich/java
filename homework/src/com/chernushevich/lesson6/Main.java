package com.chernushevich.lesson6;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(" Кости", " Будке");
        Cat cat = new Cat(" Сухой корм", " Доме");
        Horse horse = new Horse(" Сено", " Конюшне");

        dog.makeNoise();
        dog.eat();
        dog.sleep();

        cat.makeNoise();
        cat.eat();
        cat.sleep();

        horse.makeNoise();
        horse.eat();
        horse.sleep();


        Veterinarian veterinarian = new Veterinarian();
       // veterinarian.treatAnimal(dog);
       // veterinarian.treatAnimal(cat);
       // veterinarian.treatAnimal(horse);

        System.out.println();

        Animal[] animals = {
                dog, cat, horse
        };
        System.out.println("Прием у ветеринара:");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
            System.out.println();
        }
    }
}
