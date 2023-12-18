/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class Trio implements MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    public String getName() {
        return (sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio");
    }
    public double getPrice() {
        double sandwichPrice = sandwich.getPrice();
        double saladPrice = salad.getPrice();
        double drinkPrice = drink.getPrice();
        if(sandwichPrice < drinkPrice && sandwichPrice < saladPrice) {
            return drinkPrice + saladPrice;//this checks if sandwich is the cheapest
        }
        else if(saladPrice < drinkPrice) {
            return sandwichPrice + drinkPrice;
        }
        else {
            return saladPrice + sandwichPrice;
        }
    }
}
