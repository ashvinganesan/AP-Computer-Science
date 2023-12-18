
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) {
//        PictureBook mybook = new PictureBook("Peter and Wendy", "J.M. Barrie","F.D. Bedford");
//        //mybook.printBookInfo();
//        ArrayList<Book> myLibrary = new ArrayList<Book>();
//        Book book1 = new Book("Frankenstein", "Mary Shelley");
//        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum","W.W. Denslow");
//        myLibrary.add(book1);
//        myLibrary.add(book2);
//        BookListing listing1 = new BookListing(book1, 10.99);
//        listing1.printDescription();
//        BookListing listing2 = new BookListing(book2, 10.99);
//        listing2.printDescription();
        Animal lisa = new Animal("carnivore", "lion", "Lisa");	
        System.out.println(lisa.toString());	
        Herbivore gary = new Herbivore("giraffe", "Gary");	
        System.out.println(gary.toString());
        Elephant percy = new Elephant("Percy", 2.0);	
        System.out.println(percy);
    }
}
