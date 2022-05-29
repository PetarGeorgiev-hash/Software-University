package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        boolean isOdd = a % 2 == 1;


        if (isOdd){
            System.out.println("Odd");

        }else {
            System.out.println("Even");
        }
    }
}
