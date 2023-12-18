/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) {
        IfStatementDemo demo = new IfStatementDemo();
        System.out.println(demo.getFee("95070"));
        System.out.println(demo.getFee("94025"));
        System.out.println("Discounted amount from the fee of $1200 is " + demo.getDiscount(1200, 95070));
        System.out.println("Discounted amount from the fee of $1200 is " + demo.getDiscount(1200, 94025));
    }
    
        
    
}
