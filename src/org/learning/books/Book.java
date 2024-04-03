package org.learning.books;

public class Book {

    private String title, author, publisher;
    private int pages;

    public Book(String title, String author, String publisher, int pages) {

        if (title == null || author == null || publisher == null || title.isEmpty()  || author.isEmpty() || publisher.isEmpty()) {
            throw new IllegalArgumentException("Title, author, and publisher cannot be empty.");
        }

        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be a number and must be greater than 0.");
        }

            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\n" +
                "Author: " + this.author + "\n" +
                "Publisher: " + this.publisher + "\n" +
                "Pages: " + this.pages + "\n";
    }


}
