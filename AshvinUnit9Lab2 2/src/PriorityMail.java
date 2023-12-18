/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
public class PriorityMail extends Mail{
    private double weight;
    private int zone;
    public PriorityMail(double weight, int zone) {
        this.weight = weight;
        this.zone = zone;
    }
    public double calculatePostage() {
        if (weight <= 1) return 4.05;
        return (4.05 + (zone * (weight - 1)) * 0.80);
        
    }
        
}
