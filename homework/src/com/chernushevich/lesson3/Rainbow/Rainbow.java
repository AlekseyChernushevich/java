package com.chernushevich.lesson3.Rainbow;

import java.util.Scanner;

public class Rainbow {
    private final Scanner scanner = new Scanner(System.in);


    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int CYAN = 5;
    private static final int BLUE = 6;
    private static final int VIOLET = 7;


    // public void start() {
    // printColor(3);
    // }


    public static void printColor(int color) {
        switch (color) {
            case 1:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("ORANGE");
                break;
            case 3:
                System.out.println("YELLOW");
                break;
            case 4:
                System.out.println("GREEN");
                break;
            case 5:
                System.out.println("CYAN");
                break;
            case 6:
                System.out.println("BLUE");
                break;
            case 7:
                System.out.println("VIOLET");
                break;
            default:
                System.out.println("Нет " + color + " цветов радуги");
        }
    }

    public void colorSelection() {
        System.out.println("Хочешь выбрать один цвет радуги - нажми 1");
        System.out.println("Хочешь выбрать смешанный цвет радуги - нажми 2");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Что выбираешь:   ");
        if (scanner.hasNextInt()) {
            int meaning = scanner.nextInt();

            if (meaning == 1) {
                System.out.println("Выбери цвет:   ");
                int color = scanner.nextInt();
                printColor(color);
            } else if (meaning == 2) {
                System.out.println("Выбери 2 цвета:   ");
                int color1 = scanner.nextInt();
                int color2 = scanner.nextInt();
            }
        }
    }

    public void colorMixture(int color1, int color2) {
        switch (color1) {
            case RED:
                System.out.println(RED);
                break;
// тут чтото уже не выходит смесь цветов делать...



        }
    }


}
