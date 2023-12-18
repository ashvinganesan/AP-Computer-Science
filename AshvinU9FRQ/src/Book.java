/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Book {

    private String title;

    private String author;

    public Book(String t, String a) {

        title = t;

        author = a;

    }

    public void printBookInfo() {

        System.out.print(title + ", written by " + author);

    }

}
