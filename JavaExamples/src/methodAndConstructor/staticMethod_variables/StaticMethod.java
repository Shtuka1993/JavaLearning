package methodAndConstructor.staticMethod_variables;

public class StaticMethod {

    static int i,j;

    public static void main(String[] args) {
        sum(15,49);
        //mul(5,4);
    }

    static void sum(int a, int b){
        i = a;
        j = b;

        System.out.println(a);
        System.out.println(b);
    }

    static void mul(int a, int b){
        System.out.println(a*b);
    }
}
