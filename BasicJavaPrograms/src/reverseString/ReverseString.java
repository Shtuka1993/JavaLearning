package reverseString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

    public static void main(String[] args) {
        String str=null;
        String rev;
        System.out.println("Enter you ame:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try{
            str = br.readLine();
        }catch(IOException ex){

        }
        StringBuilder sb = new StringBuilder(str);
        rev = sb.reverse().toString();
        System.out.println("Reverse of-> "+str+" <-is-> "+rev);
    }

}
