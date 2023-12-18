/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
//this is an abstract class that most things extend from. 
//the abstract method is speak and all of the classes that extend it have a speak method
// It takes a name and sets that as the pets name
// and it has a method to get the name(this is used in the Kennel class)
public abstract class Pet {
    private String myName;
    public Pet (String name) { 
        myName = name; 
    }
    public String getName() { 
        return myName; 
    }
    public abstract String speak();

}
