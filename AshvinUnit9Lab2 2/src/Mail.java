/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
import java.text.DecimalFormat;

public abstract class Mail {
    public abstract double calculatePostage();
    public String toString() {
        DecimalFormat money = new DecimalFormat ("0.00");
        return money.format (calculatePostage ( ) );
    }
}
