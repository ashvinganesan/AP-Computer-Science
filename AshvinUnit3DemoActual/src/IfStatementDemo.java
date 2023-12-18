/*
 Ashvin Ganesan
AP CS
In class demo
 */
 /*
Method:
1. Access
2. Return
3. Name
4. Parameters
5. Body
 */
 /*
Var:
Datatype varName = inVal;
 */

/**
 *
 * @author ashvin
 */
public class IfStatementDemo {

    //this method determins what the fee for a soccer club
    // families who live in the 94025 zip code will pay $425 other families will pay $575
    public int getFee(String zipCode) {
        if (zipCode.equals("94025")) { // for strings we use .equals not ==
            return 425;
        } else {
            return 575;

        }

    }

    //This method determines the discount amount for a soccer club
    //Families live in the 94025 zipcode will receive a 15% discount. Otherwise, no discount
    public double getDiscount(double fee, int zipcode) {
        if (zipcode == 94025) {
            return (0.15 * fee);
        } else {
            return (0 * fee);
        }
    }

}
