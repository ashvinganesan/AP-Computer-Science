/*
Ashvin Ganesan
APCS Unit 10 Lab 1
Monday March 2nd 2020
 */

public class U10L1 {
    //this method basically counts the number of sevens in a number if 2 sevens are back to back instead of adding 1 to the count,
    //it will add 14 and not count either seven. 
    public int luckySevens(int number) {
        if(number == 0) {
            return 0;
        }
        
        luckySevens(number/10);
        if (number % 10 == 7) {
            if((number/10) % 10 == 7) {
                return luckySevens(number/10) + 13;
            }
            return luckySevens(number/10) + 1;
        }
        return luckySevens(number/10);
    }
}
