package com.company;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketPrice = 0;

        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
                ticketPrice = 12;
                break;
            case "Tuesday":
                ticketPrice = 12;
                break;
            case "Wednesday":
                ticketPrice = 14;
                break;
            case "Thursday":
                ticketPrice = 14;
                break;
            case "Friday":
                ticketPrice = 12;
                break;
            case "Saturday":
                ticketPrice = 16;
                break;
            case "Sunday":
                ticketPrice = 16;
                break;
        }
        System.out.println(ticketPrice);
    }
}
