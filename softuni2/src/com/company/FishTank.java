package com.company;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dlCm = Integer.parseInt(scanner.nextLine());
        int shCm = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int cmlitters = dlCm * shCm * high;
        double cm3 = cmlitters * 0.001;
        double littersNeeded = cm3 - (cm3 * percent / 100);
        System.out.println(littersNeeded);


    }
}
