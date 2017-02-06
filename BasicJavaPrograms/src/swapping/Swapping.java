package swapping;

public class Swapping {

    public static void main(String[] args) {
        int a = 5,b=10;
        System.out.println("Using temporary variable:");
        System.out.println("Original -> a="+a+" b="+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping -> a="+a+" b="+b);

        a=5;
        b=10;
        System.out.println("Without Using temporary variable:");
        System.out.println("Original -> a="+a+" b="+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping -> a="+a+" b="+b);

    }

}
