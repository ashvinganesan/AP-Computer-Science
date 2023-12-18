/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
//this dog is like dog except its speak method says it twice(woof woof)
public class LoudDog extends Dog{
    public LoudDog(String name) {
        super(name);
    }
    public String speak() {
        return super.speak() +" " +  super.speak();
    }
}
