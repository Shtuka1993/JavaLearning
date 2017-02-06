package polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Dimension d = new Dimension();
        System.out.println("Area of Circle:"+d.area(10));
        System.out.println("Area of Rectangle:"+d.area(20,10));
        System.out.println("Area of Cuboid:"+d.area(30,20,10));
    }

}

class Dimension{

    public double area(double r){
        double area=Math.PI*r*r;
        return area;
    }

    public double area(double l, double b){
        double area=l*b;
        return area;
    }

    public double area(double l, double b, double h){
        double area=l*b+b*h+h*l;
        return area;
    }

}
