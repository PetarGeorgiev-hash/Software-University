package com.company;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());
        double percent = 0;
        boolean isInvalid = false;


        switch (city) {
            case "Sofia":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.05 * sells;
                } else if (sells > 500 && sells <= 1000) {
                    percent = 0.07 * sells;
                } else if (sells > 1000 && sells <= 10000) {
                    percent = 0.08 * sells;
                } else if (sells > 10000){
                    percent = 0.12 * sells;
                }else {
                    isInvalid = true;
                }
                break;
            case "Varna":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.045 * sells;
                }else if (sells > 500 && sells <= 1000) {
                    percent = 0.075 * sells;
                } else if (sells > 1000 && sells <= 10000) {
                    percent = 0.10 * sells;
                } else if (sells > 10000){
                    percent = 0.13 * sells;
                }else {
                    isInvalid = true;
                }
                    break;
            case "Plovdiv":
                if (sells >= 0 && sells <= 500) {
                    percent = 0.055 * sells;
                }else if (sells > 500 && sells <= 1000) {
                    percent = 0.08 * sells;
                } else if (sells > 1000 && sells <= 10000) {
                    percent = 0.12 * sells;
                } else if (sells > 10000){
                    percent = 0.145 * sells;
                }else {
                    isInvalid = true;
                }
                    break;
            default:
                isInvalid = true;
        }if (isInvalid){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", percent);
        }
    }

}
