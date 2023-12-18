/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class Drink implements MenuItem{
    private String name;
    private double price;
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
