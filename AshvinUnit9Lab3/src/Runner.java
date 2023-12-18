/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
//This lab works with interfaces through different questions
public class Runner {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle(20000, 2500, 0.0925);
//        System.out.println(v1.purchasePrice());
        RandomPlayer p1 = new RandomPlayer("Ashvin");
        System.out.println(p1.getName());
//        Checker broccoliChecker = new SubstringChecker("broccoli");
//        System.out.println(broccoliChecker.accept("broccoli"));
//        System.out.println(broccoliChecker.accept("I Like broccoli"));
//        System.out.println(broccoliChecker.accept("carrots are great"));
//        System.out.println(broccoliChecker.accept("Broccoli Bonanza"));
        Checker bChecker = new SubstringChecker("beets");
        Checker cChecker = new SubstringChecker("carrots");
        Checker bothChecker = new AndChecker(bChecker, cChecker);
        System.out.println(bothChecker.accept("carrotsbeets"));
        System.out.println(bothChecker.accept("beets"));
        System.out.println(bothChecker.accept("carrots"));
        Checker not = new NotChecker(bChecker);
        System.out.println(not.accept("beets"));
        System.out.println(not.accept("anything else"));
    }
}
