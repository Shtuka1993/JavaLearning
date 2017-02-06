package inheritance.constOverloading2;

/**
 * Created by 1 on 02.02.2017.
 */
public class ConstructorOverloadingBoxSimple {

    public static void main(String[] args) {
        boxweight mybox1 = new boxweight(10,20,15,34.3);
        boxweight mybox2 = new boxweight(2,3,3,0.076);
        boxweight mybox3 = new boxweight();
        boxweight mycube = new boxweight(3,2);
        boxweight myclone = new boxweight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("vol of box1 "+vol);
        System.out.println("weight of box1 "+mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("vol of box2 "+vol);
        System.out.println("weight of box2 "+mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("vol of box3 "+vol);
        System.out.println("weight of box3 "+mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("vol of myclone is  "+vol);
        System.out.println("weight of myclone is "+myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("vol of my cube is "+vol);
        System.out.println("weight of my cube is "+mycube.weight);
        System.out.println();

    }

}

class box{

    private double width,height,depth;

    box(box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }

    box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    box(double len){
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }

}


class boxweight extends box{

    double weight;

    boxweight(boxweight ob){
        super(ob);
        weight = ob.weight;
    }

    boxweight(double w, double h, double d, double m){
        super(w,h,d);
        weight=m;
    }

    boxweight(){
        super();
        weight=-1;
    }

    boxweight(double len, double m){
        super(len);
        weight=m;
    }
}