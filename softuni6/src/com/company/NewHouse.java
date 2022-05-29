package com.company;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double totalPrice = 0;

        switch (flowerType){
            case "Roses":
                price = 5;
               totalPrice = count * price ;
                if (count > 80){
                   totalPrice = totalPrice - totalPrice * 0.10;
                }
                break;
            case "Dahlias":
                price = 3.80;
                totalPrice = count * price ;
                if (count > 90){
                    totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Tulips":
                price = 2.80;
                totalPrice = count * price ;
                if (count > 80){
                   totalPrice = totalPrice - totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                price = 3;
                totalPrice = count * price ;
                if (count < 120){
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                price = 2.50;
                totalPrice = count * price ;
                if (count < 80){
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;

        }if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,flowerType,budget - totalPrice);
        }else {
            System.out.printf("Not enough money, you need %0.2f leva more.",totalPrice - budget);
        }
    }
}
