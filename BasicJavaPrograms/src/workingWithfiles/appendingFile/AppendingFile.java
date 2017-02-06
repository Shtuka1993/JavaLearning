package workingWithfiles.appendingFile;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingFile {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:/JAVA PROGRAMING/BasicJavaPrograms/src/workingWithfiles/sample1.txt",true);
        }catch(IOException ex){

        }
        try{
            fw.write("I am appending file\n");
            fw.close();
        }catch(IOException ex){

        }
    }

}
