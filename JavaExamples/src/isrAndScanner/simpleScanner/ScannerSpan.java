package isrAndScanner.simpleScanner;

import java.util.Scanner;

public class ScannerSpan {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();

        if(a>=1&&a<=10){

            System.out.println("lies between 1 to 10");

        } else if(a>=11 && a<=20){

            System.out.println("lies between 11 to 20");
        }

        if(a>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
