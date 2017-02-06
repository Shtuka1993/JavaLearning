package openCalculator;

import java.io.IOException;

public class OpenCalculator {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("calc");
        }catch(IOException ex){

        }
    }

}
