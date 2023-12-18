/*  Ashvin Ganesan
 * APCS  Unit 4 - Lab 1  
 * 10/7/2019  */

public class U4L1 {

    public void countDigits(int number) {
        int count = 0;
        int num = number;
        while (num > 0) {
            num /= 10;
            count++;

        }
        System.out.println(number + " contains " + count + " digits");
    }

    public void averageDigit(int number) {
        int count = 0;
        int sum = 0;
        int num = number;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            count++;
        }
        double average = (sum / count);
        System.out.print(number + " has a digit average of ");
        System.out.println(String.format("%.1f", average)); 
    }
    public void findDivisors(int number) {
        String divisors = "";
        int count = 1;
        while(number >= count*2) {
            if (number % count == 0) {
                divisors = divisors + count + " ";
            }
            count++;
               
        }
        System.out.println(number + " has divisors " + divisors);
    }
    public void isPrime(int number) {
        int count = 2; 
        while(number > count) {
  
            
            if(number % count == 0) {
                System.out.println(number + " is not a prime number");
                return;
            }
            count++;
        }
        if(number == 1) {
                System.out.println("1 is not a prime number");
                return;
        }   
        System.out.println(number + " is a prime number ");
        
    }
        
}
