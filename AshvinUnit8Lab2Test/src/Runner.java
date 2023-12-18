/*
 Ashvin Ganesan
APCS Unit 8 Lab 2 
Wednesday January 15th 
 */
import java.io.IOException;
public class Runner {
    public static void main(String[] args) throws IOException {
        MagicSquare demo = new MagicSquare();
     //   demo.processFile("magic1.dat", false);
        //demo.debug("magic2.dat");
//        System.out.println("MAGIC 1");
//        demo.debug("magic1.dat");
//        demo.debug("magic2.dat");
        demo.processFile("magic2.dat", true);
        //demo.makeMagicSquare(4);
    }
    
}
