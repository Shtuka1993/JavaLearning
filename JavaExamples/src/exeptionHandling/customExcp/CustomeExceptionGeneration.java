package exeptionHandling.customExcp;

import java.util.Scanner;

class customException extends Exception{
    customException(String s){
        System.out.println("Custom Exception: "+s);
    }
}

public class CustomeExceptionGeneration {

    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n1 = sc.nextInt();

            if(n1%5==0){
                throw new customException("Cannot enter value in multiple of 11");
            }}
        catch (customException e)
        {}
    }
}
