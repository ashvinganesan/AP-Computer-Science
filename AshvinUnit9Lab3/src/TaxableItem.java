/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public abstract class TaxableItem implements Item{
    private double taxRate;
    
    public abstract double getListPrice();
    public TaxableItem(double rate) {
        taxRate = rate;
    }
    public double purchasePrice() {
        return getListPrice() * (taxRate + 1);//intead of adding another getListPrice();
    }
}
