/*
Question 2 in the 2019 exam
Ashvin Ganesan
APCS unit 6
Monday november 25th 2019
 */
public class StepTracker {
    private int minSteps;
    private int activeDays;
    private int totalSteps;
    private int totalDays;
    
    public StepTracker(int min) {
        minSteps = min;
        activeDays = 0;
        totalSteps = 0;
        totalDays = 0;
    }
    public void addDailySteps(int steps){
        totalSteps+= steps;
        if(steps >= minSteps) {
            activeDays++;
        }
        totalDays++;
    }
    public int activedays() {
        return activeDays;
    }
    public double averageSteps() {
        return (double)(totalSteps)/(totalDays);
    }
}
