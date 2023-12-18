/*
Ashvin Ganesan
APCS 2019-2020 Unit 9 Lab 3 
Monday February 24th 2020
 */
public class NotChecker implements Checker{
    private Checker object;
    public NotChecker(Checker object) {
        this.object = object;
    }
    public boolean accept(String checking) {
        return !object.accept(checking);
    }
    
}
