/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
public class StudentAdvance extends Advance{
    public StudentAdvance(int number, int daysInAdvance) {
        super(number, daysInAdvance);
        setPrice(getPrice()/2);
    }
    public String toString() {
        return super.toString() + "\n(student ID required)";
    }
}
