package org.learning.books;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Books[] booksArray = null;
        boolean flag = false;

        while(!flag) {
            System.out.print("How many books would you like to add? ");

            try {
                int number = Integer.parseInt(scan.nextLine());
                booksArray = new Books[number];
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("You must insert a number! Try again.");
            }

        }


        for (int i = 0; i < booksArray.length; i++) {
            System.out.println("Please insert the following data to upload the book: ");

            System.out.print("Title: ");
            String title = scan.nextLine();

            System.out.print("Author: ");
            String author = scan.nextLine();

            System.out.print("Publisher: ");
            String publisher = scan.nextLine();


            int pages = 0;
            try {
                System.out.print("Pages: ");
                pages = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }


            try {
                booksArray[i] = new Books(title, author, publisher, pages);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }

        for (Books book : booksArray) {
            System.out.println(book);
        }

        scan.close();
    }
}
