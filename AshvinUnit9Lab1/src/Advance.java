/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
//difference in price but takes some of the characteristics of Ticket.
public class Advance extends Ticket{
    public Advance(int number, int daysInAdvance) {
        super(number, 30);
        if (daysInAdvance < 10) {
            setPrice(40);
        }
    }
    
}
