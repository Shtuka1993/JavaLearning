package thread.threadByInterface2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPriorityAndJoin {

    public static void main(String[] args) {
        //A1 ob1 = new A1();
        //???
        //WAT???
    }

}

class A2 implements Runnable {

    Thread t1;

    A2(){
        t1 = new Thread(this);
    }

    public void run(){
        for(int i=1;i<11;i++){
            try{
                System.out.println("*");
                Thread.sleep(500);
            }catch(InterruptedException ex){
            }
        }
    }
}
