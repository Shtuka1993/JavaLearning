package introJavaprograming.ternaryOperator;

public class TernaryOperatorMax {
    public static void main(String[] args) {
        int a,b,c;
        a=43;
        b=56;
        c=64;
        int x=a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("max is "+x);
    }
}
