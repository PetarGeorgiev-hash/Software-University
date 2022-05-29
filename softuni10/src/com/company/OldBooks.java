package com.company;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookName = scanner.nextLine();
        int booksCount = 0;
        boolean isNegative = false;

        while (true){
            String currentBook = scanner.nextLine();
            if (currentBook.equals(bookName)){
                System.out.printf("You checked %d books and found it.",booksCount);
                break;
            }else if (currentBook.equals("No More Books")){
                isNegative = true;
                break;
            }else {
                booksCount++;
            }

        }
        if (isNegative){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",booksCount);
        }
    }
}
