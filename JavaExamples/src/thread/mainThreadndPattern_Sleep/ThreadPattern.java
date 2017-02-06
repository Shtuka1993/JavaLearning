package thread.mainThreadndPattern_Sleep;

/**
 * Created by 1 on 02.02.2017.
 */
public class ThreadPattern {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                try {
                    System.out.print("*");
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
            System.out.println();
        }
    }
}
