package methodAndConstructor.fibonacciSeries;

public class UserDefinedMethodFibonnaciSeries {

    public static void main(String[] args){
        F n = new F();
        n.fibo();
    }

}

class F{

    void fibo(){
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        int n=15;
        while(n>0){

            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

            n--;
        }
    }

}
