/*
 Ashvin Ganesan
2016 Q1 
AP CS Monday November 25th 2019
 */
public class RandomStringChooser {
    private String[] arr;
    
    public RandomStringChooser(String[] array) {
        arr = array;
    }
    
    public String getNext() {
        if (arr.length == 0) {
            return "NONE";
        }
        // get a random number from 0 to arr.length -1
        int rand = (int)(Math.random() * arr.length); 
        String randStr = arr[rand];
        //create a new aarray that has all elements of arr exceppt arr[rand]
        String[] newArr = new String[arr.length - 1];
        int j = 0;
        for(int i = 0; i< arr.length; i++) {
            if (i != rand) {
                newArr[j] = arr[i];
                j++;
            }
        }
        //update arr
        arr = newArr;
        
        return randStr;
    }
    
}
