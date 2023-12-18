
import java.math.BigInteger;

/**
 *
 * @author ashvin
 */
public class ForLoopDemo {

    //Write a methdo to print all characters whose ascii value from 10-100
    public void getASCIIchar(int lowerLimit, int upperLimit) {
        for (int c = lowerLimit; c <= upperLimit; c++) {
            System.out.println((char) c);
        }
    }

    //Write a method to print the first 10 elements in the Fibonacci
    public void printFibSeq(int count) {
        BigInteger prev2 = BigInteger.ONE;
        BigInteger prev1 = BigInteger.ONE;
        BigInteger current = BigInteger.ZERO;
        System.out.println("1\n1");
        for (int i = 3; i <= count; i++) {
            current = prev1.add(prev2);
            System.out.println(current);
            prev2 = prev1;
            prev1 = current;

        }

    }

    //write a method that takes a string  and prints its ceasar sipher equivalent
    public void ceasarCipher(String orig, int shift) {
        String ciphered = "";
        for(int i = 0; i < orig.length(); i++) {
            char cOrig = orig.charAt(i);
            char cAfter = (char)(((int)(cOrig) + shift));
            ciphered += cAfter;
        }
        System.out.println("Original: " + orig);
        System.out.println("Ciphered: " + ciphered);

    }
}
