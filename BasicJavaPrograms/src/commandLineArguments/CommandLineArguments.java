package commandLineArguments;

public class CommandLineArguments {

    public static void main(String[] args) {
        System.out.println("Traditional for loop:");
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println("Enhnced for loop:");
        for(String s:args){
            System.out.println(s);
        }
    }

}
