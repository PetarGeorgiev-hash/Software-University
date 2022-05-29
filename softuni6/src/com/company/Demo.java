package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        boolean isTrue = 5 == 5;

        if (isTrue) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
