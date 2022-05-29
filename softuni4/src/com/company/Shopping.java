package com.company;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoney = Double.parseDouble(scanner.nextLine());
        int videoCardBr = Integer.parseInt(scanner.nextLine());
        int processorBr = Integer.parseInt(scanner.nextLine());
        int ramBr = Integer.parseInt(scanner.nextLine());

        double videoCardTotalPrice = 250 * videoCardBr;
        double processorMoney = (videoCardTotalPrice * 0.35) * processorBr;
        double ramMoney = (videoCardTotalPrice * 0.10) * ramBr;
        double spentMoney = videoCardTotalPrice + processorMoney + ramMoney;
        if (videoCardBr > processorBr){
            spentMoney=  spentMoney - spentMoney * 0.15;
        }
        double moneyLeft = Math.abs(totalMoney - spentMoney);

        if (totalMoney > spentMoney ){
            System.out.printf("You have %.2f leva left!",moneyLeft);
        }else if (totalMoney < spentMoney){
            System.out.printf("Not enough money! You need %.2f leva more!",moneyLeft);
        }
    }
}
