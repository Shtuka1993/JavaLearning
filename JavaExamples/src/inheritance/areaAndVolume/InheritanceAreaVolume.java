package inheritance.areaAndVolume;

public class InheritanceAreaVolume {

    public static void main(String[] args) {
        volume ob1 = new volume();

        System.out.println(ob1.volume1(4,10));
        System.out.println(ob1.volume1(4,5,6));
    }

}

class area{
    int area1(int a){
        return a*a;
    }
    int area1(int a, int b){
        return a*b;
    }
}

class volume extends area{

    int volume1(int a, int b){
        int area=area1(a)*b;
        return area;
    }

    int volume1(int a, int b, int c){
        int area=area1(a,b)*c;
        return area;
    }

}
