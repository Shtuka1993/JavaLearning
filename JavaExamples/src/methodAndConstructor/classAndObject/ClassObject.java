package methodAndConstructor.classAndObject;

public class ClassObject {
    public static void main(String[] args) {
        A1 ob1;//declaration - creating reference point
        ob1 = new A1();//initialization - creating object

        //combine step
        A1 ob2 = new A1();

        System.out.println(ob1.a);
    }
}

class A1{
    int a=10;
}
