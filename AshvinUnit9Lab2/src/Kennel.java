/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
import java.util.ArrayList;
//This is a Kennel which holds an arrayList of pets
// you can add a pet 
// and there is a method:allspeak which makes them all run their individual(of their class) speak command.
public class Kennel {
    private ArrayList petList;
    public Kennel() {
        petList = new ArrayList<Pet>();
    }
    public void addPet(Pet pet) {
        petList.add(pet);
    }
    public void allSpeak() {
        for(int i = 0; i < petList.size(); i++) {
            Pet current = (Pet)petList.get(i);
            System.out.println(current.getName() + ": " + current.speak());

        }
        
          
    }
}
