/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class StudentBot extends ChatBot {
    public StudentBot(String n) {
        super(n);
    }
    public String respondToGreeting(String greeting) {
        if(greeting.contains("morning")) {
            return "Good morning";
        }
        if(greeting.contains("afternoon")) {
            return "Good afternoon";
        }
        return "Hello";
    }
    
}
