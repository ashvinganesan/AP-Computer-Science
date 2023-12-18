/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Elephant extends Herbivore{
    private double tusklen;
    public Elephant(String name, double len) {
        super("elephant", name);
        tusklen = len;
    }
    public String toString() {
        return (super.toString() + " with tusks " + tusklen + " meters long");
    }
}
