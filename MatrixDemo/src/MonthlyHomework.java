/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class MonthlyHomework {
    private int[][] monthlyHW;
    
    public MonthlyHomework(){
        monthlyHW = new int[4][7]; // first is number of rows(horizontal) second(7) is the number of columns(vertical)
    }
    /* Mon-thurs: 2hrs
    Fri: 0 hr
    Sat: 8hrs
    Sun: 4hrs
    */
    public void changeHW(int row, int column, int hours) {
        monthlyHW[row][column] += hours;
    }
    public void changeHW(String wk, String day, int hrs) {
        int row = Integer.parseInt(wk.substring(wk.length() - 1)) -1;
        int column = (getColumn(day));
        changeHW(row,column,hrs);
    }
    //this method converts a day to an integer
    private int getColumn(String day) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) return i;
        }
        return -1;
    }
    
    public void makeDefaultSchedule() {
        for(int r = 0; r < monthlyHW.length; r++) {
            for(int c = 0; c < monthlyHW[r].length; c++) {  
                if (c < 4) {
                    monthlyHW[r][c] = 2;
                } else if(c == 4) {
                    monthlyHW[r][c] = 0;
                } else if(c == 5) {
                    monthlyHW[r][c] = 8;
                } else {
                    monthlyHW[r][c] = 4;
                }
                    
            }
        }
//          for(int[] week : monthlyHW) {
//              for(int c = 0; c < week.length; c++) {
//                  if 
//              }
//          }
    }
    
    public String toString(){
        String s = "";
        s += "   M T W T F S S \n";
        
        for(int r = 0; r < monthlyHW.length; r++) {
            s += "W" + (r+1) + " ";
            for(int c = 0; c < monthlyHW[r].length; c++) {
                s += monthlyHW[r][c] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
