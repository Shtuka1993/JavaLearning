package thread.threadByInheritance_multiple;

public class MultipleThreadsByExtends {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}

class A extends Thread
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("From Thread A:i="+i);
        }
        System.out.println("Exit From A:");
    }
}

class B extends Thread
{
    @Override
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            System.out.println("From Thread B:j="+j);
        }
        System.out.println("Exit From B:");
    }
}

class C extends Thread
{
    @Override
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("From Thread C:k="+k);
        }
        System.out.println("Exit From C:");
    }
}

