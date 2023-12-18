
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
public class MasterOrder {
    private ArrayList<CookieOrder> orders;
    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }
    public int getTotalBoxes() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getTotalBoxes();
        }
        return sum;
    }
    public int removeVariety(String cookieVar) {
        int count = 0;
        for (int i = orders.size()-1; i >= 0; i--) {
            if(orders.get(i).equals(cookieVar)) {
                orders.remove(i);
                count++;
            }
        }
        return count;
    }
}

