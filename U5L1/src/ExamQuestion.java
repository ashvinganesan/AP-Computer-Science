/* 
Ashvin Ganesan 
AP CS Unit 
5-Lab 1 11/11/2019
*/
public class ExamQuestion {
    private String questionName;
    private int difficulty;
    
    public ExamQuestion() {
        questionName = "";
        difficulty = 0;
    }
    public ExamQuestion(String name, int diff) {
        questionName = name;
        difficulty = diff;
    }
    public ExamQuestion(int diff) {
        difficulty = diff;
    }
    public ExamQuestion(String name) {
        questionName = name;
    }
    public int getDifficulty(){
        return difficulty;
    }
    public String getName() {
        return questionName;
    }
    public String toString(){
        return "Question: " + questionName + "\nDifficulty: " + difficulty + "\n";
    }
}
