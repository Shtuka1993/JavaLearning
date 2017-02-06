package inheritance.simpleInheritance;

public class MethodOverriding {

    public static void main(String[] args) {

        science t = new science();
        t.setdata(1,"Einstein",100,70,90);
        t.show();

    }

}

class student
{
    int enrl;
    String name;
    void setname(int rno, String name)
    {
        enrl=rno;
        //name=name;//this means, "name from argument = name from argument" it points itself
        this.name=name;//this is a keywork which denoted to the current class and its' propeties.
    }

    void show()
    {
        System.out.println("Enrollment umber: "+enrl);
        System.out.println("Name:"+name);
    }
}

class science extends student
{
    int phy, chem, maths;

    void setdata(int no, String name, int a, int b, int c)
    {
        super.setname(no,name);
        phy = a;
        chem=b;
        maths = c;
    }

    @Override//this is annotation, which means methid is overridden
    void show()
    {
        super.show();
        System.out.println("Physics:"+phy);
        System.out.println("Chemistry:"+chem);
        System.out.println("Maths:"+maths);
    }
}