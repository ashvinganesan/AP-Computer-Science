/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Unit4Demo {
    //This method will return the sum of all even numbers less than a certain given number
    public int sumEvens (int max) { // the formula for the method is access return type name parameter and code
        int sum = 0;
        int num = 2;//this is start for formila initial value of variable
        while (num <= max) {// this is the stop 
            //formula is start(num = 2) stop(num<= max) and step which is num+=2
            sum+= num;
            num += 2; // step
        }
        return sum;
    }
    //This method will print all words thata have letter C in them from a given sentence
    //For example, if the sentence is "Christine got a cat from Claire"
    public void findCWords(String sentence) {
        String s = sentence;
        while (s.length() > 0){ //?
            int spaceIndex = s.indexOf(" ");
            if(spaceIndex > 0) {
                String word = s.substring(0,spaceIndex);
                if(word.indexOf("C") > 0 || word.indexOf("c") > 0){
                    System.out.print(word + ", ");
                    
                }
                s = s.substring(0,spaceIndex + 1);
              //case wehn the sentence has only 1 word  
            } else {
                String word = s;
                if(word.indexOf("C") > 0 || word.indexOf("c") > 0) {
                    System.out.print(word + ", ");
                }
            }
              
            s = ""; ///assign s to an empty string
        } 
        
    }
    public static void longestStreak(String str) {
        if(str.length() == 0) {
            return; // this return is used to terminate a method(even with void)
        }
        char longestChar = str.charAt(0);
        int longestStreak = 0;
        char currentChar = str.charAt(0);
        int currentStreak = 0;
        int index = 0; //start condition for while
        
        while(index <= str.length()) {// stop condition for while
           
            if(str.charAt(index) == currentChar) {
                currentStreak++;
                if (currentStreak > longestStreak) {
                    longestChar = currentChar;
                    longestStreak = currentStreak;
                    
                }
            } 
            else {
           
                currentStreak = 1;
                currentChar = str.charAt(index);
                
            }
            index++; //step for while
            
        }
        
        System.out.println("longest Streak " + longestChar + ""+longestStreak);
    }
}
