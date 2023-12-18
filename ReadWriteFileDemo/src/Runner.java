
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashvin
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        ReadWriteFileDemo demo = new ReadWriteFileDemo();
        //demo.readAFile("books.txt");
        //demo.ProcessBook("books.txt");
        demo.processSpeech("ObamaRutgersCommencementSpeech.txt");
    }
    
}
