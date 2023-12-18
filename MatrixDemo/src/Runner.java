/*
 Ashvin Ganesan
Monday January 6th 2019
 */
public class Runner {
    public static void main(String[] args) {
        MonthlyHomework ashvinJan = new MonthlyHomework();
        ashvinJan.makeDefaultSchedule();
        //System.out.println(ashvinJan);
        //ashvinJan.changeHW(3, 3, 0);
        System.out.println(ashvinJan);
        ashvinJan.changeHW("Week 4", "Thu", 1);
        System.out.println(ashvinJan);
    }
    
}
