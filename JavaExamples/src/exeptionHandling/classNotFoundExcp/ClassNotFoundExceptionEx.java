package exeptionHandling.classNotFoundExcp;

public class ClassNotFoundExceptionEx {

    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class Not Found Exception");
        }
    }
}
