package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());

        double abs = Math.abs(num1);

        System.out.println(abs);

    }
}
