package com.company;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double pr = Double.parseDouble(scanner.nextLine());
        double result = deposit + months *((deposit * pr /100)/12);
        System.out.println(result);


    }
}
