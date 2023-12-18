/*
 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
 * @author ashvin
 */
public class Question1 {

    public void solveQ1() {
        int num = 3; //start
        int sum = 0;
        while (num < 1000) {//stop
            if ((num % 3 == 0) || (num % 5 == 0)) {
                sum += num;
                
            }
            num++;//step
        }
        System.out.println(sum);
    }
}
