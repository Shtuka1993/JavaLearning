package methodAndConstructor.without_With1;

public class MethodTypeTwo {
    public static void main(String[] args) {
        A3 ob1 = new A3();

        //calling the method
        ob1.show(100);
    }
}

class A3{
    void show(int a){
        System.out.println("without return-type with argument");
        System.out.println("Argument received: int var="+a);
    }
}