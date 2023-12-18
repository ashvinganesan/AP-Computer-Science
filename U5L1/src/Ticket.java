/* 
Ashvin Ganesan 
AP CS Unit 
5-Lab 1 11/11/2019
*/
public class Ticket {
    private int serialNumb;
    private double price;
    public Ticket(){
        serialNumb = 0;
        price = 0;
    }
    public Ticket(int serial, double priceTag) {
        serialNumb = serial;
        price = priceTag;
        
    }
    public Ticket(int serial) {
        serialNumb = serial;
        
    }
    public Ticket(double priceTag){
        price = priceTag;   
    }
    public int getSerial() {
        return serialNumb;
    }
    public double getprice() {
        return price;
    }
    public String toString() {
        return "Serial: " + serialNumb + "\nPrice: " + price + "\n";
    }
    
}
