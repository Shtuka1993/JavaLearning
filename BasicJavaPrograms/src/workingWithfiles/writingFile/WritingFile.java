package workingWithfiles.writingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {

    public static void main(String[] args) {
        FileWriter fw=null;
        try{
            fw = new FileWriter("D:/JAVA PROGRAMING/BasicJavaPrograms/src/workingWithfiles/sample1.txt");
        }catch(IOException ex){

        }
        try{
            fw.write("I am writing this file\n");
            fw.close();
        }catch(IOException ex){

        }
    }

}
