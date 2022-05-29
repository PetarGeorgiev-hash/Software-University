package com.company;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeMovie = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int counts = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (typeMovie.equals("Premiere")) {
            price = 12;
        }else if (typeMovie.equals("Normal")){
            price = 7.50;
        }else if (typeMovie.equals("Discount")){
            price = 5;
        }
        double totalPrice = rows * counts * price;
        System.out.printf("%.2f leva",totalPrice);
    }
}
