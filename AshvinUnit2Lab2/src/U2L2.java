/* 
Ashvin Ganesan 
AP CS Unit 
2-Lab 2 09/16/2019
*/
public class U2L2 {

   public void addressExtractor( String address)
   {

	int space1= address.indexOf(" ") ;
        String stNum = address.substring(0, space1);
        System.out.println("Street Number: " + stNum);
        int period1 = address.indexOf(".");
        String stName = address.substring(space1 + 1, (period1 + 1));
        System.out.println("Street Name: " + stName);
        int comma1 = address.indexOf(",");
        String city = address.substring(period1 + 2, comma1);
        System.out.println("City: " + city);
        String State = address.substring(comma1+2, comma1 + 4);
        System.out.println("State: "+ State);
        String Zipcode = address.substring(comma1+5);
        System.out.println("Zipcode: " + Zipcode);
   }

   
}