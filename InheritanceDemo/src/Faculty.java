
import java.util.Calendar;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Faculty extends Academics{
    private String officeHours;
    private int yearStarted;
    private double salary;
    public Faculty(String name,String bDay, String address, int yearStarted, double salary){
        super(name, bDay, address, "Faculty");
        this.yearStarted = yearStarted;
        this.salary = salary;
        officeHours = "N/A";
    }
    public int getSeniority() {   
        return(Calendar.getInstance(Locale.ENGLISH).getWeekYear()) - yearStarted;
    }
    public String toString() {
        String s = super.toString();
        s += "\nOffice Hours:\t\t" + officeHours;
        s += "\nYears of Service:\t" + getSeniority();
        s += "\nSalary:\t\t\t" + salary;
        return s;
    }
}
