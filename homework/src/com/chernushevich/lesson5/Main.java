package com.chernushevich.lesson5;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        String[][] matrix = new String[10][10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int index = i * 10 + j;
                if ((index + 1) % 3 == 0) {
                    matrix[i][j] = randomDouble(random);
                } else {
                    matrix[i][j] = randomString(random);
                }
            }
        }
        System.out.println("Матрица:");
        printMatrix(matrix);
    }

    public static String randomDouble(Random random) {
        double number = random.nextDouble() * 10;
        return String.format("%.5f", number);
    }

        public static String randomString(Random random) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] text = new char[7];
        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(characters.length());
            text[i] = characters.charAt(index);
        }
        return new String(text);
    }

    public static boolean compareDiagonals(String[] diag1, String[] diag2) {
        for (int i = 0; i < diag1.length; i++) {
                     try {
                double num1 = Double.parseDouble(diag1[i]);
                double num2 = Double.parseDouble(diag2[i]);
                if (num1 != num2) {
                    return false;
                }
            } catch (NumberFormatException e) {
               if (!diag1[i].equals(diag2[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }

}


