package com.company;

import java.util.Locale;
import java.util.Scanner;

public class frOrVg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruitOrVegetable = scanner.nextLine();
        String lowerCase = fruitOrVegetable.toLowerCase(Locale.ROOT);


        switch (lowerCase){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}