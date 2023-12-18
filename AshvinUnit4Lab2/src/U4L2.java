/*
Ashvin Ganesan
APCS Unit 4 Lab 2
11/01/2019
 */
public class U4L2 {
    public void factorial(int number) {
        int factorial = 1;
        for(int i = number; i>0; i--) {
            factorial *= i;
        }
        System.out.println("factorial of " + number + " is " + factorial);
        
    }
    public boolean isCoolNum(int number) {
        if (number % 60 == 1) {
            return true;
        } else {
            return false;
        }
    }
    public void countCoolNumbers(int number) {
        int count = 0;
        for(int i = 6; i < number; i++ ) {
            if (isCoolNum(i)) {
                System.out.println(i);
                count++;
                
            }
            
        }
        System.out.println(count + " cool numbers between 6 - " + number);
            
    }
    public void fancyTriange(String word) {
        System.out.println(word);
        for(int i = word.length(); i > 0; i--) {
            word = word.substring(0, word.length() -1);
            System.out.println(word);
        }
    }
    public void generateTable(int number, int count) {
        System.out.println("time table for " + number);
        for(int i = 1; i<= count ; i++)
            System.out.println(i + "  	" + i*number);
        System.out.println("");
    }
    public void backwardString(String word) {
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));
        for(int i = word.length() - 1; 0 <= i; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println("");
        System.out.println(word);
    }
   
}
