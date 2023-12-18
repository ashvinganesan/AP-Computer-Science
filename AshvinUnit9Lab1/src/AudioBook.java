/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
//second part of this lab it extends and inherits characteristics from Book. 
public class AudioBook extends Book {
    private int numMinutes;
    private int pages;
    private String title;// don't really need but I felt like I should
    public AudioBook(int pages, String title, int numMinutes) {
        super(pages, title);
        this.numMinutes = numMinutes;
        this.pages = pages;
        this.title = title;
    }
    public String toString() {// uses super to call book's toString.
        return super.toString() +" pages\nthe number of minutes to read is "+ numMinutes + "\nThe pages per minute is " + pagesPerMinute();
    }
    public double pagesPerMinute() {
        return ((double) pages)/numMinutes;
    }
    
}
