/* 
Ashvin Ganesan 
AP CS Unit 
5-Lab 1 11/11/2019
*/
public class HotelReservation {
    private String guestName;
    private int roomNumber;
    
    public HotelReservation() {
        roomNumber = 0;
        guestName = "";
    }
    
    public HotelReservation(int room, String name) {
        roomNumber = room;
        guestName = name;
    }
    
    public void setRoom(int room) {
        roomNumber = room;
    }
    
    public void setName(String name) {
        guestName = name;
    }
    
    public int getRoom() {
        return roomNumber;
    }
    
    public String getName() {
        return guestName;
    }
    
    public String toString() {
        return "Guest: " + guestName + "\nRoom: " + roomNumber + "\n";
    }
}
