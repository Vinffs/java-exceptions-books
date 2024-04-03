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

//    @Override
//    public String toString() {
//        return "Title: " + this.title + "\n" +
//                "Author: " + this.author + "\n" +
//                "Publisher: " + this.publisher + "\n" +
//                "Pages: " + this.pages + "\n";
//    }


    // GETTER
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public int getPages() {
        return this.pages;
    }

    // SETTER

    public void setTitle(String title) throws IllegalArgumentException {
        if(title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title can't be empty or null.");
        }

        this.title = title;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if(author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author can't be empty or null.");
        }

        this.author = author;
    }

    public void setPublisher(String publisher) throws IllegalArgumentException {
        if(publisher == null || publisher.isEmpty()) {
            throw new IllegalArgumentException("Publisher can't be empty or null.");
        }

        this.publisher = publisher;
    }

    public void setPages(int pages) throws IllegalArgumentException {

        if(pages <= 0) {
            throw new IllegalArgumentException("Pages must be a number and must be greater than 0.");
        }

        this.pages = pages;
    }


}
