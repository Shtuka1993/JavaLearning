package exeptionHandling.stringIndexOutOfBoundsExcp;

public class StringIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {

        try{
            String s1="VANDE MATARAM";
            System.out.println(s1.charAt(20));
        }

        catch(StringIndexOutOfBoundsException e){
            System.out.println("String Index Out Of Bounds Exception ... ");
        }
    }
}
