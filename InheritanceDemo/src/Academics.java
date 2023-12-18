
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Academics extends Person {
//    private float GPA;
    private String[] courses; // stores 7 courses
    private ArrayList<String> extras; // stores extra curriculars
    
    public Academics(String name, String bDay, String address, String title) {
        super(name, bDay, address, title);
//        setName(name);
//        setBDay(bDay);
//        setAddress(address);
//        setTitle(title);
// these four lines of code do as much as the super.
        courses = new String[7];
        extras = new ArrayList<String> ();
        
    }
    public void addExtra(String extra) {
        extras.add(extra);
    }
    public void addCourse(String course, char period) {
         period -= 65;
        courses[period] = course;
    }
    public String toString(){
        String s = super.toString() + "\nCourses:\t\t";
        for (String course: courses) {
            s += course + " ";
        }
        s += "\nExtra Curriculars:\t";
        for (String extra: extras ) {
            s += extra + " ";
        }
        return s;
    }
}
