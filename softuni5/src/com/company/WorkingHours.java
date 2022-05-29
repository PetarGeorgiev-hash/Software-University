package com.company;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hours <= 18 && hours >= 10) {
            if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Thursday")
                    || day.equals("Wednesday") || day.equals("Friday") || day.equals("Saturday")) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }else {
            System.out.println("closed");
        }
    }
}
