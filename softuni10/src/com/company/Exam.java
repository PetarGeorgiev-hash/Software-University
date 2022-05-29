package com.company;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGrades = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        int poorGradesCount = 0;
        double gradesCount = 0;
        int allGrades = 0;

        while (!problem.equals("Enough")) {
            String currentProblem = problem;
            double grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                poorGradesCount++;
            }
            if (poorGradesCount >= poorGrades) {
                System.out.printf("You need a break, %d poor grades.", poorGradesCount);
                break;
            }
            allGrades += grade;
            gradesCount++;
            problem = scanner.nextLine();
            grade = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Average score: %f%n", allGrades / (poorGrades + gradesCount));
        System.out.printf("Number of problems: %.0f%n", gradesCount + poorGradesCount);
        System.out.printf("Last problem: %s", problem);




}
}