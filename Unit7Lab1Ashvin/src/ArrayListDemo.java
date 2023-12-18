import java.util.ArrayList;
//Ashvin Ganesan
//APCS Unit 7 Lab 1
//Monday, December 9th, 2019
public class ArrayListDemo {
    //this method returns a list of factors
    public ArrayList<Integer> getFactors(int num) { // putting "<Integer>" is not needed, but more precise
        ArrayList<Integer> factors = new ArrayList <Integer>();
        //find the factors, one at a time, and store them into the list
        for(int i = 1; i<= num/2; i++) {
            if(num % i == 0) {
                factors.add(i);
            }
        }
        factors.add(num);
        return factors;
    }
    
    public ArrayList<Integer> getAboveThreshold (int threshold, ArrayList<Integer> scores) {//again the 2 <Integer> are not needed
       for(int i = scores.size() - 1; i >= 0; i--)  {
           Integer score = scores.get(i); // this auto unboxes it from small int to Integer
           if(score < threshold) {
               scores.remove(score);
           }
           System.out.println(scores);
       }
       return scores;
    }
    
    
}
