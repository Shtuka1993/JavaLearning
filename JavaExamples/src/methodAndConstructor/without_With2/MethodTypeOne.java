package methodAndConstructor.without_With2;

public class MethodTypeOne {
    public static void main(String[] args) {
        A2 ob1 = new A2();

        //calling the method
        ob1.show();
    }
}

class A2{
    void show(){
        System.out.println("Without return-type without argument");
    }
}
