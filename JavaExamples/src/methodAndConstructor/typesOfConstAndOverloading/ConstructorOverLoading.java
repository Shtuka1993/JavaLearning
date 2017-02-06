package methodAndConstructor.typesOfConstAndOverloading;

public class ConstructorOverLoading {

    public static void main(String[] args) {

        String name = "INDIA";

        A7 ob1;

        ob1 = new A7();
        ob1 = new A7(23);
        ob1 = new A7(name,3.789);
    }

}

class A7{
    //there are 3 variants of constructors in this class
    //with different parameters, they are known as Constructor overLoading

    A7(){
        System.out.println("Without arameter constructor");
    }

    A7(int a){
        System.out.println("Parametrized constructor with one integer as parameter");
    }

    A7(String s, double j){
        System.out.println("Parametrized constructor with one string and one double as parameters");
    }
}