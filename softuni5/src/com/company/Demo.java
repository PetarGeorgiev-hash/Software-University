package com.company;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        if (text.equals("Example") || text.equals("Demo")){
            System.out.println("Lecture");
        }
    }
}
