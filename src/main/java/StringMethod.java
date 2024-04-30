import static java.lang.System.*;

public class StringMethod {
    public static void main(String[] args){
        String name;
        String john = "John";
        boolean greet = false;
        out.println(greet);
        out.println(greet);
        out.println(greet);
        out.println(greet);
    }

    //Method that returns string value
    public static String greet(String name){
        return String.format("hello, %s, Welcome to java", name);
    }
}
