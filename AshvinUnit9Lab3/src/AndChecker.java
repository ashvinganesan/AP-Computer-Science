/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class AndChecker implements Checker{
    private Checker word1;
    private Checker word2;
    public AndChecker(Checker word1, Checker word2) {
        this.word1 = word1;
        this.word2 = word2;
    }
    public boolean accept(String checking) {
        if (word1.accept(checking) == true && word2.accept(checking) == true ) {
            return true;
        } else {
            return false;
        }
    }
}
