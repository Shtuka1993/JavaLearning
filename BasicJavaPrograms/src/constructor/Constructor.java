package constructor;

public class Constructor {

    int num;
    String str;

    public Constructor(){
        System.out.println("I am inside Default Constructor");
    }

    public Constructor(int n, String s){
        num = n;
        str = s;
        System.out.println("I am inside Parameterised Constructor");
        System.out.println("num="+num);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        System.out.println("Inside Main:");
        System.out.println("num="+c1.num);
        System.out.println("str="+c1.str);

        Constructor c2 = new Constructor(5,"Basic Java Programs");
        System.out.println("Inside Main:");
        System.out.println("num="+c2.num);
        System.out.println("str="+c2.str);
    }

}
