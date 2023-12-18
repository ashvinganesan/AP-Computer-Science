/*
Ashvin Ganesan
Ms. Hemiup APCS Unit 9 Lab 1
Friday January 31st 2019
 */
//Part 1 of the lab
//nothing extends this class
public class Cars {
    private int numbOfDoors;
    private boolean hasAC;
    private double avgMPG;
    //Basically just takes amount of doors if it has ac and the average miles per galon. 
    public Cars(int numbOfDoors, boolean hasAC, double avgMPG) {
        if (numbOfDoors != 2 && numbOfDoors != 4) {
            System.out.println("this is not a valid number of doors");
        }
        this.numbOfDoors = numbOfDoors;
        this.hasAC = hasAC;
        this.avgMPG = avgMPG;
    }//specific to having ac.
    public String toString() {
        if(hasAC) {
            return "number of Doors is " + numbOfDoors + "\nthe car has Air Conditioning\nThe average Miles per Galon is " + avgMPG;
        }
        return "number of Doors is " + numbOfDoors + "\nthe car does not have Air Conditioning\nThe average Miles per Galon is " + avgMPG;
    }
    
}
