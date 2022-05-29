package com.company;

import java.util.Scanner;

public class LunchBrake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String show = scanner.nextLine();
        int showTime = Integer.parseInt(scanner.nextLine());
        int brakeTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = brakeTime / 8.0;
        double relaxTime = brakeTime / 4.0;
        double timeLeft = brakeTime - lunchTime - relaxTime;

        double diff = Math.abs(timeLeft - showTime);
        if (timeLeft >= showTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    show,Math.ceil(diff));
        }else {
            System.out.printf("You don't have enough time to watch %s,you need %.0f more minutes."
                    ,show,Math.ceil(diff));
        }
    }
}
