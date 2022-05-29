package com.company;

import java.util.Scanner;

public class from100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        if (num < 100){
            System.out.println("Less than 100");
        }else if (num <= 200){
            System.out.println("Between 100 and 200");
        }else{
            System.out.println("Bigger than 200");
        }
    }
}
