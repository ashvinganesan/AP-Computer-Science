/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) {
        Cookie ashvinFavCookie = new Cookie("chocolate chip");
        Cookie nikFavCookie = new Cookie();
        Cookie msHemiup = new Cookie("oatmeal and raisin");
        System.out.println("hello");
        System.out.println();
        System.out.println("how are you?");
        //println in lines 10 -13 have the same name but different signature
        //we called this overloading overloading is really common
        //GraphicsRunner aWindow = new GraphicsRunner(); // this is a line of code
        
        //creating and calling String class methods
        String fName = "ashvin";
        String lName = "Ganesan";
        String fullName = fName + " " + lName;
        int fullNameLength = fullName.length();
        int spaceLoc = fullName.indexOf(" ");
        String fnInit = fullName.substring(0,1);
        String lnInit = fullName. substring(spaceLoc + 1, spaceLoc + 2);
        String initials = fnInit + "." +lnInit + ".";
        System.out.println(fullName + "'s Initials are " + fnInit + "." +lnInit + ".");
        String ssn = "123-66-9977";
        int ssnLength = ssn.length();
        String last4 = ssn.substring(ssnLength-4);
        System.out.println("the last 4 digits of the SSN is: " + last4);
        
        //what is the char at location 5 in SSM 
        System.out.println(ssn.charAt(5));
        
        String aRandomStr = "     I am bored   !  ";     
        System.out.println("How Long is the String \"      I am bored   !  \"? "  + aRandomStr.length());
        String trimmedRandomStr = aRandomStr.trim();
        System.out.println(" the trimmed version of \"      I am bored   !  \" is " + trimmedRandomStr + ".");
        System.out.println("First name before calling toUpperCase is: " + fName);
        fName = fName.toUpperCase();
        System.out.println("First name after calling toUpperCase is: " + fName);
        String s1 = new String ("compsci");
        String s2 = new String ("compsci");
        System.out.println(s1.equals(s2)); // comparing the content of the 2 strings
        System.out.println(s1 == s2); // comparing the memory locations of the 2 Strings
        s2 = s1;
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = "compsci";
        System.out.println(s1==s3);
        String s4 = "compsci";
        System.out.println(s3==s4);
        String s5 = new String("compsci");
        System.out.println(s4==s5);
        

        System.out.println("c".compareTo("a"));
        System.out.println("z".compareTo("a"));
        System.out.println("a".compareTo("z"));
        System.out.println("a".compareTo("A"));// this shows capitals come before lowercase
        System.out.println("a".compareTo("ab"));
        //compare 2 Strings 
        
        String animal1 = "girrafe";
        String animal2 = "gorrila";
        System.out.println(animal1.compareTo(animal2));// if negative its in the order it would be in the dictionary
        // Demoing Wrapper Classes and Auto-boxing, Auto-unboxing
        Integer num = 2002;
        System.out.println("Num is: " + num);
        
        // calling some Math class methods
        double x = 1999.67;
        System.out.println("Ceiling of 1999.67: " + Math.ceil(x)); 
        System.out.println("Floor of 1999.67: " + Math.floor(x));
        System.out.println("Round of 1999.67: " + Math.round(x));
        System.out.println("Round of 1999.23: " + Math.round(1999.23));
        System.out.println("The Pi value: " + Math.PI);
        System.out.println("The square root of PI: " + Math.sqrt(Math.PI));
        System.out.println("PI to the 0.1 exponent: " + Math.pow(Math.PI, 0.5));
        System.out.println("A random number from [0.0,1.0): " + Math.random());
        // Generate a random integer from [0, 100]
        //x = random numb from 0.0 to 1
        // x *101 then cast
        double randReal = Math.random();
        int randInt = (int) (randReal * 101); //randreal and 101 must be in paranthese or it will be equal to 0 
        // that would be a logic error
        System.out.println("Random integer from [0,100]: " + randInt);
        
        
        
    }
}

