/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class NumberSystem {



    /** Precondition: a and b are positive integers.

    * Returns the greatest common factor of a and b, as described in part (a).

    */

    public static int gcf(int a, int b) { 
    /* to be implemented in part (a) */ 
        if (a % b == 0) {
            return b;       
        }
        return gcf(b, a % b);
    }

 

    /** Precondition: numerator and denominator are positive integers.

    * Reduces the fraction numerator / denominator

    * and prints the result, as described in part (b).

    */

    public static void reduceFraction(int numerator, int denominator){ 
        if(numerator % denominator == 0) {
            System.out.println(numerator/denominator);
            return;
        }
        int gcf = gcf(numerator, denominator);
        System.out.println(numerator/gcf + "/" + denominator/gcf);
    }

}