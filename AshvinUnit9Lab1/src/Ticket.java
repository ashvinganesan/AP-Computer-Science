/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
//highest level for part 3
// Other classes extend off of this. 
public class Ticket {
    private int number;
    private double price;
    //all classes that extend this call this constructor. 
    public Ticket(int number, double price) {
        this.number = number;
        this.price = price;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Number: " + number + "\nPrice: " + price;
    }
}
