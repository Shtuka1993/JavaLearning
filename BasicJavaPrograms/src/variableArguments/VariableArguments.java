package variableArguments;

public class VariableArguments {

    public static void main(String[] args) {
        System.out.println("Sum of numbers:"+sum(1,2,3));
        System.out.println("Sum of numbers:"+sum(1,2,3,4,5));
        System.out.println("Sum of numbers:"+sum(1,2,3,4,5,6,7,8));
    }

    public static int sum(int...num){
        int total=0;
        for(int x:num){
            total = total+x;
        }
        return total;
    }

}
