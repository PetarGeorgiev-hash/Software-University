package com.company;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toysPrice = Integer.parseInt(scanner.nextLine());
        int toysCount = 0;
        double savedMoney = 0;
        double allMoney = 0;
        int brother = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney = savedMoney + 10;
                allMoney = allMoney + savedMoney;
                brother++;
            } else {
                toysCount += 1;
            }
        }
        double toysSum = toysPrice * toysCount;
        double totalMoney = allMoney - brother + toysSum;
        double diff = Math.abs(washingMachinePrice - totalMoney);

        if (washingMachinePrice >= totalMoney){
            System.out.printf("No! %.2f",diff);
        }else {
            System.out.printf("Yes! %.2f",diff);
        }
    }
}
