package threading;

public class Threading {

    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        o.start();
        t.start();
    }

}

class One extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.print("1");
        }
    }
}

class Two extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.print("2");
        }
    }
}
