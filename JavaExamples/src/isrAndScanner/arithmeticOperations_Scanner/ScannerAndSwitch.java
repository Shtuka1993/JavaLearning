package isrAndScanner.arithmeticOperations_Scanner;

import java.util.Scanner;

public class ScannerAndSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");

        int a=sc.nextInt();

        System.out.println("Enter b");
        int b=sc.nextInt();

        double c;

        System.out.println("Enter choice");
        int ch = sc.nextInt();
        switch(ch){

            case 1:
                System.out.println("Addition");
                c=a+b;
                System.out.println(c);
                break;

            case 2:
                System.out.println("Subtraction");
                c=a-b;
                System.out.println(c);
                break;

            case 3:
                System.out.println("Multiplication");
                c=a*b;
                System.out.println(c);
                break;

            case 4:
                System.out.println("Division");
                if(b!=0){
                    c=a/b;
                    System.out.println(c);
                }else{
                    System.out.println("Cannot be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid Choice!!Please Enter again");
        }
    }

}
