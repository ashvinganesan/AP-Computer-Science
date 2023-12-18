/* 
Ashvin Ganesan 
AP CS 
Unit 2-Lab 3 9/23/2019
*/

public class Runner {
    public static void main(String[] args) {
        U2L3 test = new U2L3();
        //tests for calSlope
        test.calSlope(1, 9, 14, 2);
        test.calSlope(1, 7, 18, 3);
        test.calSlope(6, 4, 2, 2);
        test.calSlope(4, 4, 5, 3);
        test.calSlope(1, 1, 2, 9);
        
        //tests for convertCelsius
        test.convertCelsius(98.6);
        test.convertCelsius(52.30);
        test.convertCelsius(82.45);
        test.convertCelsius(75.00);
        test.convertCelsius(100.00);
        double testAnswer = test.areaCircle(7.5);
        System.out.println("The area is :: " + (String.format("%.4f", testAnswer)));
        System.out.println("");
        
        testAnswer =  test.areaCircle(10);
        System.out.println("The area is :: " + (String.format("%.4f", testAnswer)));
        System.out.println("");
        
        testAnswer =  test.areaCircle(72.534);
        System.out.println("The area is :: " + (String.format("%.4f", testAnswer)));
        System.out.println("");
        
        testAnswer =  test.areaCircle(55);
        System.out.println("The area is :: " + (String.format("%.4f", testAnswer)));
        System.out.println("");
        
        testAnswer =  test.areaCircle(99.952);
        System.out.println("The area is :: " + (String.format("%.4f", testAnswer)));
        System.out.println("");
        
    }
    
}
