package com.chernushevich.lesson8practic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Миша", "Арх", 2, Arrays.asList(4, 5, 2, 4, 3)));
        students.add(new Student("Маша", "Стр", 2, Arrays.asList(2, 4, 2, 3, 2)));
        students.add(new Student("Гриша", "Арх", 3, Arrays.asList(4, 2, 2, 3, 3)));
        students.add(new Student("Леша", "Стр", 1, Arrays.asList(4, 5, 5, 4, 5)));
        students.add(new Student("Паша", "Бух", 2, Arrays.asList(2, 5, 2, 3, 4)));

        System.out.println("Студенты перед отчислением: ");
        students.forEach(System.out::println);

        removeStudentsWithLowGpa(students);

        System.out.println("Студенты после отчисления: ");
        students.forEach(System.out::println);
    }

    public static void removeStudentsWithLowGpa(List<Student> students) {
        students.removeIf(student -> {
            if (student.getAverageGrade() < 3) {
                return true;
            } else {
                students.setCourse(student.getCourse());
                return false;
            }
        }
    }
}