package exeptionHandling.throwsEx2;

public class ThrowsMultipleExc {

    public static void main(String[] args) {

        String str[] = new String[6];
        str[0]="45";
        str[1]="-578";
        str[2]="100";
        str[4]="-1";
        str[5]="3600";

        try {
            System.out.println(average(str));
        } catch(NullPointerException s){
            System.out.println("Null pointer Exception");
        }catch(NumberFormatException s){
            System.out.println("Number Format Exception");
        }
    }

    static double average(String arr[]) throws NullPointerException,NumberFormatException{
        double sum=0;
        double d;
        for(int i=0;i<arr.length;i++){
            d=Double.valueOf(arr[i]);
            sum+=d;
        }
        return sum/arr.length;
    }
}
