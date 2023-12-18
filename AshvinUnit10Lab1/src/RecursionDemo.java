
public class RecursionDemo {
    private int count = 0;
    public int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public int fib2(int n) {
        int number1 = 1;
        int number2 = 1;
        int result = 2;
        for (int i = 3; i <= n; i++) {
            result = number1 + number2;
            number1 = number2;
            number2 = result;
        }
        return result;
    }
//I wrote this in this class then realized and moved it to U10L1 :D
//    public int luckySevens(int number) {
//        if(number == 0) {
//            return 0;
//        }
//        
//        luckySevens(number/10);
//        if (number % 10 == 7) {
//            if((number/10) % 10 == 7) {
//                return luckySevens(number/10) + 13;
//            }
//            return luckySevens(number/10) + 1;
//        }
//        return luckySevens(number/10);
//    }
    
}
