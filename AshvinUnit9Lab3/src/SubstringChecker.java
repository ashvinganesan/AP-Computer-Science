/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class SubstringChecker implements Checker {
    private String word;
    public SubstringChecker(String word) {
        this.word = word;
    }
    public boolean accept(String checking) {
        if (checking.contains(word)) {
            return true;
        }
        return false;
    }
            
}
