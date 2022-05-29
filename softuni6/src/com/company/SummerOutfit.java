package com.company;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfTheDay = scanner.nextLine();
        String outfit = null;
        String shoes = null;
        if (degrees >= 10 && degrees <= 18 && timeOfTheDay.equals("Morning")) {
            outfit = "Sweatshirt";
            shoes = "Sneakers";
        } else if (degrees >= 18 && degrees <= 24 && timeOfTheDay.equals("Morning")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 25 && timeOfTheDay.equals("Morning")) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        }

        if (degrees >= 10 && degrees <= 18 && timeOfTheDay.equals("Afternoon")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 18 && degrees <= 24 && timeOfTheDay.equals("Afternoon")) {
            outfit = "T-Shirt";
            shoes = "Sandals";
        }else  if (degrees >=25  && timeOfTheDay.equals("Afternoon")){
            outfit = "Swim Suit";
            shoes = "Barefoot";
        }

        if (degrees >= 10 && degrees <= 18 && timeOfTheDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        } else if (degrees >= 18 && degrees <= 24 && timeOfTheDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }else  if (degrees >=25  && timeOfTheDay.equals("Evening")){
            outfit = "Shirt";
            shoes = "Moccasins";
        }
     System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}