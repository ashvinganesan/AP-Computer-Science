/* 
Ashvin Ganesan 
AP CS Unit 
5-Lab 1 11/11/2019
*/
public class Book {
    private String title;
    private String author;
    private int pages;
    
    public Book(){
        title = "";
        author = "";
        pages = 0;
    }
    
    public Book(String bookTitle, String bookAuthor, int numOfPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = numOfPages;
    }
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;
        pages = 0;
    }
    public Book(String bookTitle) {
        title = bookTitle;
        author = "";
        pages = 0;
    }
    
    // 3mutators because the Book class has 3 instance variables
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    public void setAuthor (String newAuthor) {
        author = newAuthor;
    }
    
    public void setPages(int newPages) {
        pages = newPages;
    }
    // 3 accessors because the Book class has 3 instance variables
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPages() {
        return pages;
    }
    
    public String toString() {
        return ("Title: " + title + "\nAuthor: " + author + "\nPages: " + pages + "\n");
    }
}
