package exeptionHandling.numberFormatExcp;

public class NumberFormatExceptionEx {

    public static void main(String[] args) {

        try{
            String s1="ok";
            int n1 = Integer.parseInt(s1);
            System.out.println(n1);
        }catch(NumberFormatException e){
            System.out.println("Number Format Exception ...");
        }
    }
}
