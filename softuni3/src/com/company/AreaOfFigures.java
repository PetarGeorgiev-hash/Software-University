package com.company;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
             area = side * side;

        }else if (figure.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        }else if (figure.equals("circle")){
         double radius = Double.parseDouble(scanner.nextLine());
         area = Math.PI * radius * radius;
        }else if (figure.equals("triangle")){
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = side * height / 2;
        }
        System.out.printf("%.3f",area);
    }
}
