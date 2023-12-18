/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
//This method is an extension of pet and its speak  says "woof"
public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }
    public String speak() {
        return "woof";
    }
}
