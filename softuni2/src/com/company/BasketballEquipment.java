package com.company;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        double sneakers = yearTax - (yearTax*0.40);
        double suit = sneakers - (sneakers*0.20);
        double ball = suit / 4;
        double accessories = ball / 5;
        double fullPrice = yearTax + sneakers + suit + ball + accessories;
        System.out.println(fullPrice);


    }
}
