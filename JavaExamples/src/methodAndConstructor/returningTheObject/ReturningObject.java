package methodAndConstructor.returningTheObject;

public class ReturningObject {

    public static void main(String[] args) {
        A8 ob1 = new A8(13);
        A8 ob2 = ob1.sqr();

        System.out.println("ob1.a:"+ob1.a);
        System.out.println("ob2.a:"+ob2.a);

        ob2 = ob2.sqr();
        System.out.println("ob2.a fter 2nd sqr:"+ob2.a);
    }

}

class A8{

    int a;

    A8(int i){
        a=i;
    }

    A8 sqr(){
        A8 ob = new A8(a*a);
        return ob;
    }

}