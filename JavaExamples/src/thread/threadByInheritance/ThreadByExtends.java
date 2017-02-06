package thread.threadByInheritance;

public class ThreadByExtends {
    public static void main(String[] args) {
        new NewThread1();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main Thread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interuppted");
            System.out.println("Exiting main Thread");
        }
    }
}
class NewThread1 extends Thread {

    NewThread1(){
        super("Demo Thread");
        System.out.println("Child Thread: "+this);
        start();
    }

    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread: "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Intruppted");
            System.out.println("Exiting main Thread");
        }
    }
}
