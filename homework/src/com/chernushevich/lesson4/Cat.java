package com.chernushevich.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat {
    private String name;
    private int age;

    private RandomCatName randomCatName = new RandomCatName();

//    public static class RandomCatName {
//        private final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        private static final int Name_Length = 8;
//
//
//        private static String generateRandomCatName(RandomCatName randomCatName) {
//            for (int i = 0; i < Name_Length; i++) {
//                int i = random.nextInt(alphabet.length());
//            }
//        }
//    }
        public Cat() {
            String[] catNames = {"Мурзик", "Барсик", "Пушок", "Симба", "Том", "Лео", "Рыжик", "Гарфилд"};
            Random random = new Random();
            int randomNameIndex = random.nextInt(catNames.length);
            this.name = catNames[randomNameIndex];
            this.age = 1 + random.nextInt(28);
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static void firstCycle() {
            System.out.println("Задание п.4");
            Cat cat;
            int counter = 0;
            while (counter < 10) {
                cat = new Cat();
                System.out.println(cat.toString());
                counter++;
            }
        }

        public static void secondCycle() {
            System.out.println("Задание п.5");
            Cat cat;
            for (int i = 0; i < 10; i++) {
                cat = new Cat();
                cat.setName("Мурзик");
                cat.setAge(10);
                System.out.println("Имя = " + cat.getName() + " Возраст = " + cat.getAge());
            }
        }

        public static void thirdCycle() {
            System.out.println("Задание п.6");
            Cat cat;
            int i = 0;
            do {
                cat = new Cat("Мурзик", 11);
                System.out.println(cat.toString());
                i++;
            } while (i < 10);
        }

        public static void fourthCycle() {
            System.out.println("Задание п.7");
            List<Cat> cats = new ArrayList<>();
            cats.add(new Cat("Мурзик", 3));
            cats.add(new Cat("Барсик", 5));
            cats.add(new Cat("Пушок", 13));
            cats.add(new Cat("Том", 10));
            cats.add(new Cat("Лео", 15));
            for (Cat cat : cats) {
                System.out.println("Имя = " + cat.getName() + " Возраст = " + cat.getAge());
            }
        }

        public static void start() {
            firstCycle();
            secondCycle();
            thirdCycle();
            fourthCycle();
        }
    }
