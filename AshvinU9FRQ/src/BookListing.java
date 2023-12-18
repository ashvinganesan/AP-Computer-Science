/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class BookListing {
    private Book book;
    private double price;
    public BookListing(Book book, double price) {
        this.book = book;
        this.price = price;
    }
    public void printDescription() {
        book.printBookInfo();
        System.out.println(", $" + price);
    }
}
    