package conditionalOperator;

public class ConditionalOperator {

    public static void main(String[] args) {
        int a=2,b=3,c;
        System.out.println("By if-else:");
        if(a<b)
            c=a;
        else
            c=b;
        System.out.println("c="+c);
        System.out.println("By Conditional Operator:");
        c=(a<b)?a:b;
        System.out.println("c="+c);
    }

}
