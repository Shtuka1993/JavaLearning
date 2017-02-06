package substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString {

    public static void main(String[] args) {
        String str=null;
        String sub;
        System.out.println("Enter your name:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        try{
            str = br.readLine();
        }catch(IOException ex){

        }
        System.out.println("All substrings:");
        for(int c=0;c<str.length();c++){
            for(int i=1;i<=str.length()-c;i++){
                sub=str.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }

}
