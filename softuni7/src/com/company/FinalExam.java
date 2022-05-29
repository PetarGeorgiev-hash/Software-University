package com.company;

import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                leftSum = leftSum + currentNum;
            }else {
                rightSum = rightSum + currentNum;
            }
        }
        if (leftSum == rightSum){
            System.out.printf("Yes%nSum = %d",leftSum);
        }else if (leftSum < rightSum || rightSum < leftSum){
            System.out.printf("No%nDiff = %d",Math.abs(leftSum - rightSum));
        }

    }
}
