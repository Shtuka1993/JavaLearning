package inheritance.constOverloading1;

public class ConstructorOverloadingBox {

    public static void main(String[] args) {
        BoxWeight ob1;

        ob1 = new BoxWeight();
        ob1.vol();
        ob1 = new BoxWeight(10,20);
        ob1.vol();
        ob1 = new BoxWeight(10,20,30,40);
        ob1.vol();
        ob1 = new BoxWeight(ob1);
        ob1.vol();
    }

}

class Box {

    double l,b,h;

    Box(){
        l=b=h=-1;
    }

    Box(int a){
        l=b=h=a;
    }

    Box(int a, int b, int c){
        l=a;
        this.b = b;
        h = c;
    }

    Box(Box ob){
        l=ob.l;
        b=ob.b;
        h=ob.h;
    }

}

class BoxWeight extends Box {

    double w;

    BoxWeight(){
        //constructor without parameter
        super();//constructor run
    }

    BoxWeight(int a, double b){
        //parametrized constructor
        super(a);
        w=b;
    }

    BoxWeight(int x, int y, int z, double w){
        //parametrized constructor
        super(x,y,z);
        this.w = w;
    }

    BoxWeight(BoxWeight ob){
        //copy constructor
        super(ob);
        w=ob.w;
    }

    double vol;

    void vol(){
        vol = l*b*h;
        System.out.println("Volume:"+vol);
        System.out.println("Weight:"+w+"\n");
    }

    void display(){
        System.out.println("\nVolume of Box having "+l+", "+b+" and "+h+" with "+w+" parameter::");
        vol();
    }

}