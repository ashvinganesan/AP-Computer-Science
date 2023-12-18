import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
/**  Ashvin Ganesan 
 * APCS UNIT 2 - Lab 1 
 * 09/06/2019 */
// the purpose of this lab is to draw a figure of a "human" who is as
//close as possible to the human drawn in the google doc. 

public class MyArt extends Canvas {
    
   public MyArt()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }
   // paint is called automatically when MyArt is created
   public void paint( Graphics window ) {
      window.setColor(Color.BLUE);

      window.drawString("Unit 2 Lab 1", 35, 35 );

      //call head method
      head(window);
      //call other methods
      
   }

   public void head(Graphics window)
   {
      Color flesh = new Color(253, 198, 157);
      window.setColor(flesh);
      window.fillOval(300, 100, 200, 100); // x, y, width, height
      
      //eyes
      window.setColor(Color.BLACK);
      window.fillOval(350, 120, 20, 20);
      window.fillOval(430, 120, 20, 20);

      //mouth
      window.setColor(Color.RED);
      window.drawArc(360, 140, 80, 40, 210, 120);
      
      
      //neck
      window.setColor(flesh);
      window.fillRect(375, 190, 50, 40); // x, y, width, height
      body(window);
   }
   
   public void drawHexagon(Graphics window, int x, int y) { //x is x starting point y is y starting point
//     this draws a hexagon for the buttons 
       int[] xValueOfHexagonButton = {x,x-5,x,x+10,x+15,x+10}; 
       int[] yValueOfHexagonButton = {y,y+8,y+16,y+16,y+8,y};
       window.fillPolygon(xValueOfHexagonButton, yValueOfHexagonButton, 6);
   }
   public void body( Graphics window ) {
       //body(like dress)
       int[] yValuesOfBody = {230, 230, 400, 400};
       int[] xValuesOfBody = {360,440,500,290};
       window.setColor(Color.blue);
       window.fillPolygon(xValuesOfBody, yValuesOfBody, 4); // [x1, x2, x3, x4]
       //buttons
       //400,210
       window.setColor(Color.DARK_GRAY);
//       int[] xValuesOfButtonOne = {400,395,400,410, 415, 410};
//       int[] yValuesOfButtonOne = {210,218,226,226,218,210};
//       window.fillPolygon(xValuesOfButtonOne,yValuesOfButtonOne,6);
//       Used method Draw Hexagon for the buttons      
         drawHexagon(window,395,240);
         drawHexagon(window,395,270);
         drawHexagon(window,395,300);
         //Legs :)
         window.setColor(Color.BLACK);
         window.drawLine(345, 400, 345, 490);
         window.drawLine(445, 400, 445, 490);
         //Arms
         window.drawLine(345, 268, 250, 220); // starting point (x1,y1) is on the body
         window.drawLine(452,268,542,220);
   }

   
}