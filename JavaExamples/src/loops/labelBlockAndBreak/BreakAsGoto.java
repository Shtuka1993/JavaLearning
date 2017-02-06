package loops.labelBlockAndBreak;

public class BreakAsGoto {
    public static void main(String[] args) {
        ablock:
        {
            bblock:
            {
                cblock:
                {
                    System.out.println("Before using break");
                    if(true){
                        break bblock;
                    }
                    System.out.println("This will never execute");
                }
                System.out.println("This is never execute");
            }
            System.out.println("This will be executed");
        }
    }
}
