/*
 Ashvin Ganesan   
APCS  Unit 3 - Lab 1 
09/30/2019  
*/

public class U3L1 {
    public void compare4Doubles(double val1, double val2, double val3, double val4){ //this method takes 4 doubles and prints the largest
        if (val1 > val2 && val1 > val3 && val1 > val4) {
            System.out.println(val1);
        } else if (val2 > val3 && val2 > val4) {
            System.out.println(val2);
        } else if (val3 > val4) {
            System.out.println(val3);
        } else {
            System.out.println(val4);
        }
        
    }
    public String compare3Strings(String str1, String str2, String str3) {//this method takes three strings and returns the one that would come last in a dictionary
     if(str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0){
         return str1;
     } else if (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
         return str2;
     } else {
         return str3;
     }
                  
    }
    public boolean isPalindromeWeek(String week) {// this method takes a string in a m.dd.yy format and returns true or false if its a palindrome
       if (week.substring(0,1).equals(week.substring(6)) && (week.substring(2,3).equals(week.substring(5,6)))){
        return true;    
       } else {
           return false;
       }
               
    }
    public void rockPaperScissors(String pc) {//you give the computer R P or S and it generates a random R P or S and you play rock paper scissors it prints the results
        int randomNumber = (int)(3 * Math.random()); 
        String computerChoice;
        String playerChoice = pc.toUpperCase();
        if (playerChoice != "R" && playerChoice != "P" && playerChoice != "S") {
            return; // the use of return to break out of the method is taken from https://stackoverflow.com/questions/7937029/how-to-break-out-or-exit-a-method-in-java
            //is there a more proper way I'm supposed to site any code I use?
        }
        if (randomNumber == 0) {
            computerChoice = "R";
        } else if(randomNumber == 1) {
            computerChoice = "P";
        } else {
            computerChoice = "S";
        }
            
        System.out.println("Rock-Paper-Scissors");
        System.out.println("player had " +  playerChoice);
        System.out.println("computer had " +  computerChoice);
        if (computerChoice.equals(playerChoice)) {
            System.out.println("Draw Game!");
        } else if(computerChoice.equals("R") && playerChoice.equals("S")) {
            System.out.println("Computer wins <<Rock Breaks Scissors>>!");
        } else if(playerChoice.equals("R") && computerChoice.equals("S")) {
            System.out.println("Player wins <<Rock Breaks Scissors>>!");
        } else if(computerChoice.equals("R") && playerChoice.equals("P")) {
            System.out.println("Player wins <<Paper Covers Rock>>!");
        } else if(playerChoice.equals("R") && computerChoice.equals("P")) {
            System.out.println("Computer wins <<Paper Covers Rock>>!");
        } else if(computerChoice.equals("P") && playerChoice.equals("S")) {
            System.out.println("Player wins <<Scissors Cuts Paper>>");
        } else {
            System.out.println("Computer wins <<Scissors Cuts Paper>>");
        }
            
        
    }
    
}
