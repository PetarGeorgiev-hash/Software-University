package com.company;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalReach = 10000;
        int totalSteps = 0;
        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + steps;
                break;
            } else if (totalSteps >= goalReach) {
                break;
            } else {
                int steps = Integer.parseInt(command);
                totalSteps = totalSteps + steps;
            }
        }
        if (totalSteps < goalReach) {
            System.out.printf("%d more steps to reach goal.", Math.abs(totalSteps - goalReach));
        } else if (totalSteps >= goalReach) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - goalReach);
        }
    }
}