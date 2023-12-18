/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Question2Euler {
    public void findFibonachi() {
        long previous1 = 1;
        long previous2 = 1;
        long current = 0;
        long sum = 0;
        while (current <= 4000000) {
            current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;
            if(current % 2 == 0) {
                sum+= current;
            }
            
        }
        System.out.println(sum);
    
    }
}
