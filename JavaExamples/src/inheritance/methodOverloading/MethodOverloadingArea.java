package inheritance.methodOverloading;

public class MethodOverloadingArea {

    public static void main(String[] args) {
        area ob1 = new area();

        ob1.display();

        //1st object
        ob1.count(3f);
        ob1.display();

        //2nd object
        ob1.count(10);
        ob1.display();

        //3rd object
        ob1.count(10,20);
        ob1.display();
    }

}

class area{

    double vararea;
    private int signal=0;
    //private int signal=10;

    void count(float radius){
        //area of circle
        signal=1;
        vararea=Math.PI*radius*radius;
    }

    void count(int length){
        //area of square
        signal = 2;
        vararea=length*length;
    }

    void count(int length, int breadth){
        //area of rectangle
        signal=3;
        vararea=length*breadth;
    }

    void display(){
        switch(signal)
        {
            case 0:
                System.out.println("Pass argument first by count method");
                break;
            case 1:
                System.out.println("Area of circle:: "+vararea+"\n");
                break;
            case 2:
                System.out.println("Area of square:: "+vararea+"\n");
                break;
            case 3:
                System.out.println("Area of rectangle:: "+vararea+"\n");
                break;
            default:
                System.out.println("Value of signal can be changed only then when it is called by reference of object");
                System.out.println("Don't do this");
                System.out.println("To stop it accessible from other classes, I can make it private");
        }
        System.out.println("Area: "+vararea+"\n");
    }

}

