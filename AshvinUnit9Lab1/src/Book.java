/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
//second part of this lab. Audiobook extends book
public class Book {

    private int numPages;
    private String bookTitle;

    public Book(int pages, String title) {
        numPages = pages;
        bookTitle = title;
    }

    public String toString() {
        return bookTitle + " " + numPages;
    }

    public int length() {
        return numPages;
    }

}
