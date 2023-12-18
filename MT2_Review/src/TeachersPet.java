/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class TeachersPet extends StudentBot {
    public TeachersPet(String n) {
        super(n);
    }
    public String respondToGreeting(String greeting) {
        String s = super.respondToGreeting(greeting);
        if(greeting.contains("name is ")) {
            int index = greeting.indexOf("name is ");
            return s + greeting.substring(index + 7) + "\n What are we doing in class today?";
        }
        return s + ".\n What are we doing in class today?";
    }
    
}
