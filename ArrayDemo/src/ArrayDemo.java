/*
 author ashvin
 */
public class ArrayDemo {

    private int[] apScores; // just declaring not initializing
    // This method generates an array of random integers representing AP score
    // The size of the array is determined by parameter size

    public ArrayDemo(int size) {
        apScores = new int[size]; //initializing not declaring
    }

    public int[] generateRandoms() {
        for (int i = 0; i < apScores.length; i++) {
            apScores[i] = (int) (Math.random() * 5 + 1);

        }
        return apScores;
    }

    public double averageScore() {
        double sum = 0.0;
        for (int i = 0; i < apScores.length; i++) {
            sum += apScores[i];
        }
        sum /= apScores.length;
        return sum;
    }

    public int findMax() {
        int max = apScores[0];
        for (int i = 0; i < apScores.length; i++) {
            if (apScores[i] > max) {
                max = apScores[i];
            }
        }
        return max;
    }

    public int findMin() {
        int min = apScores[0];
        for (int i = 0; i < apScores.length; i++) {
            if (apScores[i] < min) {
                min = apScores[i];
            }
        }
        return min;
    }
    
    // this method returns the number of students whose score is greater than 3
    // Use for each loop in this method
    public int preveredScore() {
        int prevered = 0;
        for(int score : apScores) {
            if (score >= 4) {
                prevered++;
            }
        }
        return prevered;
    }
    
    // This method returns a histogram the histogramis represented by an array of 5 ints
    //assuming the first element[0] represents score of 1 and so on. Last element [4] represents score of 5 
    public int[] getHistogram() {
        int[] histogram = new int[5];
        for (int score : apScores) {
            histogram[score-1]++;
        }
        return histogram;
    }
    
    public void printHistogram() {
        int[] histogram = getHistogram();
        for(int i = 0; i <  histogram.length; i++) {
            System.out.print("number of Students scored " + (i+1) + " is " + histogram[i] + "\n");
        }
    }

    public String toString() {
        String output = new String("");
//        for(int i = 0; i < apScores.length; i++) {
//            output += apScores[i] + " ";
//        }
        for (int score : apScores) { // for each loop
            output += score + " ";
        }
        return output;
    }
}
