package com.company;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendStreak = 0;
        int totalDays = 0;
        double totalMoney = currentMoney;
        boolean cantSaveMoney = false;

        while (totalMoney < moneyNeeded) {
            totalDays++;
            String saveOrSpend = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            switch (saveOrSpend) {
                case "save":
                    spendStreak = 0;
                    totalMoney = totalMoney + money;
                    break;
                case "spend":
                    spendStreak++;
                    totalMoney = totalMoney - money;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
            }
            if (spendStreak == 5) {
                cantSaveMoney = true;
                break;
            }
        }
        if (cantSaveMoney){
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        }else {
            System.out.printf("You saved the money for %d days",totalDays);
        }
    }

}
