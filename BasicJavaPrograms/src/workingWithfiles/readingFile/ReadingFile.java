package workingWithfiles.readingFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) {
        FileReader fr = null;
        try{
            //fr = new FileReader("../sample.txt");
            fr = new FileReader("D:/JAVA PROGRAMING/BasicJavaPrograms/src/workingWithfiles/sample.txt");
        }catch(FileNotFoundException ex){

        }
        String str=null;
        BufferedReader br = new BufferedReader(fr);
        try{
            str = br.readLine();
        }catch(IOException ex){

        }
        System.out.println("Contents of sample.txt:\n");
        while(str!=null){
            System.out.println(str);
            try{
                str=br.readLine();
            }catch(IOException ex){

            }
        }
    }

}
