/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/**
 *
 * @author ashvin
 */
public class Animal {
    private String vore;
    private String species;
    private String name;
    public Animal(String vore, String species, String name) {
        this.vore = vore;
        this.species = species;
        this.name = name;
    }
    public String toString() {
        return(name + " the " + species + " is a " + vore);
    }

}
