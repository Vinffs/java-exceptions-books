package org.learning.books;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        Book[] bookArray = null;
        boolean flag = false;

        while(!flag) {
            System.out.print("How many books would you like to add? ");

            try {
                int number = Integer.parseInt(scan.nextLine());
                bookArray = new Book[number];
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("You must insert a number! Try again.");
            }

        }


        for (int i = 0; i < bookArray.length; i++) {
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
                bookArray[i] = new Book(title, author, publisher, pages);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }


        // write in a new file
        File bookList = new File("./resources/booklist.txt");
        if(!bookList.exists()) {
            bookList.createNewFile();
        }

        try {
            FileWriter writer = new FileWriter(bookList);

            writer.write("List Of Books" + "\n");
            writer.write("\n");

            for (Book book : bookArray) {
                writer.write("Title: " + book.getTitle() + "\n" + "Author: " + book.getAuthor() + "\n" +
                        "Publisher: " + book.getAuthor() + "\n" + "Pages: " + book.getPages() + "\n"
                );
                writer.write("-------------------" + "\n");
            }

            writer.close();
        } catch (IOException e ) {
            e.printStackTrace();
        }

        // read and print from file

        Scanner reader = new Scanner(bookList);

        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }

        reader.close();
        scan.close();

    }
}
