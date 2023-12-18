/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) {
        First sec = new Second(); // Line 1
        Second thr = new Third(); // Line 2
        sec.output(); // Line 3
        thr.output(); // Line 4
    }
}
