/*
 Ashvin Ganesan   
APCS  Unit 3 - Lab 1 
09/30/2019  
*/

public class Runner {
    public static void main(String[] args) {
        U3L1 test = new U3L1();
        //method compare4Doubles
        System.out.println("4.5 6.7 7.8 9.0");
        System.out.print("biggest = ");
        test.compare4Doubles(4.5, 6.7, 7.8, 9.0);
        System.out.println();
        System.out.println("14.51 6.17 71.8 1.0");
        System.out.print("biggest = ");
        test.compare4Doubles(14.51, 6.17, 71.8, 1.0);
        System.out.println();
        System.out.println("41.15 816.7 17.8 19.0");
        System.out.print("biggest = ");
        test.compare4Doubles(41.15, 816.7, 17.8, 19.0);
        System.out.println();
        System.out.println("884.5 16.7 7.8 9.0");
        System.out.print("biggest = ");
        test.compare4Doubles(884.5, 16.7, 7.8, 9.0);
        System.out.println();
        System.out.println("4.5 -456.7 677.8 9.0");
        System.out.print("biggest = ");
        test.compare4Doubles(4.5, -456.7, 677.8, 9.0);
        System.out.println();
        System.out.println("4.5 16.7 -7.8 -9.0");
        System.out.print("biggest = ");
        test.compare4Doubles(4.5, 16.7, -7.8, -9.0);
        //methods compare3Strings
        System.out.println();
        System.out.println("abc cba bca");
        System.out.println("biggest = " + test.compare3Strings("abc", "cba", "bca"));
        System.out.println();
        System.out.println("one fourteen twenty");
        System.out.println("biggest = " + test.compare3Strings("one", "fourteen", "twenty"));
        System.out.println();
        System.out.println("124323 20009 3434");
        System.out.println("biggest = " + test.compare3Strings("124323", "20009", "3434"));
        System.out.println();
        System.out.println("abcde ABCDE 1234234324");
        System.out.println("biggest = " + test.compare3Strings("abcde", "ABCDE", "1234234324"));
        //isPalindromeWeek
        if(test.isPalindromeWeek("9.10.19")) {
            System.out.println("The date " + "9/10/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/10/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.13.19")) {
            System.out.println("The date " + "9/13/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/13/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.15.19")) {
            System.out.println("The date " + "9/15/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/15/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.17.19")) {
            System.out.println("The date " + "9/17/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/17/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.19.19")) {
            System.out.println("The date " + "9/19/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/19/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.21.19")) {
            System.out.println("The date " + "9/21/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/21/19" + " is not a palindrome");
        }
        if(test.isPalindromeWeek("9.23.19")) {
            System.out.println("The date " + "9/23/19" +  " is a palindrome");
        } else {
            System.out.println("The date " + "9/23/19" + " is not a palindrome");
        }
        test.rockPaperScissors("S");
        
        
    
        
    }
                
           
    
}
