package com.company;

import java.util.Scanner;

public class TenisRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int wins = 0;
        double pointsFromTour = 0;

        for (int i = 1; i <= n; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    startingPoints += 2000;
                    wins++;
                    pointsFromTour +=2000;
                    break;
                case "F":
                    startingPoints += 1200;
                    pointsFromTour += 1200;
                    break;
                case "SF":
                    startingPoints += 720;
                    pointsFromTour += 720;
                    break;

            }
        }
        double averageWining = Math.floor(pointsFromTour / n);
        double winInPercent = wins * 1.0 / n * 100;
        System.out.printf("Final points: %d%n",startingPoints);
        System.out.printf("Average points %.0f%n",averageWining);
        System.out.printf("%.2f%%",winInPercent);
    }
}
