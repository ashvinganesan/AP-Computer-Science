/* 
Ashvin Ganesan 
AP CS 
Unit 2-Lab 3 9/23/2019
*/
public class U2L3 {
    
    //This method caculates the slope of a linear line and displays the result 
    // as "the slope is -0.54"
    

    public void calSlope(int x1,int y1, int x2, int y2){
        double slope = (double)(y2-y1)/(x2-x1);
        
        System.out.print("the slope is ");
        //format output to 2 decimals using String.format
        System.out.println(String.format("%.2f",slope));
    }
    
    //this method takes a double in fahrenheit and 
    //prints out 98.60 degrees Fahrenheit == 37.00 degrees Celsius
    public void convertCelsius  (double fahrenheit){
        double celsius = (fahrenheit -32) *5/9;
        System.out.println(String.format("%.2f",fahrenheit) + " degrees Fahrenheit == " + String.format("%.2f",celsius) + " degrees Celsius");
        System.out.println("");
    }
    //this method returns the AREA OF THE circle with all decimal points(that can fit in double)
    //once it is out you print a certain number
    public double areaCircle (double radius) {
        double area = radius * radius * Math.PI;
        //String output = "The area is :: " + (String.format("%.4f", area)); 
        return area;
        
    }
    
}
