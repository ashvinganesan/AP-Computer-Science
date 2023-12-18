
import java.util.ArrayList;

//Ashvin Ganesan
//APCS Unit 7 Lab 1
//Monday, December 9th, 2019
public class TablesSchedule {

    /**
     * Holds reservation schedules for all tables; the first element is not used
     * (null)
     */
    private ArrayList<String> schedule = new ArrayList<String>();

    /**
     * Creates schedules for the evening for a given number of tables, 12 empty
     * time slots for each table.
     *
     * @param numTables the number of tables in the restaurant
     */
    public TablesSchedule(int numTables) {
        schedule.add("");
        for (int i = 1; i <= numTables; i++) {
            schedule.add("............");
        }
//        for(int i = 0; i < schedule.size();i++)
//            System.out.println(schedule.get(i));
        
    }

    /* For a given table, marks as occupied three consecutive time slots in its schedule, 
     * starting from timeSlot.
    * @param k table number
    * @param timeSlot the starting time of reservation
    * Precondition: 1 <= k <= schedules.size(); 0 <= timeSlot <= 9
     * Postcondition: the substring of length 3 starting at timeSlot in the schedule for the table is
     * replaced with “xxx”, all other reservations remain unchanged
         */
    public void reserve(int k, int timeSlot) {
        String tableSchedule = schedule.get(k);
        String newTableSchedule;
        if (timeSlot>9 ||(tableSchedule.substring(timeSlot,timeSlot + 3)).equals("xxx")) {
            return;
        } else {
            newTableSchedule = (tableSchedule.substring(0,timeSlot) + "xxx" + tableSchedule.substring(timeSlot + 3));
            schedule.set(k,newTableSchedule);
            //System.out.println(newTableSchedule);
        }
        }
        /* Returns the total number of occupied time slots for a given table
    * @param k table number
    * Precondition: 1 <= k <= schedules.size();
         */
    public int occupiedSlots(int k) {
        int counter = 0;
        String table = schedule.get(k);
        for(int i = 0; i < 12; i++) {
            if(table.substring(i, i+1).equals("x")) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Finds the best table available for three consecutive time slots, starting
     * from timeSlot, and returns that table’s number. The best table is the one
     * with the maximum total reserved time (or the first one of them if several
     * have the same maximum reserved time). If none of the tables is available
     * for the three-time slots, returns 0.
     *
     * @param timeSlot the starting time slot for this reservation Precondition:
     * 0 <= timeSlot <= 9
     */
    public int findTable(int timeSlot) {
        int bestTable = 0;
        int occupiedOfBestTable = -1;
        for (int i = 1; i <= schedule.size()-1; i++) {
            //System.out.println("the i is " +  i);
            if(occupiedSlots(i)> occupiedOfBestTable) {
                if (schedule.get(i).substring(timeSlot,timeSlot+3).equals("...")) {
                    bestTable = i;
                    //System.out.println("best table has been set to " + i + "the ocupied slots is " + occupiedSlots(i));
                    occupiedOfBestTable = occupiedSlots(i);
                }
            }
        }
//        for(int i = 0; i < schedule.size();i++)
//            System.out.println(schedule.get(i));
        return bestTable;
        /* to be implement in this lab */ 
    }
}
