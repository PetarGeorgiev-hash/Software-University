package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        while (true){
            int newNum = Integer.parseInt(scanner.nextLine());
            totalSum += newNum;
            if (totalSum >= num){
                break;
            }
        }
        System.out.println(num);
    }
}
