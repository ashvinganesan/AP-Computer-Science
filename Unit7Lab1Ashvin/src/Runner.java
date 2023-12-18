
import java.util.ArrayList;

/*
 Ashvin Ganesan
Unit 7 Lab 1
Monday December 9th 2019
 */
public class Runner {
    
    public static void main(String[] args) {
//        ArrayListDemo demo = new ArrayListDemo();
//        ArrayList<Integer> midterm = new ArrayList<Integer>();
//        midterm.add(89);
//        midterm.add(67);
//        midterm.add(91);
//        midterm.add(93);
//        midterm.add(72);
//        System.out.println(midterm);
//        midterm.add(2,75);
//        //System.out.println(midterm);
//        System.out.println(demo.getAboveThreshold(80, midterm));
//I named the tester class runner because we did that in class. 
          TablesSchedule demo = new TablesSchedule(5);
          demo.reserve(1,0);
          demo.reserve(1, 9);
          demo.reserve(2, 1);
          demo.reserve(2,5);
          demo.reserve(3,5);
          demo.reserve(4,4);
          demo.reserve(4,7);
          demo.reserve(5,1);
          demo.reserve(5, 5);
          System.out.println(demo.findTable(1));
          System.out.println(demo.findTable(9));
          System.out.println(demo.findTable(7));
    }
    
}
