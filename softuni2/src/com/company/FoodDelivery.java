package com.company;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenu * 10.36;
        double fishPrice = fishMenu * 12.40;
        double veganPrice = veganMenu * 8.15;

        double allPrices = chickenPrice + fishPrice + veganPrice;
        double desert = allPrices * 0.20;
        double totalPrice = allPrices + desert + 2.50;
        System.out.printf("%.2f",totalPrice);

    }
}
