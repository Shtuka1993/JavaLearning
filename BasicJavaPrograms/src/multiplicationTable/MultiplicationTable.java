package multiplicationTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {

    public static void main(String[] args){
        System.out.println("Enter a Digit:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String str = null;
        try{
            str=br.readLine();
        } catch (IOException ex){

        }
        int num;
        num = Integer.parseInt(str);
        for(int i = 1; i<10; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }

}
