/* 
Ashvin Ganesan 
AP CS Unit 
5-Lab 1 11/11/2019
*/
public class Runner {
    public static void main(String[] args) {
//        Book ashvinBook = new Book("Sapiens", "Yyval Noah Harari", 498);
//        System.out.println(ashvinBook.toString());
//        ashvinBook.setAuthor("Yuval Noah Harari");
//        System.out.println(ashvinBook.toString());
//        Book hemiupBook = new Book("Still Water");
//        System.out.println(hemiupBook.toString());
//        hemiupBook.setAuthor("Viveca Sten");
//        hemiupBook.setPages(448);
          HotelReservation r1 = new HotelReservation(101, "Hemiup");
          System.out.println(r1);
          ExamQuestion r2 = new ExamQuestion("complex numbers", 100);
          System.out.println(r2);
          Ticket r3 = new Ticket(10001, 100.00);
          System.out.println(r3);
    }
    
}
