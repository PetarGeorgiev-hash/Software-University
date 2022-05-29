package com.company;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minOfArrival = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHour * 60 + examMinutes;
        int arrivalTimeInMinutes = hourOfArrival * 60 + minOfArrival;
        int diff = Math.abs(examTimeInMinutes - arrivalTimeInMinutes);

        if (examTimeInMinutes < arrivalTimeInMinutes) {
            System.out.println("Late");
            if (diff >= 60){
                System.out.printf("%d:%02d hours after the start");
            }else {
                System.out.printf("");
            }
        } else if (examTimeInMinutes == arrivalTimeInMinutes || diff <= 30){
            System.out.printf("On Time");
        }else {
            System.out.println("Early");
        }
    }
}
