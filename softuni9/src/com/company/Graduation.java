package com.company;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int classes = 1;
        double sumGrades = 0;
        int poorGrades = 0;
        boolean isExcluded = false;
        while (classes <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (poorGrades == 2) {
                isExcluded = true;
                break;
            }
            if (grade < 4) {
                poorGrades++;
                continue;
            }
            sumGrades = sumGrades + grade;

            classes++;
        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, classes);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades / 12);
        }
    }
}