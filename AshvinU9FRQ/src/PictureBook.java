/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class PictureBook extends Book{
    private String illustrator;
    public PictureBook(String title, String author, String illustrator) {
        super(title, author);
        this.illustrator = illustrator;
    }
    public void printBookInfo() {
        super.printBookInfo();
        System.out.print(" and illustrated by " + illustrator);
    }
    
}
