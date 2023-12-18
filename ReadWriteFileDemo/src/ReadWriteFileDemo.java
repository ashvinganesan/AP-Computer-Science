
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * @author ashvin
 */
public class ReadWriteFileDemo {

    //this method reads and displays contents of a file given the file's name
    public void readAFile(String fileName) throws IOException {
        Scanner fileReader = new Scanner(new File(fileName));
        int count = 0;
            
        while (fileReader.hasNextLine()) { // if there is a line to read 
            System.out.println(fileReader.nextLine()); //read it
            count++;
        }
        System.out.println("There are " + count + " books");
    }

    //this method processes and displays "book title by author"
    public void ProcessBook(String fileName) throws IOException {
        Scanner fileReader = new Scanner(new File(fileName));
        int count = 0;

        while (fileReader.hasNextLine()) { // if there is a line to read 
            String line = fileReader.nextLine();
            int comma = line.indexOf(",");
            String author = line.substring(0, comma);
            String title = line.substring(comma + 1);
            System.out.println(title + " by " + author);
            count++;
        }
    }

    public void processSpeech(String fileName) throws IOException {
        Scanner fileReader = new Scanner(new File(fileName));
        int applause = 0;
        int success = 0;
        int countLine = 0;
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            applause += countKeyword(line, "applause");
            success += countKeyword(line, "success");
            
        }
        System.out.println(countLine);
    }

    public int countKeyword(String line, String keyWord) {
        line = line.toLowerCase();
        keyWord = keyWord.toLowerCase();
        int numApplause = 0;
        for (int i = 0; i < line.length() - keyWord.length(); i++) { //applause has 8 characters
            if(line.substring(i, i+ keyWord.length()).equals(keyWord)){
                numApplause++;
            }
        }
        return numApplause++;

    }
}
