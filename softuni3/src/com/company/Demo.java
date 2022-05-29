package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double rounded = Math.ceil(num1);
        System.out.println(rounded);
    }
}
