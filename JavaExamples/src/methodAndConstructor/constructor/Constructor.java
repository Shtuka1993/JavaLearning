package methodAndConstructor.constructor;

public class Constructor {
    public Constructor(){
        //created automaticaly, even if we don't create it
        //and automatially executed when object of class s initiallized
    }

    public static void main(String[] args){
        A6 ob1 = new A6();//constructor will execute

        ob1.A6();//method called
    }
}

class A6{

    A6(){
        System.out.println("Constructor can not be called");
        System.out.println("Constructor has the same name as of class");
        System.out.println("It as no return-type");
        System.out.println("executed automatically when object of class is nitialized");
    }
    void A6(){
        System.out.println("Method A6 with return-type void is called");
    }

}
