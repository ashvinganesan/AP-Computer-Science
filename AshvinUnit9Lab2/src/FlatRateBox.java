/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
public class FlatRateBox extends PriorityMail {
    public FlatRateBox() {
        super(1.0,1);
    }
    public double calculatePostage() {
        return 2 * super.calculatePostage();
    }
}
