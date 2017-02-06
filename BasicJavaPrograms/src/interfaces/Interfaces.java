package interfaces;

interface AddComponents{
    public void addMotor();

    public void addGear();
}

interface RemoveComponents{
    public void removeMotor();

    public void removeGear();
}

public class Interfaces {

    public static void main(String[] args) {
        Machine m1 = new Machine(0,0);
        System.out.println("Geer:"+m1.Gear);
        System.out.println("Motor:"+m1.Motor);
        m1.addGear();
        m1.addMotor();
        System.out.println("Geer:"+m1.Gear);
        System.out.println("Motor:"+m1.Motor);
        m1.removeGear();
        m1.removeMotor();
        System.out.println("Geer:"+m1.Gear);
        System.out.println("Motor:"+m1.Motor);
    }

}

class Machine implements AddComponents, RemoveComponents{
    int Gear;
    int Motor;

    public Machine(int g, int m){
        Gear = g;
        Motor = m;
    }

    @Override
    public void addMotor() {
        Motor++;
    }

    @Override
    public void addGear() {
        Gear++;
    }

    @Override
    public void removeMotor() {
        Motor--;
    }

    @Override
    public void removeGear() {
        Gear--;
    }
}
