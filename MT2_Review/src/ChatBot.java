/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public abstract class ChatBot {
    public static String readInput(String prompt) {
        return "";
    }
    private String name;
    public ChatBot(String nm)  {
        name = nm;
    }
    public String getName() {
        return name;
    }
    public abstract String respondToGreeting(String greeting);
}
