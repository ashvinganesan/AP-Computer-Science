/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Vehicle extends TaxableItem{
   private double dealerCost;
   private double dealerMarkup;
   public Vehicle(double dealerCost, double markup, double rate) {
       super(rate);
       this.dealerCost = dealerCost;
       dealerMarkup = markup;
   }
   public double getListPrice() {
      return dealerCost + dealerMarkup;
   }
   public void changeMarkup(double newMarkup) {
       dealerMarkup = newMarkup;
   }
}
