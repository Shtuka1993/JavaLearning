package isrAndScanner.inputByISR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamREaderArithmeticOperation {

    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        //String s1 = br.readLine();
        //int n1 = Integer.parseInt(s1);

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        Double n2 = Double.parseDouble(br.readLine());

        System.out.println("addition is "+(a+b));
        System.out.println("substraction is "+(a-b));
        System.out.println("multiplication is "+(a*b));
        System.out.println("division is "+(a/b));
    }

}
